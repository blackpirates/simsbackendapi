package com.simsbackend.repositories;

import com.simsbackend.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 26-Mar-18.
 */
@Repository
public interface  StudentsRepository extends JpaRepository<Student,Integer > {
}
