package com.techb.javaBasics;

public class Words {

    private String sentence;
    private String[] split_sentence;
    private int count;

    public Words(String sentence) {
        this.sentence = sentence;
    }

    public void split(){
        split_sentence = sentence.split(" ");
    }

    public  void countWords(){
        count = split_sentence.length;
    }

    public void printWordCount(){
        System.out.println("The number of words in the sentence '" + sentence + "' is " + count);
    }

}
