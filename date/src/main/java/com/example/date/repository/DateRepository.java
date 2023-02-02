package com.example.date.repository;

import com.example.date.entity.Dates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DateRepository extends JpaRepository<Dates,Long> {
    List<Dates> findByCreatedAtBetween(Date startDate, Date endDate);

}
