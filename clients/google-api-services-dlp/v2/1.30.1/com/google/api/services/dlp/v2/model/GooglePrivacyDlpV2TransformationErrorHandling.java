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
 * How to handle transformation errors during de-identification. A transformation error occurs when
 * the requested transformation is incompatible with the data. For example, trying to de-identify an
 * IP address using a `DateShift` transformation would result in a transformation error, since date
 * info cannot be extracted from an IP address. Information about any incompatible transformations,
 * and how they were handled, is returned in the response as part of the `TransformationOverviews`.
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
public final class GooglePrivacyDlpV2TransformationErrorHandling extends com.google.api.client.json.GenericJson {

  /**
   * Ignore errors
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2LeaveUntransformed leaveUntransformed;

  /**
   * Throw an error
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2ThrowError throwError;

  /**
   * Ignore errors
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2LeaveUntransformed getLeaveUntransformed() {
    return leaveUntransformed;
  }

  /**
   * Ignore errors
   * @param leaveUntransformed leaveUntransformed or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationErrorHandling setLeaveUntransformed(GooglePrivacyDlpV2LeaveUntransformed leaveUntransformed) {
    this.leaveUntransformed = leaveUntransformed;
    return this;
  }

  /**
   * Throw an error
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2ThrowError getThrowError() {
    return throwError;
  }

  /**
   * Throw an error
   * @param throwError throwError or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationErrorHandling setThrowError(GooglePrivacyDlpV2ThrowError throwError) {
    this.throwError = throwError;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2TransformationErrorHandling set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2TransformationErrorHandling) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2TransformationErrorHandling clone() {
    return (GooglePrivacyDlpV2TransformationErrorHandling) super.clone();
  }

}