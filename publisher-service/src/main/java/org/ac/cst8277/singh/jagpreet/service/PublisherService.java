package org.ac.cst8277.singh.jagpreet.service;

import org.ac.cst8277.singh.jagpreet.util.BaseResponse;
import org.ac.cst8277.singh.jagpreet.domain.dto.PublisherDTO;

public interface PublisherService {
    BaseResponse getPublishers();
    BaseResponse addPublisher(PublisherDTO publisherDTO);
    BaseResponse addSubscription(long pubId, long subId);
    BaseResponse removeSubscription(long pubId, long subId);
    BaseResponse getSubscribersByPubId(long pubId);
}

