package com.simsbackend.repositories;

import com.simsbackend.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 28-Mar-18.
 */
public interface SubjectRepository  extends JpaRepository<Subject,Integer>{
}
