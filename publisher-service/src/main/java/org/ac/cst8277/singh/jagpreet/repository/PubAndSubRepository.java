package org.ac.cst8277.singh.jagpreet.repository;

import org.ac.cst8277.singh.jagpreet.domain.PubAndSub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PubAndSubRepository extends JpaRepository<PubAndSub, Long> {
    Optional<PubAndSub> findByPublisherIdAndSubscriberId(long pubId, long subId);
    List<PubAndSub> findByPublisherId(long pubId);
}
