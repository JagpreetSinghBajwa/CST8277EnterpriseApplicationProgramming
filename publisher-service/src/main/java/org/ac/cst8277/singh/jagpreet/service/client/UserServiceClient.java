package org.ac.cst8277.singh.jagpreet.service.client;

import org.ac.cst8277.singh.jagpreet.config.DefaultFeignConfig;
import org.ac.cst8277.singh.jagpreet.domain.dto.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "user-management-service", path = "/api/user",
        fallback = UserServiceClientFallBack.class,
        configuration = DefaultFeignConfig.class)
public interface UserServiceClient {

    @RequestMapping(path = "/{userId}", method = RequestMethod.GET)
    UserResponseDTO getById(@PathVariable("userId") long userId);
}
