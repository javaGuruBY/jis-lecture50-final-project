package by.jrr.fp.nbrbclient.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

}
