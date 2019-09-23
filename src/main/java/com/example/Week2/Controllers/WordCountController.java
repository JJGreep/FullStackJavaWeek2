package com.example.Week2.Controllers;


import com.example.Week2.Services.WordCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

//Controls the WordCountService and maps it to a GET request.

@Controller

public class WordCountController {


    @Autowired
    private final WordCountService wordCountService;

    @GetMapping(value ="/{input}", produces = "application/json" )
    @ResponseBody int CountWords(@PathVariable String input){ return WordCounts(input); }


    public WordCountController(WordCountService wordCountService) {
        this.wordCountService = wordCountService;
    }

    private int WordCounts(String input){
        return wordCountService.CountWords(input);
    }

}
