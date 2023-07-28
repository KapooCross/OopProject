package by.itstep.j1022.JB.model.view;

public class Print implements Printer{

    @Override
    public void printToConsole(String str) {
        System.out.println(str);
    }
}
