package com.technoride.RewardIncentiveSystem.Id;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class WeavingMonthTotalWeavingProductionProductwiseId implements Serializable {

    private String department;
    private Integer pickMonth;
    private Integer pickYear;
    private String productGroup;

    public WeavingMonthTotalWeavingProductionProductwiseId() {
    }

    public WeavingMonthTotalWeavingProductionProductwiseId(Integer pickMonth, Integer pickYear) {
        this.pickMonth = pickMonth;
        this.pickYear = pickYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeavingMonthTotalWeavingProductionProductwiseId that = (WeavingMonthTotalWeavingProductionProductwiseId) o;
        return Objects.equals(pickMonth, that.pickMonth) && Objects.equals(pickYear, that.pickYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pickMonth, pickYear);
    }
}
