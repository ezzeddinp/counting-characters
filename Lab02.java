package LabAssignment;
import javax.swing.JOptionPane;

// CountChars
public class Lab02 {
    public static void main(String[] args) {
        String phrase;
        int length, countSpace, countA, countE, countI, countO, countU, countConsonants, countOther;

        do {
            // Read in a string and find its length
            phrase = JOptionPane.showInputDialog(null,
                "Enter a sentence or phrase, quit to end:\n",
                "Character Counter", JOptionPane.PLAIN_MESSAGE);

            // Check if the user entered "quit" to end the program
            if (phrase.equalsIgnoreCase("quit")) { // user input quit then it will stop
                break;
            }

            // Initialize counts
            countSpace = 0;
            countA = 0;
            countE = 0;
            countI = 0;
            countO = 0;
            countU = 0;
            countConsonants = 0;
            countOther = 0;

            // Loop through the characters in the given phrase
            for (int i = 0; i < phrase.length(); i++) {
                char ch = phrase.charAt(i);

                // Count characters by category
                switch (Character.toLowerCase(ch)) {
                    case 'a':
                        countA++;
                        break;
                    case 'e':
                        countE++;
                        break;
                    case 'i':
                        countI++;
                        break;
                    case 'o':
                        countO++;
                        break;
                    case 'u':
                        countU++;
                        break;
                    case ' ':
                        countSpace++;
                        break;
                    default:
                        if (Character.isLetter(ch)) {
                            countConsonants++;
                        } else {
                            countOther++;
                        }
                        break;
                }
            }

            // Print the results
            JOptionPane.showMessageDialog(null,
                "Space: " + countSpace + "\nA: " + countA + "\nE: " +
                countE + "\nI: " + countI + "\nO: " + countO +
                "\nU: " + countU + "\nConsonants: " + countConsonants +
                "\nOthers: " + countOther + "\nThe input was: \n" +
                phrase, "Totals", JOptionPane.PLAIN_MESSAGE);

        } while (true); // This creates an infinite loop, which can be exited using the `break` statement when the user enters "quit".

    }
}
