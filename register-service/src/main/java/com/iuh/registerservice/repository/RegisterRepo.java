package com.iuh.registerservice.repository;

import com.iuh.registerservice.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends JpaRepository<Register,Long> {
}
