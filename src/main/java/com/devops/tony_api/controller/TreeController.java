package com.devops.tony_api.controller;

import com.devops.tony_api.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class responsible for handling tree-related HTTP requests.
 */
@RestController
public class TreeController {
    private final TreeService treeService;

    /**
     * Constructs a TreeController with the specified TreeService.
     *
     * @param treeService the service used to perform tree-related operations
     */
    @Autowired
    public TreeController(TreeService treeService) {
        this.treeService = treeService;
    }

    /**
     * Handles POST requests to decorate a tree with the specified color.
     *
     * @param color the color to decorate the tree
     * @return a ResponseEntity containing the result of the operation
     */
    @PostMapping("/decorate-tree")
    public ResponseEntity<String> decorateTree(@RequestParam String color) {
        String response = treeService.decorateTree(color);
        return ResponseEntity.ok(response);
    }
}