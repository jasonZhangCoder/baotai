package com.security.baotai.model.department;

import java.io.Serializable;
import java.util.Date;

public class Department implements Serializable {
    private String id;

    private String parentId;

    private String parentIds;

    private String name;

    private Long sort;

    private String areaId;

    private String code;

    private String type;

    private String grade;

    private String address;

    private String zipCode;

    private String master;

    private String phone;

    private String fax;

    private String email;

    private String useable;

    private String primaryPerson;

    private String deputyPerson;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_office
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.id
     *
     * @return the value of sys_office.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.id
     *
     * @param id the value for sys_office.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.parent_id
     *
     * @return the value of sys_office.parent_id
     *
     * @mbggenerated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.parent_id
     *
     * @param parentId the value for sys_office.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.parent_ids
     *
     * @return the value of sys_office.parent_ids
     *
     * @mbggenerated
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.parent_ids
     *
     * @param parentIds the value for sys_office.parent_ids
     *
     * @mbggenerated
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.name
     *
     * @return the value of sys_office.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.name
     *
     * @param name the value for sys_office.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.sort
     *
     * @return the value of sys_office.sort
     *
     * @mbggenerated
     */
    public Long getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.sort
     *
     * @param sort the value for sys_office.sort
     *
     * @mbggenerated
     */
    public void setSort(Long sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.area_id
     *
     * @return the value of sys_office.area_id
     *
     * @mbggenerated
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.area_id
     *
     * @param areaId the value for sys_office.area_id
     *
     * @mbggenerated
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.code
     *
     * @return the value of sys_office.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.code
     *
     * @param code the value for sys_office.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.type
     *
     * @return the value of sys_office.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.type
     *
     * @param type the value for sys_office.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.grade
     *
     * @return the value of sys_office.grade
     *
     * @mbggenerated
     */
    public String getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.grade
     *
     * @param grade the value for sys_office.grade
     *
     * @mbggenerated
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.address
     *
     * @return the value of sys_office.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.address
     *
     * @param address the value for sys_office.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.zip_code
     *
     * @return the value of sys_office.zip_code
     *
     * @mbggenerated
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.zip_code
     *
     * @param zipCode the value for sys_office.zip_code
     *
     * @mbggenerated
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.master
     *
     * @return the value of sys_office.master
     *
     * @mbggenerated
     */
    public String getMaster() {
        return master;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.master
     *
     * @param master the value for sys_office.master
     *
     * @mbggenerated
     */
    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.phone
     *
     * @return the value of sys_office.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.phone
     *
     * @param phone the value for sys_office.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.fax
     *
     * @return the value of sys_office.fax
     *
     * @mbggenerated
     */
    public String getFax() {
        return fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.fax
     *
     * @param fax the value for sys_office.fax
     *
     * @mbggenerated
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.email
     *
     * @return the value of sys_office.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.email
     *
     * @param email the value for sys_office.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.USEABLE
     *
     * @return the value of sys_office.USEABLE
     *
     * @mbggenerated
     */
    public String getUseable() {
        return useable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.USEABLE
     *
     * @param useable the value for sys_office.USEABLE
     *
     * @mbggenerated
     */
    public void setUseable(String useable) {
        this.useable = useable == null ? null : useable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.PRIMARY_PERSON
     *
     * @return the value of sys_office.PRIMARY_PERSON
     *
     * @mbggenerated
     */
    public String getPrimaryPerson() {
        return primaryPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.PRIMARY_PERSON
     *
     * @param primaryPerson the value for sys_office.PRIMARY_PERSON
     *
     * @mbggenerated
     */
    public void setPrimaryPerson(String primaryPerson) {
        this.primaryPerson = primaryPerson == null ? null : primaryPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.DEPUTY_PERSON
     *
     * @return the value of sys_office.DEPUTY_PERSON
     *
     * @mbggenerated
     */
    public String getDeputyPerson() {
        return deputyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.DEPUTY_PERSON
     *
     * @param deputyPerson the value for sys_office.DEPUTY_PERSON
     *
     * @mbggenerated
     */
    public void setDeputyPerson(String deputyPerson) {
        this.deputyPerson = deputyPerson == null ? null : deputyPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.create_by
     *
     * @return the value of sys_office.create_by
     *
     * @mbggenerated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.create_by
     *
     * @param createBy the value for sys_office.create_by
     *
     * @mbggenerated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.create_date
     *
     * @return the value of sys_office.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.create_date
     *
     * @param createDate the value for sys_office.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.update_by
     *
     * @return the value of sys_office.update_by
     *
     * @mbggenerated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.update_by
     *
     * @param updateBy the value for sys_office.update_by
     *
     * @mbggenerated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.update_date
     *
     * @return the value of sys_office.update_date
     *
     * @mbggenerated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.update_date
     *
     * @param updateDate the value for sys_office.update_date
     *
     * @mbggenerated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.remarks
     *
     * @return the value of sys_office.remarks
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.remarks
     *
     * @param remarks the value for sys_office.remarks
     *
     * @mbggenerated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_office.del_flag
     *
     * @return the value of sys_office.del_flag
     *
     * @mbggenerated
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_office.del_flag
     *
     * @param delFlag the value for sys_office.del_flag
     *
     * @mbggenerated
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}