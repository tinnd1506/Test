package com.devops.tony_api.model;

/**
 * Represents a video model with attributes such as video ID, title, and description.
 */
public class VideoModel {
    // URL of the video
    private String url;

    /**
     * Constructs a VideoModel with the specified video URL.
     *
     * @param url the URL of the video
     */
    public VideoModel(String url) {
        this.url = url;
    }

    /**
     * Returns the video URL.
     *
     * @return the video URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the video URL.
     *
     * @param url the video URL
     */
    public void setUrl(String url) {
        this.url = url;
    }
}

