package view;


import servises.CheckingEnteredValues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataInput {
    CheckingEnteredValues checkingEnteredValues = new CheckingEnteredValues();
    List<Double> listNumbers = new ArrayList<>();
    List<String> listCommands = new ArrayList<>();
    public void introductionOfExample(){
        boolean end = true;
        while (end) {
            addedNumber();
            addedCommand();
            if (checkingEnteredValues.isEnd(listCommands))
            {
                end = false;
                System.out.println("Команда остановлена");
            }
        }

        System.out.println("Выход из цикла DataInput");
    }

    private void addedNumber() {
        System.out.println("Введите число с плавающей точкой: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean end = true;
        while (end) {
            if(checkingEnteredValues.isDigit(input)) {
                listNumbers.add(Double.valueOf(input));
                System.out.println("В список пример добавлена цифра " + Double.valueOf(input));
                end = false;
            } else {
                System.out.println("Вы ввели неверное значение, введите число с плавающей точкой");
                input = sc.next();
            }
        }

    }

    private void addedCommand() {
        System.out.println("Введите одну из следующих комманд: '+' '-' '*' '/' '=': ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean end = true;
        while (end) {
            if(checkingEnteredValues.isCorrectCharacter(input)) {
                listCommands.add(input);
                System.out.println("В пример добавлена команда " + input);
                end = false;
            } else {

                    System.out.println("Вы ввели неверное значение!");
                    System.out.println("Введите одну из следующих комманд: '+' '-' '*' '/' '=': ");
                    input = sc.next();
            }
        }
    }




    public List<Double> getListNumbers() {
        return listNumbers;
    }

    public List<String> getListCommands() {
        return listCommands;
    }

    public void setListNumbers(List<Double> listNumbers) {
        this.listNumbers = listNumbers;
    }

    public void setListCommands(List<String> listCommands) {
        this.listCommands = listCommands;
    }
}
