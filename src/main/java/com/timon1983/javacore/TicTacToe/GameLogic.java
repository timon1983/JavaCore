package main.java.com.timon1983.javacore.TicTacToe;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

 class GameLogic {

     private static Scanner scanner = new Scanner(System.in);
     private static Random random = new Random();

     //Выводим исходное игровое поле в консоль и вызываем метод inputValue() для ввода значений
     static void startGame() {
         System.out.println("Start game");
         Field.showField();
         System.out.println();
         inputValue();
     }
// Вводим значения поочередно с компьютером , проверяя наличие совпадений
     private static void inputValue() {
         String user = "Playeer";
         String computer = "CPU";
         ArrayList<Integer> playeer1 = new ArrayList<>();//значения введенные игроком
         ArrayList<Integer> playeer2 = new ArrayList<>();//значения введенные копьютером
         boolean start = true;
         boolean stop = true;

         while (start) {

             int x = scanner.nextInt();//считываем с консоли
             while(playeer1.contains(x) || playeer2.contains(x) || x < 1 || x > 9) { //проверка на неккорктный ввод
                 System.out.println("Incorrect input , try again");
                 x = scanner.nextInt();
             }
             playeer1.add(x);//добавляем в список
             Field.changeField(x,'X');//записываем в игровое поле положение Х
             Field.showField();//выводим обновленное игровое поле в консоль
             stop = chekWin(playeer1 , user);//проверяем выигрыш
             if (playeer1.size() >= 5 || stop == false) {
                 System.out.println("Game Over");
                 break;
             }

             int y = random.nextInt(9) + 1;//компьютер рандомно вводит значение от 1-9
             while(playeer1.contains(y) || playeer2.contains(y)) {   //проверка на неккорктный ввод
                 y = random.nextInt(9) + 1;
             }
             System.out.println(y);//показываем значение введенное компьютером
             playeer2.add(y);//добавляем в список
             Field.changeField(y,'O');//записываем в игровое поле положение Y
             Field.showField();//выводим обновленное игровое поле в консоль
             stop = chekWin(playeer2,computer);//проверяем выигрыш
             if (stop == false) {
                 System.out.println("Game Over");
                 break;
             }
         }
     }
// проверка выигрыша с помощью сравнения введенных значений с выигрышными комбинациями
     private static boolean chekWin(ArrayList<Integer> array , String playeer) {
             ArrayList<Integer> row1 = new ArrayList<Integer>();
             ArrayList<Integer> row2 = new ArrayList<Integer>();
             ArrayList<Integer> row3 = new ArrayList<Integer>();
             ArrayList<Integer> column1 = new ArrayList<Integer>();
             ArrayList<Integer> column2 = new ArrayList<Integer>();
             ArrayList<Integer> column3 = new ArrayList<Integer>();
             ArrayList<Integer> diagonal1 = new ArrayList<Integer>();
             ArrayList<Integer> diagonal2 = new ArrayList<Integer>();
             row1.add(1);
             row1.add(2);
             row1.add(3);
             row2.add(4);
             row2.add(5);
             row2.add(6);
             row3.add(7);
             row3.add(8);
             row3.add(9);
             column1.add(1);
             column1.add(4);
             column1.add(7);
             column2.add(2);
             column2.add(5);
             column2.add(8);
             column3.add(3);
             column3.add(6);
             column3.add(9);
             diagonal1.add(1);
             diagonal1.add(5);
             diagonal1.add(9);
             diagonal2.add(3);
             diagonal2.add(5);
             diagonal2.add(7);
             if(array.containsAll(row1) || array.containsAll(row2) || array.containsAll(row3) ||
                     array.containsAll(column1) || array.containsAll(column2) || array.containsAll(column3) ||
                     array.containsAll(diagonal1) || array.containsAll(diagonal2)) {
                 System.out.println(playeer + " is win!!!");
                 return false;}
                 else
                     return true;
             }
         }





