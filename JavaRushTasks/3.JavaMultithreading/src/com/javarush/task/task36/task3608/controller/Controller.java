//package com.javarush.task.task36.task3608.controller;
//import com.javarush.task.task36.task3608.model.MainModel;
//import com.javarush.task.task36.task3608.model.Model;
//
//
//public class Controller {
//
//    private UsersView usersView = new UsersView();
//    private Model model;
//    private EditUserView editUserView;
//
//
//
//    public void onShowAllUsers() {
//        model.loadUsers();
//        usersView.refresh(model.getModelData());
//    }
//
//    public void onShowAllDeletedUsers() {
//        model.loadDeletedUsers();
//        usersView.refresh(model.getModelData());
//    }
//
//    public void onOpenUserEditForm(long userId) {
//        model.loadUserById(userId);
//        editUserView.refresh(model.getModelData());
//    }
//
//    public void onUserDelete(long id){
//        model.deleteUserById(id);
//        usersView.refresh(model.getModelData());
//    }
//
//    public void onUserChange(String name, long id, int level){
//        model.changeUserData(name,id,level);
//        usersView.refresh(model.getModelData());
//    }
//
//
//
//
//
//
//
//
//    // Далее идут геттеры и сеттеры.
//    public void setModel(Model model) {
//        this.model = model;
//    }
//
//    public void setUsersView(UsersView usersView) {
//        this.usersView = usersView;
//    }
//
//    public void setEditUserView(EditUserView editUserView) {
//        this.editUserView = editUserView;
//    }
//
//}
