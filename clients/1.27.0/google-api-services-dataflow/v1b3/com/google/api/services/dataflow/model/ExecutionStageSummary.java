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

package com.google.api.services.dataflow.model;

/**
 * Description of the composing transforms, names/ids, and input/outputs of a stage of execution.
 * Some composing transforms and sources may have been generated by the Dataflow service during
 * execution planning.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecutionStageSummary extends com.google.api.client.json.GenericJson {

  /**
   * Collections produced and consumed by component transforms of this stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ComponentSource> componentSource;

  static {
    // hack to force ProGuard to consider ComponentSource used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ComponentSource.class);
  }

  /**
   * Transforms that comprise this execution stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ComponentTransform> componentTransform;

  /**
   * Dataflow service generated id for this stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Input sources for this stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StageSource> inputSource;

  static {
    // hack to force ProGuard to consider StageSource used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(StageSource.class);
  }

  /**
   * Type of tranform this stage is executing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Dataflow service generated name for this stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output sources for this stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StageSource> outputSource;

  static {
    // hack to force ProGuard to consider StageSource used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(StageSource.class);
  }

  /**
   * Collections produced and consumed by component transforms of this stage.
   * @return value or {@code null} for none
   */
  public java.util.List<ComponentSource> getComponentSource() {
    return componentSource;
  }

  /**
   * Collections produced and consumed by component transforms of this stage.
   * @param componentSource componentSource or {@code null} for none
   */
  public ExecutionStageSummary setComponentSource(java.util.List<ComponentSource> componentSource) {
    this.componentSource = componentSource;
    return this;
  }

  /**
   * Transforms that comprise this execution stage.
   * @return value or {@code null} for none
   */
  public java.util.List<ComponentTransform> getComponentTransform() {
    return componentTransform;
  }

  /**
   * Transforms that comprise this execution stage.
   * @param componentTransform componentTransform or {@code null} for none
   */
  public ExecutionStageSummary setComponentTransform(java.util.List<ComponentTransform> componentTransform) {
    this.componentTransform = componentTransform;
    return this;
  }

  /**
   * Dataflow service generated id for this stage.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Dataflow service generated id for this stage.
   * @param id id or {@code null} for none
   */
  public ExecutionStageSummary setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Input sources for this stage.
   * @return value or {@code null} for none
   */
  public java.util.List<StageSource> getInputSource() {
    return inputSource;
  }

  /**
   * Input sources for this stage.
   * @param inputSource inputSource or {@code null} for none
   */
  public ExecutionStageSummary setInputSource(java.util.List<StageSource> inputSource) {
    this.inputSource = inputSource;
    return this;
  }

  /**
   * Type of tranform this stage is executing.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of tranform this stage is executing.
   * @param kind kind or {@code null} for none
   */
  public ExecutionStageSummary setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Dataflow service generated name for this stage.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Dataflow service generated name for this stage.
   * @param name name or {@code null} for none
   */
  public ExecutionStageSummary setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output sources for this stage.
   * @return value or {@code null} for none
   */
  public java.util.List<StageSource> getOutputSource() {
    return outputSource;
  }

  /**
   * Output sources for this stage.
   * @param outputSource outputSource or {@code null} for none
   */
  public ExecutionStageSummary setOutputSource(java.util.List<StageSource> outputSource) {
    this.outputSource = outputSource;
    return this;
  }

  @Override
  public ExecutionStageSummary set(String fieldName, Object value) {
    return (ExecutionStageSummary) super.set(fieldName, value);
  }

  @Override
  public ExecutionStageSummary clone() {
    return (ExecutionStageSummary) super.clone();
  }

}
