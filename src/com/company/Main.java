package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a;
	Scanner S = new Scanner(System.in);
	a = S.nextInt();
	switch (a){
        case 1:
            System.out.println("Pirmas");
            break;
        case 2:
            System.out.println("Antras");
            break;
        case 3:
            System.out.println("Trečias");
            break;
        default:
            System.out.println("?");
    }

    }
}
