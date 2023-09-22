import java.util.ArrayList;
import java.util.Scanner;

public class Avogadro { // works but bad runtime, hej
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columns = sc.nextInt();

        int i = 0;
        int j = 0;
        int k = 0;

        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();
        ArrayList<Integer> r3 = new ArrayList<>();

        while (i < columns) {
            r1.add(sc.nextInt());
            i++;
        }
        while (j < columns) {
            r2.add(sc.nextInt());
            j++;
        }
        while (k < columns) {
            r3.add(sc.nextInt());
            k++;
        }
        sc.close();
        removeColumns(r1, r2, r3);
        System.out.println(columns - r1.size());
    }

    public static ArrayList<Integer>[] removeColumns(ArrayList<Integer> row1, ArrayList<Integer> row2, ArrayList<Integer> row3) {
        int row1length = row1.size();
        for (int a = 0; a < row1.size(); a++) {
            int numToCheck = row1.get(a);
            boolean oneExistsInArray2 = false;
            boolean oneExistsInArray3 = false;

            if(row2.contains(numToCheck)){
                oneExistsInArray2 = true;
            }

            if(row3.contains(numToCheck)){
                oneExistsInArray3 = true;
            }

            if (!oneExistsInArray2 || !oneExistsInArray3) {
                row1.remove(a);
                row2.remove(a);
                row3.remove(a);
                int index1 = row2.indexOf(numToCheck);
                if (index1 >= 0) {
                    row1.remove(index1);
                    row2.remove(index1);
                    row3.remove(index1);
                }
                int index2 = row3.indexOf(numToCheck);
                if (index2 >= 0) {
                    row1.remove(index2);
                    row2.remove(index2);
                    row3.remove(index2);
                }
            }
        }

        ArrayList<Integer>[] rows = (ArrayList<Integer>[]) new ArrayList[3];

        rows[0] = row1;
        rows[1] = row2;
        rows[2] = row3;


        // rows.add(row1);
        // rows.add(row2);
        // rows.add(row3);

        if(row1length > row1.size()){
            removeColumns(row1, row2, row3);
        }

        return rows;
    }
}