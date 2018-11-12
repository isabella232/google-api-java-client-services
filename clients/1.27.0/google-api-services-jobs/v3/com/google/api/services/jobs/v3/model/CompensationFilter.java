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
 * Input only.
 *
 * Filter on job compensation type and amount.
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
public final class CompensationFilter extends com.google.api.client.json.GenericJson {

  /**
   * Optional.
   *
   * Whether to include jobs whose compensation range is unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeJobsWithUnspecifiedCompensationRange;

  /**
   * Optional.
   *
   * Compensation range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompensationRange range;

  /**
   * Required.
   *
   * Type of filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Required.
   *
   * Specify desired `base compensation entry's` CompensationInfo.CompensationUnit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> units;

  /**
   * Optional.
   *
   * Whether to include jobs whose compensation range is unspecified.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeJobsWithUnspecifiedCompensationRange() {
    return includeJobsWithUnspecifiedCompensationRange;
  }

  /**
   * Optional.
   *
   * Whether to include jobs whose compensation range is unspecified.
   * @param includeJobsWithUnspecifiedCompensationRange includeJobsWithUnspecifiedCompensationRange or {@code null} for none
   */
  public CompensationFilter setIncludeJobsWithUnspecifiedCompensationRange(java.lang.Boolean includeJobsWithUnspecifiedCompensationRange) {
    this.includeJobsWithUnspecifiedCompensationRange = includeJobsWithUnspecifiedCompensationRange;
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
  public CompensationFilter setRange(CompensationRange range) {
    this.range = range;
    return this;
  }

  /**
   * Required.
   *
   * Type of filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required.
   *
   * Type of filter.
   * @param type type or {@code null} for none
   */
  public CompensationFilter setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Required.
   *
   * Specify desired `base compensation entry's` CompensationInfo.CompensationUnit.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnits() {
    return units;
  }

  /**
   * Required.
   *
   * Specify desired `base compensation entry's` CompensationInfo.CompensationUnit.
   * @param units units or {@code null} for none
   */
  public CompensationFilter setUnits(java.util.List<java.lang.String> units) {
    this.units = units;
    return this;
  }

  @Override
  public CompensationFilter set(String fieldName, Object value) {
    return (CompensationFilter) super.set(fieldName, value);
  }

  @Override
  public CompensationFilter clone() {
    return (CompensationFilter) super.clone();
  }

}
