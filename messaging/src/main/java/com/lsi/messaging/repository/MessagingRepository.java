package com.lsi.messaging.repository;

import com.lsi.messaging.domain.Messaging;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagingRepository extends JpaRepository<Messaging, Long> {
}
