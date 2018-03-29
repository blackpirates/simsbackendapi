package com.simsbackend.repositories;

import com.simsbackend.models.Exams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 28-Mar-18.
 */
@Repository
public interface  ExamsRepository  extends JpaRepository<Exams,Integer>{
}
