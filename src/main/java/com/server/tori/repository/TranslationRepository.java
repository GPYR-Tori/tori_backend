package com.server.tori.repository;

import com.server.tori.entity.Landmark.Landmark;
import com.server.tori.entity.Landmark.Translation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TranslationRepository extends JpaRepository<Translation, Long> {
    Optional<Translation> findByLandmarkIdAndLanguage(Long landmarkId, String language);
    Translation findByLandmarkAndLanguage(Landmark landmark, String language);
}
