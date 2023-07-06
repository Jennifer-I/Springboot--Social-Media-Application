package com.jennifer.services.implementation;

import com.jennifer.entity.FbUser;
import com.jennifer.repositories.UserRepository;
import com.jennifer.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

    public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public FbUser getUser(Long id) {
        return userRepository.findById(id).get();

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public FbUser createUser(FbUser fbUser) {
        return userRepository.save(fbUser);

    }

    @Override
    public FbUser updateUser(FbUser fbUser) {
        FbUser updatedFbUser = userRepository.save(fbUser);
        return updatedFbUser;
    }

    @Override
    public Optional<FbUser> UserLogin(String email, String password) {
        return Optional.empty();
    }

    @Override
    public Optional<FbUser> LoginUser(String email, String password) {
        Optional<FbUser> optionalFbUser = userRepository.findFbUserByEmail(email);
        if (optionalFbUser.isPresent()) {
            FbUser user = optionalFbUser.get();
            if (password.equals(user.getPassWord())) {
                return optionalFbUser;
            }
        }
        return Optional.empty();

    }
}