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

package com.google.api.services.cloudbilling.model;

/**
 * Response message for `ListBillingAccounts`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListBillingAccountsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of billing accounts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BillingAccount> billingAccounts;

  /**
   * A token to retrieve the next page of results. To retrieve the next page, call
   * `ListBillingAccounts` again with the `page_token` field set to this value. This field is empty
   * if there are no more results to retrieve.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of billing accounts.
   * @return value or {@code null} for none
   */
  public java.util.List<BillingAccount> getBillingAccounts() {
    return billingAccounts;
  }

  /**
   * A list of billing accounts.
   * @param billingAccounts billingAccounts or {@code null} for none
   */
  public ListBillingAccountsResponse setBillingAccounts(java.util.List<BillingAccount> billingAccounts) {
    this.billingAccounts = billingAccounts;
    return this;
  }

  /**
   * A token to retrieve the next page of results. To retrieve the next page, call
   * `ListBillingAccounts` again with the `page_token` field set to this value. This field is empty
   * if there are no more results to retrieve.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve the next page of results. To retrieve the next page, call
   * `ListBillingAccounts` again with the `page_token` field set to this value. This field is empty
   * if there are no more results to retrieve.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListBillingAccountsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListBillingAccountsResponse set(String fieldName, Object value) {
    return (ListBillingAccountsResponse) super.set(fieldName, value);
  }

  @Override
  public ListBillingAccountsResponse clone() {
    return (ListBillingAccountsResponse) super.clone();
  }

}
