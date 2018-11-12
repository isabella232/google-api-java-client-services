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

package com.google.api.services.sheets.v4.model;

/**
 * The value of the condition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConditionValue extends com.google.api.client.json.GenericJson {

  /**
   * A relative date (based on the current date). Valid only if the type is DATE_BEFORE, DATE_AFTER,
   * DATE_ON_OR_BEFORE or DATE_ON_OR_AFTER.
   *
   * Relative dates are not supported in data validation. They are supported only in conditional
   * formatting and conditional filters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relativeDate;

  /**
   * A value the condition is based on. The value is parsed as if the user typed into a cell.
   * Formulas are supported (and must begin with an `=` or a '+').
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userEnteredValue;

  /**
   * A relative date (based on the current date). Valid only if the type is DATE_BEFORE, DATE_AFTER,
   * DATE_ON_OR_BEFORE or DATE_ON_OR_AFTER.
   *
   * Relative dates are not supported in data validation. They are supported only in conditional
   * formatting and conditional filters.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelativeDate() {
    return relativeDate;
  }

  /**
   * A relative date (based on the current date). Valid only if the type is DATE_BEFORE, DATE_AFTER,
   * DATE_ON_OR_BEFORE or DATE_ON_OR_AFTER.
   *
   * Relative dates are not supported in data validation. They are supported only in conditional
   * formatting and conditional filters.
   * @param relativeDate relativeDate or {@code null} for none
   */
  public ConditionValue setRelativeDate(java.lang.String relativeDate) {
    this.relativeDate = relativeDate;
    return this;
  }

  /**
   * A value the condition is based on. The value is parsed as if the user typed into a cell.
   * Formulas are supported (and must begin with an `=` or a '+').
   * @return value or {@code null} for none
   */
  public java.lang.String getUserEnteredValue() {
    return userEnteredValue;
  }

  /**
   * A value the condition is based on. The value is parsed as if the user typed into a cell.
   * Formulas are supported (and must begin with an `=` or a '+').
   * @param userEnteredValue userEnteredValue or {@code null} for none
   */
  public ConditionValue setUserEnteredValue(java.lang.String userEnteredValue) {
    this.userEnteredValue = userEnteredValue;
    return this;
  }

  @Override
  public ConditionValue set(String fieldName, Object value) {
    return (ConditionValue) super.set(fieldName, value);
  }

  @Override
  public ConditionValue clone() {
    return (ConditionValue) super.clone();
  }

}
