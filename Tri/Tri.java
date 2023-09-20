import java.util.ArrayList;
import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        int two = scan.nextInt();
        int three = scan.nextInt();

        ArrayList<String> lol = getOutput(one, two, three);

        // String stringToReturn = "";

        // for (String l : lol) {
        // if (stringToReturn.length() > 0) {
        // stringToReturn = stringToReturn + " " + l;
        // } else {
        // stringToReturn = l;
        // }
        // }

        for (String l : lol) {
            System.out.println(l);
            return;
        }
    }

    public static ArrayList<String> getOutput(int one, int two, int three) {
        ArrayList<String> x = new ArrayList<>();
        // plus/minus
        if ((one + two) == three) {
            x.add(one + "+" + two + "=" + three);
        }
        if ((one - two) == three) {
            x.add(one + "-" + two + "=" + three);
        }
        if ((three + two) == one) {
            x.add(one + "=" + two + "+" + three);
        }
        if ((two - three) == one) {
            x.add(one + "=" + two + "-" + three);
        }
        // multiply/divide
        if ((one * two) == three) {
            x.add(one + "*" + two + "=" + three);
        }
        if ((two * three) == one) {
            x.add(one + "=" + two + "*" + three);
        }
        if ((one / two) == three) {
            x.add(one + "/" + two + "=" + three);
        }
        if ((two / three) == one) {
            x.add(one + "=" + two + "/" + three);
        } else if ((one / two) == three && (one % two) == 0) {
            x.add(one + "/" + two + "=" + three);
        } else if (one == (two / three) && (two % three) == 0) {
            x.add(one + "=" + two + "/" + three);
        }
        return x;
    }
}