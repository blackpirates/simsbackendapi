package com.simsbackend.repositories;

import com.simsbackend.models.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 29-Mar-18.
 */
public interface DepartmentsRepository extends JpaRepository<Departments,Integer > {
}
