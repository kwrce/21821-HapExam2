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
import org.hibernate.validator.constraints.NotEmpty;
@ExtensionAttribute(disable=true)
@Table(name = "xxinv_material_item")
public class Material extends BaseDTO {

     public static final String FIELD_ITEM_ID = "itemId";
     public static final String FIELD_INVENTORY_ITEM_ID = "inventoryItemId";
     public static final String FIELD_ITEM_NUMBER = "itemNumber";
     public static final String FIELD_ORGANIZATION_ID = "organizationId";
     public static final String FIELD_DESCRIPTION = "description";
     public static final String FIELD_LOT_CONTROL = "lotControl";
     public static final String FIELD_UOM_CODE = "uomCode";
     public static final String FIELD_ITEM_STATUS = "itemStatus";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";
    public static final String FIELD_LINE_QTY = "lineQty";


     @Id
     @GeneratedValue
     private Long itemId; //表ID，主键，供其他表做外键

     @NotNull
     private Long inventoryItemId; //ERP物料ID

     @NotEmpty
     @Length(max = 60)
     private String itemNumber; //物料编码

     @NotNull
     private Long organizationId; //库存组织ID

     @Length(max = 240)
     private String description; //物料说明

     @Length(max = 10)
     private String lotControl; //是否批次控制

     @NotEmpty
     @Length(max = 30)
     private String uomCode; //单位

     @NotEmpty
     @Length(max = 30)
     private String itemStatus; //物料状态 ACTIVE/INACTIVE

     private Long programApplicationId;

     private Date programUpdateDate;


     public void setItemId(Long itemId){
         this.itemId = itemId;
     }

     public Long getItemId(){
         return itemId;
     }

     public void setInventoryItemId(Long inventoryItemId){
         this.inventoryItemId = inventoryItemId;
     }

     public Long getInventoryItemId(){
         return inventoryItemId;
     }

     public void setItemNumber(String itemNumber){
         this.itemNumber = itemNumber;
     }

     public String getItemNumber(){
         return itemNumber;
     }

     public void setOrganizationId(Long organizationId){
         this.organizationId = organizationId;
     }

     public Long getOrganizationId(){
         return organizationId;
     }

     public void setDescription(String description){
         this.description = description;
     }

     public String getDescription(){
         return description;
     }

     public void setLotControl(String lotControl){
         this.lotControl = lotControl;
     }

     public String getLotControl(){
         return lotControl;
     }

     public void setUomCode(String uomCode){
         this.uomCode = uomCode;
     }

     public String getUomCode(){
         return uomCode;
     }

     public void setItemStatus(String itemStatus){
         this.itemStatus = itemStatus;
     }

     public String getItemStatus(){
         return itemStatus;
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
