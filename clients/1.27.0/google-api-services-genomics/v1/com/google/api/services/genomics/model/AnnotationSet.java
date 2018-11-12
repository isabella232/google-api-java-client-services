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

package com.google.api.services.genomics.model;

/**
 * An annotation set is a logical grouping of annotations that share consistent type information and
 * provenance. Examples of annotation sets include 'all genes from refseq', and 'all variant
 * annotations from ClinVar'.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnnotationSet extends com.google.api.client.json.GenericJson {

  /**
   * The dataset to which this annotation set belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datasetId;

  /**
   * The server-generated annotation set ID, unique across all annotation sets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * A map of additional read alignment information. This must be of the form map (string key
   * mapping to a list of string values).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.util.List<java.lang.Object>> info;

  /**
   * The display name for this annotation set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The ID of the reference set that defines the coordinate space for this set's annotations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referenceSetId;

  /**
   * The source URI describing the file from which this annotation set was generated, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceUri;

  /**
   * The type of annotations contained within this set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The dataset to which this annotation set belongs.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatasetId() {
    return datasetId;
  }

  /**
   * The dataset to which this annotation set belongs.
   * @param datasetId datasetId or {@code null} for none
   */
  public AnnotationSet setDatasetId(java.lang.String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * The server-generated annotation set ID, unique across all annotation sets.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The server-generated annotation set ID, unique across all annotation sets.
   * @param id id or {@code null} for none
   */
  public AnnotationSet setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * A map of additional read alignment information. This must be of the form map (string key
   * mapping to a list of string values).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.util.List<java.lang.Object>> getInfo() {
    return info;
  }

  /**
   * A map of additional read alignment information. This must be of the form map (string key
   * mapping to a list of string values).
   * @param info info or {@code null} for none
   */
  public AnnotationSet setInfo(java.util.Map<String, java.util.List<java.lang.Object>> info) {
    this.info = info;
    return this;
  }

  /**
   * The display name for this annotation set.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The display name for this annotation set.
   * @param name name or {@code null} for none
   */
  public AnnotationSet setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The ID of the reference set that defines the coordinate space for this set's annotations.
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceSetId() {
    return referenceSetId;
  }

  /**
   * The ID of the reference set that defines the coordinate space for this set's annotations.
   * @param referenceSetId referenceSetId or {@code null} for none
   */
  public AnnotationSet setReferenceSetId(java.lang.String referenceSetId) {
    this.referenceSetId = referenceSetId;
    return this;
  }

  /**
   * The source URI describing the file from which this annotation set was generated, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceUri() {
    return sourceUri;
  }

  /**
   * The source URI describing the file from which this annotation set was generated, if any.
   * @param sourceUri sourceUri or {@code null} for none
   */
  public AnnotationSet setSourceUri(java.lang.String sourceUri) {
    this.sourceUri = sourceUri;
    return this;
  }

  /**
   * The type of annotations contained within this set.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of annotations contained within this set.
   * @param type type or {@code null} for none
   */
  public AnnotationSet setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public AnnotationSet set(String fieldName, Object value) {
    return (AnnotationSet) super.set(fieldName, value);
  }

  @Override
  public AnnotationSet clone() {
    return (AnnotationSet) super.clone();
  }

}
