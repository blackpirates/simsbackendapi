package com.simsbackend.repositories;

import com.simsbackend.models.Staff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 28-Mar-18.
 */
public interface  StaffRepository extends JpaRepository<Staff,Integer > {
}
