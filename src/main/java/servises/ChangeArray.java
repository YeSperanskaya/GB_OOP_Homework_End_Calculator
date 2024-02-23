package servises;

import calculator.Calculator;
import view.DataInput;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ChangeArray {

//    DataInput dataInput = new DataInput();
List<Double> listNumbers = new ArrayList<>();
List<String> listCommands = new ArrayList<>();


    public void changeArray(int i, double newMeaning) {
        listCommands.remove(i);
        listNumbers.set(i, newMeaning);
        listNumbers.remove(i+1);
    }

    public ChangeArray(List<Double> listNumbers, List<String> listCommands) {
        this.listNumbers = listNumbers;
        this.listCommands = listCommands;
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
