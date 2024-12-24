package com.devops.tony_api.service;

import com.devops.tony_api.model.VideoModel;

import org.springframework.stereotype.Service;

/**
 * Service class for handling operations related to Tony's videos.
 */
@Service
public class TonyService {

    private static final String YOUTUBE_BASE_URL = "https://www.youtube.com/watch?v=";

    /**
     * Retrieves a VideoModel object representing Tony's video.
     *
     * @return VideoModel containing the full video URL.
     */
    public VideoModel getTonyVideo() {
        String videoId = "aAkMkVFwAoo";
        String videoUrl = YOUTUBE_BASE_URL + videoId;
        return new VideoModel(videoUrl);
    }
} 