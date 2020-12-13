package main.java.com.timon1983.javacore.TicTacToe;

import javax.swing.*;

 class Field {
//исходное игровое поле ввиде двумерного массива
     private static char [][] a = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
//вывод игрового поля на консоль
     static void showField() {
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a[i].length; j++) {
                 System.out.print(a[i][j] + " ");
             }
             System.out.println();
         }
     }
//изменения значения элеентов игрового поля
     static void changeField(int c, char b){
         switch (c){
             case 1:
                 a[0][0] = b;
                 break;
             case 2:
                 a[0][1] = b;
                 break;
             case 3:
                 a[0][2] = b;
                 break;
             case 4:
                 a[1][0] = b;
                 break;
             case 5:
                 a[1][1] = b;
                 break;
             case 6:
                 a[1][2] = b;
                 break;
             case 7:
                 a[2][0] = b;
                 break;
             case 8:
                 a[2][1] = b;
                 break;
             case 9:
                 a[2][2] = b;
                 break;
             default:
                 break;
         }
     }
 }
