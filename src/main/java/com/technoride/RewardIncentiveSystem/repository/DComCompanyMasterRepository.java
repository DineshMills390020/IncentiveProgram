package com.technoride.RewardIncentiveSystem.repository;

import com.technoride.RewardIncentiveSystem.entity.DComCompanyMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DComCompanyMasterRepository extends JpaRepository<DComCompanyMaster, Long>, JpaSpecificationExecutor<DComCompanyMaster> {

}