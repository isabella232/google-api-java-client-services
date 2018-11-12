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

package com.google.api.services.spanner.v1.model;

/**
 * Node information for nodes appearing in a QueryPlan.plan_nodes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlanNode extends com.google.api.client.json.GenericJson {

  /**
   * List of child node `index`es and their relationship to this parent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ChildLink> childLinks;

  /**
   * The display name for the node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The execution statistics associated with the node, contained in a group of key-value pairs.
   * Only present if the plan was returned as a result of a profile query. For example, number of
   * executions, number of rows/time per execution etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> executionStats;

  /**
   * The `PlanNode`'s index in node list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * Used to determine the type of node. May be needed for visualizing different kinds of nodes
   * differently. For example, If the node is a SCALAR node, it will have a condensed representation
   * which can be used to directly embed a description of the node in its parent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Attributes relevant to the node contained in a group of key-value pairs. For example, a
   * Parameter Reference node could have the following information in its metadata:
   *
   *     {       "parameter_reference": "param1",       "parameter_type": "array"     }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * Condensed representation for SCALAR nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShortRepresentation shortRepresentation;

  /**
   * List of child node `index`es and their relationship to this parent.
   * @return value or {@code null} for none
   */
  public java.util.List<ChildLink> getChildLinks() {
    return childLinks;
  }

  /**
   * List of child node `index`es and their relationship to this parent.
   * @param childLinks childLinks or {@code null} for none
   */
  public PlanNode setChildLinks(java.util.List<ChildLink> childLinks) {
    this.childLinks = childLinks;
    return this;
  }

  /**
   * The display name for the node.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name for the node.
   * @param displayName displayName or {@code null} for none
   */
  public PlanNode setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The execution statistics associated with the node, contained in a group of key-value pairs.
   * Only present if the plan was returned as a result of a profile query. For example, number of
   * executions, number of rows/time per execution etc.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getExecutionStats() {
    return executionStats;
  }

  /**
   * The execution statistics associated with the node, contained in a group of key-value pairs.
   * Only present if the plan was returned as a result of a profile query. For example, number of
   * executions, number of rows/time per execution etc.
   * @param executionStats executionStats or {@code null} for none
   */
  public PlanNode setExecutionStats(java.util.Map<String, java.lang.Object> executionStats) {
    this.executionStats = executionStats;
    return this;
  }

  /**
   * The `PlanNode`'s index in node list.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * The `PlanNode`'s index in node list.
   * @param index index or {@code null} for none
   */
  public PlanNode setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Used to determine the type of node. May be needed for visualizing different kinds of nodes
   * differently. For example, If the node is a SCALAR node, it will have a condensed representation
   * which can be used to directly embed a description of the node in its parent.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Used to determine the type of node. May be needed for visualizing different kinds of nodes
   * differently. For example, If the node is a SCALAR node, it will have a condensed representation
   * which can be used to directly embed a description of the node in its parent.
   * @param kind kind or {@code null} for none
   */
  public PlanNode setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Attributes relevant to the node contained in a group of key-value pairs. For example, a
   * Parameter Reference node could have the following information in its metadata:
   *
   *     {       "parameter_reference": "param1",       "parameter_type": "array"     }
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * Attributes relevant to the node contained in a group of key-value pairs. For example, a
   * Parameter Reference node could have the following information in its metadata:
   *
   *     {       "parameter_reference": "param1",       "parameter_type": "array"     }
   * @param metadata metadata or {@code null} for none
   */
  public PlanNode setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Condensed representation for SCALAR nodes.
   * @return value or {@code null} for none
   */
  public ShortRepresentation getShortRepresentation() {
    return shortRepresentation;
  }

  /**
   * Condensed representation for SCALAR nodes.
   * @param shortRepresentation shortRepresentation or {@code null} for none
   */
  public PlanNode setShortRepresentation(ShortRepresentation shortRepresentation) {
    this.shortRepresentation = shortRepresentation;
    return this;
  }

  @Override
  public PlanNode set(String fieldName, Object value) {
    return (PlanNode) super.set(fieldName, value);
  }

  @Override
  public PlanNode clone() {
    return (PlanNode) super.clone();
  }

}
