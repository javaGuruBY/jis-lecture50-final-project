package by.jrr.fp.demo.demo.model;

import lombok.Data;


@Data
public class Photo {
    Long Id;
    Long albumId;
    String title;
    String url;
    String thumbnailUrl;
}
