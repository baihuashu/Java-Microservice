package io.choerodon.study.infra.dto;

import io.choerodon.mybatis.entity.BaseDTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: zhenle.Wang
 * @date: 2019-07-31 11:48
 * @desc:
 */
@Table(name = "iam_user")
public class UserDTO extends BaseDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loginName;
    private String email;
    private Long organizationId;
    private String hashPassword;
    private String realName;
    private String phone;
    private String internationalTelCode;
    private String imageUrl;
    private String profilePhoto;
    private String language;
    private String timeZone;
    private java.util.Date lastPasswordUpdatedAt;
    private java.util.Date lastLoginAt;
    private Long isEnabled;
    private Long isLocked;
    private Long isLdap;
    private Long isAdmin;
    private java.util.Date lockedUntilAt;
    private Long passwordAttempt;
    private Long objectVersionNumber;
    private Long createdBy;
    private java.util.Date creationDate;
    private Long lastUpdatedBy;
    private java.util.Date lastUpdateDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }


    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }


    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getInternationalTelCode() {
        return internationalTelCode;
    }

    public void setInternationalTelCode(String internationalTelCode) {
        this.internationalTelCode = internationalTelCode;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }


    public java.util.Date getLastPasswordUpdatedAt() {
        return lastPasswordUpdatedAt;
    }

    public void setLastPasswordUpdatedAt(java.util.Date lastPasswordUpdatedAt) {
        this.lastPasswordUpdatedAt = lastPasswordUpdatedAt;
    }


    public java.util.Date getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(java.util.Date lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }


    public Long getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Long isEnabled) {
        this.isEnabled = isEnabled;
    }


    public Long getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Long isLocked) {
        this.isLocked = isLocked;
    }


    public Long getIsLdap() {
        return isLdap;
    }

    public void setIsLdap(Long isLdap) {
        this.isLdap = isLdap;
    }


    public Long getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Long isAdmin) {
        this.isAdmin = isAdmin;
    }


    public java.util.Date getLockedUntilAt() {
        return lockedUntilAt;
    }

    public void setLockedUntilAt(java.util.Date lockedUntilAt) {
        this.lockedUntilAt = lockedUntilAt;
    }


    public Long getPasswordAttempt() {
        return passwordAttempt;
    }

    public void setPasswordAttempt(Long passwordAttempt) {
        this.passwordAttempt = passwordAttempt;
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
        return "UserDTO{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", email='" + email + '\'' +
                ", organizationId=" + organizationId +
                ", hashPassword='" + hashPassword + '\'' +
                ", realName='" + realName + '\'' +
                ", phone='" + phone + '\'' +
                ", internationalTelCode='" + internationalTelCode + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                ", language='" + language + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", lastPasswordUpdatedAt=" + lastPasswordUpdatedAt +
                ", lastLoginAt=" + lastLoginAt +
                ", isEnabled=" + isEnabled +
                ", isLocked=" + isLocked +
                ", isLdap=" + isLdap +
                ", isAdmin=" + isAdmin +
                ", lockedUntilAt=" + lockedUntilAt +
                ", passwordAttempt=" + passwordAttempt +
                ", objectVersionNumber=" + objectVersionNumber +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", lastUpdatedBy=" + lastUpdatedBy +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}

