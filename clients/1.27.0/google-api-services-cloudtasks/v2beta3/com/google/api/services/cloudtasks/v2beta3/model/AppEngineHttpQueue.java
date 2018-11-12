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

package com.google.api.services.cloudtasks.v2beta3.model;

/**
 * App Engine HTTP queue.
 *
 * The task will be delivered to the App Engine application hostname specified by its
 * AppEngineHttpQueue and AppEngineHttpRequest. The documentation for AppEngineHttpRequest explains
 * how the task's host URL is constructed.
 *
 * Using AppEngineHttpQueue requires
 * [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control)
 * Google IAM permission for the project and the following scope:
 *
 * `https://www.googleapis.com/auth/cloud-platform`
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppEngineHttpQueue extends com.google.api.client.json.GenericJson {

  /**
   * Overrides for the task-level app_engine_routing.
   *
   * If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the
   * setting is for the task-level app_engine_routing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppEngineRouting appEngineRoutingOverride;

  /**
   * Overrides for the task-level app_engine_routing.
   *
   * If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the
   * setting is for the task-level app_engine_routing.
   * @return value or {@code null} for none
   */
  public AppEngineRouting getAppEngineRoutingOverride() {
    return appEngineRoutingOverride;
  }

  /**
   * Overrides for the task-level app_engine_routing.
   *
   * If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the
   * setting is for the task-level app_engine_routing.
   * @param appEngineRoutingOverride appEngineRoutingOverride or {@code null} for none
   */
  public AppEngineHttpQueue setAppEngineRoutingOverride(AppEngineRouting appEngineRoutingOverride) {
    this.appEngineRoutingOverride = appEngineRoutingOverride;
    return this;
  }

  @Override
  public AppEngineHttpQueue set(String fieldName, Object value) {
    return (AppEngineHttpQueue) super.set(fieldName, value);
  }

  @Override
  public AppEngineHttpQueue clone() {
    return (AppEngineHttpQueue) super.clone();
  }

}
