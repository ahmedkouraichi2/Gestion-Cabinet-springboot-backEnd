package com.cabinet.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cabinet.entity.Role;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepositroy extends JpaRepository<Role,Long>{

	
	Role findByName(String name);
}
