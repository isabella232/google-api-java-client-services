/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.content.model;

/**
 * Model definition for ProductStatusDataQualityIssue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductStatusDataQualityIssue extends com.google.api.client.json.GenericJson {

  /**
   * The destination the issue applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destination;

  /**
   * A more detailed error string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detail;

  /**
   * The fetch status for landing_page_errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fetchStatus;

  /**
   * The id of the data quality issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The attribute name that is relevant for the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The severity of the data quality issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * The time stamp of the data quality issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timestamp;

  /**
   * The value of that attribute that was found on the landing page
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueOnLandingPage;

  /**
   * The value the attribute had at time of evaluation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueProvided;

  /**
   * The destination the issue applies to.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestination() {
    return destination;
  }

  /**
   * The destination the issue applies to.
   * @param destination destination or {@code null} for none
   */
  public ProductStatusDataQualityIssue setDestination(java.lang.String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * A more detailed error string.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetail() {
    return detail;
  }

  /**
   * A more detailed error string.
   * @param detail detail or {@code null} for none
   */
  public ProductStatusDataQualityIssue setDetail(java.lang.String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * The fetch status for landing_page_errors.
   * @return value or {@code null} for none
   */
  public java.lang.String getFetchStatus() {
    return fetchStatus;
  }

  /**
   * The fetch status for landing_page_errors.
   * @param fetchStatus fetchStatus or {@code null} for none
   */
  public ProductStatusDataQualityIssue setFetchStatus(java.lang.String fetchStatus) {
    this.fetchStatus = fetchStatus;
    return this;
  }

  /**
   * The id of the data quality issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The id of the data quality issue.
   * @param id id or {@code null} for none
   */
  public ProductStatusDataQualityIssue setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The attribute name that is relevant for the issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The attribute name that is relevant for the issue.
   * @param location location or {@code null} for none
   */
  public ProductStatusDataQualityIssue setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * The severity of the data quality issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * The severity of the data quality issue.
   * @param severity severity or {@code null} for none
   */
  public ProductStatusDataQualityIssue setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The time stamp of the data quality issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimestamp() {
    return timestamp;
  }

  /**
   * The time stamp of the data quality issue.
   * @param timestamp timestamp or {@code null} for none
   */
  public ProductStatusDataQualityIssue setTimestamp(java.lang.String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The value of that attribute that was found on the landing page
   * @return value or {@code null} for none
   */
  public java.lang.String getValueOnLandingPage() {
    return valueOnLandingPage;
  }

  /**
   * The value of that attribute that was found on the landing page
   * @param valueOnLandingPage valueOnLandingPage or {@code null} for none
   */
  public ProductStatusDataQualityIssue setValueOnLandingPage(java.lang.String valueOnLandingPage) {
    this.valueOnLandingPage = valueOnLandingPage;
    return this;
  }

  /**
   * The value the attribute had at time of evaluation.
   * @return value or {@code null} for none
   */
  public java.lang.String getValueProvided() {
    return valueProvided;
  }

  /**
   * The value the attribute had at time of evaluation.
   * @param valueProvided valueProvided or {@code null} for none
   */
  public ProductStatusDataQualityIssue setValueProvided(java.lang.String valueProvided) {
    this.valueProvided = valueProvided;
    return this;
  }

  @Override
  public ProductStatusDataQualityIssue set(String fieldName, Object value) {
    return (ProductStatusDataQualityIssue) super.set(fieldName, value);
  }

  @Override
  public ProductStatusDataQualityIssue clone() {
    return (ProductStatusDataQualityIssue) super.clone();
  }

}
