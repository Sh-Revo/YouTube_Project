package com.youtube.response.parcer.forSearchDescription;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class PageInfo {
    private int totalResults;
    private int resultsPerPage;
}
