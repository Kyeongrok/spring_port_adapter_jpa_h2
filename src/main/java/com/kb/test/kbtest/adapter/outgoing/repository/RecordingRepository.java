package com.kb.test.kbtest.adapter.outgoing.repository;

import com.kb.test.kbtest.adapter.outgoing.entity.Recording;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordingRepository extends JpaRepository<Recording, Long> {
}
