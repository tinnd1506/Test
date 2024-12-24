package com.devops.tony_api.service;

import com.devops.tony_api.model.TreeModel; // Importing the TreeModel class to use its functionality
import org.springframework.stereotype.Service; // Importing the Service annotation from Spring framework

/**
 * Service class responsible for tree-related operations.
 */
@Service
public class TreeService {
    
    /**
     * Decorates a tree with the specified color if valid.
     *
     * @param color the color to decorate the tree
     * @return the color of the tree if valid, otherwise an error message
     */
    public String decorateTree(String color) {
        // Check if the provided color is one of the valid options
        if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("white") || color.equalsIgnoreCase("green")) {
            // Create a new TreeModel instance with the specified color
            new TreeModel(color);
            // Return the valid color of the tree
            return color; 
        } else {
            // Return an error message for invalid color input
            return "Invalid color. Please choose red, white, or green.";
        }
    }
}