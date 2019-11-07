package club;

import java.util.Scanner;

public class club {
    public menber[] menbers;

    public void InputMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thành viên: ");
        int n = sc.nextInt();
        menbers = new menber[n];
        for (int i = 0; i < n; i++) {
            menbers[i] = new menber();
            System.out.println("Input infomation member[" + (i + 1) + "]");
            menbers[i].InputInfo();
        }
    }

    public void Show() {
        int ii=0;
        for (menber i : menbers) {
            ii++;
            System.out.print("Member[" + ii + "]: ");
            i.ShowInfo();
        }
    }
}
