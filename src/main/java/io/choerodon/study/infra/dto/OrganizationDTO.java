package io.choerodon.study.infra.dto;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author: zhenle.Wang
 * @date: 2019-08-03 09:33
 * @desc:
 */
@Table(name = "fd_organization")
public class OrganizationDTO  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private Long isEnabled;
    private Long isRegister;
    private Long userId;
    private String address;
    private String imageUrl;
    private Long scale;
    private String homePage;
    private String category;
    private String businessType;
    private String emailSuffix;
    private Long objectVersionNumber;
    private Long createdBy;
    private java.util.Date creationDate;
    private Long lastUpdatedBy;
    private java.util.Date lastUpdateDate;
    //projects  项目
    private List<ProjectDTO> projects;

    public List<ProjectDTO> getProjects() {
        return projects;
    }

    public void setProjects( List<ProjectDTO> projects ) {
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public Long getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Long isEnabled) {
        this.isEnabled = isEnabled;
    }


    public Long getIsRegister() {
        return isRegister;
    }

    public void setIsRegister(Long isRegister) {
        this.isRegister = isRegister;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public Long getScale() {
        return scale;
    }

    public void setScale(Long scale) {
        this.scale = scale;
    }


    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }


    public String getEmailSuffix() {
        return emailSuffix;
    }

    public void setEmailSuffix(String emailSuffix) {
        this.emailSuffix = emailSuffix;
    }


    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }


    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }


    public java.util.Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }


    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }


    public java.util.Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "OrganizationDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", isEnabled=" + isEnabled +
                ", isRegister=" + isRegister +
                ", userId=" + userId +
                ", address='" + address + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", scale=" + scale +
                ", homePage='" + homePage + '\'' +
                ", category='" + category + '\'' +
                ", businessType='" + businessType + '\'' +
                ", emailSuffix='" + emailSuffix + '\'' +
                ", objectVersionNumber=" + objectVersionNumber +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", lastUpdatedBy=" + lastUpdatedBy +
                ", lastUpdateDate=" + lastUpdateDate +
                ", projects=" + projects +
                '}';
    }
}

