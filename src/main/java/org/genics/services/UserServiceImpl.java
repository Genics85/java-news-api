package org.genics.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.genics.repo.User;
import org.genics.repo.UserCreateDto;
import org.genics.repo.UserRepository;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class UserServiceImpl implements UserService {
    @Inject
    UserRepository userRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public User create(UserCreateDto userCreateDto) {
        User user = mapper.map(userCreateDto,User.class);
        userRepository.getEntityManager().persist(user);
        return user;
    }

    @Override
    public User update(User user) {
        userRepository.persist(user);
        return user;
    }

    @Override
    public Boolean delete(Long id) {
        User user = this.get(id);
        userRepository.delete(user);
        return true;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public User get(Long id) {
        return userRepository.findById(id);
    }
}
