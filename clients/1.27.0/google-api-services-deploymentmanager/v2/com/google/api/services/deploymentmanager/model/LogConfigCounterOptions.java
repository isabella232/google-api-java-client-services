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

package com.google.api.services.deploymentmanager.model;

/**
 * Increment a streamz counter with the specified metric and field names.
 *
 * Metric names should start with a '/', generally be lowercase-only, and end in "_count". Field
 * names should not contain an initial slash. The actual exported metric names will have
 * "/iam/policy" prepended.
 *
 * Field names correspond to IAM request parameters and field values are their respective values.
 *
 * At present the only supported field names are - "iam_principal", corresponding to
 * IAMContext.principal; - "" (empty string), resulting in one aggretated counter with no field.
 *
 * Examples: counter { metric: "/debug_access_count" field: "iam_principal" } ==> increment counter
 * /iam/policy/backend_debug_access_count {iam_principal=[value of IAMContext.principal]}
 *
 * At this time we do not support: * multiple field names (though this may be supported in the
 * future) * decrementing the counter * incrementing it by anything other than 1
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deployment Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogConfigCounterOptions extends com.google.api.client.json.GenericJson {

  /**
   * The field value to attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String field;

  /**
   * The metric to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metric;

  /**
   * The field value to attribute.
   * @return value or {@code null} for none
   */
  public java.lang.String getField() {
    return field;
  }

  /**
   * The field value to attribute.
   * @param field field or {@code null} for none
   */
  public LogConfigCounterOptions setField(java.lang.String field) {
    this.field = field;
    return this;
  }

  /**
   * The metric to update.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetric() {
    return metric;
  }

  /**
   * The metric to update.
   * @param metric metric or {@code null} for none
   */
  public LogConfigCounterOptions setMetric(java.lang.String metric) {
    this.metric = metric;
    return this;
  }

  @Override
  public LogConfigCounterOptions set(String fieldName, Object value) {
    return (LogConfigCounterOptions) super.set(fieldName, value);
  }

  @Override
  public LogConfigCounterOptions clone() {
    return (LogConfigCounterOptions) super.clone();
  }

}
