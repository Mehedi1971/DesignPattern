package com.example.reportinfolab.repository;

import com.example.reportinfolab.model.ReportInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportInformationRepository extends JpaRepository<ReportInformation, Long> {

}
