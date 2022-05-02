package org.ac.cst8277.singh.jagpreet.service;

import org.ac.cst8277.singh.jagpreet.domain.dto.RoleDTO;
import org.ac.cst8277.singh.jagpreet.util.BaseResponse;

public interface RoleService {
    BaseResponse getRoles();
    BaseResponse createNewRole(RoleDTO roleDTO);
    BaseResponse updateRole(RoleDTO roleDTO);
    BaseResponse deleteRole(long id);
}
