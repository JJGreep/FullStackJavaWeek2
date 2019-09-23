package com.example.Week2.Controllers;

import com.example.Week2.Services.SaveInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Controls the SaveInputService and maps it to a GET request.

@Controller
@RequestMapping("PutInputs")

public class SaveInputController {

    @Autowired
    private SaveInputService saveInputService;

    public SaveInputController(SaveInputService saveInputService) {
        this.saveInputService = saveInputService;
    }

    @GetMapping(value ="/{input}", produces = "application/json" )
    @ResponseBody String PutInputs(@PathVariable String input){
        return SaveInputs(input);
    }

    private String SaveInputs(String input){
        return saveInputService.AddInput(input);

    }

}
