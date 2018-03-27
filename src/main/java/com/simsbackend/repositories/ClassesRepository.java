package com.simsbackend.repositories;

import com.simsbackend.models.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

/**
 * Created by Administrator on 26-Mar-18.
 */
@Repository
public interface ClassesRepository extends JpaRepository<Classes,Integer > {
}
