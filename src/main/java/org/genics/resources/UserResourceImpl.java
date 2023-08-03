package org.genics.resources;

import jakarta.inject.Inject;
import org.genics.repo.User;
import org.genics.repo.UserCreateDto;
import org.genics.services.UserService;
import org.genics.utils.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserResourceImpl implements UserResource {

    @Inject
    UserService userService;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public ApiResponse<User> create(UserCreateDto userCreateDto) {
        return null;
    }

    @Override
    public ApiResponse<User> update(User user) {
        return null;
    }

    @Override
    public ApiResponse<Boolean> delete(Long id) {
        return null;
    }

    @Override
    public ApiResponse<List<User>> getAll() {
        return null;
    }

    @Override
    public ApiResponse<User> get(Long id) {
        return null;
    }
}
