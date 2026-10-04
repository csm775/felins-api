package com.example.demo.Repository;

import com.example.demo.Tigre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TigreRepository extends JpaRepository<Tigre, Integer> {
}