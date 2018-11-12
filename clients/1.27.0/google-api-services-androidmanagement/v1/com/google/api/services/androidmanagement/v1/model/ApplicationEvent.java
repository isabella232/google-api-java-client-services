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

package com.google.api.services.androidmanagement.v1.model;

/**
 * An app-related event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApplicationEvent extends com.google.api.client.json.GenericJson {

  /**
   * The creation time of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * App event type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * The creation time of the event.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The creation time of the event.
   * @param createTime createTime or {@code null} for none
   */
  public ApplicationEvent setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * App event type.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * App event type.
   * @param eventType eventType or {@code null} for none
   */
  public ApplicationEvent setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  @Override
  public ApplicationEvent set(String fieldName, Object value) {
    return (ApplicationEvent) super.set(fieldName, value);
  }

  @Override
  public ApplicationEvent clone() {
    return (ApplicationEvent) super.clone();
  }

}
