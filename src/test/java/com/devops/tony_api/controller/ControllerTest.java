package com.devops.tony_api.controller;

import com.devops.tony_api.service.VideoService;
import com.devops.tony_api.model.VideoModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

class ControllerTest {

    @Mock
    private VideoService videoService;

    @InjectMocks
    private Controller controller;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void testGetTonyVideo() throws Exception {
        when(videoService.getTonyVideo()).thenReturn(new VideoModel("https://www.youtube.com/watch?v=aAkMkVFwAoo"));

        mockMvc.perform(get("/tony"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.url").value("https://www.youtube.com/watch?v=aAkMkVFwAoo"));
    }

    @Test
    void testGetSongs() throws Exception {
        when(videoService.getSongs()).thenReturn(new VideoModel("https://www.youtube.com/watch?v=KQQU2ykEQqo, https://www.youtube.com/watch?v=z16tkLfSD1Y, https://www.youtube.com/watch?v=mZbF6RL8d6I"));

        mockMvc.perform(get("/songs"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.url").value("https://www.youtube.com/watch?v=KQQU2ykEQqo, https://www.youtube.com/watch?v=z16tkLfSD1Y, https://www.youtube.com/watch?v=mZbF6RL8d6I"));
    }
}