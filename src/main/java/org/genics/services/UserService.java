package org.genics.services;


import org.genics.repo.User;
import org.genics.repo.UserCreateDto;

import java.util.List;

public interface UserService {
    User create(UserCreateDto userCreateDto);
    User update(User user);
    Boolean delete(Long id);
    List<User> getAll();
    User get(Long id);
}
