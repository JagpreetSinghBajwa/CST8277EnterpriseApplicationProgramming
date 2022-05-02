package org.ac.cst8277.singh.jagpreet.domain.dao;

import lombok.Data;
import org.ac.cst8277.singh.jagpreet.util.BaseMessage;

@Data
public class PublisherDAO extends BaseMessage {
    private long id;
    private long publisherId;
    private String topic;
    private boolean isActive;
}
