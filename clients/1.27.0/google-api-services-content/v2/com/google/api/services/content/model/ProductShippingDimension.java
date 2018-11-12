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

package com.google.api.services.content.model;

/**
 * Model definition for ProductShippingDimension.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductShippingDimension extends com.google.api.client.json.GenericJson {

  /**
   * The unit of value.
   *
   * Acceptable values are:   - "cm"  - "in"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * The dimension of the product used to calculate the shipping cost of the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double value;

  /**
   * The unit of value.
   *
   * Acceptable values are:   - "cm"  - "in"
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * The unit of value.
   *
   * Acceptable values are:   - "cm"  - "in"
   * @param unit unit or {@code null} for none
   */
  public ProductShippingDimension setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * The dimension of the product used to calculate the shipping cost of the item.
   * @return value or {@code null} for none
   */
  public java.lang.Double getValue() {
    return value;
  }

  /**
   * The dimension of the product used to calculate the shipping cost of the item.
   * @param value value or {@code null} for none
   */
  public ProductShippingDimension setValue(java.lang.Double value) {
    this.value = value;
    return this;
  }

  @Override
  public ProductShippingDimension set(String fieldName, Object value) {
    return (ProductShippingDimension) super.set(fieldName, value);
  }

  @Override
  public ProductShippingDimension clone() {
    return (ProductShippingDimension) super.clone();
  }

}
