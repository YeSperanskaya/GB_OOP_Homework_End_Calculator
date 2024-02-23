package view;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataInput {
    List<Double> listNumbers = new ArrayList<>();
    List<String> listCommands = new ArrayList<>();
    public void introductionOfExample(){
        boolean end = true;
        while (end) {
            addedNumber();
            addedNumber();
            addedCommand();
            if (listCommands.contains('=')) end = false;
        }

    }

    private void addedNumber() {
        System.out.println("Введите число с плавающей точкой: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean end = true;
        while (end) {
            if(isDigit(input)) {
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
            if(isCorrectCharacter(input)) {
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


    private boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isCorrectCharacter(String str){
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("=")) {
            return true;
        } else {
            return false;
        }
    }

    public List<Double> getListNumbers() {
        return listNumbers;
    }

    public List<String> getListCommands() {
        return listCommands;
    }
}
