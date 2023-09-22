import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Modulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] arrOfInts = new int[10];
        int[] arrOfModulos = new int[10];
        while (i < 10) {
            arrOfInts[i] = sc.nextInt();
            i++;
        }

        sc.close();

        for (int j = 0; j < 10; j++) {
            int mod = arrOfInts[j] % 42;
            arrOfModulos[j] = mod;
        }

        Set<Integer> set = new HashSet<Integer>();
        for (int k = 0; k < arrOfModulos.length; k++) {
            set.add(arrOfModulos[k]);
        }
        int counter = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            it.next();
            counter++;
        }
        System.out.println(counter);
    }
}
