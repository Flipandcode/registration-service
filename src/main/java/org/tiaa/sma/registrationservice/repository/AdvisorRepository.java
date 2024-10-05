package org.tiaa.sma.registrationservice.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import org.tiaa.sma.registrationservice.entity.Advisor;
import java.math.BigInteger;
import reactor.core.publisher.Mono;

@Repository
public interface AdvisorRepository extends ReactiveCrudRepository<Advisor, BigInteger> {
    Mono<Advisor> findByEmailId(String emailId);
}
