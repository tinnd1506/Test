package com.devops.tony_api.model;

/**
 * Represents a video model with attributes such as video ID, title, and description.
 */
public class VideoModel {
    // Unique identifier for the video
    private String videoId;
    
    // Title of the video
    private String title;
    
    // Description of the video
    private String description;

    /**
     * Constructs a VideoModel with the specified video ID, title, and description.
     *
     * @param videoId    the unique identifier for the video
     * @param title      the title of the video
     * @param description the description of the video
     */
    public VideoModel(String videoId, String title, String description) {
        this.videoId = videoId;
        this.title = title;
        this.description = description;
    }

    // Getters and Setters

    /**
     * Returns the video ID.
     *
     * @return the video ID
     */
    public String getVideoId(){
        return videoId;
    }

    /**
     * Sets the video ID.
     *
     * @param videoId the unique identifier for the video
     */
    public void setVideoId(String videoId){
        this.videoId = videoId;
    }

    /**
     * Returns the title of the video.
     *
     * @return the title of the video
     */
    public String getTitle(){
        return title;
    }

    /**
     * Sets the title of the video.
     *
     * @param title the title of the video
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * Returns the description of the video.
     *
     * @return the description of the video
     */
    public String getDescription(){
        return description;
    }

    /**
     * Sets the description of the video.
     *
     * @param description the description of the video
     */
    public void setDescription(String description){
        this.description = description;
    }
}

