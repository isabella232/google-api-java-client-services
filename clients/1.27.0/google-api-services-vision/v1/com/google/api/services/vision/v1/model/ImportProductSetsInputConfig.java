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

package com.google.api.services.vision.v1.model;

/**
 * The input content for the `ImportProductSets` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportProductSetsInputConfig extends com.google.api.client.json.GenericJson {

  /**
   * The Google Cloud Storage location for a csv file which preserves a list of
   * ImportProductSetRequests in each line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImportProductSetsGcsSource gcsSource;

  /**
   * The Google Cloud Storage location for a csv file which preserves a list of
   * ImportProductSetRequests in each line.
   * @return value or {@code null} for none
   */
  public ImportProductSetsGcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * The Google Cloud Storage location for a csv file which preserves a list of
   * ImportProductSetRequests in each line.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public ImportProductSetsInputConfig setGcsSource(ImportProductSetsGcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  @Override
  public ImportProductSetsInputConfig set(String fieldName, Object value) {
    return (ImportProductSetsInputConfig) super.set(fieldName, value);
  }

  @Override
  public ImportProductSetsInputConfig clone() {
    return (ImportProductSetsInputConfig) super.clone();
  }

}
