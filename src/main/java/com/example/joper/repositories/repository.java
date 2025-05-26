package com.example.joper.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.joper.model.onemodel;

import java.util.List;
@Repository
public interface repository extends JpaRepository<onemodel, Long> {
    List<onemodel> findByTitleContaining(String title);
}