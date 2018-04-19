/*
 * WSO2 API Manager - Admin Portal API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.admin.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.wso2.carbon.apimgt.rest.integration.tests.admin.model.IPCondition;

/**
 * Blocking Conditions
 */
@ApiModel(description = "Blocking Conditions")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-27T17:24:45.778+05:30")
public class BlockingCondition {
  @JsonProperty("conditionId")
  private String conditionId = null;

  @JsonProperty("conditionType")
  private String conditionType = null;

  @JsonProperty("conditionValue")
  private String conditionValue = null;

  @JsonProperty("status")
  private Boolean status = null;

  @JsonProperty("ipCondition")
  private IPCondition ipCondition = null;

  public BlockingCondition conditionId(String conditionId) {
    this.conditionId = conditionId;
    return this;
  }

   /**
   * Get conditionId
   * @return conditionId
  **/
  @ApiModelProperty(value = "")
  public String getConditionId() {
    return conditionId;
  }

  public void setConditionId(String conditionId) {
    this.conditionId = conditionId;
  }

  public BlockingCondition conditionType(String conditionType) {
    this.conditionType = conditionType;
    return this;
  }

   /**
   * Get conditionType
   * @return conditionType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getConditionType() {
    return conditionType;
  }

  public void setConditionType(String conditionType) {
    this.conditionType = conditionType;
  }

  public BlockingCondition conditionValue(String conditionValue) {
    this.conditionValue = conditionValue;
    return this;
  }

   /**
   * Get conditionValue
   * @return conditionValue
  **/
  @ApiModelProperty(required = true, value = "")
  public String getConditionValue() {
    return conditionValue;
  }

  public void setConditionValue(String conditionValue) {
    this.conditionValue = conditionValue;
  }

  public BlockingCondition status(Boolean status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public BlockingCondition ipCondition(IPCondition ipCondition) {
    this.ipCondition = ipCondition;
    return this;
  }

   /**
   * Get ipCondition
   * @return ipCondition
  **/
  @ApiModelProperty(value = "")
  public IPCondition getIpCondition() {
    return ipCondition;
  }

  public void setIpCondition(IPCondition ipCondition) {
    this.ipCondition = ipCondition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockingCondition blockingCondition = (BlockingCondition) o;
    return Objects.equals(this.conditionId, blockingCondition.conditionId) &&
        Objects.equals(this.conditionType, blockingCondition.conditionType) &&
        Objects.equals(this.conditionValue, blockingCondition.conditionValue) &&
        Objects.equals(this.status, blockingCondition.status) &&
        Objects.equals(this.ipCondition, blockingCondition.ipCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionId, conditionType, conditionValue, status, ipCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockingCondition {\n");
    
    sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    conditionValue: ").append(toIndentedString(conditionValue)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ipCondition: ").append(toIndentedString(ipCondition)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
