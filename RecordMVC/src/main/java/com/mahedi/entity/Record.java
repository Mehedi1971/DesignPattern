package com.mahedi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="record")
record Record(@Id int id, String name) {}
