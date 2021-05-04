package by.jrr.fp.albums.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Deprecated//replace with users
public class Photo {
    @Id
    @GeneratedValue
    Long id;
    Long albumId;
    String title;
    String url;
    String thumbnailUrl;
}
