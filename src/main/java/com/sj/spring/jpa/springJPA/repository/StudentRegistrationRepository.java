package com.sj.spring.jpa.springJPA.repository;

import com.sj.spring.jpa.springJPA.model.UserMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegistrationRepository extends JpaRepository<UserMaster,Long> {

}
