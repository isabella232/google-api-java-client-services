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

package com.google.api.services.bigquery.model;

/**
 * Model definition for ModelDefinition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelDefinition extends com.google.api.client.json.GenericJson {

  /**
   * [Output-only, Beta] Model options used for the first training run. These options are immutable
   * for subsequent training runs. Default values are used for any options not specified in the
   * input query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ModelOptions modelOptions;

  /**
   * [Output-only, Beta] Information about ml training runs, each training run comprises of multiple
   * iterations and there may be multiple training runs for the model if warm start is used or if a
   * user decides to continue a previously cancelled query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TrainingRun> trainingRuns;

  /**
   * [Output-only, Beta] Model options used for the first training run. These options are immutable
   * for subsequent training runs. Default values are used for any options not specified in the
   * input query.
   * @return value or {@code null} for none
   */
  public ModelOptions getModelOptions() {
    return modelOptions;
  }

  /**
   * [Output-only, Beta] Model options used for the first training run. These options are immutable
   * for subsequent training runs. Default values are used for any options not specified in the
   * input query.
   * @param modelOptions modelOptions or {@code null} for none
   */
  public ModelDefinition setModelOptions(ModelOptions modelOptions) {
    this.modelOptions = modelOptions;
    return this;
  }

  /**
   * [Output-only, Beta] Information about ml training runs, each training run comprises of multiple
   * iterations and there may be multiple training runs for the model if warm start is used or if a
   * user decides to continue a previously cancelled query.
   * @return value or {@code null} for none
   */
  public java.util.List<TrainingRun> getTrainingRuns() {
    return trainingRuns;
  }

  /**
   * [Output-only, Beta] Information about ml training runs, each training run comprises of multiple
   * iterations and there may be multiple training runs for the model if warm start is used or if a
   * user decides to continue a previously cancelled query.
   * @param trainingRuns trainingRuns or {@code null} for none
   */
  public ModelDefinition setTrainingRuns(java.util.List<TrainingRun> trainingRuns) {
    this.trainingRuns = trainingRuns;
    return this;
  }

  @Override
  public ModelDefinition set(String fieldName, Object value) {
    return (ModelDefinition) super.set(fieldName, value);
  }

  @Override
  public ModelDefinition clone() {
    return (ModelDefinition) super.clone();
  }

  /**
   * [Output-only, Beta] Model options used for the first training run. These options are immutable
   * for subsequent training runs. Default values are used for any options not specified in the input
   * query.
   */
  public static final class ModelOptions extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> labels;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String lossType;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String modelType;

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getLabels() {
      return labels;
    }

    /**
     * @param labels labels or {@code null} for none
     */
    public ModelOptions setLabels(java.util.List<java.lang.String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLossType() {
      return lossType;
    }

    /**
     * @param lossType lossType or {@code null} for none
     */
    public ModelOptions setLossType(java.lang.String lossType) {
      this.lossType = lossType;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getModelType() {
      return modelType;
    }

    /**
     * @param modelType modelType or {@code null} for none
     */
    public ModelOptions setModelType(java.lang.String modelType) {
      this.modelType = modelType;
      return this;
    }

    @Override
    public ModelOptions set(String fieldName, Object value) {
      return (ModelOptions) super.set(fieldName, value);
    }

    @Override
    public ModelOptions clone() {
      return (ModelOptions) super.clone();
    }

  }

}
