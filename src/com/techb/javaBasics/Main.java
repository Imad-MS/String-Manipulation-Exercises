package com.techb.javaBasics;
import java.util.Scanner;




public class Main {
    public static void vowelDemo(){
        System.out.println("1. VOWEL DEMO");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String sentence = input.nextLine();

        Vowel demo = new Vowel(sentence);

        demo.countVowels();
        demo.displayCount();
    }

    public static void palindromeDemo(){
        System.out.println("2. PALINDROME DEMO");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or sentence");
        String sentence = input.nextLine();

        Palindrome demo = new Palindrome(sentence);
        demo.reverse();
        demo.judge();

    }

    public static void wordsDemo(){
        System.out.println("3. WORDS DEMO");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String sentence = input.nextLine();

        Words demo = new Words(sentence);
        demo.split();
        demo.countWords();
        demo.printWordCount();

    }

    public static void consonantsDemo(){
        System.out.println("4. CONSONANTS DEMO");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String sentence = input.nextLine();

        Consonants demo = new Consonants(sentence);
        demo.countConsonants();
        demo.replaceConsonants();
        demo.display();

    }

    public static void lastLetterCountDemo(){
        System.out.println("5. LAST LETTER COUNT DEMO");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String sentence = input.nextLine();

        LastLetterCount demo = new LastLetterCount(sentence);
        demo.split();
        demo.countInstances();
        demo.replace();
        demo.display();
    }

    public static void main(String[] args) {
	// write your code here

        boolean flag = false;
        Scanner selection_input = new Scanner(System.in);

        while(flag == false){
            System.out.println("Enter the number of the exercise you want to demo:");
            System.out.println("(1) Vowels   (2) Palindrome   (3) Words    (4) Consonants   (5) Last Letter Count    (0) Exit");
            String selection = selection_input.nextLine();

            switch (selection){
                case "1":
                    vowelDemo();
                    break;
                case "2":
                    palindromeDemo();
                    break;
                case "3":
                    wordsDemo();
                    break;
                case "4":
                    consonantsDemo();
                    break;
                case "5":
                    lastLetterCountDemo();
                    break;
                case "0":
                    flag = true;
                    break;
                default:
                    System.out.println("'" + selection + "' is not a valid input. Enter a number between 1-6 to make your selection.\n");
                    break;
            }
        }

        System.out.println("Exited program.");

    }
}
