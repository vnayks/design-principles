package TemplateAndStrategy;

import java.util.Scanner;

public class FtoCTemplate extends Template {

    public static void main(String[] args){
        new FtoCTemplate().run();
    }


    @Override
    protected void init() {
        System.out.println("Running from template method");
    }

    @Override
    protected void idle() {
        Scanner scanner = new Scanner(System.in);
        String fahr = scanner.next();
        if(fahr.equals("q")){
            setDone(true);
        }
        else {
            double f = Double.parseDouble(fahr);
            double c = (5.0 / 9.0) * (f - 32);
            System.out.println(String.format("Fahrenheit : %s, Celsius : %s", String.valueOf(f), String.valueOf(c)));
        }
    }

    @Override
    protected void cleanUp() {
        System.out.println("Good bye!!");
    }
}
