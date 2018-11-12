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
 * Contains an ordered list of nodes appearing in the query plan.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryPlan extends com.google.api.client.json.GenericJson {

  /**
   * The nodes in the query plan. Plan nodes are returned in pre-order starting with the plan root.
   * Each PlanNode's `id` corresponds to its index in `plan_nodes`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PlanNode> planNodes;

  /**
   * The nodes in the query plan. Plan nodes are returned in pre-order starting with the plan root.
   * Each PlanNode's `id` corresponds to its index in `plan_nodes`.
   * @return value or {@code null} for none
   */
  public java.util.List<PlanNode> getPlanNodes() {
    return planNodes;
  }

  /**
   * The nodes in the query plan. Plan nodes are returned in pre-order starting with the plan root.
   * Each PlanNode's `id` corresponds to its index in `plan_nodes`.
   * @param planNodes planNodes or {@code null} for none
   */
  public QueryPlan setPlanNodes(java.util.List<PlanNode> planNodes) {
    this.planNodes = planNodes;
    return this;
  }

  @Override
  public QueryPlan set(String fieldName, Object value) {
    return (QueryPlan) super.set(fieldName, value);
  }

  @Override
  public QueryPlan clone() {
    return (QueryPlan) super.clone();
  }

}
