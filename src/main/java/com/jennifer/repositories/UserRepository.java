package com.jennifer.repositories;

import com.jennifer.entity.FbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<FbUser,Long> {

    Optional<FbUser> findFbUserByEmail(String email);
    FbUser findFbUserByFullName(String fullName);
}
