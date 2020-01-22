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

package com.google.api.services.cloudasset.v1.model;

/**
 * `CustomLevel` is an `AccessLevel` using the Cloud Common Expression Language to represent the
 * necessary conditions for the level to apply to a request. See CEL spec at:
 * https://github.com/google/cel-spec
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityAccesscontextmanagerV1CustomLevel extends com.google.api.client.json.GenericJson {

  /**
   * Required. A Cloud CEL expression evaluating to a boolean.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Expr expr;

  /**
   * Required. A Cloud CEL expression evaluating to a boolean.
   * @return value or {@code null} for none
   */
  public Expr getExpr() {
    return expr;
  }

  /**
   * Required. A Cloud CEL expression evaluating to a boolean.
   * @param expr expr or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1CustomLevel setExpr(Expr expr) {
    this.expr = expr;
    return this;
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1CustomLevel set(String fieldName, Object value) {
    return (GoogleIdentityAccesscontextmanagerV1CustomLevel) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1CustomLevel clone() {
    return (GoogleIdentityAccesscontextmanagerV1CustomLevel) super.clone();
  }

}