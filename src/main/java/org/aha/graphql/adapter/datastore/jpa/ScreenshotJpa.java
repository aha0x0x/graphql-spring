package org.aha.graphql.adapter.datastore.jpa;

import org.aha.graphql.adapter.datastore.model.ScreenshotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ScreenshotJpa extends JpaRepository<ScreenshotEntity, Integer> {
    List<ScreenshotEntity> findByProductId(final UUID productId);

}
