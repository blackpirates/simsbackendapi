package com.simsbackend.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 28-Mar-18.
 */
@Entity
@Table(name="class_student")
public class StudentClasses implements Serializable {
     private Student students;
    private  Classes classes;
    private Date   year;



    @Id
    @ManyToOne
    @JoinColumn(name = "student_id")
    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "class_id")
    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Column(name = "year")
    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }
}
