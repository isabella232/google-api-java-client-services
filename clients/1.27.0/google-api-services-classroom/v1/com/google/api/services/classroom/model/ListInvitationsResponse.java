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

package com.google.api.services.classroom.model;

/**
 * Response when listing invitations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListInvitationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Invitations that match the list request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Invitation> invitations;

  /**
   * Token identifying the next page of results to return. If empty, no further results are
   * available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Invitations that match the list request.
   * @return value or {@code null} for none
   */
  public java.util.List<Invitation> getInvitations() {
    return invitations;
  }

  /**
   * Invitations that match the list request.
   * @param invitations invitations or {@code null} for none
   */
  public ListInvitationsResponse setInvitations(java.util.List<Invitation> invitations) {
    this.invitations = invitations;
    return this;
  }

  /**
   * Token identifying the next page of results to return. If empty, no further results are
   * available.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token identifying the next page of results to return. If empty, no further results are
   * available.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListInvitationsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListInvitationsResponse set(String fieldName, Object value) {
    return (ListInvitationsResponse) super.set(fieldName, value);
  }

  @Override
  public ListInvitationsResponse clone() {
    return (ListInvitationsResponse) super.clone();
  }

}
