import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        listOfPossibleWords();
    }

    public static void listOfPossibleWords() throws IOException {
        File allEnglishWordsFile = new File("C:\\Programming\\Java_fstetler\\WordleSolver\\english-words\\words.txt");
        Scanner scanner = new Scanner(allEnglishWordsFile);

        List<String> listEnglishWords = new ArrayList<>();
        while (scanner.hasNext()) {
            listEnglishWords.add(scanner.nextLine());
        }

        listEnglishWords.removeIf(word -> word.length() != 5);
        listEnglishWords = listEnglishWords.stream().map(String::toUpperCase).collect(Collectors.toList());

        for (int i = 0; i < 5; i++) {
            System.out.println("What is the " + (i + 1) + " letter of the word (if you dont know, just press enter)");
            Scanner letterFromTerminal = new Scanner(System.in);
            String inputString = letterFromTerminal.nextLine();

            List<String> listOfWords = new ArrayList<>();

            if (inputString.length() == 0) {
                continue;
            }

            for (String listEnglishWord : listEnglishWords) {
                if (listEnglishWord.toLowerCase().charAt(i) == inputString.toLowerCase().charAt(0)) {
                    listOfWords.add(listEnglishWord);
                }
            }
            listEnglishWords = listOfWords;
        }

        System.out.println("Please write a string of letters that you know arent included. All lower case and space between each (for example o k u c d)");
        Scanner lettersNotIncluded = new Scanner(System.in);
        String letters = lettersNotIncluded.nextLine();

        List<String> charsNotIncluded = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) != ' ') {
                charsNotIncluded.add(String.valueOf(letters.charAt(i)));
            }
        }

        List<String> listWords;
        for (String s : charsNotIncluded) {
            listWords = new ArrayList<>();
            for (String listEnglishWord : listEnglishWords) {
                if (!listEnglishWord.toLowerCase().contains(s.toLowerCase())) {
                    listWords.add(listEnglishWord);
                }
            }
            listEnglishWords = listWords;
        }

        System.out.println("Write the letters that you know are part of the word, in no specific order");
        Scanner scannedLettersIncluded = new Scanner(System.in);
        String lettersIncluded = scannedLettersIncluded.nextLine();

        List<String> charsIncluded = new ArrayList<>();
        for (int i = 0; i < lettersIncluded.length(); i++) {
            if (lettersIncluded.charAt(i) != ' ') {
                charsIncluded.add(String.valueOf(lettersIncluded.charAt(i)));
            }
        }

        List<String> finalWordList = new ArrayList<>();

        for (String word : listEnglishWords) {
            int count = 0;
            for (String c : charsIncluded) {
                if (word.contains(c.toUpperCase())) {
                    count += 1;
                }
            }

            if (count == charsIncluded.size()) {
                finalWordList.add(word);
            }
        }

        System.out.println("These are the possible words for your wordle problem:");
        System.out.println(finalWordList);
    }
}
