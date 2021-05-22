package com.techb.javaBasics;

public class Vowel {
    public Vowel(String sentence) {
        this.sentence = sentence;
    }

    //method for counting variables
    public void countVowels(){
        for (int i = 0; i < sentence.length(); i++){
            char current_char = sentence.charAt(i);
            if(current_char == 'a' || current_char == 'e' || current_char == 'i' || current_char == 'o' || current_char == 'u'
             || current_char == 'A' || current_char == 'E' || current_char == 'I' || current_char == 'O' || current_char == 'U'){
                vowel_count++;

            }
        }
    }
    public void displayCount(){
        System.out.println("Number of vowels: " + vowel_count + "\n");
    }

    private String sentence;
    private int vowel_count;

}
