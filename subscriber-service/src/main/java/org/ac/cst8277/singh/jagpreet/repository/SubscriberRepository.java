package org.ac.cst8277.singh.jagpreet.repository;

import org.ac.cst8277.singh.jagpreet.domain.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
    Optional<Subscriber> findByPublisherIdAndSubscriberId(long pubId, long subId);
    List<Subscriber> findBySubscriberId(long subId);
}
