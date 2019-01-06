package com.hand.exam.bills.dto;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Bill {
    public static final String FIELD_SHIP_LINE_ID = "shipLineId";
    public static final String FIELD_SHIP_DOC_ID = "shipDocId";
    public static final String FIELD_SHIPPED_TIME = "shippedTime";
    public static final String FIELD_DOC_TYPE = "docType";
    public static final String FIELD_ORGANIZATION_ID = "organizationId";
    public static final String FIELD_SHIPPMENT_STATUS = "shippmentStatus";
    public static final String FIELD_DRIVER_NAME = "driverName";
    public static final String FIELD_DRIVER_PHONE = "driverPhone";
    public static final String FIELD_FREIGHT = "freight";
    public static final String FIELD_MEMO = "memo";
    public static final String FIELD_DOC_NUMBER = "docNumber";
    public static final String FIELD_TO_ORGANIZATION_ID = "toOrganizationId";
    public static final String FIELD_CONFIRMER_ID = "confirmerId";
    public static final String FIELD_PLATE_NUMBER = "plateNumber";
    public static final String FIELD_ITEM_ID = "itemId";
    public static final String FIELD_ITEM_NUMBER = "itemNumber";
    public static final String FIELD_LOT_CONTROL = "lotControl";
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_LOT_NUMBER = "lotNumber";
    public static final String FIELD_ISSUE_REQ_QTY = "issueReqQty";
    public static final String FIELD_SHIPPED_NUMBER = "shippedNumber";
    public static final String FIELD_LINE_NUM = "lineNum";
    public static final String FIELD_INVENTORY_ITEM_ID = "inventoryItemId";
    public static final String FIELD_LINE_QTY = "lineQty";

    @Id
    @GeneratedValue
    private Long shipLineId; //表ID

    @NotNull
    private Long inventoryItemId; //物料

    private Date shippedTime; //发货时间

    private Long shipDocId; //表ID

    private Long lineNum; //行号

    @NotEmpty
    @Length(max = 50)
    private String docType; //ISSUED(出库单)/RETURN(入库单)

    @NotNull
    private Long organizationId; //组织ID

    @NotEmpty
    @Length(max = 30)
    private String shippmentStatus; //PENDING(未发货)/(CONFIRMED)已确认/SHIPPED(已发货)

    @Length(max = 30)
    private String driverName; //司机姓名

    @Length(max = 30)
    private String driverPhone; //司机电话

    @Length(max = 30)
    private String plateNumber; //车牌号码

    private Double freight; //运费


    @Length(max = 65535)
    private String memo; //备注

    @NotEmpty
    @Length(max = 240)
    private String docNumber; //发货单号

    private Long toOrganizationId; //目标仓库

    private Long confirmerId; //确认人用户ID

    private Long itemId; //表ID，主键，供其他表做外键

    @NotEmpty
    @Length(max = 60)
    private String itemNumber; //物料编码

    @Length(max = 10)
    private String lotControl; //是否批次控制

    @Length(max = 240)
    private String description; //物料说明

    @Length(max = 100)
    private String lotNumber; //批次

    private Double lineQty; //行数量

    private Double issueReqQty; //待发货数量

    private Double shippedNumber;  //已发货数量

    public Long getShipLineId() {
        return shipLineId;
    }

    public void setShipLineId(Long shipLineId) {
        this.shipLineId = shipLineId;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Date getShippedTime() {
        return shippedTime;
    }

    public void setShippedTime(Date shippedTime) {
        this.shippedTime = shippedTime;
    }

    public Long getShipDocId() {
        return shipDocId;
    }

    public void setShipDocId(Long shipDocId) {
        this.shipDocId = shipDocId;
    }

    public Long getLineNum() {
        return lineNum;
    }

    public void setLineNum(Long lineNum) {
        this.lineNum = lineNum;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getShippmentStatus() {
        return shippmentStatus;
    }

    public void setShippmentStatus(String shippmentStatus) {
        this.shippmentStatus = shippmentStatus;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public Long getToOrganizationId() {
        return toOrganizationId;
    }

    public void setToOrganizationId(Long toOrganizationId) {
        this.toOrganizationId = toOrganizationId;
    }

    public Long getConfirmerId() {
        return confirmerId;
    }

    public void setConfirmerId(Long confirmerId) {
        this.confirmerId = confirmerId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getLotControl() {
        return lotControl;
    }

    public void setLotControl(String lotControl) {
        this.lotControl = lotControl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Double getLineQty() {
        return lineQty;
    }

    public void setLineQty(Double lineQty) {
        this.lineQty = lineQty;
    }

    public Double getIssueReqQty() {
        return issueReqQty;
    }

    public void setIssueReqQty(Double issueReqQty) {
        this.issueReqQty = issueReqQty;
    }

    public Double getShippedNumber() {
        return shippedNumber;
    }

    public void setShippedNumber(Double shippedNumber) {
        this.shippedNumber = shippedNumber;
    }
}
