package com.devops.tony_api.controller;

import com.devops.tony_api.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.function.Supplier;
import org.springframework.http.HttpStatus;

/**
 * Controller for handling requests related to Tony's video and songs.
 *///
@RestController
public class Controller {
    private final VideoService videoService;

    @Autowired
    public Controller(VideoService videoService) {
        this.videoService = videoService;
    }

    /**
     * Endpoint to retrieve Tony's video.
     * 
     * @return ResponseEntity containing the video model or an error message.
     */
    @GetMapping("/tony")
    public ResponseEntity<?> getTonyVideo() {
        return handleRequest(() -> videoService.getTonyVideo());
    }

    /**
     * Endpoint to retrieve a list of songs.
     * 
     * @return ResponseEntity containing a list of video models for songs or an
     *         error message.
     */
    @GetMapping("/songs")
    public ResponseEntity<?> getSongs() {
        return handleRequest(() -> videoService.getSongs());
    }

    private ResponseEntity<?> handleRequest(Supplier<?> supplier) {
        try {
            return ResponseEntity.ok(supplier.get());
        } catch (Exception e) {
            // Log the exception (optional)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("An error occurred. Please try again later.");
        }
    }
}