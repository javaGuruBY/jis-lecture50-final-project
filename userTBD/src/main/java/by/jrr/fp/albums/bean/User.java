package by.jrr.fp.albums.bean;

import by.jrr.fp.albums.client.PhotoClient;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    Long id;
    @ManyToOne
    Photo photo;
}
