import java.util.ArrayList;
import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine().toLowerCase();
        String input2 = scanner.nextLine().toLowerCase();

        if(input1.indexOf('h')!= input1.length()-1){
            System.out.println("h was not the last letter");
        }

        if(input1.indexOf('a') == input1.length()-1){
            System.out.println("h was not the last letter");
        }
        
        int i = 0;
        while(i < input1.length()){
            if(input1.indexOf(i) != 'h' || input1.indexOf(i) != 'a'){
                System.out.println("included non a or h letters");
            }
            i++;
        }

        // for(char letter : input1.toCharArray()){
        //     if(letter != 'h' || letter != 'a'){
        //         System.out.println("The input was not an 'aaah'");
        //         return;
        //     }
        // }

        for(char letter : input1.toCharArray()){
            if(letter != 'h' || letter != 'a'){
                System.out.println("The input was not an 'aaah'");
                return;
            }
        }

        if (input1.length() > 0 && input2.length() > 0 && input1.length() < 1000 && input2.length() < 1000) {
            if (input1.length() > input2.length()) {
                System.out.println("go");
                return;
            } else {
                System.out.println("no");
                return;
            }
        }
    }
}

    