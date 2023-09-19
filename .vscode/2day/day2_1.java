import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class day2_1 {
    public static void main(String[] args) {

        int twoCount = 0;
        int threeCount = 0;

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(".vscode\\2day\\day2-input.txt")));

            while (scanner.hasNextLine()) {
                String id = scanner.nextLine();

                if (countDupChars(id, 2)) {
                    twoCount++;
                }
                if (countDupChars(id, 3)) {
                    threeCount++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        System.out.printf("Checksum is %d * %d = %d", twoCount, threeCount, twoCount * threeCount);
    }

    private static boolean countDupChars(String text, int targetCount) {
        int[] charCounts = new int[26];

        for (int letter : text.chars().toArray()) {
            int index = letter - 'a';
            charCounts[index] += 1;
        }

        for (int count : charCounts) {
            if (count == targetCount)
                return true;
        }

        return false;
    }
}
