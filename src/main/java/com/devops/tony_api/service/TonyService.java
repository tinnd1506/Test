package com.devops.tony_api.service;

import com.devops.tony_api.model.VideoModel;

import org.springframework.stereotype.Service;

/**
 * Service class for handling operations related to Tony's videos.
 */
@Service
public class TonyService {

    /**
     * Retrieves a VideoModel object representing Tony's video.
     *
     * @return VideoModel containing the video ID, title, and description.
     */
    public VideoModel getTonyVideo() {
        return new VideoModel("aAkMkVFwAoo", "Tony's Song", "A fun song by Tony.");
    }
} 