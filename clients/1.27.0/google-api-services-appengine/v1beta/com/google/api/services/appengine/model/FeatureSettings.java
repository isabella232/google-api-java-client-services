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

package com.google.api.services.appengine.model;

/**
 * The feature specific settings to be used in the application. These define behaviors that are user
 * configurable.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FeatureSettings extends com.google.api.client.json.GenericJson {

  /**
   * Boolean value indicating if split health checks should be used instead of the legacy health
   * checks. At an app.yaml level, this means defaulting to 'readiness_check' and 'liveness_check'
   * values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated,
   * and this value is always true, this setting can be removed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean splitHealthChecks;

  /**
   * If true, use Container-Optimized OS (https://cloud.google.com/container-optimized-os/) base
   * image for VMs, rather than a base Debian image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useContainerOptimizedOs;

  /**
   * Boolean value indicating if split health checks should be used instead of the legacy health
   * checks. At an app.yaml level, this means defaulting to 'readiness_check' and 'liveness_check'
   * values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated,
   * and this value is always true, this setting can be removed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSplitHealthChecks() {
    return splitHealthChecks;
  }

  /**
   * Boolean value indicating if split health checks should be used instead of the legacy health
   * checks. At an app.yaml level, this means defaulting to 'readiness_check' and 'liveness_check'
   * values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated,
   * and this value is always true, this setting can be removed.
   * @param splitHealthChecks splitHealthChecks or {@code null} for none
   */
  public FeatureSettings setSplitHealthChecks(java.lang.Boolean splitHealthChecks) {
    this.splitHealthChecks = splitHealthChecks;
    return this;
  }

  /**
   * If true, use Container-Optimized OS (https://cloud.google.com/container-optimized-os/) base
   * image for VMs, rather than a base Debian image.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseContainerOptimizedOs() {
    return useContainerOptimizedOs;
  }

  /**
   * If true, use Container-Optimized OS (https://cloud.google.com/container-optimized-os/) base
   * image for VMs, rather than a base Debian image.
   * @param useContainerOptimizedOs useContainerOptimizedOs or {@code null} for none
   */
  public FeatureSettings setUseContainerOptimizedOs(java.lang.Boolean useContainerOptimizedOs) {
    this.useContainerOptimizedOs = useContainerOptimizedOs;
    return this;
  }

  @Override
  public FeatureSettings set(String fieldName, Object value) {
    return (FeatureSettings) super.set(fieldName, value);
  }

  @Override
  public FeatureSettings clone() {
    return (FeatureSettings) super.clone();
  }

}
