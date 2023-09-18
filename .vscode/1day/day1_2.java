import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.io.FileReader;
import java.io.BufferedReader;

public class day1_2 {
    public static void main(String[] args) {

        List<Integer> inputList = new ArrayList<Integer>();

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(".vscode\\1day\\day1-input.txt")));

            while (scanner.hasNextInt()) {
                inputList.add(scanner.nextInt());
            }            
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        int freq = 0;
        Set<Integer> freqList = new HashSet<Integer>();
        boolean isFound = false;

        for (int i = 0; !isFound && i < inputList.size(); i++) {
            
            System.out.printf("No duplcates as of iteration %d (freq = %d, freqList.size = %d)\n", i, freq, freqList.size());

            for (Integer inputFreq : inputList) {

                freq += inputFreq;
                //System.out.println("\t" + inputFreq + " -> " + freq);

                if (freqList.contains(freq)) {
                    isFound = true;
                    break;
                } else {
                    freqList.add(freq);
                }
            }
        }

        System.out.println("The first duplicate frequency is: " + freq);
    }
}
