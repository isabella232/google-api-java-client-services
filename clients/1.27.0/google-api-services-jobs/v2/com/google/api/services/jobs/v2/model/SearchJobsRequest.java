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

package com.google.api.services.jobs.v2.model;

/**
 * Input only.
 *
 * The Request body of the `SearchJobs` call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchJobsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. Any value provided in this field is ignored.
   *
   * Optional.
   *
   * Controls whether to disable relevance thresholding. Relevance thresholding removes jobs that
   * have low relevance in search results, for example, removing "Assistant to the CEO" positions
   * from the search results of a search for "CEO".
   *
   * Disabling relevance thresholding improves the accuracy of subsequent search requests.
   *
   * Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableRelevanceThresholding;

  /**
   * Optional.
   *
   * Controls whether to broaden the search when it produces sparse results. Broadened queries
   * append results to the end of the matching results list.
   *
   * Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableBroadening;

  /**
   * Optional.
   *
   * Controls if the search job request requires the return of a precise count of the first 300
   * results. Setting this to `true` ensures consistency in the number of results per page. Best
   * practice is to set this value to true if a client allows users to jump directly to a non-
   * sequential search results page.
   *
   * Enabling this flag may adversely impact performance.
   *
   * Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enablePreciseResultSize;

  /**
   * Deprecated. Use query instead.
   *
   * Optional.
   *
   * Restrictions on the scope of the search request, such as filtering by location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobFilters filters;

  /**
   * Optional.
   *
   * Restrictions on what fields to perform histogram on, such as `COMPANY_SIZE` etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HistogramFacets histogramFacets;

  /**
   * Optional.
   *
   * The number of job attributes returned for jobs in the search response. Defaults to
   * JobView.SMALL if no value is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobView;

  /**
   * Required.
   *
   * Mode of a search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mode;

  /**
   * Optional.
   *
   * An integer that specifies the current offset (that is, starting result location, amongst the
   * jobs deemed by the API as relevant) in search results. This field is only considered if
   * page_token is unset.
   *
   * For example, 0 means to  return results starting from the first matching job, and 10 means to
   * return from the 11th job. This can be used for pagination, (for example, pageSize = 10 and
   * offset = 10 means to return from the second page).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer offset;

  /**
   * Deprecated. Use sort_by instead.
   *
   * Optional.
   *
   * The criteria determining how search results are sorted. Defaults to SortBy.RELEVANCE_DESC if no
   * value is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderBy;

  /**
   * Optional.
   *
   * A limit on the number of jobs returned in the search results. Increasing this value above the
   * default value of 10 can increase search response time. The value can be between 1 and 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * Optional.
   *
   * The token specifying the current offset within search results. See
   * SearchJobsResponse.next_page_token for an explanation of how to obtain the next set of query
   * results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Optional.
   *
   * Query used to search against jobs, such as keyword, location filters, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobQuery query;

  /**
   * Required.
   *
   * The meta information collected about the job searcher, used to improve the search quality of
   * the service. The identifiers, (such as `user_id`) are provided by users, and must be unique and
   * consistent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestMetadata requestMetadata;

  /**
   * Optional.
   *
   * The criteria determining how search results are sorted. Defaults to SortBy.RELEVANCE_DESC if no
   * value is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sortBy;

  /**
   * Deprecated. Any value provided in this field is ignored.
   *
   * Optional.
   *
   * Controls whether to disable relevance thresholding. Relevance thresholding removes jobs that
   * have low relevance in search results, for example, removing "Assistant to the CEO" positions
   * from the search results of a search for "CEO".
   *
   * Disabling relevance thresholding improves the accuracy of subsequent search requests.
   *
   * Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableRelevanceThresholding() {
    return disableRelevanceThresholding;
  }

  /**
   * Deprecated. Any value provided in this field is ignored.
   *
   * Optional.
   *
   * Controls whether to disable relevance thresholding. Relevance thresholding removes jobs that
   * have low relevance in search results, for example, removing "Assistant to the CEO" positions
   * from the search results of a search for "CEO".
   *
   * Disabling relevance thresholding improves the accuracy of subsequent search requests.
   *
   * Defaults to false.
   * @param disableRelevanceThresholding disableRelevanceThresholding or {@code null} for none
   */
  public SearchJobsRequest setDisableRelevanceThresholding(java.lang.Boolean disableRelevanceThresholding) {
    this.disableRelevanceThresholding = disableRelevanceThresholding;
    return this;
  }

  /**
   * Optional.
   *
   * Controls whether to broaden the search when it produces sparse results. Broadened queries
   * append results to the end of the matching results list.
   *
   * Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableBroadening() {
    return enableBroadening;
  }

  /**
   * Optional.
   *
   * Controls whether to broaden the search when it produces sparse results. Broadened queries
   * append results to the end of the matching results list.
   *
   * Defaults to false.
   * @param enableBroadening enableBroadening or {@code null} for none
   */
  public SearchJobsRequest setEnableBroadening(java.lang.Boolean enableBroadening) {
    this.enableBroadening = enableBroadening;
    return this;
  }

  /**
   * Optional.
   *
   * Controls if the search job request requires the return of a precise count of the first 300
   * results. Setting this to `true` ensures consistency in the number of results per page. Best
   * practice is to set this value to true if a client allows users to jump directly to a non-
   * sequential search results page.
   *
   * Enabling this flag may adversely impact performance.
   *
   * Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnablePreciseResultSize() {
    return enablePreciseResultSize;
  }

  /**
   * Optional.
   *
   * Controls if the search job request requires the return of a precise count of the first 300
   * results. Setting this to `true` ensures consistency in the number of results per page. Best
   * practice is to set this value to true if a client allows users to jump directly to a non-
   * sequential search results page.
   *
   * Enabling this flag may adversely impact performance.
   *
   * Defaults to false.
   * @param enablePreciseResultSize enablePreciseResultSize or {@code null} for none
   */
  public SearchJobsRequest setEnablePreciseResultSize(java.lang.Boolean enablePreciseResultSize) {
    this.enablePreciseResultSize = enablePreciseResultSize;
    return this;
  }

  /**
   * Deprecated. Use query instead.
   *
   * Optional.
   *
   * Restrictions on the scope of the search request, such as filtering by location.
   * @return value or {@code null} for none
   */
  public JobFilters getFilters() {
    return filters;
  }

  /**
   * Deprecated. Use query instead.
   *
   * Optional.
   *
   * Restrictions on the scope of the search request, such as filtering by location.
   * @param filters filters or {@code null} for none
   */
  public SearchJobsRequest setFilters(JobFilters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Optional.
   *
   * Restrictions on what fields to perform histogram on, such as `COMPANY_SIZE` etc.
   * @return value or {@code null} for none
   */
  public HistogramFacets getHistogramFacets() {
    return histogramFacets;
  }

  /**
   * Optional.
   *
   * Restrictions on what fields to perform histogram on, such as `COMPANY_SIZE` etc.
   * @param histogramFacets histogramFacets or {@code null} for none
   */
  public SearchJobsRequest setHistogramFacets(HistogramFacets histogramFacets) {
    this.histogramFacets = histogramFacets;
    return this;
  }

  /**
   * Optional.
   *
   * The number of job attributes returned for jobs in the search response. Defaults to
   * JobView.SMALL if no value is specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobView() {
    return jobView;
  }

  /**
   * Optional.
   *
   * The number of job attributes returned for jobs in the search response. Defaults to
   * JobView.SMALL if no value is specified.
   * @param jobView jobView or {@code null} for none
   */
  public SearchJobsRequest setJobView(java.lang.String jobView) {
    this.jobView = jobView;
    return this;
  }

  /**
   * Required.
   *
   * Mode of a search.
   * @return value or {@code null} for none
   */
  public java.lang.String getMode() {
    return mode;
  }

  /**
   * Required.
   *
   * Mode of a search.
   * @param mode mode or {@code null} for none
   */
  public SearchJobsRequest setMode(java.lang.String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Optional.
   *
   * An integer that specifies the current offset (that is, starting result location, amongst the
   * jobs deemed by the API as relevant) in search results. This field is only considered if
   * page_token is unset.
   *
   * For example, 0 means to  return results starting from the first matching job, and 10 means to
   * return from the 11th job. This can be used for pagination, (for example, pageSize = 10 and
   * offset = 10 means to return from the second page).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOffset() {
    return offset;
  }

  /**
   * Optional.
   *
   * An integer that specifies the current offset (that is, starting result location, amongst the
   * jobs deemed by the API as relevant) in search results. This field is only considered if
   * page_token is unset.
   *
   * For example, 0 means to  return results starting from the first matching job, and 10 means to
   * return from the 11th job. This can be used for pagination, (for example, pageSize = 10 and
   * offset = 10 means to return from the second page).
   * @param offset offset or {@code null} for none
   */
  public SearchJobsRequest setOffset(java.lang.Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Deprecated. Use sort_by instead.
   *
   * Optional.
   *
   * The criteria determining how search results are sorted. Defaults to SortBy.RELEVANCE_DESC if no
   * value is specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderBy() {
    return orderBy;
  }

  /**
   * Deprecated. Use sort_by instead.
   *
   * Optional.
   *
   * The criteria determining how search results are sorted. Defaults to SortBy.RELEVANCE_DESC if no
   * value is specified.
   * @param orderBy orderBy or {@code null} for none
   */
  public SearchJobsRequest setOrderBy(java.lang.String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * Optional.
   *
   * A limit on the number of jobs returned in the search results. Increasing this value above the
   * default value of 10 can increase search response time. The value can be between 1 and 100.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Optional.
   *
   * A limit on the number of jobs returned in the search results. Increasing this value above the
   * default value of 10 can increase search response time. The value can be between 1 and 100.
   * @param pageSize pageSize or {@code null} for none
   */
  public SearchJobsRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Optional.
   *
   * The token specifying the current offset within search results. See
   * SearchJobsResponse.next_page_token for an explanation of how to obtain the next set of query
   * results.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * Optional.
   *
   * The token specifying the current offset within search results. See
   * SearchJobsResponse.next_page_token for an explanation of how to obtain the next set of query
   * results.
   * @param pageToken pageToken or {@code null} for none
   */
  public SearchJobsRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Optional.
   *
   * Query used to search against jobs, such as keyword, location filters, etc.
   * @return value or {@code null} for none
   */
  public JobQuery getQuery() {
    return query;
  }

  /**
   * Optional.
   *
   * Query used to search against jobs, such as keyword, location filters, etc.
   * @param query query or {@code null} for none
   */
  public SearchJobsRequest setQuery(JobQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Required.
   *
   * The meta information collected about the job searcher, used to improve the search quality of
   * the service. The identifiers, (such as `user_id`) are provided by users, and must be unique and
   * consistent.
   * @return value or {@code null} for none
   */
  public RequestMetadata getRequestMetadata() {
    return requestMetadata;
  }

  /**
   * Required.
   *
   * The meta information collected about the job searcher, used to improve the search quality of
   * the service. The identifiers, (such as `user_id`) are provided by users, and must be unique and
   * consistent.
   * @param requestMetadata requestMetadata or {@code null} for none
   */
  public SearchJobsRequest setRequestMetadata(RequestMetadata requestMetadata) {
    this.requestMetadata = requestMetadata;
    return this;
  }

  /**
   * Optional.
   *
   * The criteria determining how search results are sorted. Defaults to SortBy.RELEVANCE_DESC if no
   * value is specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getSortBy() {
    return sortBy;
  }

  /**
   * Optional.
   *
   * The criteria determining how search results are sorted. Defaults to SortBy.RELEVANCE_DESC if no
   * value is specified.
   * @param sortBy sortBy or {@code null} for none
   */
  public SearchJobsRequest setSortBy(java.lang.String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  @Override
  public SearchJobsRequest set(String fieldName, Object value) {
    return (SearchJobsRequest) super.set(fieldName, value);
  }

  @Override
  public SearchJobsRequest clone() {
    return (SearchJobsRequest) super.clone();
  }

}
