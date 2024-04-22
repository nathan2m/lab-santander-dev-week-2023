package _projetos.service;

import _projetos.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
