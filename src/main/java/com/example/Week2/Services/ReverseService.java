package com.example.Week2.Services;

import org.springframework.stereotype.Service;

//Reverses the string input and returns it.

@Service
public class ReverseService {

    public String reverseThis(String input){

        return new StringBuilder(input).reverse().toString();

    }
}
