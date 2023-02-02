package com.mahedi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doc")
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String header;
	private String content;

	public Document() {
		super();
	}

	public Document(long id, String header, String content) {
		super();
		this.id = id;
		this.header = header;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", header=" + header + ", content=" + content + "]";
	}

}
