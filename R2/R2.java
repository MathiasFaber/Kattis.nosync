package R2;

import java.util.Scanner;

public class R2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int c = b * 2 - a;
        System.out.println(c);
    }
}
