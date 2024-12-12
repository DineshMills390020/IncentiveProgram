package com.technoride.RewardIncentiveSystem.repository;

import com.technoride.RewardIncentiveSystem.entity.DFinGl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DFinGlRepository extends JpaRepository<DFinGl, String>, JpaSpecificationExecutor<DFinGl> {

}