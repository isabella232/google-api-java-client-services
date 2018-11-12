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

package com.google.api.services.spanner.v1.model;

/**
 * Options for a PartitionQueryRequest and PartitionReadRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartitionOptions extends com.google.api.client.json.GenericJson {

  /**
   * **Note:** This hint is currently ignored by PartitionQuery and PartitionRead requests.
   *
   * The desired maximum number of partitions to return.  For example, this may be set to the number
   * of workers available.  The default for this option is currently 10,000. The maximum value is
   * currently 200,000.  This is only a hint.  The actual number of partitions returned may be
   * smaller or larger than this maximum count request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxPartitions;

  /**
   * **Note:** This hint is currently ignored by PartitionQuery and PartitionRead requests.
   *
   * The desired data size for each partition generated.  The default for this option is currently 1
   * GiB.  This is only a hint. The actual size of each partition may be smaller or larger than this
   * size request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long partitionSizeBytes;

  /**
   * **Note:** This hint is currently ignored by PartitionQuery and PartitionRead requests.
   *
   * The desired maximum number of partitions to return.  For example, this may be set to the number
   * of workers available.  The default for this option is currently 10,000. The maximum value is
   * currently 200,000.  This is only a hint.  The actual number of partitions returned may be
   * smaller or larger than this maximum count request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxPartitions() {
    return maxPartitions;
  }

  /**
   * **Note:** This hint is currently ignored by PartitionQuery and PartitionRead requests.
   *
   * The desired maximum number of partitions to return.  For example, this may be set to the number
   * of workers available.  The default for this option is currently 10,000. The maximum value is
   * currently 200,000.  This is only a hint.  The actual number of partitions returned may be
   * smaller or larger than this maximum count request.
   * @param maxPartitions maxPartitions or {@code null} for none
   */
  public PartitionOptions setMaxPartitions(java.lang.Long maxPartitions) {
    this.maxPartitions = maxPartitions;
    return this;
  }

  /**
   * **Note:** This hint is currently ignored by PartitionQuery and PartitionRead requests.
   *
   * The desired data size for each partition generated.  The default for this option is currently 1
   * GiB.  This is only a hint. The actual size of each partition may be smaller or larger than this
   * size request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPartitionSizeBytes() {
    return partitionSizeBytes;
  }

  /**
   * **Note:** This hint is currently ignored by PartitionQuery and PartitionRead requests.
   *
   * The desired data size for each partition generated.  The default for this option is currently 1
   * GiB.  This is only a hint. The actual size of each partition may be smaller or larger than this
   * size request.
   * @param partitionSizeBytes partitionSizeBytes or {@code null} for none
   */
  public PartitionOptions setPartitionSizeBytes(java.lang.Long partitionSizeBytes) {
    this.partitionSizeBytes = partitionSizeBytes;
    return this;
  }

  @Override
  public PartitionOptions set(String fieldName, Object value) {
    return (PartitionOptions) super.set(fieldName, value);
  }

  @Override
  public PartitionOptions clone() {
    return (PartitionOptions) super.clone();
  }

}
