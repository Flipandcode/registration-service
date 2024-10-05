package org.tiaa.sma.registrationservice.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import org.tiaa.sma.registrationservice.entity.EmailNotification;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface EmailNotificationRepository extends ReactiveCrudRepository<EmailNotification, Long> {

    Flux<EmailNotification> findByStatus(String status);

}
