package com.simsbackend.repositories;

import com.simsbackend.models.StudentClasses;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 28-Mar-18.
 */
public interface  StudentClassesRepository extends JpaRepository<StudentClasses,Integer > {
}
