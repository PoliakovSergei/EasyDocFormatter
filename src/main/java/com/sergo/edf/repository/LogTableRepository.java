package com.sergo.edf.repository;

import com.sergo.edf.entity.LogTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogTableRepository extends JpaRepository<LogTable, Long> {
}
