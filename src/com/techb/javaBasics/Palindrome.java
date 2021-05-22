package com.techb.javaBasics;

public class Palindrome {
    private String word;
    private String word_reversed;

    public Palindrome(String word) {
        this.word = word;
    }

    public void reverse(){
        StringBuilder reversed = new StringBuilder();
        reversed.append(word);
        reversed.reverse();
        word_reversed = reversed.toString();
        System.out.println(word_reversed);
    }

    public void judge(){
        if(word.equals(word_reversed)) {
            System.out.println("'" + word + "' is a palindrome.\n");
        } else {
            System.out.println("'" + word + "' is not a palindrome.\n");
        }
    }

}
