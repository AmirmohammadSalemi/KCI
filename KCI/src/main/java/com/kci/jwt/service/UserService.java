package com.kci.jwt.service;

import com.kci.jwt.dao.RoleDao;
import com.kci.jwt.dao.UserDao;
import com.kci.jwt.entity.Role;
import com.kci.jwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;
    public User registerNewUser(User user){
        return userDao.save(user);
    }

//    public void initRolesAndUsers(){
//        Role adminRole = new Role();
//        adminRole.setRoleName("Admin");
//        adminRole.setRoleDescription("Admin role");
//        roleDao.save(adminRole);
//
//        Role userRole = new Role();
//        userRole.setRoleName("User");
//        userRole.setRoleDescription("default role for newly created record");
//        roleDao.save(userRole);
//
//        User adminUser = new User();
//        adminUser.setUserFirstName("admin");
//        adminUser.setUserLastName("admin");
//        adminUser.setUserName("admin123");
//        adminUser.setUserPassword("admin@pass");
//        Set<Role> adminRoles = new HashSet<>();
//        adminRoles.add(adminRole);
//        userDao.save(adminUser);
//
//        User user = new User();
//        user.setUserFirstName("amir");
//        user.setUserLastName("salemi");
//        user.setUserName("amir123");
//        user.setUserPassword("amir@pass");
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        userDao.save(user);
//    }
}
