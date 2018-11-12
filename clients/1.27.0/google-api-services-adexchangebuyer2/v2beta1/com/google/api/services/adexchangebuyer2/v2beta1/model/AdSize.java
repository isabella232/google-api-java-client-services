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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * Represents size of a single ad slot, or a creative.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdSize extends com.google.api.client.json.GenericJson {

  /**
   * The height of the ad slot in pixels. This field will be present only when size type is `PIXEL`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long height;

  /**
   * The size type of the ad slot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sizeType;

  /**
   * The width of the ad slot in pixels. This field will be present only when size type is `PIXEL`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long width;

  /**
   * The height of the ad slot in pixels. This field will be present only when size type is `PIXEL`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getHeight() {
    return height;
  }

  /**
   * The height of the ad slot in pixels. This field will be present only when size type is `PIXEL`.
   * @param height height or {@code null} for none
   */
  public AdSize setHeight(java.lang.Long height) {
    this.height = height;
    return this;
  }

  /**
   * The size type of the ad slot.
   * @return value or {@code null} for none
   */
  public java.lang.String getSizeType() {
    return sizeType;
  }

  /**
   * The size type of the ad slot.
   * @param sizeType sizeType or {@code null} for none
   */
  public AdSize setSizeType(java.lang.String sizeType) {
    this.sizeType = sizeType;
    return this;
  }

  /**
   * The width of the ad slot in pixels. This field will be present only when size type is `PIXEL`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWidth() {
    return width;
  }

  /**
   * The width of the ad slot in pixels. This field will be present only when size type is `PIXEL`.
   * @param width width or {@code null} for none
   */
  public AdSize setWidth(java.lang.Long width) {
    this.width = width;
    return this;
  }

  @Override
  public AdSize set(String fieldName, Object value) {
    return (AdSize) super.set(fieldName, value);
  }

  @Override
  public AdSize clone() {
    return (AdSize) super.clone();
  }

}
