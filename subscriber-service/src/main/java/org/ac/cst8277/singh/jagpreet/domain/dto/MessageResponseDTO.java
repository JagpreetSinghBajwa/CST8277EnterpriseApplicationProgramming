package org.ac.cst8277.singh.jagpreet.domain.dto;

import lombok.Data;
import org.ac.cst8277.singh.jagpreet.domain.dao.MessageDAO;
import org.ac.cst8277.singh.jagpreet.util.MessageTransferResponse;

import java.util.Collection;

@Data
public class MessageResponseDTO extends MessageTransferResponse {
    private MessageDAO data;
    private Collection<? extends MessageDAO> dataList;
}
