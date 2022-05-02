package org.ac.cst8277.singh.jagpreet.repository;

import org.ac.cst8277.singh.jagpreet.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
