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

package com.google.api.services.analytics.model;

/**
 * JSON template for Analytics Custom Dimension.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomDimension extends com.google.api.client.json.GenericJson {

  /**
   * Account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * Boolean indicating whether the custom dimension is active.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean active;

  /**
   * Time the custom dimension was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime created;

  /**
   * Custom dimension ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Index of the custom dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * Kind value for a custom dimension. Set to "analytics#customDimension". It is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the custom dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Parent link for the custom dimension. Points to the property to which the custom dimension
   * belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParentLink parentLink;

  /**
   * Scope of the custom dimension: HIT, SESSION, USER or PRODUCT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scope;

  /**
   * Link for the custom dimension
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Time the custom dimension was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

  /**
   * Property ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webPropertyId;

  /**
   * Account ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * Account ID.
   * @param accountId accountId or {@code null} for none
   */
  public CustomDimension setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Boolean indicating whether the custom dimension is active.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getActive() {
    return active;
  }

  /**
   * Boolean indicating whether the custom dimension is active.
   * @param active active or {@code null} for none
   */
  public CustomDimension setActive(java.lang.Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Time the custom dimension was created.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreated() {
    return created;
  }

  /**
   * Time the custom dimension was created.
   * @param created created or {@code null} for none
   */
  public CustomDimension setCreated(com.google.api.client.util.DateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Custom dimension ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Custom dimension ID.
   * @param id id or {@code null} for none
   */
  public CustomDimension setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Index of the custom dimension.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * Index of the custom dimension.
   * @param index index or {@code null} for none
   */
  public CustomDimension setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Kind value for a custom dimension. Set to "analytics#customDimension". It is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind value for a custom dimension. Set to "analytics#customDimension". It is a read-only field.
   * @param kind kind or {@code null} for none
   */
  public CustomDimension setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the custom dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the custom dimension.
   * @param name name or {@code null} for none
   */
  public CustomDimension setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Parent link for the custom dimension. Points to the property to which the custom dimension
   * belongs.
   * @return value or {@code null} for none
   */
  public ParentLink getParentLink() {
    return parentLink;
  }

  /**
   * Parent link for the custom dimension. Points to the property to which the custom dimension
   * belongs.
   * @param parentLink parentLink or {@code null} for none
   */
  public CustomDimension setParentLink(ParentLink parentLink) {
    this.parentLink = parentLink;
    return this;
  }

  /**
   * Scope of the custom dimension: HIT, SESSION, USER or PRODUCT.
   * @return value or {@code null} for none
   */
  public java.lang.String getScope() {
    return scope;
  }

  /**
   * Scope of the custom dimension: HIT, SESSION, USER or PRODUCT.
   * @param scope scope or {@code null} for none
   */
  public CustomDimension setScope(java.lang.String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Link for the custom dimension
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Link for the custom dimension
   * @param selfLink selfLink or {@code null} for none
   */
  public CustomDimension setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Time the custom dimension was last modified.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * Time the custom dimension was last modified.
   * @param updated updated or {@code null} for none
   */
  public CustomDimension setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Property ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebPropertyId() {
    return webPropertyId;
  }

  /**
   * Property ID.
   * @param webPropertyId webPropertyId or {@code null} for none
   */
  public CustomDimension setWebPropertyId(java.lang.String webPropertyId) {
    this.webPropertyId = webPropertyId;
    return this;
  }

  @Override
  public CustomDimension set(String fieldName, Object value) {
    return (CustomDimension) super.set(fieldName, value);
  }

  @Override
  public CustomDimension clone() {
    return (CustomDimension) super.clone();
  }

  /**
   * Parent link for the custom dimension. Points to the property to which the custom dimension
   * belongs.
   */
  public static final class ParentLink extends com.google.api.client.json.GenericJson {

    /**
     * Link to the property to which the custom dimension belongs.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String href;

    /**
     * Type of the parent link. Set to "analytics#webproperty".
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * Link to the property to which the custom dimension belongs.
     * @return value or {@code null} for none
     */
    public java.lang.String getHref() {
      return href;
    }

    /**
     * Link to the property to which the custom dimension belongs.
     * @param href href or {@code null} for none
     */
    public ParentLink setHref(java.lang.String href) {
      this.href = href;
      return this;
    }

    /**
     * Type of the parent link. Set to "analytics#webproperty".
     * @return value or {@code null} for none
     */
    public java.lang.String getType() {
      return type;
    }

    /**
     * Type of the parent link. Set to "analytics#webproperty".
     * @param type type or {@code null} for none
     */
    public ParentLink setType(java.lang.String type) {
      this.type = type;
      return this;
    }

    @Override
    public ParentLink set(String fieldName, Object value) {
      return (ParentLink) super.set(fieldName, value);
    }

    @Override
    public ParentLink clone() {
      return (ParentLink) super.clone();
    }

  }

}
