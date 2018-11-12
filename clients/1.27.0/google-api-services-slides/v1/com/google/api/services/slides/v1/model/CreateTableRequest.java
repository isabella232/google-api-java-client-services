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

package com.google.api.services.slides.v1.model;

/**
 * Creates a new table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateTableRequest extends com.google.api.client.json.GenericJson {

  /**
   * Number of columns in the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer columns;

  /**
   * The element properties for the table.
   *
   * The table will be created at the provided size, subject to a minimum size. If no size is
   * provided, the table will be automatically sized.
   *
   * Table transforms must have a scale of 1 and no shear components. If no transform is provided,
   * the table will be centered on the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PageElementProperties elementProperties;

  /**
   * A user-supplied object ID.
   *
   * If you specify an ID, it must be unique among all pages and page elements in the presentation.
   * The ID must start with an alphanumeric character or an underscore (matches regex
   * `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches
   * regex `[a-zA-Z0-9_-:]`). The length of the ID must not be less than 5 or greater than 50.
   *
   * If you don't specify an ID, a unique one is generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * Number of rows in the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rows;

  /**
   * Number of columns in the table.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumns() {
    return columns;
  }

  /**
   * Number of columns in the table.
   * @param columns columns or {@code null} for none
   */
  public CreateTableRequest setColumns(java.lang.Integer columns) {
    this.columns = columns;
    return this;
  }

  /**
   * The element properties for the table.
   *
   * The table will be created at the provided size, subject to a minimum size. If no size is
   * provided, the table will be automatically sized.
   *
   * Table transforms must have a scale of 1 and no shear components. If no transform is provided,
   * the table will be centered on the page.
   * @return value or {@code null} for none
   */
  public PageElementProperties getElementProperties() {
    return elementProperties;
  }

  /**
   * The element properties for the table.
   *
   * The table will be created at the provided size, subject to a minimum size. If no size is
   * provided, the table will be automatically sized.
   *
   * Table transforms must have a scale of 1 and no shear components. If no transform is provided,
   * the table will be centered on the page.
   * @param elementProperties elementProperties or {@code null} for none
   */
  public CreateTableRequest setElementProperties(PageElementProperties elementProperties) {
    this.elementProperties = elementProperties;
    return this;
  }

  /**
   * A user-supplied object ID.
   *
   * If you specify an ID, it must be unique among all pages and page elements in the presentation.
   * The ID must start with an alphanumeric character or an underscore (matches regex
   * `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches
   * regex `[a-zA-Z0-9_-:]`). The length of the ID must not be less than 5 or greater than 50.
   *
   * If you don't specify an ID, a unique one is generated.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * A user-supplied object ID.
   *
   * If you specify an ID, it must be unique among all pages and page elements in the presentation.
   * The ID must start with an alphanumeric character or an underscore (matches regex
   * `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches
   * regex `[a-zA-Z0-9_-:]`). The length of the ID must not be less than 5 or greater than 50.
   *
   * If you don't specify an ID, a unique one is generated.
   * @param objectId objectId or {@code null} for none
   */
  public CreateTableRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * Number of rows in the table.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRows() {
    return rows;
  }

  /**
   * Number of rows in the table.
   * @param rows rows or {@code null} for none
   */
  public CreateTableRequest setRows(java.lang.Integer rows) {
    this.rows = rows;
    return this;
  }

  @Override
  public CreateTableRequest set(String fieldName, Object value) {
    return (CreateTableRequest) super.set(fieldName, value);
  }

  @Override
  public CreateTableRequest clone() {
    return (CreateTableRequest) super.clone();
  }

}
