package org.ac.cst8277.singh.jagpreet.service.client;

import org.ac.cst8277.singh.jagpreet.domain.dto.MessageResponseDTO;
import org.ac.cst8277.singh.jagpreet.util.BaseResponse;
import org.springframework.stereotype.Component;

@Component
public class PublisherServiceFallBack implements PublisherServiceClient{

    @Override
    public BaseResponse addSubscription(long publisherId, long subscriberId) {
        return null;
    }

    @Override
    public BaseResponse removeSubscription(long publisherId, long subscriberId) {
        return null;
    }

    @Override
    public MessageResponseDTO getActiveMessagesByPublisher(long publisherId) {
        return null;
    }
}
