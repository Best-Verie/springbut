package com.example.template.repository;

import com.example.template.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ICatRepository extends JpaRepository<Cat, UUID> { }
