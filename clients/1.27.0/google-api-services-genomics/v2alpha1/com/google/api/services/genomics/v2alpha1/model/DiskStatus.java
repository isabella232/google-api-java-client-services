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

package com.google.api.services.genomics.v2alpha1.model;

/**
 * The status of a disk on a VM.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiskStatus extends com.google.api.client.json.GenericJson {

  /**
   * Free disk space.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger freeSpaceBytes;

  /**
   * Total disk space.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger totalSpaceBytes;

  /**
   * Free disk space.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getFreeSpaceBytes() {
    return freeSpaceBytes;
  }

  /**
   * Free disk space.
   * @param freeSpaceBytes freeSpaceBytes or {@code null} for none
   */
  public DiskStatus setFreeSpaceBytes(java.math.BigInteger freeSpaceBytes) {
    this.freeSpaceBytes = freeSpaceBytes;
    return this;
  }

  /**
   * Total disk space.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTotalSpaceBytes() {
    return totalSpaceBytes;
  }

  /**
   * Total disk space.
   * @param totalSpaceBytes totalSpaceBytes or {@code null} for none
   */
  public DiskStatus setTotalSpaceBytes(java.math.BigInteger totalSpaceBytes) {
    this.totalSpaceBytes = totalSpaceBytes;
    return this;
  }

  @Override
  public DiskStatus set(String fieldName, Object value) {
    return (DiskStatus) super.set(fieldName, value);
  }

  @Override
  public DiskStatus clone() {
    return (DiskStatus) super.clone();
  }

}
