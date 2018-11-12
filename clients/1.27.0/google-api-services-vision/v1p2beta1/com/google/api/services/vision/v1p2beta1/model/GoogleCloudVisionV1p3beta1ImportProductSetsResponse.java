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
 * Response message for the `ImportProductSets` method.
 *
 * This message is returned by the google.longrunning.Operations.GetOperation method in the returned
 * google.longrunning.Operation.response field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p3beta1ImportProductSetsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of reference_images that are imported successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p3beta1ReferenceImage> referenceImages;

  /**
   * The rpc status for each ImportProductSet request, including both successes and errors.
   *
   * The number of statuses here matches the number of lines in the csv file, and statuses[i] stores
   * the success or failure status of processing the i-th line of the csv, starting from line 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Status> statuses;

  /**
   * The list of reference_images that are imported successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p3beta1ReferenceImage> getReferenceImages() {
    return referenceImages;
  }

  /**
   * The list of reference_images that are imported successfully.
   * @param referenceImages referenceImages or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1ImportProductSetsResponse setReferenceImages(java.util.List<GoogleCloudVisionV1p3beta1ReferenceImage> referenceImages) {
    this.referenceImages = referenceImages;
    return this;
  }

  /**
   * The rpc status for each ImportProductSet request, including both successes and errors.
   *
   * The number of statuses here matches the number of lines in the csv file, and statuses[i] stores
   * the success or failure status of processing the i-th line of the csv, starting from line 0.
   * @return value or {@code null} for none
   */
  public java.util.List<Status> getStatuses() {
    return statuses;
  }

  /**
   * The rpc status for each ImportProductSet request, including both successes and errors.
   *
   * The number of statuses here matches the number of lines in the csv file, and statuses[i] stores
   * the success or failure status of processing the i-th line of the csv, starting from line 0.
   * @param statuses statuses or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1ImportProductSetsResponse setStatuses(java.util.List<Status> statuses) {
    this.statuses = statuses;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p3beta1ImportProductSetsResponse set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p3beta1ImportProductSetsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p3beta1ImportProductSetsResponse clone() {
    return (GoogleCloudVisionV1p3beta1ImportProductSetsResponse) super.clone();
  }

}
