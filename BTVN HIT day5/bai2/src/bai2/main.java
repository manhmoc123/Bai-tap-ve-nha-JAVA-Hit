package bai2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Knight nv = new Knight();
        System.out.println("Let's input");
        nv.Input();
        do {
            nv.Show();
            System.out.println("\nLet's choose\n1.HEAL");
            System.out.println("!1.EXIT");
            int op = sc.nextByte();
            switch (op) {
                case 1:
                    if (nv.MP < 50 || nv.HP <= 0) {
                        System.out.println("\nNot enought MP");
                    } else {
                        nv.Heal();
                    }
                    break;
                default:
                    System.out.println("\nGood bye");
                    return;
            }
        } while (true);
 
	}

}
