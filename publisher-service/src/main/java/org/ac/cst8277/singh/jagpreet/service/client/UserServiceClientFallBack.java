package org.ac.cst8277.singh.jagpreet.service.client;

import org.ac.cst8277.singh.jagpreet.domain.dto.UserResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class UserServiceClientFallBack implements UserServiceClient {

    @Override
    public UserResponseDTO getById(long userId) {
        return null;
    }
}
