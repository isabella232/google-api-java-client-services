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
 * Model definition for Dataset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Dataset extends com.google.api.client.json.GenericJson {

  /**
   * [Optional] An array of objects that define dataset access for one or more entities. You can set
   * this property when inserting or updating a dataset in order to control who is allowed to access
   * the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the
   * following entities: access.specialGroup: projectReaders; access.role: READER;
   * access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners;
   * access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Access> access;

  static {
    // hack to force ProGuard to consider Access used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Access.class);
  }

  /**
   * [Output-only] The time when this dataset was created, in milliseconds since the epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long creationTime;

  /**
   * [Required] A reference that identifies the dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatasetReference datasetReference;

  /**
   * [Optional] The default partition expiration for all partitioned tables in the dataset, in
   * milliseconds. Once this property is set, all newly-created partitioned tables in the dataset
   * will have an expirationMs property in the timePartitioning settings set to this value, and
   * changing the value will only affect new tables, not existing ones. The storage in a partition
   * will have an expiration time of its partition time plus this value. Setting this property
   * overrides the use of defaultTableExpirationMs for partitioned tables: only one of
   * defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned
   * table. If you provide an explicit timePartitioning.expirationMs when creating or updating a
   * partitioned table, that value takes precedence over the default partition expiration time
   * indicated by this property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long defaultPartitionExpirationMs;

  /**
   * [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum
   * value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables
   * in the dataset will have an expirationTime property set to the creation time plus the value in
   * this property, and changing the value will only affect new tables, not existing ones. When the
   * expirationTime for a given table is reached, that table will be deleted automatically. If a
   * table's expirationTime is modified or removed before the table expires, or if you provide an
   * explicit expirationTime when creating a table, that value takes precedence over the default
   * expiration time indicated by this property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long defaultTableExpirationMs;

  /**
   * [Optional] A user-friendly description of the dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output-only] A hash of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * [Optional] A descriptive name for the dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String friendlyName;

  /**
   * [Output-only] The fully-qualified unique name of the dataset in the format projectId:datasetId.
   * The dataset name without the project name is given in the datasetId field. When creating a new
   * dataset, leave this field blank, and instead specify the datasetId field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * [Output-only] The resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The labels associated with this dataset. You can use these to organize and group your datasets.
   * You can set this property when inserting or updating a dataset. See Creating and Updating
   * Dataset Labels for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * [Output-only] The date when this dataset or any of its tables was last modified, in
   * milliseconds since the epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModifiedTime;

  /**
   * The geographic location where the dataset should reside. The default value is US. See details
   * at https://cloud.google.com/bigquery/docs/dataset-locations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * [Output-only] A URL that can be used to access the resource again. You can use this URL in Get
   * or Update requests to the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Optional] An array of objects that define dataset access for one or more entities. You can set
   * this property when inserting or updating a dataset in order to control who is allowed to access
   * the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the
   * following entities: access.specialGroup: projectReaders; access.role: READER;
   * access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners;
   * access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
   * @return value or {@code null} for none
   */
  public java.util.List<Access> getAccess() {
    return access;
  }

  /**
   * [Optional] An array of objects that define dataset access for one or more entities. You can set
   * this property when inserting or updating a dataset in order to control who is allowed to access
   * the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the
   * following entities: access.specialGroup: projectReaders; access.role: READER;
   * access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners;
   * access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
   * @param access access or {@code null} for none
   */
  public Dataset setAccess(java.util.List<Access> access) {
    this.access = access;
    return this;
  }

  /**
   * [Output-only] The time when this dataset was created, in milliseconds since the epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreationTime() {
    return creationTime;
  }

  /**
   * [Output-only] The time when this dataset was created, in milliseconds since the epoch.
   * @param creationTime creationTime or {@code null} for none
   */
  public Dataset setCreationTime(java.lang.Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * [Required] A reference that identifies the dataset.
   * @return value or {@code null} for none
   */
  public DatasetReference getDatasetReference() {
    return datasetReference;
  }

  /**
   * [Required] A reference that identifies the dataset.
   * @param datasetReference datasetReference or {@code null} for none
   */
  public Dataset setDatasetReference(DatasetReference datasetReference) {
    this.datasetReference = datasetReference;
    return this;
  }

  /**
   * [Optional] The default partition expiration for all partitioned tables in the dataset, in
   * milliseconds. Once this property is set, all newly-created partitioned tables in the dataset
   * will have an expirationMs property in the timePartitioning settings set to this value, and
   * changing the value will only affect new tables, not existing ones. The storage in a partition
   * will have an expiration time of its partition time plus this value. Setting this property
   * overrides the use of defaultTableExpirationMs for partitioned tables: only one of
   * defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned
   * table. If you provide an explicit timePartitioning.expirationMs when creating or updating a
   * partitioned table, that value takes precedence over the default partition expiration time
   * indicated by this property.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDefaultPartitionExpirationMs() {
    return defaultPartitionExpirationMs;
  }

  /**
   * [Optional] The default partition expiration for all partitioned tables in the dataset, in
   * milliseconds. Once this property is set, all newly-created partitioned tables in the dataset
   * will have an expirationMs property in the timePartitioning settings set to this value, and
   * changing the value will only affect new tables, not existing ones. The storage in a partition
   * will have an expiration time of its partition time plus this value. Setting this property
   * overrides the use of defaultTableExpirationMs for partitioned tables: only one of
   * defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned
   * table. If you provide an explicit timePartitioning.expirationMs when creating or updating a
   * partitioned table, that value takes precedence over the default partition expiration time
   * indicated by this property.
   * @param defaultPartitionExpirationMs defaultPartitionExpirationMs or {@code null} for none
   */
  public Dataset setDefaultPartitionExpirationMs(java.lang.Long defaultPartitionExpirationMs) {
    this.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
    return this;
  }

  /**
   * [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum
   * value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables
   * in the dataset will have an expirationTime property set to the creation time plus the value in
   * this property, and changing the value will only affect new tables, not existing ones. When the
   * expirationTime for a given table is reached, that table will be deleted automatically. If a
   * table's expirationTime is modified or removed before the table expires, or if you provide an
   * explicit expirationTime when creating a table, that value takes precedence over the default
   * expiration time indicated by this property.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDefaultTableExpirationMs() {
    return defaultTableExpirationMs;
  }

  /**
   * [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum
   * value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables
   * in the dataset will have an expirationTime property set to the creation time plus the value in
   * this property, and changing the value will only affect new tables, not existing ones. When the
   * expirationTime for a given table is reached, that table will be deleted automatically. If a
   * table's expirationTime is modified or removed before the table expires, or if you provide an
   * explicit expirationTime when creating a table, that value takes precedence over the default
   * expiration time indicated by this property.
   * @param defaultTableExpirationMs defaultTableExpirationMs or {@code null} for none
   */
  public Dataset setDefaultTableExpirationMs(java.lang.Long defaultTableExpirationMs) {
    this.defaultTableExpirationMs = defaultTableExpirationMs;
    return this;
  }

  /**
   * [Optional] A user-friendly description of the dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * [Optional] A user-friendly description of the dataset.
   * @param description description or {@code null} for none
   */
  public Dataset setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output-only] A hash of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * [Output-only] A hash of the resource.
   * @param etag etag or {@code null} for none
   */
  public Dataset setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * [Optional] A descriptive name for the dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getFriendlyName() {
    return friendlyName;
  }

  /**
   * [Optional] A descriptive name for the dataset.
   * @param friendlyName friendlyName or {@code null} for none
   */
  public Dataset setFriendlyName(java.lang.String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * [Output-only] The fully-qualified unique name of the dataset in the format projectId:datasetId.
   * The dataset name without the project name is given in the datasetId field. When creating a new
   * dataset, leave this field blank, and instead specify the datasetId field.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * [Output-only] The fully-qualified unique name of the dataset in the format projectId:datasetId.
   * The dataset name without the project name is given in the datasetId field. When creating a new
   * dataset, leave this field blank, and instead specify the datasetId field.
   * @param id id or {@code null} for none
   */
  public Dataset setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * [Output-only] The resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output-only] The resource type.
   * @param kind kind or {@code null} for none
   */
  public Dataset setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The labels associated with this dataset. You can use these to organize and group your datasets.
   * You can set this property when inserting or updating a dataset. See Creating and Updating
   * Dataset Labels for more information.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels associated with this dataset. You can use these to organize and group your datasets.
   * You can set this property when inserting or updating a dataset. See Creating and Updating
   * Dataset Labels for more information.
   * @param labels labels or {@code null} for none
   */
  public Dataset setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * [Output-only] The date when this dataset or any of its tables was last modified, in
   * milliseconds since the epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  /**
   * [Output-only] The date when this dataset or any of its tables was last modified, in
   * milliseconds since the epoch.
   * @param lastModifiedTime lastModifiedTime or {@code null} for none
   */
  public Dataset setLastModifiedTime(java.lang.Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * The geographic location where the dataset should reside. The default value is US. See details
   * at https://cloud.google.com/bigquery/docs/dataset-locations.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The geographic location where the dataset should reside. The default value is US. See details
   * at https://cloud.google.com/bigquery/docs/dataset-locations.
   * @param location location or {@code null} for none
   */
  public Dataset setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * [Output-only] A URL that can be used to access the resource again. You can use this URL in Get
   * or Update requests to the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output-only] A URL that can be used to access the resource again. You can use this URL in Get
   * or Update requests to the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Dataset setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public Dataset set(String fieldName, Object value) {
    return (Dataset) super.set(fieldName, value);
  }

  @Override
  public Dataset clone() {
    return (Dataset) super.clone();
  }

  /**
   * Model definition for DatasetAccess.
   */
  public static final class Access extends com.google.api.client.json.GenericJson {

    /**
     * [Pick one] A domain to grant access to. Any users signed in with the domain specified will be
     * granted the specified access. Example: "example.com".
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String domain;

    /**
     * [Pick one] An email address of a Google Group to grant access to.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String groupByEmail;

    /**
     * [Required] Describes the rights granted to the user specified by the other member of the access
     * object. The following string values are supported: READER, WRITER, OWNER.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String role;

    /**
     * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners
     * of the enclosing project. projectReaders: Readers of the enclosing project. projectWriters:
     * Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String specialGroup;

    /**
     * [Pick one] An email address of a user to grant access to. For example: fred@example.com.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String userByEmail;

    /**
     * [Pick one] A view from a different dataset to grant access to. Queries executed against that
     * view will have read access to tables in this dataset. The role field is not required when this
     * field is set. If that view is updated by any user, access to the view needs to be granted again
     * via an update operation.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private TableReference view;

    /**
     * [Pick one] A domain to grant access to. Any users signed in with the domain specified will be
     * granted the specified access. Example: "example.com".
     * @return value or {@code null} for none
     */
    public java.lang.String getDomain() {
      return domain;
    }

    /**
     * [Pick one] A domain to grant access to. Any users signed in with the domain specified will be
     * granted the specified access. Example: "example.com".
     * @param domain domain or {@code null} for none
     */
    public Access setDomain(java.lang.String domain) {
      this.domain = domain;
      return this;
    }

    /**
     * [Pick one] An email address of a Google Group to grant access to.
     * @return value or {@code null} for none
     */
    public java.lang.String getGroupByEmail() {
      return groupByEmail;
    }

    /**
     * [Pick one] An email address of a Google Group to grant access to.
     * @param groupByEmail groupByEmail or {@code null} for none
     */
    public Access setGroupByEmail(java.lang.String groupByEmail) {
      this.groupByEmail = groupByEmail;
      return this;
    }

    /**
     * [Required] Describes the rights granted to the user specified by the other member of the access
     * object. The following string values are supported: READER, WRITER, OWNER.
     * @return value or {@code null} for none
     */
    public java.lang.String getRole() {
      return role;
    }

    /**
     * [Required] Describes the rights granted to the user specified by the other member of the access
     * object. The following string values are supported: READER, WRITER, OWNER.
     * @param role role or {@code null} for none
     */
    public Access setRole(java.lang.String role) {
      this.role = role;
      return this;
    }

    /**
     * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners
     * of the enclosing project. projectReaders: Readers of the enclosing project. projectWriters:
     * Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users.
     * @return value or {@code null} for none
     */
    public java.lang.String getSpecialGroup() {
      return specialGroup;
    }

    /**
     * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners
     * of the enclosing project. projectReaders: Readers of the enclosing project. projectWriters:
     * Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users.
     * @param specialGroup specialGroup or {@code null} for none
     */
    public Access setSpecialGroup(java.lang.String specialGroup) {
      this.specialGroup = specialGroup;
      return this;
    }

    /**
     * [Pick one] An email address of a user to grant access to. For example: fred@example.com.
     * @return value or {@code null} for none
     */
    public java.lang.String getUserByEmail() {
      return userByEmail;
    }

    /**
     * [Pick one] An email address of a user to grant access to. For example: fred@example.com.
     * @param userByEmail userByEmail or {@code null} for none
     */
    public Access setUserByEmail(java.lang.String userByEmail) {
      this.userByEmail = userByEmail;
      return this;
    }

    /**
     * [Pick one] A view from a different dataset to grant access to. Queries executed against that
     * view will have read access to tables in this dataset. The role field is not required when this
     * field is set. If that view is updated by any user, access to the view needs to be granted again
     * via an update operation.
     * @return value or {@code null} for none
     */
    public TableReference getView() {
      return view;
    }

    /**
     * [Pick one] A view from a different dataset to grant access to. Queries executed against that
     * view will have read access to tables in this dataset. The role field is not required when this
     * field is set. If that view is updated by any user, access to the view needs to be granted again
     * via an update operation.
     * @param view view or {@code null} for none
     */
    public Access setView(TableReference view) {
      this.view = view;
      return this;
    }

    @Override
    public Access set(String fieldName, Object value) {
      return (Access) super.set(fieldName, value);
    }

    @Override
    public Access clone() {
      return (Access) super.clone();
    }

  }

}
