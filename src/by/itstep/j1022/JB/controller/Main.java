package by.itstep.j1022.JB.controller;

import by.itstep.j1022.JB.programInterface.Switcher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        while (true) {
            System.out.println(switcher.OPERATIONS);
            boolean operation = switcher.switcherOperation(enterVariable());
            if(!operation){
                System.out.println("BYE");
                break;
            }
        }

    }

    public static Integer enterVariable(){
        return new Scanner(System.in).nextInt();
    }
}