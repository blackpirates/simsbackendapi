package com.simsbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 26-Mar-18.
 */
@Entity
@Table(name="classes")
@JsonIgnoreProperties(value = {"created_at", "updated_at"},
        allowGetters = true)
public class Classes {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private Integer id;

    @Column(name="class_name")
    private String class_name;

    @Column (name="stream_name")
    private String stream_name;

    @Column (name="updated_at")
    private Date updated_at;

    @Column (name="created_at")
    private Date  created_at;


    public Classes (){

    }

    public Classes(String class_name,String stream_name){
this.class_name=class_name;
this.stream_name=stream_name;
    }





    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getStream_name() {
        return stream_name;
    }

    public void setStream_name(String stream_name) {
        this.stream_name = stream_name;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
