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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * External image source (Google Cloud Storage or web URL image location).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p1beta1ImageSource extends com.google.api.client.json.GenericJson {

  /**
   * **Use `image_uri` instead.**
   *
   * The Google Cloud Storage  URI of the form `gs://bucket_name/object_name`. Object versioning is
   * not supported. See [Google Cloud Storage Request URIs](https://cloud.google.com/storage/docs
   * /reference-uris) for more info.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsImageUri;

  /**
   * The URI of the source image. Can be either:
   *
   * 1. A Google Cloud Storage URI of the form    `gs://bucket_name/object_name`. Object versioning
   * is not supported. See    [Google Cloud Storage Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris) for more    info.
   *
   * 2. A publicly-accessible image HTTP/HTTPS URL. When fetching images from    HTTP/HTTPS URLs,
   * Google cannot guarantee that the request will be    completed. Your request may fail if the
   * specified host denies the    request (e.g. due to request throttling or DOS prevention), or if
   * Google    throttles requests to the site for abuse prevention. You should not    depend on
   * externally-hosted images for production applications.
   *
   * When both `gcs_image_uri` and `image_uri` are specified, `image_uri` takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUri;

  /**
   * **Use `image_uri` instead.**
   *
   * The Google Cloud Storage  URI of the form `gs://bucket_name/object_name`. Object versioning is
   * not supported. See [Google Cloud Storage Request URIs](https://cloud.google.com/storage/docs
   * /reference-uris) for more info.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsImageUri() {
    return gcsImageUri;
  }

  /**
   * **Use `image_uri` instead.**
   *
   * The Google Cloud Storage  URI of the form `gs://bucket_name/object_name`. Object versioning is
   * not supported. See [Google Cloud Storage Request URIs](https://cloud.google.com/storage/docs
   * /reference-uris) for more info.
   * @param gcsImageUri gcsImageUri or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageSource setGcsImageUri(java.lang.String gcsImageUri) {
    this.gcsImageUri = gcsImageUri;
    return this;
  }

  /**
   * The URI of the source image. Can be either:
   *
   * 1. A Google Cloud Storage URI of the form    `gs://bucket_name/object_name`. Object versioning
   * is not supported. See    [Google Cloud Storage Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris) for more    info.
   *
   * 2. A publicly-accessible image HTTP/HTTPS URL. When fetching images from    HTTP/HTTPS URLs,
   * Google cannot guarantee that the request will be    completed. Your request may fail if the
   * specified host denies the    request (e.g. due to request throttling or DOS prevention), or if
   * Google    throttles requests to the site for abuse prevention. You should not    depend on
   * externally-hosted images for production applications.
   *
   * When both `gcs_image_uri` and `image_uri` are specified, `image_uri` takes precedence.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUri() {
    return imageUri;
  }

  /**
   * The URI of the source image. Can be either:
   *
   * 1. A Google Cloud Storage URI of the form    `gs://bucket_name/object_name`. Object versioning
   * is not supported. See    [Google Cloud Storage Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris) for more    info.
   *
   * 2. A publicly-accessible image HTTP/HTTPS URL. When fetching images from    HTTP/HTTPS URLs,
   * Google cannot guarantee that the request will be    completed. Your request may fail if the
   * specified host denies the    request (e.g. due to request throttling or DOS prevention), or if
   * Google    throttles requests to the site for abuse prevention. You should not    depend on
   * externally-hosted images for production applications.
   *
   * When both `gcs_image_uri` and `image_uri` are specified, `image_uri` takes precedence.
   * @param imageUri imageUri or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageSource setImageUri(java.lang.String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p1beta1ImageSource set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p1beta1ImageSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p1beta1ImageSource clone() {
    return (GoogleCloudVisionV1p1beta1ImageSource) super.clone();
  }

}
