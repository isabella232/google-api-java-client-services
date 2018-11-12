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

package com.google.api.services.youtube.model;

/**
 * Model definition for LiveChatPollOpenedDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveChatPollOpenedDetails extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LiveChatPollItem> items;

  static {
    // hack to force ProGuard to consider LiveChatPollItem used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LiveChatPollItem.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prompt;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public LiveChatPollOpenedDetails setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<LiveChatPollItem> getItems() {
    return items;
  }

  /**
   * @param items items or {@code null} for none
   */
  public LiveChatPollOpenedDetails setItems(java.util.List<LiveChatPollItem> items) {
    this.items = items;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPrompt() {
    return prompt;
  }

  /**
   * @param prompt prompt or {@code null} for none
   */
  public LiveChatPollOpenedDetails setPrompt(java.lang.String prompt) {
    this.prompt = prompt;
    return this;
  }

  @Override
  public LiveChatPollOpenedDetails set(String fieldName, Object value) {
    return (LiveChatPollOpenedDetails) super.set(fieldName, value);
  }

  @Override
  public LiveChatPollOpenedDetails clone() {
    return (LiveChatPollOpenedDetails) super.clone();
  }

}
