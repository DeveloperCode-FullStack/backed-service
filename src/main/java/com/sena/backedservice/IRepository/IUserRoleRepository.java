package com.sena.backedservice.IRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sena.backedservice.Dto.IUserRoleDto;
import com.sena.backedservice.Entity.UserRole;

public interface IUserRoleRepository extends JpaRepository<UserRole, Long>{
	
	@Query(value = "SELECT * FROM person", nativeQuery = true)
    Page<IUserRoleDto> getDatatable(Pageable pageable, String search);
}
