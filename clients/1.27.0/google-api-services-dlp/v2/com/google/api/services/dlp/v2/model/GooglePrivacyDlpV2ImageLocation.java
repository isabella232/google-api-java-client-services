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
 * Location of the finding within an image.
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
public final class GooglePrivacyDlpV2ImageLocation extends com.google.api.client.json.GenericJson {

  /**
   * Bounding boxes locating the pixels within the image containing the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2BoundingBox> boundingBoxes;

  /**
   * Bounding boxes locating the pixels within the image containing the finding.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2BoundingBox> getBoundingBoxes() {
    return boundingBoxes;
  }

  /**
   * Bounding boxes locating the pixels within the image containing the finding.
   * @param boundingBoxes boundingBoxes or {@code null} for none
   */
  public GooglePrivacyDlpV2ImageLocation setBoundingBoxes(java.util.List<GooglePrivacyDlpV2BoundingBox> boundingBoxes) {
    this.boundingBoxes = boundingBoxes;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2ImageLocation set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2ImageLocation) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2ImageLocation clone() {
    return (GooglePrivacyDlpV2ImageLocation) super.clone();
  }

}
