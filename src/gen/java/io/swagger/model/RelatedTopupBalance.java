/*
 * Prepay Balance Management
 * ## TMF API Reference: TMF654 - Prepay Balance Management  ### Draft : 19.5 - January 2020  The Prepay Balance Management API enables consumers to manage the balance, recharge (top-up), transfer, reserve, unreserve, deduct and balance adjustments of a  bucket. A bucket is understood in the context of this API to be an entity that keeps track of the balance available to use services. Every bucket will measure balance in different units, it can be monetary or non-monetary (e.g.: number of sms that are available, number of GB of data available, …)  ### Resources - Bucket - TopupBalance - AdjustBalance - TransferBalance - ReserveBalance - AccumulatedBalance - BalanceActionHistory  ### Operations - Retrieve the balance information on a bucket for a given product (individual or aggregated). - Retrieve the list of balance-related operations performed over a given product - Retrieve information about all the top-up operations stored in the server filtered by some criteria. - Perform a new top up operation (recharge) - Retrieve detailed information about a top-up operation previously processed by the server. - Retrieve the current and historic status information about a top-up operation previously processed by the server. - Perform a new transfer operation - Retrieve information about all the transfer operations stored in the server filtered by some criteria - Retrieve detailed information about a transfer operation previously processed by the server - Retrieve the current and historic status information about a transfer operation previously processed by the server. - Retrieve information about all the adjustments stored in the server filtered by some criteria. - Perform a new adjustment operation - Retrieve detailed information about a balance adjustment operation previously processed by the server - Reserve a balance on a bucket. - Unreserve a balance on a bucket. - Retrieve aggregated (accumulative) balances for a bucket.
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Related Entity reference. A related balance topup defines a relationship via a role to another balance topup. Used in the PrepayBalanceManagement API to track child topups that are related to the parent (initiating balance topup resource). PrepayBalanceManagement defines the child role
 */
@Schema(description = "Related Entity reference. A related balance topup defines a relationship via a role to another balance topup. Used in the PrepayBalanceManagement API to track child topups that are related to the parent (initiating balance topup resource). PrepayBalanceManagement defines the child role")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class RelatedTopupBalance   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  @JsonProperty("@referredType")
  private String _atReferredType = null;

  public RelatedTopupBalance id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   **/
  @JsonProperty("id")
  @Schema(required = true, description = "unique identifier")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedTopupBalance href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   **/
  @JsonProperty("href")
  @Schema(description = "Hyperlink reference")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RelatedTopupBalance name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the related entity.
   * @return name
   **/
  @JsonProperty("name")
  @Schema(description = "Name of the related entity.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RelatedTopupBalance role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role played by the TopupBalance. In the PrepayBalanceManagement API this is parent or child
   * @return role
   **/
  @JsonProperty("role")
  @Schema(description = "Role played by the TopupBalance. In the PrepayBalanceManagement API this is parent or child")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedTopupBalance _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
   **/
  @JsonProperty("@baseType")
  @Schema(example = "ResourceSpecification", description = "When sub-classing, this defines the super-class")
  public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public RelatedTopupBalance _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
   **/
  @JsonProperty("@schemaLocation")
  @Schema(example = "https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json", description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public RelatedTopupBalance _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return _atType
   **/
  @JsonProperty("@type")
  @Schema(example = "LogicalResourceSpecification", description = "When sub-classing, this defines the sub-class Extensible name")
  public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }

  public RelatedTopupBalance _atReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return _atReferredType
   **/
  @JsonProperty("@referredType")
  @Schema(required = true, description = "The actual type of the target instance when needed for disambiguation.")
  @NotNull
  public String getAtReferredType() {
    return _atReferredType;
  }

  public void setAtReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedTopupBalance relatedTopupBalance = (RelatedTopupBalance) o;
    return Objects.equals(this.id, relatedTopupBalance.id) &&
        Objects.equals(this.href, relatedTopupBalance.href) &&
        Objects.equals(this.name, relatedTopupBalance.name) &&
        Objects.equals(this.role, relatedTopupBalance.role) &&
        Objects.equals(this._atBaseType, relatedTopupBalance._atBaseType) &&
        Objects.equals(this._atSchemaLocation, relatedTopupBalance._atSchemaLocation) &&
        Objects.equals(this._atType, relatedTopupBalance._atType) &&
        Objects.equals(this._atReferredType, relatedTopupBalance._atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, role, _atBaseType, _atSchemaLocation, _atType, _atReferredType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedTopupBalance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    _atReferredType: ").append(toIndentedString(_atReferredType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
