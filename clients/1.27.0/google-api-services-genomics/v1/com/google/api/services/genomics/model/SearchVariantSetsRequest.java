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

package com.google.api.services.genomics.model;

/**
 * The search variant sets request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchVariantSetsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Exactly one dataset ID must be provided here. Only variant sets which belong to this dataset
   * will be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> datasetIds;

  /**
   * The maximum number of results to return in a single page. If unspecified, defaults to 1024.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * The continuation token, which is used to page through large result sets. To get the next page
   * of results, set this parameter to the value of `nextPageToken` from the previous response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Exactly one dataset ID must be provided here. Only variant sets which belong to this dataset
   * will be returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDatasetIds() {
    return datasetIds;
  }

  /**
   * Exactly one dataset ID must be provided here. Only variant sets which belong to this dataset
   * will be returned.
   * @param datasetIds datasetIds or {@code null} for none
   */
  public SearchVariantSetsRequest setDatasetIds(java.util.List<java.lang.String> datasetIds) {
    this.datasetIds = datasetIds;
    return this;
  }

  /**
   * The maximum number of results to return in a single page. If unspecified, defaults to 1024.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * The maximum number of results to return in a single page. If unspecified, defaults to 1024.
   * @param pageSize pageSize or {@code null} for none
   */
  public SearchVariantSetsRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The continuation token, which is used to page through large result sets. To get the next page
   * of results, set this parameter to the value of `nextPageToken` from the previous response.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * The continuation token, which is used to page through large result sets. To get the next page
   * of results, set this parameter to the value of `nextPageToken` from the previous response.
   * @param pageToken pageToken or {@code null} for none
   */
  public SearchVariantSetsRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  @Override
  public SearchVariantSetsRequest set(String fieldName, Object value) {
    return (SearchVariantSetsRequest) super.set(fieldName, value);
  }

  @Override
  public SearchVariantSetsRequest clone() {
    return (SearchVariantSetsRequest) super.clone();
  }

}
