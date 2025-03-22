package com.JWTAuth.api.repository;

import com.JWTAuth.api.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long>{

    Optional<Role> findById(String name);
}
