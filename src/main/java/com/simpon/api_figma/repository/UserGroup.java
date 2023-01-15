package com.simpon.api_figma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroup extends JpaRepository<UserGroup,Long> {
}
