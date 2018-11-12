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

package com.google.api.services.dlp.v2.model;

/**
 * Shared message indicating Cloud storage type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2StorageConfig extends com.google.api.client.json.GenericJson {

  /**
   * BigQuery options specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BigQueryOptions bigQueryOptions;

  /**
   * Google Cloud Storage options specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CloudStorageOptions cloudStorageOptions;

  /**
   * Google Cloud Datastore options specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2DatastoreOptions datastoreOptions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2TimespanConfig timespanConfig;

  /**
   * BigQuery options specification.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryOptions getBigQueryOptions() {
    return bigQueryOptions;
  }

  /**
   * BigQuery options specification.
   * @param bigQueryOptions bigQueryOptions or {@code null} for none
   */
  public GooglePrivacyDlpV2StorageConfig setBigQueryOptions(GooglePrivacyDlpV2BigQueryOptions bigQueryOptions) {
    this.bigQueryOptions = bigQueryOptions;
    return this;
  }

  /**
   * Google Cloud Storage options specification.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CloudStorageOptions getCloudStorageOptions() {
    return cloudStorageOptions;
  }

  /**
   * Google Cloud Storage options specification.
   * @param cloudStorageOptions cloudStorageOptions or {@code null} for none
   */
  public GooglePrivacyDlpV2StorageConfig setCloudStorageOptions(GooglePrivacyDlpV2CloudStorageOptions cloudStorageOptions) {
    this.cloudStorageOptions = cloudStorageOptions;
    return this;
  }

  /**
   * Google Cloud Datastore options specification.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2DatastoreOptions getDatastoreOptions() {
    return datastoreOptions;
  }

  /**
   * Google Cloud Datastore options specification.
   * @param datastoreOptions datastoreOptions or {@code null} for none
   */
  public GooglePrivacyDlpV2StorageConfig setDatastoreOptions(GooglePrivacyDlpV2DatastoreOptions datastoreOptions) {
    this.datastoreOptions = datastoreOptions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2TimespanConfig getTimespanConfig() {
    return timespanConfig;
  }

  /**
   * @param timespanConfig timespanConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2StorageConfig setTimespanConfig(GooglePrivacyDlpV2TimespanConfig timespanConfig) {
    this.timespanConfig = timespanConfig;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2StorageConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2StorageConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2StorageConfig clone() {
    return (GooglePrivacyDlpV2StorageConfig) super.clone();
  }

}
