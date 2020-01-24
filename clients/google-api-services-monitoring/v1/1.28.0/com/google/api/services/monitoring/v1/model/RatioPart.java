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

package com.google.api.services.monitoring.v1.model;

/**
 * Describes a query to build the numerator or denominator of a TimeSeriesFilterRatio.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RatioPart extends com.google.api.client.json.GenericJson {

  /**
   * By default, the raw time series data is returned. Use this field to combine multiple time
   * series for different views of the data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Aggregation aggregation;

  /**
   * Required. The monitoring filter that identifies the metric types, resources, and projects to
   * query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * By default, the raw time series data is returned. Use this field to combine multiple time
   * series for different views of the data.
   * @return value or {@code null} for none
   */
  public Aggregation getAggregation() {
    return aggregation;
  }

  /**
   * By default, the raw time series data is returned. Use this field to combine multiple time
   * series for different views of the data.
   * @param aggregation aggregation or {@code null} for none
   */
  public RatioPart setAggregation(Aggregation aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Required. The monitoring filter that identifies the metric types, resources, and projects to
   * query.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Required. The monitoring filter that identifies the metric types, resources, and projects to
   * query.
   * @param filter filter or {@code null} for none
   */
  public RatioPart setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  @Override
  public RatioPart set(String fieldName, Object value) {
    return (RatioPart) super.set(fieldName, value);
  }

  @Override
  public RatioPart clone() {
    return (RatioPart) super.clone();
  }

}