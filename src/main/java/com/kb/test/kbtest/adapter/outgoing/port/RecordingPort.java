package com.kb.test.kbtest.adapter.outgoing.port;

import com.kb.test.kbtest.adapter.outgoing.entity.Recording;

import java.util.Optional;

public interface RecordingPort {
    Optional<Recording> findById(Long id);

    Recording save(Recording recording);
}
