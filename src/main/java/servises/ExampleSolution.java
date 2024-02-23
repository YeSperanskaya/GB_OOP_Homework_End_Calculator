package servises;

import calculator.Calculator;
import view.DataInput;

import java.util.ArrayList;
import java.util.List;

public class ExampleSolution {
    Calculator calculator = new Calculator();

    List<String> listCommands = new ArrayList<>();
    List <Double> listNumbers = new ArrayList<>();
    ChangeArray changeArray = new ChangeArray(this.listNumbers, this.listCommands);

    public ExampleSolution(List<String> listCommands, List<Double> listNumbers) {

        this.listCommands = listCommands;
        this.listNumbers = listNumbers;
    }

    public List<Double> exampleSolution() {

        int i = 0;
        double newMeaning;
        while (listNumbers.size() > 1) {
            if (isExistMultyDiv()) {
                if(listCommands.get(i).equals("*")) {
                    newMeaning = calculator.multy(listNumbers.get(i), listNumbers.get(i+1));
                    changeArray.changeArray(i, newMeaning);
                } else if (listCommands.get(i).equals("/")) {
                    newMeaning = calculator.division(listNumbers.get(i), listNumbers.get(i+1));
                    changeArray.changeArray(i, newMeaning);
                } else {
                    i++;
                }
            } else {
                i=0;
                if(listCommands.get(i).equals("+")) {
                    newMeaning = calculator.sum(listNumbers.get(i), listNumbers.get(i+1));
                    changeArray.changeArray(i, newMeaning);
                } else if (listCommands.get(i).equals("-")) {
                    newMeaning = calculator.subtraction (listNumbers.get(i), listNumbers.get(i+1));
                    changeArray.changeArray(i, newMeaning);
                }
                i++;
            }
            i=0;
        }
        return listNumbers;

    }

    private boolean isExistMultyDiv() {
        if (changeArray.listCommands.contains("*") || changeArray.listCommands.contains("/")) {
            return true;
        } else {
            return false;
        }
    }



}
