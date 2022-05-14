package com.kb.test.kbtest.adapter.outgoing.RecordingDto;

import com.kb.test.kbtest.adapter.outgoing.entity.RecordingFile;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RecordingDto {
    private long id;
    private String title;
    private List<RecordingFile> recordingFiles;
}
