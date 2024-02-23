//package view;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class DataInput {
//    List<Double> listNumbers = new ArrayList<>();
//    List<String> listCommands = new ArrayList<>();
//    public void introductionOfExample(){
//        boolean end = true;
//        while (end) {
//            addedNumber();
//            addedCommand();
//            if (listCommands.contains('=')) end = false;
//        }
//
//    }
//
//    private void addedNumber() {
//        System.out.println("Введите число с плавающей точкой: ");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        boolean end = true;
//        while (end) {
//            if(Double.parseDouble(input)) {
//                listNumbers.add(Double.valueOf(input));
//                end = false;
//            } else {
//                System.out.println("Вы ввели неверное значение, введите число с плавающей точкой");
//                input = sc.next();
//            }
//        }
//        sc.close();
//    }
//
//    private void addedCommand() {
//        System.out.println("Введите одну из следующих комманд: '+' '-' '*' '/' '=': ");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        boolean end = true;
//        while (end) {
//            switch (input) {
//                case ("+"):
//                    listCommands.add(input);
//                    break;
//                case "-":
//                    listCommands.add(input);
//                    break;
//                case "*":
//                    listCommands.add(input);
//                    break;
//                case "/":
//                    listCommands.add(input);
//                    break;
//                case "=":
//                    listCommands.add(input);
//                    break;
//                default:
//                    System.out.println("Вы ввели неверное значение!");
//                    System.out.println("Введите одну из следующих комманд: '+' '-' '*' '/' '=': ");
//                    input = sc.next();
//            }
//        }
//        sc.close();
//    }
//
//    public List<Double> getListNumbers() {
//        return listNumbers;
//    }
//
//    public List<String> getListCommands() {
//        return listCommands;
//    }
//}
