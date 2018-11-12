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

package com.google.api.services.dfareporting.model;

/**
 * Remarketing List Population Rule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListPopulationRule extends com.google.api.client.json.GenericJson {

  /**
   * Floodlight activity ID associated with this rule. This field can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long floodlightActivityId;

  /**
   * Name of floodlight activity associated with this rule. This is a read-only, auto-generated
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String floodlightActivityName;

  /**
   * Clauses that make up this list population rule. Clauses are joined by ANDs, and the clauses
   * themselves are made up of list population terms which are joined by ORs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ListPopulationClause> listPopulationClauses;

  static {
    // hack to force ProGuard to consider ListPopulationClause used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ListPopulationClause.class);
  }

  /**
   * Floodlight activity ID associated with this rule. This field can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFloodlightActivityId() {
    return floodlightActivityId;
  }

  /**
   * Floodlight activity ID associated with this rule. This field can be left blank.
   * @param floodlightActivityId floodlightActivityId or {@code null} for none
   */
  public ListPopulationRule setFloodlightActivityId(java.lang.Long floodlightActivityId) {
    this.floodlightActivityId = floodlightActivityId;
    return this;
  }

  /**
   * Name of floodlight activity associated with this rule. This is a read-only, auto-generated
   * field.
   * @return value or {@code null} for none
   */
  public java.lang.String getFloodlightActivityName() {
    return floodlightActivityName;
  }

  /**
   * Name of floodlight activity associated with this rule. This is a read-only, auto-generated
   * field.
   * @param floodlightActivityName floodlightActivityName or {@code null} for none
   */
  public ListPopulationRule setFloodlightActivityName(java.lang.String floodlightActivityName) {
    this.floodlightActivityName = floodlightActivityName;
    return this;
  }

  /**
   * Clauses that make up this list population rule. Clauses are joined by ANDs, and the clauses
   * themselves are made up of list population terms which are joined by ORs.
   * @return value or {@code null} for none
   */
  public java.util.List<ListPopulationClause> getListPopulationClauses() {
    return listPopulationClauses;
  }

  /**
   * Clauses that make up this list population rule. Clauses are joined by ANDs, and the clauses
   * themselves are made up of list population terms which are joined by ORs.
   * @param listPopulationClauses listPopulationClauses or {@code null} for none
   */
  public ListPopulationRule setListPopulationClauses(java.util.List<ListPopulationClause> listPopulationClauses) {
    this.listPopulationClauses = listPopulationClauses;
    return this;
  }

  @Override
  public ListPopulationRule set(String fieldName, Object value) {
    return (ListPopulationRule) super.set(fieldName, value);
  }

  @Override
  public ListPopulationRule clone() {
    return (ListPopulationRule) super.clone();
  }

}
