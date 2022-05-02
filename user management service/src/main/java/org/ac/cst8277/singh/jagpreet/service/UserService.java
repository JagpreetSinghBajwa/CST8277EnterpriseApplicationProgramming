package org.ac.cst8277.singh.jagpreet.service;

import org.ac.cst8277.singh.jagpreet.domain.dto.UserDTO;
import org.ac.cst8277.singh.jagpreet.util.BaseResponse;

public interface UserService {
    BaseResponse getAllUsers();
    BaseResponse getUserByField(long id);
    BaseResponse getUserByUsername(String username);
    BaseResponse getUserByUserRole(String role);
    BaseResponse createNewUser(UserDTO customerDTO);
    BaseResponse updateUser(UserDTO userDTO);
    BaseResponse deleteUser(long id);
}
