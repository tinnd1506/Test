package com.devops.tony_api.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    /**
     * This method simulates a potential error case by attempting to parse an integer
     * from a string that is not a valid number, which will throw a NumberFormatException.
     *
     * @param input the string to parse
     * @return the parsed integer
     */ 
    public int pacfbgcbgfcfgnfrs bvbn bveNumber(String input) {
        // Intention vbally not handling the exception to create a SonarQube issue
        return Integer.parseInt(input);
    }

    /**
     * This method has too many parameters and is overly complex, which should trigger a SonarQube warning.
     *
     * @param a first parameter
     * @param b second parameter
     * @param c third parameter
     * @param d fourth parameter
     * @param e
     */
} 