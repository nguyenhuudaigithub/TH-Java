package com.example.NguyenHuuDai.repository;

import com.example.NguyenHuuDai.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository <Category, Long> {
}
