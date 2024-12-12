package com.technoride.RewardIncentiveSystem.entity;

import com.technoride.RewardIncentiveSystem.Id.WeaverProductionTargetsId;
import com.technoride.RewardIncentiveSystem.Id.WeavingMonthTotalWeavingProductionProductwiseId;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WI_MTH_TOTAL_WEAVING_PRODUCTION_PRODUCTWISE")
@IdClass(WeavingMonthTotalWeavingProductionProductwiseId.class)
public class WeavingMonthTotalWeavingProductionProductwise implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "DEPARTMENT", nullable = false)
    private String department;

    @Id
    @Column(name = "PICK_MTH", nullable = false)
    private Integer pickMonth;

    @Id
    @Column(name = "PICK_YEAR", nullable = false)
    private Integer pickYear;

    @Id
    @Column(name = "PRODUCT_GROUP", nullable = false)
    private String productGroup;

    @Column(name = "PICKMTR")
    private Double pickMtr;

    @Column(name = "PICKKG")
    private Double pickKg;

    @Column(name = "PIECE_COUNT")
    private Double pieceCount;

    @Column(name = "MTH_WEIGHT")
    private Double mthWeight;

    @Column(name = "EFFICIENCY")
    private Double efficiency;

    @Column(name = "MTH_PICKMTR")
    private Double mthPickMtr;

    @Column(name = "INC_RATE")
    private Double incRate;

    @Column(name = "TOTAL_INCENTIVE_AMOUNT")
    private Double totalIncentiveAmount;

}
