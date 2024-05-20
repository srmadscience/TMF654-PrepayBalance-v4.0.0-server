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
import io.swagger.model.AdjustBalanceFailureEventPayload;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The notification data structure
 */
@Schema(description = "The notification data structure")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class AdjustBalanceFailureEvent   {
  @JsonProperty("event")
  private AdjustBalanceFailureEventPayload event = null;

  @JsonProperty("eventId")
  private String eventId = null;

  @JsonProperty("eventTime")
  private Date eventTime = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("correlationId")
  private String correlationId = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("timeOcurred")
  private Date timeOcurred = null;

  public AdjustBalanceFailureEvent event(AdjustBalanceFailureEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   **/
  @JsonProperty("event")
  @Schema(description = "")
  @Valid
  public AdjustBalanceFailureEventPayload getEvent() {
    return event;
  }

  public void setEvent(AdjustBalanceFailureEventPayload event) {
    this.event = event;
  }

  public AdjustBalanceFailureEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
   **/
  @JsonProperty("eventId")
  @Schema(description = "The identifier of the notification.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public AdjustBalanceFailureEvent eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
   **/
  @JsonProperty("eventTime")
  @Schema(description = "Time of the event occurrence.")
  @Valid
  public Date getEventTime() {
    return eventTime;
  }

  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  public AdjustBalanceFailureEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
   **/
  @JsonProperty("eventType")
  @Schema(description = "The type of the notification.")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public AdjustBalanceFailureEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
   **/
  @JsonProperty("correlationId")
  @Schema(description = "The correlation id for this event.")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public AdjustBalanceFailureEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
   **/
  @JsonProperty("domain")
  @Schema(description = "The domain of the event.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public AdjustBalanceFailureEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
   **/
  @JsonProperty("title")
  @Schema(description = "The title of the event.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AdjustBalanceFailureEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explnatory of the event.
   * @return description
   **/
  @JsonProperty("description")
  @Schema(description = "An explnatory of the event.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdjustBalanceFailureEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
   **/
  @JsonProperty("priority")
  @Schema(description = "A priority.")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public AdjustBalanceFailureEvent timeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

  /**
   * The time the event occured.
   * @return timeOcurred
   **/
  @JsonProperty("timeOcurred")
  @Schema(description = "The time the event occured.")
  @Valid
  public Date getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustBalanceFailureEvent adjustBalanceFailureEvent = (AdjustBalanceFailureEvent) o;
    return Objects.equals(this.event, adjustBalanceFailureEvent.event) &&
        Objects.equals(this.eventId, adjustBalanceFailureEvent.eventId) &&
        Objects.equals(this.eventTime, adjustBalanceFailureEvent.eventTime) &&
        Objects.equals(this.eventType, adjustBalanceFailureEvent.eventType) &&
        Objects.equals(this.correlationId, adjustBalanceFailureEvent.correlationId) &&
        Objects.equals(this.domain, adjustBalanceFailureEvent.domain) &&
        Objects.equals(this.title, adjustBalanceFailureEvent.title) &&
        Objects.equals(this.description, adjustBalanceFailureEvent.description) &&
        Objects.equals(this.priority, adjustBalanceFailureEvent.priority) &&
        Objects.equals(this.timeOcurred, adjustBalanceFailureEvent.timeOcurred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustBalanceFailureEvent {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
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
