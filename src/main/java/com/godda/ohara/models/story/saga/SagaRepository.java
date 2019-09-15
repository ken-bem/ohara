package com.godda.ohara.models.story.saga;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SagaRepository extends JpaRepository<Saga, Long> {
}
