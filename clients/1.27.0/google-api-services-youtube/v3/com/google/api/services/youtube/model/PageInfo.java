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
 * Paging details for lists of resources, including total number of items available and number of
 * resources returned in a single page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PageInfo extends com.google.api.client.json.GenericJson {

  /**
   * The number of results included in the API response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer resultsPerPage;

  /**
   * The total number of results in the result set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalResults;

  /**
   * The number of results included in the API response.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getResultsPerPage() {
    return resultsPerPage;
  }

  /**
   * The number of results included in the API response.
   * @param resultsPerPage resultsPerPage or {@code null} for none
   */
  public PageInfo setResultsPerPage(java.lang.Integer resultsPerPage) {
    this.resultsPerPage = resultsPerPage;
    return this;
  }

  /**
   * The total number of results in the result set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalResults() {
    return totalResults;
  }

  /**
   * The total number of results in the result set.
   * @param totalResults totalResults or {@code null} for none
   */
  public PageInfo setTotalResults(java.lang.Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  @Override
  public PageInfo set(String fieldName, Object value) {
    return (PageInfo) super.set(fieldName, value);
  }

  @Override
  public PageInfo clone() {
    return (PageInfo) super.clone();
  }

}
