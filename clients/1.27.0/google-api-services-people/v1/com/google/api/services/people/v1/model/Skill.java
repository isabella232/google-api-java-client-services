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

package com.google.api.services.people.v1.model;

/**
 * A skill that the person has.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Skill extends com.google.api.client.json.GenericJson {

  /**
   * Metadata about the skill.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The skill; for example, `underwater basket weaving`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Metadata about the skill.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the skill.
   * @param metadata metadata or {@code null} for none
   */
  public Skill setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The skill; for example, `underwater basket weaving`.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The skill; for example, `underwater basket weaving`.
   * @param value value or {@code null} for none
   */
  public Skill setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public Skill set(String fieldName, Object value) {
    return (Skill) super.set(fieldName, value);
  }

  @Override
  public Skill clone() {
    return (Skill) super.clone();
  }

}
