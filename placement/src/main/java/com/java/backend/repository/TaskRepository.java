package com.preptrack.repository;

import com.preptrack.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findByCompleted(boolean completed);
}