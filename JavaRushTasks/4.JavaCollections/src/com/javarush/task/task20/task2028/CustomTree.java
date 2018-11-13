package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root = new Entry<>("0");
    List<Entry<String>> list = new ArrayList<>();


    public CustomTree() {
//        new Entry<>("0");
        list.add(new Entry<>("0"));
    }

    public String getParent(String s){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).elementName.equals(s)){
                return list.get(i).parent.elementName;
            }
        }
        return null;
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException("get");
    }

    @Override
    public int size() {
        return list.size()-1;
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException("set");
    }

    @Override
    public boolean add(String s) {
        for (int i = 0; i < list.size(); i++) {
            int k = 0;

            for (int j = 0; j < list.size() ; j++) {
                if(list.get(j).isAvailableToAddChildren()){
                    k = 1;
                }
            }
            if (k==0){
                int q = ((list.size() - 1)/2)+1;
                for (int j = list.size()-q; j < list.size(); j++) {
                    list.get(j).availableToAddLeftChildren = true;
                    list.get(j).availableToAddRightChildren = true;
                }
            }

            if(list.get(i).isAvailableToAddChildren()){
                if(list.get(i).availableToAddLeftChildren){
                    Entry sw = new Entry(s);
                    list.get(i).leftChild = sw;
                    list.get(i).availableToAddLeftChildren = false;
                    sw.parent = list.get(i);
                    list.add(sw);
                } else if(list.get(i).availableToAddRightChildren){
                    Entry sw = new Entry(s);
                    list.get(i).rightChild = sw;
                    list.get(i).availableToAddRightChildren = false;
                    sw.parent = list.get(i);
                    list.add(sw);
                }
                break;
            }
        }
        return true;
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException("add");
    }

    @Override
    public boolean remove(Object o) {
        if (!(o instanceof String)) throw new UnsupportedOperationException();
        String name = String.valueOf(o);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).elementName.equals(name)){

                // Удаление детей у родителей.
//                if(list.get(i).parent.rightChild.elementName.equals(name)){
//                    list.get(i).parent.availableToAddRightChildren = true;
//                }
//                if(list.get(i).parent.leftChild.elementName.equals(name)){
//                    list.get(i).parent.availableToAddLeftChildren = true;
//                }

                // Удаление детей.
                if(list.get(i).isAvailableToAddChildren()){
                    list.remove(i);
                } else {
                    deletchild(list.get(i));
                }

            }
        }

        return false;
    }

    public void deletchild(Entry<String> parent){

//        System.out.println(parent.elementName + " - имя элемента в методе");

//            System.out.println("Есть ли дети у элемента ноер " + parent.elementName + "?" );
            if(!parent.availableToAddLeftChildren){
//                System.out.println("Левый ребенок " + parent.leftChild.elementName);
            deletchild(parent.leftChild);
            } if(!parent.availableToAddRightChildren){
            deletchild(parent.rightChild);
//                System.out.println("Правый ребенок " + parent.rightChild.elementName);
            }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).elementName.equals(parent.elementName)){
//                System.out.println("удаляем - " + list.get(i).elementName);
                list.remove(i);
            }
        }
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException("remove");
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("subList");
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException("addAll");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("removeRange");
    }


    static class  Entry<T> implements Serializable{

        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;


        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        void checkChildren(){
            if(leftChild != null){
                availableToAddLeftChildren = false;
            }
            if(rightChild != null){
                availableToAddRightChildren = false;
            }
        }

        boolean isAvailableToAddChildren(){
            if(availableToAddRightChildren || availableToAddLeftChildren){
            return true;}
            else return false;
        }
    }
}


