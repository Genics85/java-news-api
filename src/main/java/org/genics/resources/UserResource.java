package org.genics.resources;

import org.genics.repo.User;
import org.genics.repo.UserCreateDto;
import org.genics.utils.ApiResponse;

import java.util.List;

public interface UserResource {
    ApiResponse<User> create(UserCreateDto userCreateDto);
    ApiResponse<User> update(User user);
    ApiResponse<Boolean> delete(Long id);
    ApiResponse<List<User>> getAll();
    ApiResponse<User> get(Long id);
}
