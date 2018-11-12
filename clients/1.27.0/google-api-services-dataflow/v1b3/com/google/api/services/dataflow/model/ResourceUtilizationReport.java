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

package com.google.api.services.dataflow.model;

/**
 * Worker metrics exported from workers. This contains resource utilization metrics accumulated from
 * a variety of sources. For more information, see go/df-resource-signals.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceUtilizationReport extends com.google.api.client.json.GenericJson {

  /**
   * CPU utilization samples.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CPUTime> cpuTime;

  /**
   * CPU utilization samples.
   * @return value or {@code null} for none
   */
  public java.util.List<CPUTime> getCpuTime() {
    return cpuTime;
  }

  /**
   * CPU utilization samples.
   * @param cpuTime cpuTime or {@code null} for none
   */
  public ResourceUtilizationReport setCpuTime(java.util.List<CPUTime> cpuTime) {
    this.cpuTime = cpuTime;
    return this;
  }

  @Override
  public ResourceUtilizationReport set(String fieldName, Object value) {
    return (ResourceUtilizationReport) super.set(fieldName, value);
  }

  @Override
  public ResourceUtilizationReport clone() {
    return (ResourceUtilizationReport) super.clone();
  }

}
