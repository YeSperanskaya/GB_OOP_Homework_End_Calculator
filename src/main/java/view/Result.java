package view;

import servises.ChangeArray;
import servises.ExampleSolution;

public class Result {
    public void start() {
        DataInput dataInput = new DataInput();
        dataInput.introductionOfExample();
        ExampleSolution exampleSolution = new ExampleSolution(dataInput.getListCommands(), dataInput.getListNumbers());
        System.out.println(exampleSolution.exampleSolution());
    }
}
