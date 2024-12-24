/** */
package com.devops.tony_api.model;

/**
 * Represents a model for a tree with a specific color.
 */
public class TreeModel {
    /**
     * The color of the tree.
     */
    private String color;

    /**
     * Constructs a TreeModel with the specified color.
     *
     * @param color the color of the tree
     */
    public TreeModel(String color) {
        this.color = color;
    }

    /**
     * Returns the color of the tree.
     *
     * @return the color of the tree
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the tree.
     *
     * @param color the new color of the tree
     */
    public void setColor(String color) {
        this.color = color;
    }
}