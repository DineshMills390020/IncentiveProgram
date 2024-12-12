package com.technoride.RewardIncentiveSystem.Id;

import java.io.Serializable;
import java.util.Objects;

public class DFinGLId implements Serializable {
    private Integer companyId;
    private String mainAccountCode;
    private String subAccountCode;

    public DFinGLId() {
    }

    public DFinGLId(Integer companyId, String mainAccountCode, String subAccountCode) {
        this.companyId = companyId;
        this.mainAccountCode = mainAccountCode;
        this.subAccountCode = subAccountCode;
    }

    @Override
    public String toString() {
        return "DFinGLId{" +
                "companyId=" + companyId +
                ", mainAccountCode='" + mainAccountCode + '\'' +
                ", subAccountCode='" + subAccountCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DFinGLId dFinGLId = (DFinGLId) o;
        return Objects.equals(companyId, dFinGLId.companyId) && Objects.equals(mainAccountCode, dFinGLId.mainAccountCode) && Objects.equals(subAccountCode, dFinGLId.subAccountCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, mainAccountCode, subAccountCode);
    }
}
