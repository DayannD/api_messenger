package com.simpon.api_figma.repository;

import com.simpon.api_figma.entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup,Long> {
}
