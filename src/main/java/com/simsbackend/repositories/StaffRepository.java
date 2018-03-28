package com.simsbackend.repositories;

import com.simsbackend.models.Staff;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 28-Mar-18.
 */
public interface  StaffRepository extends JpaRepository<Staff,Integer > {
}
