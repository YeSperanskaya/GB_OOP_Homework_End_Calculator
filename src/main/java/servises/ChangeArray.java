package servises;

import calculator.Calculator;
import view.DataInput;

import java.util.Calendar;
import java.util.List;

public class ChangeArray {
    Calculator calculator = new Calculator();
    DataInput dataInput = new DataInput();
    List<Double> listNumbers = dataInput.getListNumbers();
    List<String> listCommands = dataInput.getListCommands();

    public void exampleSolution() {
        int i = 0;
        double newMeaning;
        while (listNumbers.size() > 1 && i < listNumbers.size()) {
            if (isExistMultyDiv()) {
                if(listCommands.get(i).equals("*")) {
                    newMeaning = calculator.sum(listNumbers.get(i), listNumbers.get(i+1));
                } else if (listCommands.get(i).equals("/")) {
                    newMeaning = calculator.division(listNumbers.get(i), listNumbers.get(i+1));
                } else {
                    i++;
                }
            } else {

            }
        }

    }



    private boolean isExistMultyDiv() {
        if (listCommands.contains("*") || listCommands.contains("/")) {
            return true;
        } else {
            return false;
        }
    }

    private void changeArray(int i, double newMeaning) {
        listCommands.remove(i);
        listNumbers.set(i, newMeaning);
        listNumbers.remove(i+1);
    }

    /**
     * пока вообще содержится * или поделить надо делать только эти действия по порядку
     */

    /**
     * когда они вообще закончились только тогда делать + и -
     *
     *
     *
     * если содержит умножение деление, то делаем вот это если не модержит то вот это!
     */

}
