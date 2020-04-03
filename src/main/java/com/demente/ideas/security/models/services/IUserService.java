package com.demente.ideas.security.models.services;

import com.demente.ideas.security.models.entity.User;
import javassist.NotFoundException;

import java.util.List;

public interface IUserService {

    User save(User user);
    User getMockUser();
    List<User> findAll();
    User find(Long id) throws NotFoundException;
    void delete(Long id);
}
