package bai3;

public class attack {
	public static void main(String[] args) {
        human p1 = new human();
        human p2 = new human();
        System.out.println("Input info P1:");
        p1.Input();
        System.out.println("Input info P2:");
        p2.Input();
        do {
            for (int i = 0; i < 4; i++) {
                p2.HP -= p1.dmg;
                if (p2.HP > 0) {
                    System.out.println("\nStatus \nP1.HP: " + p1.HP + "\nP2.HP: " + p2.HP);
                } else {
                    System.out.println("\nP1 is a winner\nP1.HP: " + p1.HP);
                    return;
                }
            }
            for (int i = 0; i < 5; i++) {
                p1.HP -= p2.dmg;
                if (p1.HP > 0) {
                    System.out.println("\nStatus \nP1.HP: " + p1.HP + "\nP2.HP: " + p2.HP);
                } else {
                    System.out.println("\nP2 is a winner\nP1.HP: " + p2.HP);
                    return;
                }
            }
        } while (true);
    }

}
