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

package com.google.api.services.replicapoolupdater.model;

/**
 * The following represents a resource describing a single update (rollout) of a group of instances
 * to the given template.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Compute Engine Instance Group Updater API. For
 * a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RollingUpdate extends com.google.api.client.json.GenericJson {

  /**
   * Specifies the action to take for each instance within the instance group. This can be RECREATE
   * which will recreate each instance and is only available for managed instance groups. It can
   * also be REBOOT which performs a soft reboot for each instance and is only available for regular
   * (non-managed) instance groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actionType;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] Errors that occurred during the rolling update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Error error;

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Fully-qualified URL of an instance group being updated. Exactly one of instanceGroupManager and
   * instanceGroup must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceGroup;

  /**
   * Fully-qualified URL of an instance group manager being updated. Exactly one of
   * instanceGroupManager and instanceGroup must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceGroupManager;

  /**
   * Fully-qualified URL of an instance template to apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceTemplate;

  /**
   * [Output Only] Type of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Fully-qualified URL of the instance template encountered while starting the update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oldInstanceTemplate;

  /**
   * Parameters of the update process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Policy policy;

  /**
   * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement
   * that this be linear or support any granularity of operations. This should not be used to guess
   * at when the update will be complete. This number should be monotonically increasing as the
   * update progresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer progress;

  /**
   * [Output Only] The fully qualified URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Status of the update. Possible values are: - "ROLLING_FORWARD": The update is
   * going forward.  - "ROLLING_BACK": The update is being rolled back.  - "PAUSED": The update is
   * temporarily paused (inactive).  - "ROLLED_OUT": The update is finished, all instances have been
   * updated successfully.  - "ROLLED_BACK": The update is finished, all instances have been
   * reverted to the previous template.  - "CANCELLED": The update is paused and no longer can be
   * resumed, undefined how many instances are running in which template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] An optional textual description of the current status of the update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * [Output Only] User who requested the update, for example: user@example.com.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String user;

  /**
   * Specifies the action to take for each instance within the instance group. This can be RECREATE
   * which will recreate each instance and is only available for managed instance groups. It can
   * also be REBOOT which performs a soft reboot for each instance and is only available for regular
   * (non-managed) instance groups.
   * @return value or {@code null} for none
   */
  public java.lang.String getActionType() {
    return actionType;
  }

  /**
   * Specifies the action to take for each instance within the instance group. This can be RECREATE
   * which will recreate each instance and is only available for managed instance groups. It can
   * also be REBOOT which performs a soft reboot for each instance and is only available for regular
   * (non-managed) instance groups.
   * @param actionType actionType or {@code null} for none
   */
  public RollingUpdate setActionType(java.lang.String actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public RollingUpdate setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * @param description description or {@code null} for none
   */
  public RollingUpdate setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] Errors that occurred during the rolling update.
   * @return value or {@code null} for none
   */
  public Error getError() {
    return error;
  }

  /**
   * [Output Only] Errors that occurred during the rolling update.
   * @param error error or {@code null} for none
   */
  public RollingUpdate setError(Error error) {
    this.error = error;
    return this;
  }

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * @param id id or {@code null} for none
   */
  public RollingUpdate setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Fully-qualified URL of an instance group being updated. Exactly one of instanceGroupManager and
   * instanceGroup must be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceGroup() {
    return instanceGroup;
  }

  /**
   * Fully-qualified URL of an instance group being updated. Exactly one of instanceGroupManager and
   * instanceGroup must be set.
   * @param instanceGroup instanceGroup or {@code null} for none
   */
  public RollingUpdate setInstanceGroup(java.lang.String instanceGroup) {
    this.instanceGroup = instanceGroup;
    return this;
  }

  /**
   * Fully-qualified URL of an instance group manager being updated. Exactly one of
   * instanceGroupManager and instanceGroup must be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceGroupManager() {
    return instanceGroupManager;
  }

  /**
   * Fully-qualified URL of an instance group manager being updated. Exactly one of
   * instanceGroupManager and instanceGroup must be set.
   * @param instanceGroupManager instanceGroupManager or {@code null} for none
   */
  public RollingUpdate setInstanceGroupManager(java.lang.String instanceGroupManager) {
    this.instanceGroupManager = instanceGroupManager;
    return this;
  }

  /**
   * Fully-qualified URL of an instance template to apply.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceTemplate() {
    return instanceTemplate;
  }

  /**
   * Fully-qualified URL of an instance template to apply.
   * @param instanceTemplate instanceTemplate or {@code null} for none
   */
  public RollingUpdate setInstanceTemplate(java.lang.String instanceTemplate) {
    this.instanceTemplate = instanceTemplate;
    return this;
  }

  /**
   * [Output Only] Type of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource.
   * @param kind kind or {@code null} for none
   */
  public RollingUpdate setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Fully-qualified URL of the instance template encountered while starting the update.
   * @return value or {@code null} for none
   */
  public java.lang.String getOldInstanceTemplate() {
    return oldInstanceTemplate;
  }

  /**
   * Fully-qualified URL of the instance template encountered while starting the update.
   * @param oldInstanceTemplate oldInstanceTemplate or {@code null} for none
   */
  public RollingUpdate setOldInstanceTemplate(java.lang.String oldInstanceTemplate) {
    this.oldInstanceTemplate = oldInstanceTemplate;
    return this;
  }

  /**
   * Parameters of the update process.
   * @return value or {@code null} for none
   */
  public Policy getPolicy() {
    return policy;
  }

  /**
   * Parameters of the update process.
   * @param policy policy or {@code null} for none
   */
  public RollingUpdate setPolicy(Policy policy) {
    this.policy = policy;
    return this;
  }

  /**
   * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement
   * that this be linear or support any granularity of operations. This should not be used to guess
   * at when the update will be complete. This number should be monotonically increasing as the
   * update progresses.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProgress() {
    return progress;
  }

  /**
   * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement
   * that this be linear or support any granularity of operations. This should not be used to guess
   * at when the update will be complete. This number should be monotonically increasing as the
   * update progresses.
   * @param progress progress or {@code null} for none
   */
  public RollingUpdate setProgress(java.lang.Integer progress) {
    this.progress = progress;
    return this;
  }

  /**
   * [Output Only] The fully qualified URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] The fully qualified URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public RollingUpdate setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Status of the update. Possible values are: - "ROLLING_FORWARD": The update is
   * going forward.  - "ROLLING_BACK": The update is being rolled back.  - "PAUSED": The update is
   * temporarily paused (inactive).  - "ROLLED_OUT": The update is finished, all instances have been
   * updated successfully.  - "ROLLED_BACK": The update is finished, all instances have been
   * reverted to the previous template.  - "CANCELLED": The update is paused and no longer can be
   * resumed, undefined how many instances are running in which template.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] Status of the update. Possible values are: - "ROLLING_FORWARD": The update is
   * going forward.  - "ROLLING_BACK": The update is being rolled back.  - "PAUSED": The update is
   * temporarily paused (inactive).  - "ROLLED_OUT": The update is finished, all instances have been
   * updated successfully.  - "ROLLED_BACK": The update is finished, all instances have been
   * reverted to the previous template.  - "CANCELLED": The update is paused and no longer can be
   * resumed, undefined how many instances are running in which template.
   * @param status status or {@code null} for none
   */
  public RollingUpdate setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] An optional textual description of the current status of the update.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * [Output Only] An optional textual description of the current status of the update.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public RollingUpdate setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * [Output Only] User who requested the update, for example: user@example.com.
   * @return value or {@code null} for none
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * [Output Only] User who requested the update, for example: user@example.com.
   * @param user user or {@code null} for none
   */
  public RollingUpdate setUser(java.lang.String user) {
    this.user = user;
    return this;
  }

  @Override
  public RollingUpdate set(String fieldName, Object value) {
    return (RollingUpdate) super.set(fieldName, value);
  }

  @Override
  public RollingUpdate clone() {
    return (RollingUpdate) super.clone();
  }

  /**
   * [Output Only] Errors that occurred during the rolling update.
   */
  public static final class Error extends com.google.api.client.json.GenericJson {

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Errors> errors;

    static {
      // hack to force ProGuard to consider Errors used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Errors.class);
    }

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * @return value or {@code null} for none
     */
    public java.util.List<Errors> getErrors() {
      return errors;
    }

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * @param errors errors or {@code null} for none
     */
    public Error setErrors(java.util.List<Errors> errors) {
      this.errors = errors;
      return this;
    }

    @Override
    public Error set(String fieldName, Object value) {
      return (Error) super.set(fieldName, value);
    }

    @Override
    public Error clone() {
      return (Error) super.clone();
    }

    /**
     * Model definition for RollingUpdateErrorErrors.
     */
    public static final class Errors extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] The error type identifier for this error.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String code;

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String location;

      /**
       * [Output Only] An optional, human-readable error message.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String message;

      /**
       * [Output Only] The error type identifier for this error.
       * @return value or {@code null} for none
       */
      public java.lang.String getCode() {
        return code;
      }

      /**
       * [Output Only] The error type identifier for this error.
       * @param code code or {@code null} for none
       */
      public Errors setCode(java.lang.String code) {
        this.code = code;
        return this;
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * @return value or {@code null} for none
       */
      public java.lang.String getLocation() {
        return location;
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * @param location location or {@code null} for none
       */
      public Errors setLocation(java.lang.String location) {
        this.location = location;
        return this;
      }

      /**
       * [Output Only] An optional, human-readable error message.
       * @return value or {@code null} for none
       */
      public java.lang.String getMessage() {
        return message;
      }

      /**
       * [Output Only] An optional, human-readable error message.
       * @param message message or {@code null} for none
       */
      public Errors setMessage(java.lang.String message) {
        this.message = message;
        return this;
      }

      @Override
      public Errors set(String fieldName, Object value) {
        return (Errors) super.set(fieldName, value);
      }

      @Override
      public Errors clone() {
        return (Errors) super.clone();
      }

    }
  }

  /**
   * Parameters of the update process.
   */
  public static final class Policy extends com.google.api.client.json.GenericJson {

    /**
     * Number of instances to update before the updater pauses the rolling update.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer autoPauseAfterInstances;

    /**
     * The maximum amount of time that the updater waits for a HEALTHY state after all of the update
     * steps are complete. If the HEALTHY state is not received before the deadline, the instance
     * update is considered a failure.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer instanceStartupTimeoutSec;

    /**
     * The maximum number of instances that can be updated simultaneously. An instance update is
     * considered complete only after the instance is restarted and initialized.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer maxNumConcurrentInstances;

    /**
     * The maximum number of instance updates that can fail before the group update is considered a
     * failure. An instance update is considered failed if any of its update actions (e.g. Stop call
     * on Instance resource in Rolling Reboot) failed with permanent failure, or if the instance is in
     * an UNHEALTHY state after it finishes all of the update actions.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer maxNumFailedInstances;

    /**
     * The minimum amount of time that the updater spends to update each instance. Update time is the
     * time it takes to complete all update actions (e.g. Stop call on Instance resource in Rolling
     * Reboot), reboot, and initialize. If the instance update finishes early, the updater pauses for
     * the remainder of the time before it starts the next instance update.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer minInstanceUpdateTimeSec;

    /**
     * Number of instances to update before the updater pauses the rolling update.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getAutoPauseAfterInstances() {
      return autoPauseAfterInstances;
    }

    /**
     * Number of instances to update before the updater pauses the rolling update.
     * @param autoPauseAfterInstances autoPauseAfterInstances or {@code null} for none
     */
    public Policy setAutoPauseAfterInstances(java.lang.Integer autoPauseAfterInstances) {
      this.autoPauseAfterInstances = autoPauseAfterInstances;
      return this;
    }

    /**
     * The maximum amount of time that the updater waits for a HEALTHY state after all of the update
     * steps are complete. If the HEALTHY state is not received before the deadline, the instance
     * update is considered a failure.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getInstanceStartupTimeoutSec() {
      return instanceStartupTimeoutSec;
    }

    /**
     * The maximum amount of time that the updater waits for a HEALTHY state after all of the update
     * steps are complete. If the HEALTHY state is not received before the deadline, the instance
     * update is considered a failure.
     * @param instanceStartupTimeoutSec instanceStartupTimeoutSec or {@code null} for none
     */
    public Policy setInstanceStartupTimeoutSec(java.lang.Integer instanceStartupTimeoutSec) {
      this.instanceStartupTimeoutSec = instanceStartupTimeoutSec;
      return this;
    }

    /**
     * The maximum number of instances that can be updated simultaneously. An instance update is
     * considered complete only after the instance is restarted and initialized.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getMaxNumConcurrentInstances() {
      return maxNumConcurrentInstances;
    }

    /**
     * The maximum number of instances that can be updated simultaneously. An instance update is
     * considered complete only after the instance is restarted and initialized.
     * @param maxNumConcurrentInstances maxNumConcurrentInstances or {@code null} for none
     */
    public Policy setMaxNumConcurrentInstances(java.lang.Integer maxNumConcurrentInstances) {
      this.maxNumConcurrentInstances = maxNumConcurrentInstances;
      return this;
    }

    /**
     * The maximum number of instance updates that can fail before the group update is considered a
     * failure. An instance update is considered failed if any of its update actions (e.g. Stop call
     * on Instance resource in Rolling Reboot) failed with permanent failure, or if the instance is in
     * an UNHEALTHY state after it finishes all of the update actions.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getMaxNumFailedInstances() {
      return maxNumFailedInstances;
    }

    /**
     * The maximum number of instance updates that can fail before the group update is considered a
     * failure. An instance update is considered failed if any of its update actions (e.g. Stop call
     * on Instance resource in Rolling Reboot) failed with permanent failure, or if the instance is in
     * an UNHEALTHY state after it finishes all of the update actions.
     * @param maxNumFailedInstances maxNumFailedInstances or {@code null} for none
     */
    public Policy setMaxNumFailedInstances(java.lang.Integer maxNumFailedInstances) {
      this.maxNumFailedInstances = maxNumFailedInstances;
      return this;
    }

    /**
     * The minimum amount of time that the updater spends to update each instance. Update time is the
     * time it takes to complete all update actions (e.g. Stop call on Instance resource in Rolling
     * Reboot), reboot, and initialize. If the instance update finishes early, the updater pauses for
     * the remainder of the time before it starts the next instance update.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getMinInstanceUpdateTimeSec() {
      return minInstanceUpdateTimeSec;
    }

    /**
     * The minimum amount of time that the updater spends to update each instance. Update time is the
     * time it takes to complete all update actions (e.g. Stop call on Instance resource in Rolling
     * Reboot), reboot, and initialize. If the instance update finishes early, the updater pauses for
     * the remainder of the time before it starts the next instance update.
     * @param minInstanceUpdateTimeSec minInstanceUpdateTimeSec or {@code null} for none
     */
    public Policy setMinInstanceUpdateTimeSec(java.lang.Integer minInstanceUpdateTimeSec) {
      this.minInstanceUpdateTimeSec = minInstanceUpdateTimeSec;
      return this;
    }

    @Override
    public Policy set(String fieldName, Object value) {
      return (Policy) super.set(fieldName, value);
    }

    @Override
    public Policy clone() {
      return (Policy) super.clone();
    }

  }

}
