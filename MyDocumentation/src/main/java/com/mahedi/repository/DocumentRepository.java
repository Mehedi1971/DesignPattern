package com.mahedi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahedi.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long>{

}
