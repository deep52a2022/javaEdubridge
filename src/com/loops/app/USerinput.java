package com.loops.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class USerinput {
    public static void main(String[] args) throws IOException {
        InputStreamReader ins = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ins);

        boolean loop = true;

        while(loop) {
            switch (br.readLine()) //Fall through execution
            {
                case "S":
                    System.out.println("Sunday");
                    break;
                case "M":
                    System.out.println("Monday");
                    break;
                case "T":
                    System.out.println("Tuesday");
                    break;
                case "W":
                    System.out.println("Wednesday");
                    break;
                case "Th":
                    System.out.println("Thursday");
                    break;
                case "F":
                    System.out.println("Friday");
                    break;
                case "Sa":
                    System.out.println("Saturday");
                    break;
                case "-1":
                    loop = false;
                    break;
                    default:
                    System.out.println("Wrong Choice..");

            }

        }


    }
}
