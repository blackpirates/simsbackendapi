package com.simsbackend.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 27-Mar-18.
 */
@Entity
@Table(name="guardians")
public class Guardians {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Integer  id;



    @Column (name="name")
    private String name;

    @Column (name="national_identification")
    private Long nationalIdentification;

    @Column(name="primary_telephone")
    private  String primaryTelephone;

    @Column(name="secondary_telephone")
    private  String secondaryTelephone;

    @Column(name="email")
    private String email;

    @Column (name="created_at")
    private Date createdAt;

    @Column (name="updated_at")
    private Date updated_at;


}
