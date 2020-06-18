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

package com.google.api.services.people.v1.model;

/**
 * The response to a request for the authenticated user's domain directory.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListDirectoryPeopleResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A token, which can be sent as `sync_token` to retrieve changes since the last request. Request
   * must set `request_sync_token` to return the sync token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextSyncToken;

  /**
   * The list of people in the domain directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Person> people;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListDirectoryPeopleResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A token, which can be sent as `sync_token` to retrieve changes since the last request. Request
   * must set `request_sync_token` to return the sync token.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextSyncToken() {
    return nextSyncToken;
  }

  /**
   * A token, which can be sent as `sync_token` to retrieve changes since the last request. Request
   * must set `request_sync_token` to return the sync token.
   * @param nextSyncToken nextSyncToken or {@code null} for none
   */
  public ListDirectoryPeopleResponse setNextSyncToken(java.lang.String nextSyncToken) {
    this.nextSyncToken = nextSyncToken;
    return this;
  }

  /**
   * The list of people in the domain directory.
   * @return value or {@code null} for none
   */
  public java.util.List<Person> getPeople() {
    return people;
  }

  /**
   * The list of people in the domain directory.
   * @param people people or {@code null} for none
   */
  public ListDirectoryPeopleResponse setPeople(java.util.List<Person> people) {
    this.people = people;
    return this;
  }

  @Override
  public ListDirectoryPeopleResponse set(String fieldName, Object value) {
    return (ListDirectoryPeopleResponse) super.set(fieldName, value);
  }

  @Override
  public ListDirectoryPeopleResponse clone() {
    return (ListDirectoryPeopleResponse) super.clone();
  }

}
