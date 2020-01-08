package com.sergo.edf.service;

import com.sergo.edf.entity.LogTable;
import com.sergo.edf.repository.LogTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogTableService {
    private final LogTableRepository logTableRepository;

    public void saveLog(LogTable logTable){
        logTableRepository.save(logTable);
    }
}
