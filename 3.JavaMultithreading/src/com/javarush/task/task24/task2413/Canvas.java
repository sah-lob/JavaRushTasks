package com.javarush.task.task24.task2413;

public class Canvas {

    private int width;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height+2][width+2];
    }

    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    private char[][] matrix;

    void setPoint(double x, double y, char c){
        Math.round(x);
        Math.round(y);

        if(x<0 || y<0 || y>matrix.length || x> matrix[0].length)
        matrix[(int) x][(int)y] = c;

    }

    void drawMatrix(double x, double y, int[][] matrix, char c){
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
             if(matrix[i][j] != 0){
                 setPoint(x+j, y+i, c);
             }
            }
        }
    }
}
