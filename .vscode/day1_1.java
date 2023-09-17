import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class day1_1 {
    public static void main(String[] args) {

        int freq = 0;

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("day1-input.txt")));

            while (scanner.hasNextInt()) {
                freq += scanner.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Target frequency is " + freq);
   }
}
