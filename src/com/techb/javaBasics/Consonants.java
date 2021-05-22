package com.techb.javaBasics;

public class Consonants {
    private String sentence;
    private int consonant_count;
    private String sentence_final;

    public Consonants(String sentence) {
        this.sentence = sentence;
    }

    public void countConsonants(){
        for (int i = 0; i < sentence.length(); i++){
            char current_char = sentence.charAt(i);
            if(!(current_char == 'a' || current_char == 'e' || current_char == 'i' || current_char == 'o' || current_char == 'u'
                    || current_char == 'A' || current_char == 'E' || current_char == 'I' || current_char == 'O' || current_char == 'U'
                    || current_char == '.' || current_char == '!' || current_char == '?' || current_char == ',' || current_char == '"')){
                consonant_count++;

            }
        }
    }

    public void replaceConsonants(){
        StringBuilder sentence_buff = new StringBuilder(sentence);
        for(int i = 0; i < sentence_buff.length(); i++){
            char current_char = sentence_buff.charAt(i);
            if(!(current_char == 'a' || current_char == 'e' || current_char == 'i' || current_char == 'o' || current_char == 'u'
                    || current_char == 'A' || current_char == 'E' || current_char == 'I' || current_char == 'O' || current_char == 'U'
                    || current_char == '.' || current_char == '!' || current_char == '?' || current_char == ',' || current_char == '"')){
                sentence_buff.setCharAt(i, '*');
            }
        }
        sentence_final = sentence_buff.toString();
    }

    public void display(){

        System.out.println("Number of consonants: " + consonant_count + "\n");
        System.out.println("Replaced Sentence: '" + sentence_final + "'");
    }



}
