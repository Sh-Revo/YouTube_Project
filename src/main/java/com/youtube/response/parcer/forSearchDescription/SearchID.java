package com.youtube.response.parcer.forSearchDescription;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class SearchID {
    private String kind;
    private String videoId;
    private String channelId;
    private String playlistId;
}
