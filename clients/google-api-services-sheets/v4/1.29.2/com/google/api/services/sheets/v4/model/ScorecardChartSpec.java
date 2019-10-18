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
 * A scorecard chart. Scorecard charts are used to highlight key performance indicators, known as
 * KPIs, on the spreadsheet. A scorecard chart can represent things like total sales, average cost,
 * or a top selling item. You can specify a single data value, or aggregate over a range of data.
 * Percentage or absolute difference from a baseline value can be highlighted, like changes over
 * time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ScorecardChartSpec extends com.google.api.client.json.GenericJson {

  /**
   * The aggregation type for key and baseline chart data in scorecard chart. This field is
   * optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aggregateType;

  /**
   * The data for scorecard baseline value. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData baselineValueData;

  /**
   * Formatting options for baseline value. This field is needed only if baseline_value_data field
   * is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BaselineValueFormat baselineValueFormat;

  /**
   * Custom formatting options for numeric key/baseline values in scorecard chart. This field is
   * used only when [number_format_source] field is set to [ChartNumberFormatSource.CUSTOM]. This
   * field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartCustomNumberFormatOptions customFormatOptions;

  /**
   * The data for scorecard key value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData keyValueData;

  /**
   * Formatting options for key value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KeyValueFormat keyValueFormat;

  /**
   * The number format source used in the scorecard chart. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String numberFormatSource;

  /**
   * Value to scale scorecard key and baseline value. For example, a factor of 10 can be used to
   * divide all values in the chart by 10. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double scaleFactor;

  /**
   * The aggregation type for key and baseline chart data in scorecard chart. This field is
   * optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getAggregateType() {
    return aggregateType;
  }

  /**
   * The aggregation type for key and baseline chart data in scorecard chart. This field is
   * optional.
   * @param aggregateType aggregateType or {@code null} for none
   */
  public ScorecardChartSpec setAggregateType(java.lang.String aggregateType) {
    this.aggregateType = aggregateType;
    return this;
  }

  /**
   * The data for scorecard baseline value. This field is optional.
   * @return value or {@code null} for none
   */
  public ChartData getBaselineValueData() {
    return baselineValueData;
  }

  /**
   * The data for scorecard baseline value. This field is optional.
   * @param baselineValueData baselineValueData or {@code null} for none
   */
  public ScorecardChartSpec setBaselineValueData(ChartData baselineValueData) {
    this.baselineValueData = baselineValueData;
    return this;
  }

  /**
   * Formatting options for baseline value. This field is needed only if baseline_value_data field
   * is specified.
   * @return value or {@code null} for none
   */
  public BaselineValueFormat getBaselineValueFormat() {
    return baselineValueFormat;
  }

  /**
   * Formatting options for baseline value. This field is needed only if baseline_value_data field
   * is specified.
   * @param baselineValueFormat baselineValueFormat or {@code null} for none
   */
  public ScorecardChartSpec setBaselineValueFormat(BaselineValueFormat baselineValueFormat) {
    this.baselineValueFormat = baselineValueFormat;
    return this;
  }

  /**
   * Custom formatting options for numeric key/baseline values in scorecard chart. This field is
   * used only when [number_format_source] field is set to [ChartNumberFormatSource.CUSTOM]. This
   * field is optional.
   * @return value or {@code null} for none
   */
  public ChartCustomNumberFormatOptions getCustomFormatOptions() {
    return customFormatOptions;
  }

  /**
   * Custom formatting options for numeric key/baseline values in scorecard chart. This field is
   * used only when [number_format_source] field is set to [ChartNumberFormatSource.CUSTOM]. This
   * field is optional.
   * @param customFormatOptions customFormatOptions or {@code null} for none
   */
  public ScorecardChartSpec setCustomFormatOptions(ChartCustomNumberFormatOptions customFormatOptions) {
    this.customFormatOptions = customFormatOptions;
    return this;
  }

  /**
   * The data for scorecard key value.
   * @return value or {@code null} for none
   */
  public ChartData getKeyValueData() {
    return keyValueData;
  }

  /**
   * The data for scorecard key value.
   * @param keyValueData keyValueData or {@code null} for none
   */
  public ScorecardChartSpec setKeyValueData(ChartData keyValueData) {
    this.keyValueData = keyValueData;
    return this;
  }

  /**
   * Formatting options for key value.
   * @return value or {@code null} for none
   */
  public KeyValueFormat getKeyValueFormat() {
    return keyValueFormat;
  }

  /**
   * Formatting options for key value.
   * @param keyValueFormat keyValueFormat or {@code null} for none
   */
  public ScorecardChartSpec setKeyValueFormat(KeyValueFormat keyValueFormat) {
    this.keyValueFormat = keyValueFormat;
    return this;
  }

  /**
   * The number format source used in the scorecard chart. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getNumberFormatSource() {
    return numberFormatSource;
  }

  /**
   * The number format source used in the scorecard chart. This field is optional.
   * @param numberFormatSource numberFormatSource or {@code null} for none
   */
  public ScorecardChartSpec setNumberFormatSource(java.lang.String numberFormatSource) {
    this.numberFormatSource = numberFormatSource;
    return this;
  }

  /**
   * Value to scale scorecard key and baseline value. For example, a factor of 10 can be used to
   * divide all values in the chart by 10. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.Double getScaleFactor() {
    return scaleFactor;
  }

  /**
   * Value to scale scorecard key and baseline value. For example, a factor of 10 can be used to
   * divide all values in the chart by 10. This field is optional.
   * @param scaleFactor scaleFactor or {@code null} for none
   */
  public ScorecardChartSpec setScaleFactor(java.lang.Double scaleFactor) {
    this.scaleFactor = scaleFactor;
    return this;
  }

  @Override
  public ScorecardChartSpec set(String fieldName, Object value) {
    return (ScorecardChartSpec) super.set(fieldName, value);
  }

  @Override
  public ScorecardChartSpec clone() {
    return (ScorecardChartSpec) super.clone();
  }

}