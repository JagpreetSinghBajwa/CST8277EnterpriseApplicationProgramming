package org.ac.cst8277.singh.jagpreet.domain.dto;

import lombok.Data;
import org.ac.cst8277.singh.jagpreet.domain.dao.UserResponseDAO;
import org.ac.cst8277.singh.jagpreet.util.MessageTransferResponse;

import java.util.Collection;

@Data
public class UserResponseDTO extends MessageTransferResponse {
    private UserResponseDAO data;
    private Collection<? extends UserResponseDAO> dataList;
}
