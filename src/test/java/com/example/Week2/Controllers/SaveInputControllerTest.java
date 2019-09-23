package com.example.Week2.Controllers;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class SaveInputControllerTest {

    @Autowired
    private SaveInputController saveInputController;

    @Test
    public void testInputs() {
        assertThat(saveInputController.PutInputs("een twee drie vier vijf zes zeven"), containsString("Input saved! Count = 7"));
        assertThat(saveInputController.PutInputs("een twee drie vier vijf zes zeven"), containsString("Input was already saved! Count = 7"));
        assertThat(saveInputController.PutInputs("yes no"), containsString("Input saved! Count = 2"));
        assertThat(saveInputController.PutInputs("222"), containsString("Those are just numbers!"));
        assertThat(saveInputController.PutInputs(""), containsString("Provide Input!"));
    }

}