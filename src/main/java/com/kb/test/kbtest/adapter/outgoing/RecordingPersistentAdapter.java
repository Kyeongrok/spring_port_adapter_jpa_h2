package com.kb.test.kbtest.adapter.outgoing;

import com.kb.test.kbtest.adapter.outgoing.entity.Recording;
import com.kb.test.kbtest.adapter.outgoing.port.RecordingPort;
import com.kb.test.kbtest.adapter.outgoing.repository.RecordingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RecordingPersistentAdapter implements RecordingPort {
    private final RecordingRepository repository;

    public RecordingPersistentAdapter(RecordingRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Recording> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Recording save(Recording recording) {
        return repository.save(recording);
    }
}
