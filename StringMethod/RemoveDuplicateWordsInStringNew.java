package week3.day1.homeassignment.StringMethod;

public class RemoveDuplicateWordsInStringNew {

	public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";

        // Expected output: “We learn Java basics as part of sessions in week1”
        String[] splitText = text.split(" ");
        int count;

        // Nested loop to find duplicates
        for (int i = 0; i < splitText.length; i++) {
            if (splitText[i].isEmpty()) {
                continue; // Skip already marked duplicates
            }
            count = 0;
            for (int j = i + 1; j < splitText.length; j++) {
                if (splitText[i].equalsIgnoreCase(splitText[j])) {
                    // Mark the duplicate as an empty string
                    splitText[j] = "";
                    count++;
                }
            }
            // If duplicate found, remove the current word
            if (count > 0) {
                splitText[i] = "";
            }
        }

        // Build the modified string
        StringBuilder result = new StringBuilder();
        for (String word : splitText) {
            if (!word.isEmpty()) {
                result.append(word).append(" ");
            }
        }

        // Print the final result
        System.out.println("Modified text: " + result.toString().trim());
    }
}
