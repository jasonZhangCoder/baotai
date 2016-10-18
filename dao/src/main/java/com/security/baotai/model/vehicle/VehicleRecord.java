package com.security.baotai.model.vehicle;

import java.io.Serializable;
import java.util.Date;

public class VehicleRecord implements Serializable {
    private Long id;

    private Long vehicleId;

    private String recordType;

    private Double money;

    private String descprition;

    private String operateUser;

    private Date createTime;

    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_vehicle_record
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_vehicle_record.id
     *
     * @return the value of tb_vehicle_record.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_vehicle_record.id
     *
     * @param id the value for tb_vehicle_record.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_vehicle_record.vehicle_id
     *
     * @return the value of tb_vehicle_record.vehicle_id
     *
     * @mbggenerated
     */
    public Long getVehicleId() {
        return vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_vehicle_record.vehicle_id
     *
     * @param vehicleId the value for tb_vehicle_record.vehicle_id
     *
     * @mbggenerated
     */
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_vehicle_record.record_type
     *
     * @return the value of tb_vehicle_record.record_type
     *
     * @mbggenerated
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_vehicle_record.record_type
     *
     * @param recordType the value for tb_vehicle_record.record_type
     *
     * @mbggenerated
     */
    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_vehicle_record.money
     *
     * @return the value of tb_vehicle_record.money
     *
     * @mbggenerated
     */
    public Double getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_vehicle_record.money
     *
     * @param money the value for tb_vehicle_record.money
     *
     * @mbggenerated
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_vehicle_record.descprition
     *
     * @return the value of tb_vehicle_record.descprition
     *
     * @mbggenerated
     */
    public String getDescprition() {
        return descprition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_vehicle_record.descprition
     *
     * @param descprition the value for tb_vehicle_record.descprition
     *
     * @mbggenerated
     */
    public void setDescprition(String descprition) {
        this.descprition = descprition == null ? null : descprition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_vehicle_record.operate_user
     *
     * @return the value of tb_vehicle_record.operate_user
     *
     * @mbggenerated
     */
    public String getOperateUser() {
        return operateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_vehicle_record.operate_user
     *
     * @param operateUser the value for tb_vehicle_record.operate_user
     *
     * @mbggenerated
     */
    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser == null ? null : operateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_vehicle_record.create_time
     *
     * @return the value of tb_vehicle_record.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_vehicle_record.create_time
     *
     * @param createTime the value for tb_vehicle_record.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_vehicle_record.create_user
     *
     * @return the value of tb_vehicle_record.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_vehicle_record.create_user
     *
     * @param createUser the value for tb_vehicle_record.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }
}