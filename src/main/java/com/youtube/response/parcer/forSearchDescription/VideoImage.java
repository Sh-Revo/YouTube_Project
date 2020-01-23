package com.youtube.response.parcer.forSearchDescription;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class VideoImage {
    private String url;
    private int width;
    private int height;
}
