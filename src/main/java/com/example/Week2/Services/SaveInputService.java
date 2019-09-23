package com.example.Week2.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


//Saves input and word count to a Hash Map. Returns a string.

@Service
public class SaveInputService {

    private HashMap<String, Integer> Inputs = new HashMap<>();

    @Autowired
    private WordCountService wordCountService = new WordCountService();

    public String AddInput( String input){
        if (input == null || input.equals("")){
            return "Provide Input!";
        }

        if (input.matches("[0-9]+")){
            return "Those are just numbers!";
        }

        else{

            String message = "";
            if( Inputs.containsKey(input)){

                message = "Input was already saved! Count = ";


            }
            else {
                Inputs.put(input, wordCountService.CountWords(input));
                message = "Input saved! Count = ";
            }

            int count = Inputs.get(input);
            return message + count;

        }

    }

}
