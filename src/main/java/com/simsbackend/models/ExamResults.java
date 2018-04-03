package com.simsbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 29-Mar-18.
 */
@Entity
@Table( name="exam_restults")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"created_at", "updated_at"},
        allowGetters = true)
public class ExamResults  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name="student_id")
    private Integer studentId;


    @Column (name= "exam_id")
    private Integer examId;

    @Column ( name=" subject_id")
    private Integer subjectId;

    @Column (name="subject_marks")
    private Double subjectMarks;

    @Column(name= "created_at")
    @CreatedDate
    private Date  createdAt;


    @Column(name= "updated_at")
    @LastModifiedDate
    private Date  updatedAt;




public ExamResults(){

}


public ExamResults(Integer studentId,Integer examId,Integer subjectId,Double subjectMarks){
    this.studentId=studentId;
    this.examId=examId;
    this.subjectId=subjectId;
    this.subjectMarks=subjectMarks;
}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Double getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(Double subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
