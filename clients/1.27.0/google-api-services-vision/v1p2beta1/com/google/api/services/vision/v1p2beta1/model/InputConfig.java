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

package com.google.api.services.vision.v1p2beta1.model;

/**
 * The desired input location and metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InputConfig extends com.google.api.client.json.GenericJson {

  /**
   * The Google Cloud Storage location to read the input from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsSource gcsSource;

  /**
   * The type of the file. Currently only "application/pdf" and "image/tiff" are supported.
   * Wildcards are not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * The Google Cloud Storage location to read the input from.
   * @return value or {@code null} for none
   */
  public GcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * The Google Cloud Storage location to read the input from.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public InputConfig setGcsSource(GcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  /**
   * The type of the file. Currently only "application/pdf" and "image/tiff" are supported.
   * Wildcards are not supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * The type of the file. Currently only "application/pdf" and "image/tiff" are supported.
   * Wildcards are not supported.
   * @param mimeType mimeType or {@code null} for none
   */
  public InputConfig setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  @Override
  public InputConfig set(String fieldName, Object value) {
    return (InputConfig) super.set(fieldName, value);
  }

  @Override
  public InputConfig clone() {
    return (InputConfig) super.clone();
  }

}
