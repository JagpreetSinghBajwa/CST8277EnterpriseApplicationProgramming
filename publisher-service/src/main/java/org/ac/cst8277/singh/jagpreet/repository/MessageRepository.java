package org.ac.cst8277.singh.jagpreet.repository;

import org.ac.cst8277.singh.jagpreet.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByPublisherId(long publisherId);
}
