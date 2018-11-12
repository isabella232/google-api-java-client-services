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

package com.google.api.services.jobs.v3.model;

/**
 * A compensation entry that represents one component of compensation, such as base pay, bonus, or
 * other compensation type.
 *
 * Annualization: One compensation entry can be annualized if - it contains valid amount or range. -
 * and its expected_units_per_year is set or can be derived. Its annualized range is determined as
 * (amount or range) times expected_units_per_year.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompensationEntry extends com.google.api.client.json.GenericJson {

  /**
   * Optional.
   *
   * Compensation amount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money amount;

  /**
   * Optional.
   *
   * Compensation description.  For example, could indicate equity terms or provide additional
   * context to an estimated bonus.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional.
   *
   * Expected number of units paid each year. If not specified, when Job.employment_types is
   * FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY:
   * 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double expectedUnitsPerYear;

  /**
   * Optional.
   *
   * Compensation range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompensationRange range;

  /**
   * Optional.
   *
   * Compensation type.
   *
   * Default is CompensationUnit.OTHER_COMPENSATION_TYPE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional.
   *
   * Frequency of the specified amount.
   *
   * Default is CompensationUnit.OTHER_COMPENSATION_UNIT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * Optional.
   *
   * Compensation amount.
   * @return value or {@code null} for none
   */
  public Money getAmount() {
    return amount;
  }

  /**
   * Optional.
   *
   * Compensation amount.
   * @param amount amount or {@code null} for none
   */
  public CompensationEntry setAmount(Money amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Optional.
   *
   * Compensation description.  For example, could indicate equity terms or provide additional
   * context to an estimated bonus.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional.
   *
   * Compensation description.  For example, could indicate equity terms or provide additional
   * context to an estimated bonus.
   * @param description description or {@code null} for none
   */
  public CompensationEntry setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional.
   *
   * Expected number of units paid each year. If not specified, when Job.employment_types is
   * FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY:
   * 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
   * @return value or {@code null} for none
   */
  public java.lang.Double getExpectedUnitsPerYear() {
    return expectedUnitsPerYear;
  }

  /**
   * Optional.
   *
   * Expected number of units paid each year. If not specified, when Job.employment_types is
   * FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY:
   * 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
   * @param expectedUnitsPerYear expectedUnitsPerYear or {@code null} for none
   */
  public CompensationEntry setExpectedUnitsPerYear(java.lang.Double expectedUnitsPerYear) {
    this.expectedUnitsPerYear = expectedUnitsPerYear;
    return this;
  }

  /**
   * Optional.
   *
   * Compensation range.
   * @return value or {@code null} for none
   */
  public CompensationRange getRange() {
    return range;
  }

  /**
   * Optional.
   *
   * Compensation range.
   * @param range range or {@code null} for none
   */
  public CompensationEntry setRange(CompensationRange range) {
    this.range = range;
    return this;
  }

  /**
   * Optional.
   *
   * Compensation type.
   *
   * Default is CompensationUnit.OTHER_COMPENSATION_TYPE.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Optional.
   *
   * Compensation type.
   *
   * Default is CompensationUnit.OTHER_COMPENSATION_TYPE.
   * @param type type or {@code null} for none
   */
  public CompensationEntry setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Optional.
   *
   * Frequency of the specified amount.
   *
   * Default is CompensationUnit.OTHER_COMPENSATION_UNIT.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * Optional.
   *
   * Frequency of the specified amount.
   *
   * Default is CompensationUnit.OTHER_COMPENSATION_UNIT.
   * @param unit unit or {@code null} for none
   */
  public CompensationEntry setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  @Override
  public CompensationEntry set(String fieldName, Object value) {
    return (CompensationEntry) super.set(fieldName, value);
  }

  @Override
  public CompensationEntry clone() {
    return (CompensationEntry) super.clone();
  }

}
