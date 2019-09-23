package com.example.Week2.Controllers;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class WordCountControllerTest {

    @Autowired
    private WordCountController wordCountController;



    @Test
    void controllerShouldReturnCount() throws Exception {

        assertEquals(7,wordCountController.CountWords("een twee drie vier vijf zes zeven"));
        assertEquals(1, wordCountController.CountWords("222"));
        assertEquals(0, wordCountController.CountWords(""));
    }
}