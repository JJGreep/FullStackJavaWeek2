package com.example.Week2.Controllers;

import com.example.Week2.Services.ReverseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Controls the ReverseService and maps it to a GET request.

@Controller
@RequestMapping("ReverseInput")

public class ReverseController{

    @Autowired
    private final ReverseService reverseService;

    public ReverseController(ReverseService reverseService) {
        this.reverseService = reverseService;
    }

    @GetMapping(value ="/{input}", produces = "application/json" )
    @ResponseBody String ReverseInput(@PathVariable String input){ return ReverseIt(input); }


    private String ReverseIt(String input) {
        return reverseService.reverseThis(input);
    }

}
