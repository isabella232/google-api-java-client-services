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

package com.google.api.services.dataflow.model;

/**
 * The version of the SDK used to run the jobl
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SdkVersion extends com.google.api.client.json.GenericJson {

  /**
   * The support status for this SDK version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sdkSupportStatus;

  /**
   * The version of the SDK used to run the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * A readable string describing the version of the sdk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionDisplayName;

  /**
   * The support status for this SDK version.
   * @return value or {@code null} for none
   */
  public java.lang.String getSdkSupportStatus() {
    return sdkSupportStatus;
  }

  /**
   * The support status for this SDK version.
   * @param sdkSupportStatus sdkSupportStatus or {@code null} for none
   */
  public SdkVersion setSdkSupportStatus(java.lang.String sdkSupportStatus) {
    this.sdkSupportStatus = sdkSupportStatus;
    return this;
  }

  /**
   * The version of the SDK used to run the job.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The version of the SDK used to run the job.
   * @param version version or {@code null} for none
   */
  public SdkVersion setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  /**
   * A readable string describing the version of the sdk.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionDisplayName() {
    return versionDisplayName;
  }

  /**
   * A readable string describing the version of the sdk.
   * @param versionDisplayName versionDisplayName or {@code null} for none
   */
  public SdkVersion setVersionDisplayName(java.lang.String versionDisplayName) {
    this.versionDisplayName = versionDisplayName;
    return this;
  }

  @Override
  public SdkVersion set(String fieldName, Object value) {
    return (SdkVersion) super.set(fieldName, value);
  }

  @Override
  public SdkVersion clone() {
    return (SdkVersion) super.clone();
  }

}
