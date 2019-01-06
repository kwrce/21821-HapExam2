package com.hand.exam.bills.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;
import javax.validation.constraints.NotNull;
@ExtensionAttribute(disable=true)
@Table(name = "xxinv_shiped_doc_lines")
public class Line extends BaseDTO {

     public static final String FIELD_SHIP_LINE_ID = "shipLineId";
     public static final String FIELD_SHIP_DOC_ID = "shipDocId";
     public static final String FIELD_LINE_NUM = "lineNum";
     public static final String FIELD_INVENTORY_ITEM_ID = "inventoryItemId";
     public static final String FIELD_ORGANIZATION_ID = "organizationId";
     public static final String FIELD_ISSUE_REQ_QTY = "issueReqQty";
     public static final String FIELD_LINE_QTY = "lineQty";
     public static final String FIELD_LOT_NUMBER = "lotNumber";
     public static final String FIELD_ISSUED_FLAG = "issuedFlag";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Id
     @GeneratedValue
     private Long shipLineId; //表ID

     @NotNull
     private Long shipDocId; //单据ID

     private Long lineNum; //行号

     @NotNull
     private Long inventoryItemId; //物料

     @NotNull
     private Long organizationId; //组织

     private Double issueReqQty; //待发货数量

     private Double lineQty; //行数量

     @Length(max = 100)
     private String lotNumber; //批次

     @Length(max = 10)
     private String issuedFlag; //行发货标志

     private Long programApplicationId;

     private Date programUpdateDate;


     public void setShipLineId(Long shipLineId){
         this.shipLineId = shipLineId;
     }

     public Long getShipLineId(){
         return shipLineId;
     }

     public void setShipDocId(Long shipDocId){
         this.shipDocId = shipDocId;
     }

     public Long getShipDocId(){
         return shipDocId;
     }

     public void setLineNum(Long lineNum){
         this.lineNum = lineNum;
     }

     public Long getLineNum(){
         return lineNum;
     }

     public void setInventoryItemId(Long inventoryItemId){
         this.inventoryItemId = inventoryItemId;
     }

     public Long getInventoryItemId(){
         return inventoryItemId;
     }

     public void setOrganizationId(Long organizationId){
         this.organizationId = organizationId;
     }

     public Long getOrganizationId(){
         return organizationId;
     }

     public void setIssueReqQty(Double issueReqQty){
         this.issueReqQty = issueReqQty;
     }

     public Double getIssueReqQty(){
         return issueReqQty;
     }

     public void setLineQty(Double lineQty){
         this.lineQty = lineQty;
     }

     public Double getLineQty(){
         return lineQty;
     }

     public void setLotNumber(String lotNumber){
         this.lotNumber = lotNumber;
     }

     public String getLotNumber(){
         return lotNumber;
     }

     public void setIssuedFlag(String issuedFlag){
         this.issuedFlag = issuedFlag;
     }

     public String getIssuedFlag(){
         return issuedFlag;
     }

     public void setProgramApplicationId(Long programApplicationId){
         this.programApplicationId = programApplicationId;
     }

     public Long getProgramApplicationId(){
         return programApplicationId;
     }

     public void setProgramUpdateDate(Date programUpdateDate){
         this.programUpdateDate = programUpdateDate;
     }

     public Date getProgramUpdateDate(){
         return programUpdateDate;
     }

     }
