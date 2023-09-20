import java.util.ArrayList;
import java.util.Scanner;

public class AvogadroOptimized { // works but bad runtime
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columns = sc.nextInt();

        int i = 0;
        int j = 0;
        int o = 0;

        var r1 = new int[columns];
        var r2 = new int[columns];
        var r3 = new int[columns];
        while (i < columns) {
            r1[i] = sc.nextInt();
            i++;
        }
        while (j < columns) {
            r2[j] = sc.nextInt();
            j++;
        }
        while (o < columns) {
            r3[o] = sc.nextInt();
            o++;
        }

        int[][] test = removeColumns(r1, r2, r3);

        int counter = 0;
        for (int k = 0; k < test[0].length; k++) {
            if(test[0][k] == 0 && test[1][k] == 0 && test[2][k] == 0){
                counter++;
            }
        }

        System.out.println(counter);
    }

    public static int[][] removeColumns(int[] row1, int[] row2, int[] row3) {
        int row1length = row1.length;
        boolean removedIndex = false;
        for (int a = 0; a < row1.length; a++) {
            int numToCheck = row1[a];
            boolean oneExistsInArray2 = false;
            boolean oneExistsInArray3 = false;

            for (int q1 : row2) {
                if (q1 == numToCheck) {
                    oneExistsInArray2 = true;
                    break;
                }
            }

            for (int q2 : row3) {
                if (q2 == numToCheck) {
                    oneExistsInArray3 = true;
                    break;
                }
            }

            if (!oneExistsInArray2 || !oneExistsInArray3) {
                removedIndex = true;

                row1[a] = 0;
                row2[a] = 0;
                row3[a] = 0;
                for (int h = 0; h < row2.length; h++) {
                    if (row2[h] == numToCheck) {
                        row2[h] = 0;
                    }
                }
                for (int l = 0; l < row3.length; l++) {
                    if (row2[l] == numToCheck) {
                        row2[l] = 0;
                    }
                }
            }
        }

        if (removedIndex) {
            removeColumns(row1, row2, row3);
        }

        int[][] rows = { row1, row2, row3 };

        if (row1length > row1.length) {
            removeColumns(row1, row2, row3);
        }

        return rows;
    }
}