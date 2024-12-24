package com.devops.tony_api.controller;

import com.devops.tony_api.model.VideoModel;
import com.devops.tony_api.service.TonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for handling requests related to Tony's video.
 */
@RestController
public class TonyController {
    private final TonyService tonyService;

    /**
     * Constructor for TonyController.
     * 
     * @param tonyService Service to handle video-related operations.
     */
    @Autowired
    public TonyController(TonyService tonyService) {
        this.tonyService = tonyService;
    }

    /**
     * Endpoint to retrieve Tony's video.
     * 
     * @return ResponseEntity containing the video model or an error message.
     */
    @GetMapping("/tony")
    public ResponseEntity<?> getTonyVideo() {
        try {
            VideoModel videoModel = tonyService.getTonyVideo();
            return ResponseEntity.ok(videoModel);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to load video. Please try again later.");
        }
    }
}
