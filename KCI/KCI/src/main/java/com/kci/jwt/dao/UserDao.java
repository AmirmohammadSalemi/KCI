package com.kci.jwt.dao;

import com.kci.jwt.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<Users,String> {
}
