package com.example.Week2.Controllers;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReverseServiceControllerTest {

    @Autowired
    private ReverseController controller;

    @Test
    public void controllerShouldReturnReverse() {
      assertThat(controller.ReverseInput("zeven"), CoreMatchers.equalTo("nevez"));
      assertThat(controller.ReverseInput("drie vier vijf"), CoreMatchers.equalTo("fjiv reiv eird"));
    }
}
