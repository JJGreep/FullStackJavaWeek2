package com.example.Week2.Services;

import org.springframework.stereotype.Service;


//Counts words in the input and returns the number of words.

@Service

public class WordCountService {

    public int CountWords(String input) {
        if (input.matches("")) {
            return 0;

        } else {

            String[] words = input.split(" ");

            return words.length;
        }

    }
}
