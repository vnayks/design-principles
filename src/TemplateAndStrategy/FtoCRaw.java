package TemplateAndStrategy;

import java.util.Scanner;

public class FtoCRaw {

    public static void main(String[] args){
        boolean done = false;
        Scanner scanner = new Scanner(System.in);

        while(!done){
            String fahrString = scanner.next();

            if(fahrString.equals(null) || fahrString.length()==0 || fahrString.equals("q")){
                done = true;
            }
            else{
                double fahr = Double.parseDouble(fahrString);
                double celsius = (5.0/9.0)*(fahr-32);
                System.out.println(String.format("Fahrenheit : %s, Celsius : %s", String.valueOf(fahr), String.valueOf(celsius)));

            }
        }
    }
}
