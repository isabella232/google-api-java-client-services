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

package com.google.api.services.cloudresourcemanager.model;

/**
 * A Project is a high-level Google Cloud Platform entity.  It is a container for ACLs, APIs, App
 * Engine Apps, VMs, and other Google Cloud Platform resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Project extends com.google.api.client.json.GenericJson {

  /**
   * Creation time.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The labels associated with this Project.
   *
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.
   *
   * Label values must be between 0 and 63 characters long and must conform to the regular
   * expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?. A label value can be empty.
   *
   * No more than 256 labels can be associated with a given resource.
   *
   * Clients should store labels in a representation such as JSON that does not depend on specific
   * characters being disallowed.
   *
   * Example: "environment" : "dev" Read-write.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The Project lifecycle state.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lifecycleState;

  /**
   * The user-assigned display name of the Project. It must be 4 to 30 characters. Allowed
   * characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote,
   * space, and exclamation point.
   *
   * Example: My Project Read-write.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * An optional reference to a parent Resource.
   *
   * Supported parent types include "organization" and "folder". Once set, the parent cannot be
   * cleared. The `parent` can be set on creation or using the `UpdateProject` method; the end user
   * must have the `resourcemanager.projects.create` permission on the parent.
   *
   * Read-write.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceId parent;

  /**
   * The unique, user-assigned ID of the Project. It must be 6 to 30 lowercase letters, digits, or
   * hyphens. It must start with a letter. Trailing hyphens are prohibited.
   *
   * Example: tokyo-rain-123 Read-only after creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * The number uniquely identifying the project.
   *
   * Example: 415104041262 Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long projectNumber;

  /**
   * Creation time.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Creation time.
   *
   * Read-only.
   * @param createTime createTime or {@code null} for none
   */
  public Project setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The labels associated with this Project.
   *
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.
   *
   * Label values must be between 0 and 63 characters long and must conform to the regular
   * expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?. A label value can be empty.
   *
   * No more than 256 labels can be associated with a given resource.
   *
   * Clients should store labels in a representation such as JSON that does not depend on specific
   * characters being disallowed.
   *
   * Example: "environment" : "dev" Read-write.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels associated with this Project.
   *
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.
   *
   * Label values must be between 0 and 63 characters long and must conform to the regular
   * expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?. A label value can be empty.
   *
   * No more than 256 labels can be associated with a given resource.
   *
   * Clients should store labels in a representation such as JSON that does not depend on specific
   * characters being disallowed.
   *
   * Example: "environment" : "dev" Read-write.
   * @param labels labels or {@code null} for none
   */
  public Project setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The Project lifecycle state.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * The Project lifecycle state.
   *
   * Read-only.
   * @param lifecycleState lifecycleState or {@code null} for none
   */
  public Project setLifecycleState(java.lang.String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * The user-assigned display name of the Project. It must be 4 to 30 characters. Allowed
   * characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote,
   * space, and exclamation point.
   *
   * Example: My Project Read-write.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The user-assigned display name of the Project. It must be 4 to 30 characters. Allowed
   * characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote,
   * space, and exclamation point.
   *
   * Example: My Project Read-write.
   * @param name name or {@code null} for none
   */
  public Project setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * An optional reference to a parent Resource.
   *
   * Supported parent types include "organization" and "folder". Once set, the parent cannot be
   * cleared. The `parent` can be set on creation or using the `UpdateProject` method; the end user
   * must have the `resourcemanager.projects.create` permission on the parent.
   *
   * Read-write.
   * @return value or {@code null} for none
   */
  public ResourceId getParent() {
    return parent;
  }

  /**
   * An optional reference to a parent Resource.
   *
   * Supported parent types include "organization" and "folder". Once set, the parent cannot be
   * cleared. The `parent` can be set on creation or using the `UpdateProject` method; the end user
   * must have the `resourcemanager.projects.create` permission on the parent.
   *
   * Read-write.
   * @param parent parent or {@code null} for none
   */
  public Project setParent(ResourceId parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The unique, user-assigned ID of the Project. It must be 6 to 30 lowercase letters, digits, or
   * hyphens. It must start with a letter. Trailing hyphens are prohibited.
   *
   * Example: tokyo-rain-123 Read-only after creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * The unique, user-assigned ID of the Project. It must be 6 to 30 lowercase letters, digits, or
   * hyphens. It must start with a letter. Trailing hyphens are prohibited.
   *
   * Example: tokyo-rain-123 Read-only after creation.
   * @param projectId projectId or {@code null} for none
   */
  public Project setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The number uniquely identifying the project.
   *
   * Example: 415104041262 Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProjectNumber() {
    return projectNumber;
  }

  /**
   * The number uniquely identifying the project.
   *
   * Example: 415104041262 Read-only.
   * @param projectNumber projectNumber or {@code null} for none
   */
  public Project setProjectNumber(java.lang.Long projectNumber) {
    this.projectNumber = projectNumber;
    return this;
  }

  @Override
  public Project set(String fieldName, Object value) {
    return (Project) super.set(fieldName, value);
  }

  @Override
  public Project clone() {
    return (Project) super.clone();
  }

}
