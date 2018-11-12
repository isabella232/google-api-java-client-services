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
 * Metadata for the given google.longrunning.Operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationMetadataV1 extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CreateVersionMetadataV1 createVersionMetadata;

  /**
   * Time that this operation completed.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Ephemeral message that may change every time the operation is polled. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ephemeralMessage;

  /**
   * Time that this operation was created.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String insertTime;

  /**
   * API method that initiated this operation. Example:
   * google.appengine.v1.Versions.CreateVersion.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * Name of the resource that this operation is acting on. Example:
   * apps/myapp/services/default.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * User who requested this operation.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String user;

  /**
   * Durable messages that persist on every operation poll. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> warning;

  /**
   * @return value or {@code null} for none
   */
  public CreateVersionMetadataV1 getCreateVersionMetadata() {
    return createVersionMetadata;
  }

  /**
   * @param createVersionMetadata createVersionMetadata or {@code null} for none
   */
  public OperationMetadataV1 setCreateVersionMetadata(CreateVersionMetadataV1 createVersionMetadata) {
    this.createVersionMetadata = createVersionMetadata;
    return this;
  }

  /**
   * Time that this operation completed.@OutputOnly
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Time that this operation completed.@OutputOnly
   * @param endTime endTime or {@code null} for none
   */
  public OperationMetadataV1 setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Ephemeral message that may change every time the operation is polled. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getEphemeralMessage() {
    return ephemeralMessage;
  }

  /**
   * Ephemeral message that may change every time the operation is polled. @OutputOnly
   * @param ephemeralMessage ephemeralMessage or {@code null} for none
   */
  public OperationMetadataV1 setEphemeralMessage(java.lang.String ephemeralMessage) {
    this.ephemeralMessage = ephemeralMessage;
    return this;
  }

  /**
   * Time that this operation was created.@OutputOnly
   * @return value or {@code null} for none
   */
  public String getInsertTime() {
    return insertTime;
  }

  /**
   * Time that this operation was created.@OutputOnly
   * @param insertTime insertTime or {@code null} for none
   */
  public OperationMetadataV1 setInsertTime(String insertTime) {
    this.insertTime = insertTime;
    return this;
  }

  /**
   * API method that initiated this operation. Example:
   * google.appengine.v1.Versions.CreateVersion.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * API method that initiated this operation. Example:
   * google.appengine.v1.Versions.CreateVersion.@OutputOnly
   * @param method method or {@code null} for none
   */
  public OperationMetadataV1 setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  /**
   * Name of the resource that this operation is acting on. Example:
   * apps/myapp/services/default.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Name of the resource that this operation is acting on. Example:
   * apps/myapp/services/default.@OutputOnly
   * @param target target or {@code null} for none
   */
  public OperationMetadataV1 setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * User who requested this operation.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * User who requested this operation.@OutputOnly
   * @param user user or {@code null} for none
   */
  public OperationMetadataV1 setUser(java.lang.String user) {
    this.user = user;
    return this;
  }

  /**
   * Durable messages that persist on every operation poll. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWarning() {
    return warning;
  }

  /**
   * Durable messages that persist on every operation poll. @OutputOnly
   * @param warning warning or {@code null} for none
   */
  public OperationMetadataV1 setWarning(java.util.List<java.lang.String> warning) {
    this.warning = warning;
    return this;
  }

  @Override
  public OperationMetadataV1 set(String fieldName, Object value) {
    return (OperationMetadataV1) super.set(fieldName, value);
  }

  @Override
  public OperationMetadataV1 clone() {
    return (OperationMetadataV1) super.clone();
  }

}
