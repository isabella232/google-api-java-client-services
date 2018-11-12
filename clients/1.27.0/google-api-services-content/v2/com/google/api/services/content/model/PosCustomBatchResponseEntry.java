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
 * Model definition for PosCustomBatchResponseEntry.
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
public final class PosCustomBatchResponseEntry extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the request entry to which this entry responds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * A list of errors defined if, and only if, the request failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Errors errors;

  /**
   * The updated inventory information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PosInventory inventory;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#posCustomBatchResponseEntry".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The updated sale information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PosSale sale;

  /**
   * The retrieved or updated store information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PosStore store;

  /**
   * The ID of the request entry to which this entry responds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * The ID of the request entry to which this entry responds.
   * @param batchId batchId or {@code null} for none
   */
  public PosCustomBatchResponseEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * A list of errors defined if, and only if, the request failed.
   * @return value or {@code null} for none
   */
  public Errors getErrors() {
    return errors;
  }

  /**
   * A list of errors defined if, and only if, the request failed.
   * @param errors errors or {@code null} for none
   */
  public PosCustomBatchResponseEntry setErrors(Errors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * The updated inventory information.
   * @return value or {@code null} for none
   */
  public PosInventory getInventory() {
    return inventory;
  }

  /**
   * The updated inventory information.
   * @param inventory inventory or {@code null} for none
   */
  public PosCustomBatchResponseEntry setInventory(PosInventory inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#posCustomBatchResponseEntry".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#posCustomBatchResponseEntry".
   * @param kind kind or {@code null} for none
   */
  public PosCustomBatchResponseEntry setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The updated sale information.
   * @return value or {@code null} for none
   */
  public PosSale getSale() {
    return sale;
  }

  /**
   * The updated sale information.
   * @param sale sale or {@code null} for none
   */
  public PosCustomBatchResponseEntry setSale(PosSale sale) {
    this.sale = sale;
    return this;
  }

  /**
   * The retrieved or updated store information.
   * @return value or {@code null} for none
   */
  public PosStore getStore() {
    return store;
  }

  /**
   * The retrieved or updated store information.
   * @param store store or {@code null} for none
   */
  public PosCustomBatchResponseEntry setStore(PosStore store) {
    this.store = store;
    return this;
  }

  @Override
  public PosCustomBatchResponseEntry set(String fieldName, Object value) {
    return (PosCustomBatchResponseEntry) super.set(fieldName, value);
  }

  @Override
  public PosCustomBatchResponseEntry clone() {
    return (PosCustomBatchResponseEntry) super.clone();
  }

}
