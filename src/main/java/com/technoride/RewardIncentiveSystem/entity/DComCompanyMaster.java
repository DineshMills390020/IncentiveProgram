package com.technoride.RewardIncentiveSystem.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "D_COM_COMPANY_MASTER")
public class DComCompanyMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "COMPANY_ID", nullable = false)
    private Long companyId;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "ADD1")
    private String ADD1;

    @Column(name = "ADD2")
    private String ADD2;

    @Column(name = "ADD3")
    private String ADD3;

    @Column(name = "CITY")
    private String CITY;

    @Column(name = "STATE")
    private String STATE;

    @Column(name = "PINCODE")
    private String PINCODE;

    @Column(name = "PHONE")
    private String PHONE;

    @Column(name = "FAX")
    private String FAX;

    @Column(name = "E_MAIL")
    private String eMail;

    @Column(name = "URL")
    private String URL;

    @Column(name = "SYNC_URL")
    private String syncUrl;

    @Column(name = "ECC_NO")
    private String eccNo;

    @Column(name = "ECC_DATE")
    private Date eccDate;

    @Column(name = "RANGE")
    private String RANGE;

    @Column(name = "COMMISIONRATE")
    private String COMMISIONRATE;

    @Column(name = "DIVISION")
    private String DIVISION;

    @Column(name = "CST_NO")
    private String cstNo;

    @Column(name = "CST_DATE")
    private Date cstDate;

    @Column(name = "GST_NO")
    private String gstNo;

    @Column(name = "GST_DATE")
    private Date gstDate;

    @Column(name = "LICENSE_NO")
    private String licenseNo;

    @Column(name = "REGISTERATION_NO")
    private String registerationNo;

    @Column(name = "DISPLAY_ORDER")
    private Integer displayOrder;

    @Column(name = "CIN_NO", nullable = false)
    private String cinNo;

    @Column(name = "CREATED_BY")
    private Integer createdBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "MODIFIED_BY")
    private Integer modifiedBy;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "COUNTRY")
    private String COUNTRY;

    @Column(name = "CHANGED")
    private Boolean CHANGED;

    @Column(name = "CHANGED_DATE")
    private Date changedDate;

    @Column(name = "GSTIN_NO")
    private String gstinNo;

    @Column(name = "GSTIN_DATE")
    private Date gstinDate;

}
