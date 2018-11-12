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
 * State family configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StateFamilyConfig extends com.google.api.client.json.GenericJson {

  /**
   * If true, this family corresponds to a read operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRead;

  /**
   * The state family value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateFamily;

  /**
   * If true, this family corresponds to a read operation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRead() {
    return isRead;
  }

  /**
   * If true, this family corresponds to a read operation.
   * @param isRead isRead or {@code null} for none
   */
  public StateFamilyConfig setIsRead(java.lang.Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

  /**
   * The state family value.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateFamily() {
    return stateFamily;
  }

  /**
   * The state family value.
   * @param stateFamily stateFamily or {@code null} for none
   */
  public StateFamilyConfig setStateFamily(java.lang.String stateFamily) {
    this.stateFamily = stateFamily;
    return this;
  }

  @Override
  public StateFamilyConfig set(String fieldName, Object value) {
    return (StateFamilyConfig) super.set(fieldName, value);
  }

  @Override
  public StateFamilyConfig clone() {
    return (StateFamilyConfig) super.clone();
  }

}
