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
 * The ListMetricDescriptors response.
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
public final class ListMetricDescriptorsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The metric descriptors that are available to the project and that match the value of filter, if
   * present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricDescriptor> metricDescriptors;

  static {
    // hack to force ProGuard to consider MetricDescriptor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricDescriptor.class);
  }

  /**
   * If there are more results than have been returned, then this field is set to a non-empty value.
   * To see the additional results, use that value as pageToken in the next call to this method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The metric descriptors that are available to the project and that match the value of filter, if
   * present.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricDescriptor> getMetricDescriptors() {
    return metricDescriptors;
  }

  /**
   * The metric descriptors that are available to the project and that match the value of filter, if
   * present.
   * @param metricDescriptors metricDescriptors or {@code null} for none
   */
  public ListMetricDescriptorsResponse setMetricDescriptors(java.util.List<MetricDescriptor> metricDescriptors) {
    this.metricDescriptors = metricDescriptors;
    return this;
  }

  /**
   * If there are more results than have been returned, then this field is set to a non-empty value.
   * To see the additional results, use that value as pageToken in the next call to this method.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If there are more results than have been returned, then this field is set to a non-empty value.
   * To see the additional results, use that value as pageToken in the next call to this method.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListMetricDescriptorsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListMetricDescriptorsResponse set(String fieldName, Object value) {
    return (ListMetricDescriptorsResponse) super.set(fieldName, value);
  }

  @Override
  public ListMetricDescriptorsResponse clone() {
    return (ListMetricDescriptorsResponse) super.clone();
  }

}
