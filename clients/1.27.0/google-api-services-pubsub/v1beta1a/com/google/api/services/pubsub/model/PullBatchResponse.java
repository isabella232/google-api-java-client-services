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

package com.google.api.services.pubsub.model;

/**
 * Response for the PullBatch method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PullBatchResponse extends com.google.api.client.json.GenericJson {

  /**
   * Received Pub/Sub messages or status events. The Pub/Sub system will return zero messages if
   * there are no more messages available in the backlog. The Pub/Sub system may return fewer than
   * the max_events requested even if there are more messages available in the backlog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PullResponse> pullResponses;

  /**
   * Received Pub/Sub messages or status events. The Pub/Sub system will return zero messages if
   * there are no more messages available in the backlog. The Pub/Sub system may return fewer than
   * the max_events requested even if there are more messages available in the backlog.
   * @return value or {@code null} for none
   */
  public java.util.List<PullResponse> getPullResponses() {
    return pullResponses;
  }

  /**
   * Received Pub/Sub messages or status events. The Pub/Sub system will return zero messages if
   * there are no more messages available in the backlog. The Pub/Sub system may return fewer than
   * the max_events requested even if there are more messages available in the backlog.
   * @param pullResponses pullResponses or {@code null} for none
   */
  public PullBatchResponse setPullResponses(java.util.List<PullResponse> pullResponses) {
    this.pullResponses = pullResponses;
    return this;
  }

  @Override
  public PullBatchResponse set(String fieldName, Object value) {
    return (PullBatchResponse) super.set(fieldName, value);
  }

  @Override
  public PullBatchResponse clone() {
    return (PullBatchResponse) super.clone();
  }

}
