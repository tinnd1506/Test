package com.devops.tony_api.service;

import com.devops.tony_api.model.VideoModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VideoServiceTest {

    private final VideoService videoService = new VideoService();

    @Test
    void testGetSongs() {
        VideoModel videoModel = videoService.getSongs();
        String expectedUrl = "https://www.youtube.com/watch?v=KQQU2ykEQqo, https://www.youtube.com/watch?v=z16tkLfSD1Y, https://www.youtube.com/watch?v=mZbF6RL8d6I";
        assertEquals(expectedUrl, videoModel.getUrl());
    }

    @Test
    void testGetTonyVideo() {
        VideoModel videoModel = videoService.getTonyVideo();
        String expectedUrl = "https://www.youtube.com/watch?v=aAkMkVFwAoo";
        assertEquals(expectedUrl, videoModel.getUrl());
    }
}