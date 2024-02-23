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

    public double exampleSolution() {
        int i = 0;
        while (listNumbers.size() > 1) {
            if (listCommands.get(i).equals("*") || listCommands.get(i).equals("/")) {
                if

            }
        }

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
