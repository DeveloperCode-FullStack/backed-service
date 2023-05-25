package com.sena.backedservice.IRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.backedservice.Dto.IRoleDto;
import com.sena.backedservice.Entity.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>{

	@Query(value = "SELECT * FROM person", nativeQuery = true)
    Page<IRoleDto> getDatatable(Pageable pageable, String search);
}
