package servises;

import calculator.Calculator;

import java.util.ArrayList;
import java.util.List;

public class ExampleSolution {
    Calculator calculator = new Calculator();

    List<String> listCommands = new ArrayList<>();
    List <Double> listNumbers = new ArrayList<>();


    public ExampleSolution(List<String> listCommands, List<Double> listNumbers) {
        for (int i = 0; i < listCommands.size(); i++) {
            this.listCommands.add(listCommands.get(i));
            this.listNumbers.add(listNumbers.get(1));
        }
        System.out.println(listCommands);
        System.out.println(listNumbers);
    }

    public List<Double> exampleSolution() {
        System.out.println("запуск exampleSolution");
        while (listNumbers.size() > 1) {
            if (isExistMultyDiv()) {
                whileExistMultuDiv();
            } else {
                whenNewerMultuDiv();
            }
        }
        System.out.println("отработал exampleSolution");
        return this.listNumbers;

    }

    private boolean isExistMultyDiv() {
        if (this.listCommands.contains("*") || this.listCommands.contains("/")) {
            return true;
        } else {
            return false;
        }
    }


    private void changeArray(int i, double newMeaning) {
        this.listCommands.remove(i);
        this.listNumbers.set(i, newMeaning);
        this.listNumbers.remove(i+1);
    }


    private void whileExistMultuDiv(){
        double newMeaning;
        for (int i = 0; i < listCommands.size(); i++) {
            if(listCommands.get(i).equals("*")) {
                newMeaning = calculator.multy(listNumbers.get(i), listNumbers.get(i+1));
                changeArray(i, newMeaning);
            } else if (listCommands.get(i).equals("/")) {
                newMeaning = calculator.division(listNumbers.get(i), listNumbers.get(i+1));
                changeArray(i, newMeaning);
            }
        }

    }


    private void whenNewerMultuDiv() {
        double newMeaning;
        for (int i = 0; i < listCommands.size(); i++) {
            if(listCommands.get(i).equals("+")) {
                newMeaning = calculator.sum(listNumbers.get(i), listNumbers.get(i+1));
                changeArray(i, newMeaning);
            } else if (listCommands.get(i).equals("-")) {
                newMeaning = calculator.subtraction(listNumbers.get(i), listNumbers.get(i+1));
                System.out.println("новое значение при вычитании равно: " +  newMeaning);
                changeArray(i, newMeaning);
                System.out.println("отработал минус");
            }
        }
    }


}
