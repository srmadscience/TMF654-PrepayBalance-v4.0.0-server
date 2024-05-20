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
import io.swagger.model.BucketRef;
import io.swagger.model.ChannelRef;
import io.swagger.model.CostOwnerType;
import io.swagger.model.LogicalResourceRef;
import io.swagger.model.Money;
import io.swagger.model.ProductRef;
import io.swagger.model.Quantity;
import io.swagger.model.RelatedParty;
import io.swagger.model.UsageType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The TransferBalance resource is a detailed description of credit transfer operation requested between two buckets (reference to products owned by customers and consuming credit when using a service). Skipped properties: id,href,status,requestedDate,confirmationDate,validFor,description,partyAccount,relatedParty
 */
@Schema(description = "The TransferBalance resource is a detailed description of credit transfer operation requested between two buckets (reference to products owned by customers and consuming credit when using a service). Skipped properties: id,href,status,requestedDate,confirmationDate,validFor,description,partyAccount,relatedParty")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class TransferBalanceUpdate   {
  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("amount")
  private Quantity amount = null;

  @JsonProperty("bucket")
  private BucketRef bucket = null;

  @JsonProperty("channel")
  private ChannelRef channel = null;

  @JsonProperty("costOwner")
  private CostOwnerType costOwner = null;

  @JsonProperty("logicalResource")
  private List<LogicalResourceRef> logicalResource = new ArrayList<LogicalResourceRef>();

  @JsonProperty("product")
  private List<ProductRef> product = null;

  @JsonProperty("receiver")
  private RelatedParty receiver = null;

  @JsonProperty("receiverBucket")
  private BucketRef receiverBucket = null;

  @JsonProperty("receiverBucketUsageType")
  private UsageType receiverBucketUsageType = null;

  @JsonProperty("receiverLogicalResource")
  private LogicalResourceRef receiverLogicalResource = null;

  @JsonProperty("receiverProduct")
  private ProductRef receiverProduct = null;

  @JsonProperty("requestor")
  private RelatedParty requestor = null;

  @JsonProperty("transferCost")
  private Money transferCost = null;

  @JsonProperty("usageType")
  private UsageType usageType = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public TransferBalanceUpdate reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Text describing the reason for the action/task
   * @return reason
   **/
  @JsonProperty("reason")
  @Schema(required = true, description = "Text describing the reason for the action/task")
  @NotNull
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public TransferBalanceUpdate amount(Quantity amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @JsonProperty("amount")
  @Schema(description = "")
  @Valid
  public Quantity getAmount() {
    return amount;
  }

  public void setAmount(Quantity amount) {
    this.amount = amount;
  }

  public TransferBalanceUpdate bucket(BucketRef bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Get bucket
   * @return bucket
   **/
  @JsonProperty("bucket")
  @Schema(description = "")
  @Valid
  public BucketRef getBucket() {
    return bucket;
  }

  public void setBucket(BucketRef bucket) {
    this.bucket = bucket;
  }

  public TransferBalanceUpdate channel(ChannelRef channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
   **/
  @JsonProperty("channel")
  @Schema(required = true, description = "")
  @NotNull
  @Valid
  public ChannelRef getChannel() {
    return channel;
  }

  public void setChannel(ChannelRef channel) {
    this.channel = channel;
  }

  public TransferBalanceUpdate costOwner(CostOwnerType costOwner) {
    this.costOwner = costOwner;
    return this;
  }

  /**
   * Get costOwner
   * @return costOwner
   **/
  @JsonProperty("costOwner")
  @Schema(description = "")
  @Valid
  public CostOwnerType getCostOwner() {
    return costOwner;
  }

  public void setCostOwner(CostOwnerType costOwner) {
    this.costOwner = costOwner;
  }

  public TransferBalanceUpdate logicalResource(List<LogicalResourceRef> logicalResource) {
    this.logicalResource = logicalResource;
    return this;
  }

  public TransferBalanceUpdate addLogicalResourceItem(LogicalResourceRef logicalResourceItem) {
    this.logicalResource.add(logicalResourceItem);
    return this;
  }

  /**
   * Get logicalResource
   * @return logicalResource
   **/
  @JsonProperty("logicalResource")
  @Schema(required = true, description = "")
  @NotNull
  @Valid
 @Size(min=1)  public List<LogicalResourceRef> getLogicalResource() {
    return logicalResource;
  }

  public void setLogicalResource(List<LogicalResourceRef> logicalResource) {
    this.logicalResource = logicalResource;
  }

  public TransferBalanceUpdate product(List<ProductRef> product) {
    this.product = product;
    return this;
  }

  public TransferBalanceUpdate addProductItem(ProductRef productItem) {
    if (this.product == null) {
      this.product = new ArrayList<ProductRef>();
    }
    this.product.add(productItem);
    return this;
  }

  /**
   * Get product
   * @return product
   **/
  @JsonProperty("product")
  @Schema(description = "")
  @Valid
  public List<ProductRef> getProduct() {
    return product;
  }

  public void setProduct(List<ProductRef> product) {
    this.product = product;
  }

  public TransferBalanceUpdate receiver(RelatedParty receiver) {
    this.receiver = receiver;
    return this;
  }

  /**
   * Get receiver
   * @return receiver
   **/
  @JsonProperty("receiver")
  @Schema(description = "")
  @Valid
  public RelatedParty getReceiver() {
    return receiver;
  }

  public void setReceiver(RelatedParty receiver) {
    this.receiver = receiver;
  }

  public TransferBalanceUpdate receiverBucket(BucketRef receiverBucket) {
    this.receiverBucket = receiverBucket;
    return this;
  }

  /**
   * Get receiverBucket
   * @return receiverBucket
   **/
  @JsonProperty("receiverBucket")
  @Schema(description = "")
  @Valid
  public BucketRef getReceiverBucket() {
    return receiverBucket;
  }

  public void setReceiverBucket(BucketRef receiverBucket) {
    this.receiverBucket = receiverBucket;
  }

  public TransferBalanceUpdate receiverBucketUsageType(UsageType receiverBucketUsageType) {
    this.receiverBucketUsageType = receiverBucketUsageType;
    return this;
  }

  /**
   * Get receiverBucketUsageType
   * @return receiverBucketUsageType
   **/
  @JsonProperty("receiverBucketUsageType")
  @Schema(description = "")
  @Valid
  public UsageType getReceiverBucketUsageType() {
    return receiverBucketUsageType;
  }

  public void setReceiverBucketUsageType(UsageType receiverBucketUsageType) {
    this.receiverBucketUsageType = receiverBucketUsageType;
  }

  public TransferBalanceUpdate receiverLogicalResource(LogicalResourceRef receiverLogicalResource) {
    this.receiverLogicalResource = receiverLogicalResource;
    return this;
  }

  /**
   * Get receiverLogicalResource
   * @return receiverLogicalResource
   **/
  @JsonProperty("receiverLogicalResource")
  @Schema(required = true, description = "")
  @NotNull
  @Valid
  public LogicalResourceRef getReceiverLogicalResource() {
    return receiverLogicalResource;
  }

  public void setReceiverLogicalResource(LogicalResourceRef receiverLogicalResource) {
    this.receiverLogicalResource = receiverLogicalResource;
  }

  public TransferBalanceUpdate receiverProduct(ProductRef receiverProduct) {
    this.receiverProduct = receiverProduct;
    return this;
  }

  /**
   * Get receiverProduct
   * @return receiverProduct
   **/
  @JsonProperty("receiverProduct")
  @Schema(description = "")
  @Valid
  public ProductRef getReceiverProduct() {
    return receiverProduct;
  }

  public void setReceiverProduct(ProductRef receiverProduct) {
    this.receiverProduct = receiverProduct;
  }

  public TransferBalanceUpdate requestor(RelatedParty requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Get requestor
   * @return requestor
   **/
  @JsonProperty("requestor")
  @Schema(description = "")
  @Valid
  public RelatedParty getRequestor() {
    return requestor;
  }

  public void setRequestor(RelatedParty requestor) {
    this.requestor = requestor;
  }

  public TransferBalanceUpdate transferCost(Money transferCost) {
    this.transferCost = transferCost;
    return this;
  }

  /**
   * Get transferCost
   * @return transferCost
   **/
  @JsonProperty("transferCost")
  @Schema(description = "")
  @Valid
  public Money getTransferCost() {
    return transferCost;
  }

  public void setTransferCost(Money transferCost) {
    this.transferCost = transferCost;
  }

  public TransferBalanceUpdate usageType(UsageType usageType) {
    this.usageType = usageType;
    return this;
  }

  /**
   * Get usageType
   * @return usageType
   **/
  @JsonProperty("usageType")
  @Schema(description = "")
  @Valid
  public UsageType getUsageType() {
    return usageType;
  }

  public void setUsageType(UsageType usageType) {
    this.usageType = usageType;
  }

  public TransferBalanceUpdate _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
   **/
  @JsonProperty("@baseType")
  @Schema(description = "When sub-classing, this defines the super-class")
  public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public TransferBalanceUpdate _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
   **/
  @JsonProperty("@schemaLocation")
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public TransferBalanceUpdate _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return _atType
   **/
  @JsonProperty("@type")
  @Schema(description = "When sub-classing, this defines the sub-class entity name")
  public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferBalanceUpdate transferBalanceUpdate = (TransferBalanceUpdate) o;
    return Objects.equals(this.reason, transferBalanceUpdate.reason) &&
        Objects.equals(this.amount, transferBalanceUpdate.amount) &&
        Objects.equals(this.bucket, transferBalanceUpdate.bucket) &&
        Objects.equals(this.channel, transferBalanceUpdate.channel) &&
        Objects.equals(this.costOwner, transferBalanceUpdate.costOwner) &&
        Objects.equals(this.logicalResource, transferBalanceUpdate.logicalResource) &&
        Objects.equals(this.product, transferBalanceUpdate.product) &&
        Objects.equals(this.receiver, transferBalanceUpdate.receiver) &&
        Objects.equals(this.receiverBucket, transferBalanceUpdate.receiverBucket) &&
        Objects.equals(this.receiverBucketUsageType, transferBalanceUpdate.receiverBucketUsageType) &&
        Objects.equals(this.receiverLogicalResource, transferBalanceUpdate.receiverLogicalResource) &&
        Objects.equals(this.receiverProduct, transferBalanceUpdate.receiverProduct) &&
        Objects.equals(this.requestor, transferBalanceUpdate.requestor) &&
        Objects.equals(this.transferCost, transferBalanceUpdate.transferCost) &&
        Objects.equals(this.usageType, transferBalanceUpdate.usageType) &&
        Objects.equals(this._atBaseType, transferBalanceUpdate._atBaseType) &&
        Objects.equals(this._atSchemaLocation, transferBalanceUpdate._atSchemaLocation) &&
        Objects.equals(this._atType, transferBalanceUpdate._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, amount, bucket, channel, costOwner, logicalResource, product, receiver, receiverBucket, receiverBucketUsageType, receiverLogicalResource, receiverProduct, requestor, transferCost, usageType, _atBaseType, _atSchemaLocation, _atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferBalanceUpdate {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    costOwner: ").append(toIndentedString(costOwner)).append("\n");
    sb.append("    logicalResource: ").append(toIndentedString(logicalResource)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    receiverBucket: ").append(toIndentedString(receiverBucket)).append("\n");
    sb.append("    receiverBucketUsageType: ").append(toIndentedString(receiverBucketUsageType)).append("\n");
    sb.append("    receiverLogicalResource: ").append(toIndentedString(receiverLogicalResource)).append("\n");
    sb.append("    receiverProduct: ").append(toIndentedString(receiverProduct)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    transferCost: ").append(toIndentedString(transferCost)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
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
