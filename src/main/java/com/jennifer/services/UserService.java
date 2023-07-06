package com.jennifer.services;

import com.jennifer.entity.FbUser;

import java.util.Optional;

public interface UserService {
    FbUser createUser(FbUser newUser);
    FbUser getUser (Long id);

    void deleteUser(Long id);

    FbUser updateUser(FbUser user);
    Optional<FbUser> UserLogin(String email, String password);


    Optional<FbUser> LoginUser(String email, String password);
}
