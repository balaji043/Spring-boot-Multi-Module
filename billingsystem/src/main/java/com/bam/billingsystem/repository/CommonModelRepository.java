package com.bam.billingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bam.billingsystem.model.CommonModel;

@Repository
public interface CommonModelRepository extends JpaRepository<CommonModel, Long> {

}
