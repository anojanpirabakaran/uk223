package com.example.demo.domain.group;

import com.example.demo.domain.appUser.User;
import com.example.demo.domain.role.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GroupService {
    Group saveGroup(Group group) throws InstanceAlreadyExistsException;
    Group getGroup(String username);
    Page<User> getAllUsersOfGroup(UUID uuid, int offset, int pageSize);
    User saveUser(User user);
    void addUserToGroup(String username, String groupName);
    Group findById(UUID id);
    List<Group> findAll();
    //Group put(Group group, UUID uuid) throws InstanceNotFoundException;
    void delete(UUID uuid);
}
