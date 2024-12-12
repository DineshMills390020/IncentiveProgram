package com.technoride.RewardIncentiveSystem.entity;

import com.technoride.RewardIncentiveSystem.Id.CompanyUserId;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "D_FIN_GL")
@IdClass(DFinGl.class)
public class DFinGl implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "COMPANY_ID", nullable = false)
    private Integer companyId;

    @Id
    @Column(name = "MAIN_ACCOUNT_CODE", nullable = false)
    private String mainAccountCode;

    @Id
    @Column(name = "SUB_ACCOUNT_CODE", nullable = false)
    private String subAccountCode;

    @Column(name = "ACCOUNT_ID", nullable = false)
    private Integer accountId;

    @Column(name = "ACCOUNT_NAME", nullable = false)
    private String accountName;

    @Column(name = "SH_NAME")
    private String shName;

    @Column(name = "REMARKS")
    private String REMARKS;

    @Column(name = "IS_SUBSIDAIRY")
    private Integer subsidairy;

    @Column(name = "SH_CODE")
    private String shCode;

    @Column(name = "GROUP_CODE")
    private String groupCode;

    @Column(name = "APPROVED")
    private Boolean APPROVED;

    @Column(name = "APPROVED_DATE")
    private Date approvedDate;

    @Column(name = "REJECTED")
    private Boolean REJECTED;

    @Column(name = "REJECTED_DATE")
    private Date rejectedDate;

    @Column(name = "REJECTED_REMARKS")
    private String rejectedRemarks;

    @Column(name = "HIERARCHY_ID")
    private Integer hierarchyId;

    @Column(name = "CANCELLED")
    private Boolean CANCELLED;

    @Column(name = "BLOCKED")
    private Boolean BLOCKED;

    @Column(name = "CHANGED")
    private Boolean CHANGED;

    @Column(name = "CHANGED_DATE")
    private Date changedDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "CLOSING_BALANCE")
    private Double closingBalance;

    @Column(name = "CLOSING_EFFECT")
    private String closingEffect;

    @Column(name = "GST_CATG")
    private String gstCatg;

    @Column(name = "GST_PERCENT")
    private String gstPercent;

}
