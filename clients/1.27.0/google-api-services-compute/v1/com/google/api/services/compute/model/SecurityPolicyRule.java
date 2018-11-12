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

package com.google.api.services.compute.model;

/**
 * Represents a rule that describes one or more match conditions along with the action to be taken
 * when traffic matches this condition (allow or deny).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityPolicyRule extends com.google.api.client.json.GenericJson {

  /**
   * The Action to preform when the client connection triggers the rule. Can currently be either
   * "allow" or "deny()" where valid values for status are 403, 404, and 502.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   * corresponding ?action? is enforced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRuleMatcher match;

  /**
   * If set to true, the specified action is not enforced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preview;

  /**
   * An integer indicating the priority of a rule in the list. The priority must be a positive value
   * between 0 and 2147483647. Rules are evaluated in the increasing order of priority.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * The Action to preform when the client connection triggers the rule. Can currently be either
   * "allow" or "deny()" where valid values for status are 403, 404, and 502.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * The Action to preform when the client connection triggers the rule. Can currently be either
   * "allow" or "deny()" where valid values for status are 403, 404, and 502.
   * @param action action or {@code null} for none
   */
  public SecurityPolicyRule setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public SecurityPolicyRule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
   * @param kind kind or {@code null} for none
   */
  public SecurityPolicyRule setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   * corresponding ?action? is enforced.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRuleMatcher getMatch() {
    return match;
  }

  /**
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   * corresponding ?action? is enforced.
   * @param match match or {@code null} for none
   */
  public SecurityPolicyRule setMatch(SecurityPolicyRuleMatcher match) {
    this.match = match;
    return this;
  }

  /**
   * If set to true, the specified action is not enforced.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreview() {
    return preview;
  }

  /**
   * If set to true, the specified action is not enforced.
   * @param preview preview or {@code null} for none
   */
  public SecurityPolicyRule setPreview(java.lang.Boolean preview) {
    this.preview = preview;
    return this;
  }

  /**
   * An integer indicating the priority of a rule in the list. The priority must be a positive value
   * between 0 and 2147483647. Rules are evaluated in the increasing order of priority.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * An integer indicating the priority of a rule in the list. The priority must be a positive value
   * between 0 and 2147483647. Rules are evaluated in the increasing order of priority.
   * @param priority priority or {@code null} for none
   */
  public SecurityPolicyRule setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  @Override
  public SecurityPolicyRule set(String fieldName, Object value) {
    return (SecurityPolicyRule) super.set(fieldName, value);
  }

  @Override
  public SecurityPolicyRule clone() {
    return (SecurityPolicyRule) super.clone();
  }

}
