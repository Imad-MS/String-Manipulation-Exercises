package com.techb.javaBasics;
import java.util.Collections;

public class LastLetterCount {
    private String sentence;
    private String[] split_sentence;
    private int y_first_instance;
    private int s_first_instance;
    private int y_instances = 0;
    private int s_instances = 0;

    public LastLetterCount(String sentence) {
        this.sentence = sentence;
    }

    public void split(){
        split_sentence = sentence.split(" ");
    }

    public void countInstances(){
        for(int i = 0; i < split_sentence.length; i++){
            if(split_sentence[i].endsWith("s") || split_sentence[i].endsWith("s.") || split_sentence[i].endsWith("s,")
                    || split_sentence[i].endsWith("s!")){
                s_instances++;
            } else if (split_sentence[i].endsWith("y") || split_sentence[i].endsWith("y.")|| split_sentence[i].endsWith("y,")
                    || split_sentence[i].endsWith("y!")){
                y_instances++;
            }
        }
    }

    public void replace(){
        for(int i = 0; i < split_sentence.length; i++){
            if(split_sentence[i].endsWith("s") || split_sentence[i].endsWith("s.") || split_sentence[i].endsWith("s,")
                || split_sentence[i].endsWith("s!")){
                s_first_instance = i;
                break;
            }
        }

        for(int i = 0; i < split_sentence.length; i++){
            if (split_sentence[i].endsWith("y") || split_sentence[i].endsWith("y.")|| split_sentence[i].endsWith("y,")
                    || split_sentence[i].endsWith("y!")){
                y_first_instance = i;
                break;
            }
        }

        String y_word = split_sentence[y_first_instance];
        String s_word = split_sentence[s_first_instance];

        split_sentence[s_first_instance] = y_word;
        split_sentence[y_first_instance] = s_word;
    }

    public void display(){
        StringBuilder final_sentence = new StringBuilder();
        for(int i = 0; i < split_sentence.length; i++){
            final_sentence.append(split_sentence[i] + " ");
        }
        String final_sentence_string = final_sentence.toString();
        System.out.println(final_sentence_string);
        System.out.println("Instances of words ending in 'y': " + y_instances);
        System.out.println("Instances of words ending in 's': " + s_instances);
    }

}
