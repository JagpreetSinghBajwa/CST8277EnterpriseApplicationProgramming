package org.ac.cst8277.singh.jagpreet.domain.dao;

import lombok.Data;
import org.ac.cst8277.singh.jagpreet.util.BaseMessage;

import java.util.List;

@Data
public class BulkMessageDAO extends BaseMessage {
    private long publisherId;
    private List<MessageDAO> messages;
}
