package Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntroProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TextAndLineCounter textCounter = new TextAndLineCounter();

        String currentRow = scanner.nextLine();

        int charCountResult = 0;
        List<String> lines = new ArrayList<>();

        while(!currentRow.contains("stop")) {
            lines.add(currentRow);

            int currentResult = textCounter.CountChars(currentRow);

            charCountResult = charCountResult + currentResult;
            currentRow = scanner.nextLine();
        }

        charCountResult =  charCountResult + textCounter.CountChars(currentRow);
        int numberOfRowsCount = textCounter.CountRows(lines);

        System.out.println("Number of chars: " + charCountResult);
        System.out.println("Number of rows: " + numberOfRowsCount);
    }
}
