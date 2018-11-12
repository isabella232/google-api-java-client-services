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

package com.google.api.services.monitoring.v3.model;

/**
 * A collection of data points that describes the time-varying values of a metric. A time series is
 * identified by a combination of a fully-specified monitored resource and a fully-specified metric.
 * This type is used for both listing and creating time series.
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
public final class TimeSeries extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The associated monitored resource metadata. When reading a a timeseries, this
   * field will include metadata labels that are explicitly named in the reduction. When creating a
   * timeseries, this field is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoredResourceMetadata metadata;

  /**
   * The associated metric. A fully-specified metric used to identify the time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Metric metric;

  /**
   * The metric kind of the time series. When listing time series, this metric kind might be
   * different from the metric kind of the associated metric if this time series is an alignment or
   * reduction of other time series.When creating a time series, this field is optional. If present,
   * it must be the same as the metric kind of the associated metric. If the associated metric's
   * descriptor must be auto-created, then this field specifies the metric kind of the new
   * descriptor and must be either GAUGE (the default) or CUMULATIVE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metricKind;

  /**
   * The data points of this time series. When listing time series, points are returned in reverse
   * time order.When creating a time series, this field must contain exactly one point and the
   * point's type must be the same as the value type of the associated metric. If the associated
   * metric's descriptor must be auto-created, then the value type of the descriptor is determined
   * by the point's type, which must be BOOL, INT64, DOUBLE, or DISTRIBUTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Point> points;

  /**
   * The associated monitored resource. Custom metrics can use only certain monitored resource types
   * in their time series data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoredResource resource;

  /**
   * The value type of the time series. When listing time series, this value type might be different
   * from the value type of the associated metric if this time series is an alignment or reduction
   * of other time series.When creating a time series, this field is optional. If present, it must
   * be the same as the type of the data in the points field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueType;

  /**
   * Output only. The associated monitored resource metadata. When reading a a timeseries, this
   * field will include metadata labels that are explicitly named in the reduction. When creating a
   * timeseries, this field is ignored.
   * @return value or {@code null} for none
   */
  public MonitoredResourceMetadata getMetadata() {
    return metadata;
  }

  /**
   * Output only. The associated monitored resource metadata. When reading a a timeseries, this
   * field will include metadata labels that are explicitly named in the reduction. When creating a
   * timeseries, this field is ignored.
   * @param metadata metadata or {@code null} for none
   */
  public TimeSeries setMetadata(MonitoredResourceMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The associated metric. A fully-specified metric used to identify the time series.
   * @return value or {@code null} for none
   */
  public Metric getMetric() {
    return metric;
  }

  /**
   * The associated metric. A fully-specified metric used to identify the time series.
   * @param metric metric or {@code null} for none
   */
  public TimeSeries setMetric(Metric metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The metric kind of the time series. When listing time series, this metric kind might be
   * different from the metric kind of the associated metric if this time series is an alignment or
   * reduction of other time series.When creating a time series, this field is optional. If present,
   * it must be the same as the metric kind of the associated metric. If the associated metric's
   * descriptor must be auto-created, then this field specifies the metric kind of the new
   * descriptor and must be either GAUGE (the default) or CUMULATIVE.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetricKind() {
    return metricKind;
  }

  /**
   * The metric kind of the time series. When listing time series, this metric kind might be
   * different from the metric kind of the associated metric if this time series is an alignment or
   * reduction of other time series.When creating a time series, this field is optional. If present,
   * it must be the same as the metric kind of the associated metric. If the associated metric's
   * descriptor must be auto-created, then this field specifies the metric kind of the new
   * descriptor and must be either GAUGE (the default) or CUMULATIVE.
   * @param metricKind metricKind or {@code null} for none
   */
  public TimeSeries setMetricKind(java.lang.String metricKind) {
    this.metricKind = metricKind;
    return this;
  }

  /**
   * The data points of this time series. When listing time series, points are returned in reverse
   * time order.When creating a time series, this field must contain exactly one point and the
   * point's type must be the same as the value type of the associated metric. If the associated
   * metric's descriptor must be auto-created, then the value type of the descriptor is determined
   * by the point's type, which must be BOOL, INT64, DOUBLE, or DISTRIBUTION.
   * @return value or {@code null} for none
   */
  public java.util.List<Point> getPoints() {
    return points;
  }

  /**
   * The data points of this time series. When listing time series, points are returned in reverse
   * time order.When creating a time series, this field must contain exactly one point and the
   * point's type must be the same as the value type of the associated metric. If the associated
   * metric's descriptor must be auto-created, then the value type of the descriptor is determined
   * by the point's type, which must be BOOL, INT64, DOUBLE, or DISTRIBUTION.
   * @param points points or {@code null} for none
   */
  public TimeSeries setPoints(java.util.List<Point> points) {
    this.points = points;
    return this;
  }

  /**
   * The associated monitored resource. Custom metrics can use only certain monitored resource types
   * in their time series data.
   * @return value or {@code null} for none
   */
  public MonitoredResource getResource() {
    return resource;
  }

  /**
   * The associated monitored resource. Custom metrics can use only certain monitored resource types
   * in their time series data.
   * @param resource resource or {@code null} for none
   */
  public TimeSeries setResource(MonitoredResource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The value type of the time series. When listing time series, this value type might be different
   * from the value type of the associated metric if this time series is an alignment or reduction
   * of other time series.When creating a time series, this field is optional. If present, it must
   * be the same as the type of the data in the points field.
   * @return value or {@code null} for none
   */
  public java.lang.String getValueType() {
    return valueType;
  }

  /**
   * The value type of the time series. When listing time series, this value type might be different
   * from the value type of the associated metric if this time series is an alignment or reduction
   * of other time series.When creating a time series, this field is optional. If present, it must
   * be the same as the type of the data in the points field.
   * @param valueType valueType or {@code null} for none
   */
  public TimeSeries setValueType(java.lang.String valueType) {
    this.valueType = valueType;
    return this;
  }

  @Override
  public TimeSeries set(String fieldName, Object value) {
    return (TimeSeries) super.set(fieldName, value);
  }

  @Override
  public TimeSeries clone() {
    return (TimeSeries) super.clone();
  }

}
