package org.ac.cst8277.singh.jagpreet.domain.dao;

import lombok.Data;
import org.ac.cst8277.singh.jagpreet.util.BaseMessage;

@Data
public class MessageDAO extends BaseMessage {
    private long id;
    private String message;
}
