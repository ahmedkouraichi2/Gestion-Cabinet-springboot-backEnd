package com.cabinet.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabinet.entity.Rdv;
@Repository
public interface IRdvRepository extends JpaRepository<Rdv,Long>{

}
