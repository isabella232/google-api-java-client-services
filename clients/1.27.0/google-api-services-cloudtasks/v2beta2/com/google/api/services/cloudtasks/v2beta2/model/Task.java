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

package com.google.api.services.cloudtasks.v2beta2.model;

/**
 * A unit of scheduled work.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Task extends com.google.api.client.json.GenericJson {

  /**
   * App Engine HTTP request that is sent to the task's target. Can be set only if
   * app_engine_http_target is set on the queue.
   *
   * An App Engine task is a task that has AppEngineHttpRequest set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppEngineHttpRequest appEngineHttpRequest;

  /**
   * Output only. The time that the task was created.
   *
   * `create_time` will be truncated to the nearest second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optionally caller-specified in CreateTask.
   *
   * The task name.
   *
   * The task name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons (:), or
   * periods (.).    For more information, see    [Identifying projects](https://cloud.google.com
   * /resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the
   * canonical ID for the task's location.    The list of available locations can be obtained by
   * calling    ListLocations.    For more information, see
   * https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers
   * ([0-9]), or   hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only
   * letters ([A-Za-z]), numbers ([0-9]),   hyphens (-), or underscores (_). The maximum length is
   * 500 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * LeaseTasks to process the task. Can be set only if pull_target is set on the queue.
   *
   * A pull task is a task that has PullMessage set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PullMessage pullMessage;

  /**
   * The time when the task is scheduled to be attempted.
   *
   * For App Engine queues, this is when the task will be attempted or retried.
   *
   * For pull queues, this is the time when the task is available to be leased; if a task is
   * currently leased, this is the time when the current lease expires, that is, the time that the
   * task was leased plus the lease_duration.
   *
   * `schedule_time` will be truncated to the nearest microsecond.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduleTime;

  /**
   * Output only. The task status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TaskStatus status;

  /**
   * Output only. The view specifies which subset of the Task has been returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String view;

  /**
   * App Engine HTTP request that is sent to the task's target. Can be set only if
   * app_engine_http_target is set on the queue.
   *
   * An App Engine task is a task that has AppEngineHttpRequest set.
   * @return value or {@code null} for none
   */
  public AppEngineHttpRequest getAppEngineHttpRequest() {
    return appEngineHttpRequest;
  }

  /**
   * App Engine HTTP request that is sent to the task's target. Can be set only if
   * app_engine_http_target is set on the queue.
   *
   * An App Engine task is a task that has AppEngineHttpRequest set.
   * @param appEngineHttpRequest appEngineHttpRequest or {@code null} for none
   */
  public Task setAppEngineHttpRequest(AppEngineHttpRequest appEngineHttpRequest) {
    this.appEngineHttpRequest = appEngineHttpRequest;
    return this;
  }

  /**
   * Output only. The time that the task was created.
   *
   * `create_time` will be truncated to the nearest second.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time that the task was created.
   *
   * `create_time` will be truncated to the nearest second.
   * @param createTime createTime or {@code null} for none
   */
  public Task setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optionally caller-specified in CreateTask.
   *
   * The task name.
   *
   * The task name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons (:), or
   * periods (.).    For more information, see    [Identifying projects](https://cloud.google.com
   * /resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the
   * canonical ID for the task's location.    The list of available locations can be obtained by
   * calling    ListLocations.    For more information, see
   * https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers
   * ([0-9]), or   hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only
   * letters ([A-Za-z]), numbers ([0-9]),   hyphens (-), or underscores (_). The maximum length is
   * 500 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optionally caller-specified in CreateTask.
   *
   * The task name.
   *
   * The task name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons (:), or
   * periods (.).    For more information, see    [Identifying projects](https://cloud.google.com
   * /resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the
   * canonical ID for the task's location.    The list of available locations can be obtained by
   * calling    ListLocations.    For more information, see
   * https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers
   * ([0-9]), or   hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only
   * letters ([A-Za-z]), numbers ([0-9]),   hyphens (-), or underscores (_). The maximum length is
   * 500 characters.
   * @param name name or {@code null} for none
   */
  public Task setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * LeaseTasks to process the task. Can be set only if pull_target is set on the queue.
   *
   * A pull task is a task that has PullMessage set.
   * @return value or {@code null} for none
   */
  public PullMessage getPullMessage() {
    return pullMessage;
  }

  /**
   * LeaseTasks to process the task. Can be set only if pull_target is set on the queue.
   *
   * A pull task is a task that has PullMessage set.
   * @param pullMessage pullMessage or {@code null} for none
   */
  public Task setPullMessage(PullMessage pullMessage) {
    this.pullMessage = pullMessage;
    return this;
  }

  /**
   * The time when the task is scheduled to be attempted.
   *
   * For App Engine queues, this is when the task will be attempted or retried.
   *
   * For pull queues, this is the time when the task is available to be leased; if a task is
   * currently leased, this is the time when the current lease expires, that is, the time that the
   * task was leased plus the lease_duration.
   *
   * `schedule_time` will be truncated to the nearest microsecond.
   * @return value or {@code null} for none
   */
  public String getScheduleTime() {
    return scheduleTime;
  }

  /**
   * The time when the task is scheduled to be attempted.
   *
   * For App Engine queues, this is when the task will be attempted or retried.
   *
   * For pull queues, this is the time when the task is available to be leased; if a task is
   * currently leased, this is the time when the current lease expires, that is, the time that the
   * task was leased plus the lease_duration.
   *
   * `schedule_time` will be truncated to the nearest microsecond.
   * @param scheduleTime scheduleTime or {@code null} for none
   */
  public Task setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  /**
   * Output only. The task status.
   * @return value or {@code null} for none
   */
  public TaskStatus getStatus() {
    return status;
  }

  /**
   * Output only. The task status.
   * @param status status or {@code null} for none
   */
  public Task setStatus(TaskStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Output only. The view specifies which subset of the Task has been returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getView() {
    return view;
  }

  /**
   * Output only. The view specifies which subset of the Task has been returned.
   * @param view view or {@code null} for none
   */
  public Task setView(java.lang.String view) {
    this.view = view;
    return this;
  }

  @Override
  public Task set(String fieldName, Object value) {
    return (Task) super.set(fieldName, value);
  }

  @Override
  public Task clone() {
    return (Task) super.clone();
  }

}
