package com.bam.bs.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bam.bs.common.model.CommonModel;

@Repository
public interface CommonModelRepository extends JpaRepository<CommonModel, Long> {

}
