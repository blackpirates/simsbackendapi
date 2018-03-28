package com.simsbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 27-Mar-18.
 */
@Entity
@Table(name="guardians")

@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"created_at", "updated_at"},
        allowGetters = true)
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
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column (name="updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updated_at;



    public Guardians(Long nationalIdentification,String name,String primaryTelephone,String secondaryTelephone){

        this.nationalIdentification=nationalIdentification;
        this.name=name;
        this.primaryTelephone=primaryTelephone;
        this.secondaryTelephone=secondaryTelephone;

    }






    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNationalIdentification() {
        return nationalIdentification;
    }

    public void setNationalIdentification(Long nationalIdentification) {
        this.nationalIdentification = nationalIdentification;
    }

    public String getPrimaryTelephone() {
        return primaryTelephone;
    }

    public void setPrimaryTelephone(String primaryTelephone) {
        this.primaryTelephone = primaryTelephone;
    }

    public String getSecondaryTelephone() {
        return secondaryTelephone;
    }

    public void setSecondaryTelephone(String secondaryTelephone) {
        this.secondaryTelephone = secondaryTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
