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
 * An optional setting on a PivotGroup that defines buckets for the values in the source data column
 * rather than breaking out each individual value. Only one PivotGroup with a group rule may be
 * added for each column in the source data, though on any given column you may add both a
 * PivotGroup that has a rule and a PivotGroup that does not.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PivotGroupRule extends com.google.api.client.json.GenericJson {

  /**
   * A DateTimeRule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateTimeRule dateTimeRule;

  /**
   * A HistogramRule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HistogramRule histogramRule;

  /**
   * A ManualRule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManualRule manualRule;

  /**
   * A DateTimeRule.
   * @return value or {@code null} for none
   */
  public DateTimeRule getDateTimeRule() {
    return dateTimeRule;
  }

  /**
   * A DateTimeRule.
   * @param dateTimeRule dateTimeRule or {@code null} for none
   */
  public PivotGroupRule setDateTimeRule(DateTimeRule dateTimeRule) {
    this.dateTimeRule = dateTimeRule;
    return this;
  }

  /**
   * A HistogramRule.
   * @return value or {@code null} for none
   */
  public HistogramRule getHistogramRule() {
    return histogramRule;
  }

  /**
   * A HistogramRule.
   * @param histogramRule histogramRule or {@code null} for none
   */
  public PivotGroupRule setHistogramRule(HistogramRule histogramRule) {
    this.histogramRule = histogramRule;
    return this;
  }

  /**
   * A ManualRule.
   * @return value or {@code null} for none
   */
  public ManualRule getManualRule() {
    return manualRule;
  }

  /**
   * A ManualRule.
   * @param manualRule manualRule or {@code null} for none
   */
  public PivotGroupRule setManualRule(ManualRule manualRule) {
    this.manualRule = manualRule;
    return this;
  }

  @Override
  public PivotGroupRule set(String fieldName, Object value) {
    return (PivotGroupRule) super.set(fieldName, value);
  }

  @Override
  public PivotGroupRule clone() {
    return (PivotGroupRule) super.clone();
  }

}
