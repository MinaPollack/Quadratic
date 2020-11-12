package edu.bi.chapthree;

import java.util.*;

public class Quadratic {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        giveIntro();

        System.out.print("a = ? ");
        int a = console.nextInt();
        System.out.print("b = ? ");
        int b = console.nextInt();
        System.out.print("c = ? ");
        int c = console.nextInt();
        System.out.println();


        double x = (-b +- Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2 * a;
        double n = a * Math.pow(x,2);
        double t = b * x;
        System.out.print("x = " + (int) (x *100.0) / 100.0);

    }

    //intro for the user
    public static void giveIntro() {
        System.out.println("This program solves for x in a quadratic formula.");
        System.out.println();
    }
}
