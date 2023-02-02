package com.mahedi.service;

import java.util.List;

import com.mahedi.model.Document;

public interface DocumentService {

	List<Document> getAllDocuments();
	void savemyDocuments(Document document);
}
