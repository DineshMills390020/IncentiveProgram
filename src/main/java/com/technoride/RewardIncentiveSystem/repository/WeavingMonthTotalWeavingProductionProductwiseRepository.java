package com.technoride.RewardIncentiveSystem.repository;

import com.technoride.RewardIncentiveSystem.Id.WeavingMonthTotalWeavingProductionProductwiseId;
import com.technoride.RewardIncentiveSystem.entity.WeaverProductionTargets;
import com.technoride.RewardIncentiveSystem.entity.WeavingMonthTotalWeavingProductionProductwise;

import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeavingMonthTotalWeavingProductionProductwiseRepository extends JpaRepository<WeavingMonthTotalWeavingProductionProductwise, WeavingMonthTotalWeavingProductionProductwiseId> {

    @Query(value = "SELECT SUM(p.totalIncentiveAmount) FROM WeavingMonthTotalWeavingProductionProductwise p WHERE p.pickMonth=:pickMonth AND p.pickYear=:pickYear")
    //WeaverProductionTargets getRewardDetails(@Param("loom") int loom, @Param("weftDetails") String weftDetails);
    double getTotalIncentive(@Param("pickMonth") int pickMonth ,@Param("pickYear") int pickYear );

    @Query(value = "select p from WeavingMonthTotalWeavingProductionProductwise p where p.pickMonth=:pickMonth AND p.pickYear=:pickYear")
    List<WeavingMonthTotalWeavingProductionProductwise> getAllDetails(@Param("pickMonth") int pickMonth , @Param("pickYear") int pickYear );

}