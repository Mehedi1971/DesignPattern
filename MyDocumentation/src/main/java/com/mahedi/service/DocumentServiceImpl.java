package com.mahedi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahedi.model.Document;
import com.mahedi.repository.DocumentRepository;

@Service
public class DocumentServiceImpl implements DocumentService{

	@Autowired
	private DocumentRepository documentRepository;
	
	@Override
	public List<Document> getAllDocuments() {
		return documentRepository.findAll();
	}

	@Override
	public void savemyDocuments(Document document) {
		this.documentRepository.save(document);
		
	}

}
