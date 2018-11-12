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
 * Model definition for LiveChatMessageListResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveChatMessageListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Serialized EventId of the request which produced this response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventId;

  /**
   * A list of live chat messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LiveChatMessage> items;

  static {
    // hack to force ProGuard to consider LiveChatMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LiveChatMessage.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#liveChatMessageListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the next page in
   * the result set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The date and time when the underlying stream went offline. The value is specified in ISO 8601
   * (YYYY-MM-DDThh:mm:ss.sZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime offlineAt;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PageInfo pageInfo;

  /**
   * The amount of time the client should wait before polling again.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long pollingIntervalMillis;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TokenPagination tokenPagination;

  /**
   * The visitorId identifies the visitor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visitorId;

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public LiveChatMessageListResponse setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Serialized EventId of the request which produced this response.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventId() {
    return eventId;
  }

  /**
   * Serialized EventId of the request which produced this response.
   * @param eventId eventId or {@code null} for none
   */
  public LiveChatMessageListResponse setEventId(java.lang.String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * A list of live chat messages.
   * @return value or {@code null} for none
   */
  public java.util.List<LiveChatMessage> getItems() {
    return items;
  }

  /**
   * A list of live chat messages.
   * @param items items or {@code null} for none
   */
  public LiveChatMessageListResponse setItems(java.util.List<LiveChatMessage> items) {
    this.items = items;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#liveChatMessageListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#liveChatMessageListResponse".
   * @param kind kind or {@code null} for none
   */
  public LiveChatMessageListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the next page in
   * the result set.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the next page in
   * the result set.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public LiveChatMessageListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The date and time when the underlying stream went offline. The value is specified in ISO 8601
   * (YYYY-MM-DDThh:mm:ss.sZ) format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getOfflineAt() {
    return offlineAt;
  }

  /**
   * The date and time when the underlying stream went offline. The value is specified in ISO 8601
   * (YYYY-MM-DDThh:mm:ss.sZ) format.
   * @param offlineAt offlineAt or {@code null} for none
   */
  public LiveChatMessageListResponse setOfflineAt(com.google.api.client.util.DateTime offlineAt) {
    this.offlineAt = offlineAt;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  /**
   * @param pageInfo pageInfo or {@code null} for none
   */
  public LiveChatMessageListResponse setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * The amount of time the client should wait before polling again.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPollingIntervalMillis() {
    return pollingIntervalMillis;
  }

  /**
   * The amount of time the client should wait before polling again.
   * @param pollingIntervalMillis pollingIntervalMillis or {@code null} for none
   */
  public LiveChatMessageListResponse setPollingIntervalMillis(java.lang.Long pollingIntervalMillis) {
    this.pollingIntervalMillis = pollingIntervalMillis;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public TokenPagination getTokenPagination() {
    return tokenPagination;
  }

  /**
   * @param tokenPagination tokenPagination or {@code null} for none
   */
  public LiveChatMessageListResponse setTokenPagination(TokenPagination tokenPagination) {
    this.tokenPagination = tokenPagination;
    return this;
  }

  /**
   * The visitorId identifies the visitor.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisitorId() {
    return visitorId;
  }

  /**
   * The visitorId identifies the visitor.
   * @param visitorId visitorId or {@code null} for none
   */
  public LiveChatMessageListResponse setVisitorId(java.lang.String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

  @Override
  public LiveChatMessageListResponse set(String fieldName, Object value) {
    return (LiveChatMessageListResponse) super.set(fieldName, value);
  }

  @Override
  public LiveChatMessageListResponse clone() {
    return (LiveChatMessageListResponse) super.clone();
  }

}
