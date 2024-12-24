package com.devops.tony_api.service;

import com.devops.tony_api.model.VideoModel;
import org.springframework.stereotype.Service;

/**
 * Service class for handling operations related to videos.
 */
@Service
public class VideoService {

    private static final String YOUTUBE_BASE_URL = "https://www.youtube.com/watch?v=";

    private String getVideoUrl(String videoId) {
        return YOUTUBE_BASE_URL + videoId;
    }

    /**
     * Retrieves a VideoModel object containing a single string of concatenated song URLs.
     *
     * @return VideoModel containing a string of all video URLs for songs.
     */
    public VideoModel getSongs() {
        // Directly return the concatenated string of song URLs
        return new VideoModel(String.join(", ", 
            getVideoUrl("KQQU2ykEQqo"), 
            getVideoUrl("z16tkLfSD1Y"), 
            getVideoUrl("mZbF6RL8d6I")
        ));
    }

    /**
     * Retrieves a VideoModel object representing Tony's video.
     *
     * @return VideoModel containing the full video URL for Tony's video.
     */
    public VideoModel getTonyVideo() {
        String videoId = "aAkMkVFwAoo";
        return new VideoModel(getVideoUrl(videoId));
    }
}