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

package com.google.api.services.firestore.v1beta2.model;

/**
 * Cloud Firestore indexes enable simple and complex queries against documents in a database.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1beta2Index extends com.google.api.client.json.GenericJson {

  /**
   * The fields supported by this index.
   *
   * For composite indexes, this is always 2 or more fields. The last field entry is always for the
   * field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will
   * be added automatically with the same direction as that of the last field defined. If the final
   * field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless
   * explicitly specified).
   *
   * For single field indexes, this will always be exactly one entry with a field path equal to the
   * field path of the associated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleFirestoreAdminV1beta2IndexField> fields;

  static {
    // hack to force ProGuard to consider GoogleFirestoreAdminV1beta2IndexField used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleFirestoreAdminV1beta2IndexField.class);
  }

  /**
   * Output only. A server defined name for this index. The form of this name for composite indexes
   * will be: `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexe
   * s/{composite_index_id}` For single field indexes, this field will be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Indexes with a collection query scope specified allow queries against a collection that is the
   * child of a specific document, specified at query time, and that has the same collection id.
   *
   * Indexes with a collection group query scope specified allow queries against all collections
   * descended from a specific document, specified at query time, and that have the same collection
   * id as this index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryScope;

  /**
   * Output only. The serving state of the index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The fields supported by this index.
   *
   * For composite indexes, this is always 2 or more fields. The last field entry is always for the
   * field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will
   * be added automatically with the same direction as that of the last field defined. If the final
   * field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless
   * explicitly specified).
   *
   * For single field indexes, this will always be exactly one entry with a field path equal to the
   * field path of the associated field.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleFirestoreAdminV1beta2IndexField> getFields() {
    return fields;
  }

  /**
   * The fields supported by this index.
   *
   * For composite indexes, this is always 2 or more fields. The last field entry is always for the
   * field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will
   * be added automatically with the same direction as that of the last field defined. If the final
   * field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless
   * explicitly specified).
   *
   * For single field indexes, this will always be exactly one entry with a field path equal to the
   * field path of the associated field.
   * @param fields fields or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2Index setFields(java.util.List<GoogleFirestoreAdminV1beta2IndexField> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Output only. A server defined name for this index. The form of this name for composite indexes
   * will be: `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexe
   * s/{composite_index_id}` For single field indexes, this field will be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. A server defined name for this index. The form of this name for composite indexes
   * will be: `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexe
   * s/{composite_index_id}` For single field indexes, this field will be empty.
   * @param name name or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2Index setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Indexes with a collection query scope specified allow queries against a collection that is the
   * child of a specific document, specified at query time, and that has the same collection id.
   *
   * Indexes with a collection group query scope specified allow queries against all collections
   * descended from a specific document, specified at query time, and that have the same collection
   * id as this index.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryScope() {
    return queryScope;
  }

  /**
   * Indexes with a collection query scope specified allow queries against a collection that is the
   * child of a specific document, specified at query time, and that has the same collection id.
   *
   * Indexes with a collection group query scope specified allow queries against all collections
   * descended from a specific document, specified at query time, and that have the same collection
   * id as this index.
   * @param queryScope queryScope or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2Index setQueryScope(java.lang.String queryScope) {
    this.queryScope = queryScope;
    return this;
  }

  /**
   * Output only. The serving state of the index.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The serving state of the index.
   * @param state state or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2Index setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1beta2Index set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1beta2Index) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1beta2Index clone() {
    return (GoogleFirestoreAdminV1beta2Index) super.clone();
  }

}
