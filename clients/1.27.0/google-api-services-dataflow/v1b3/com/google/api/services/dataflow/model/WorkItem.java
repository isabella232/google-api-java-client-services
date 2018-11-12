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

package com.google.api.services.dataflow.model;

/**
 * WorkItem represents basic information about a WorkItem to be executed in the cloud.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkItem extends com.google.api.client.json.GenericJson {

  /**
   * Work item-specific configuration as an opaque blob.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configuration;

  /**
   * Identifies this WorkItem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The initial index to use when reporting the status of the WorkItem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long initialReportIndex;

  /**
   * Identifies the workflow job this WorkItem belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobId;

  /**
   * Time when the lease on this Work will expire.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String leaseExpireTime;

  /**
   * Additional information for MapTask WorkItems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MapTask mapTask;

  /**
   * Any required packages that need to be fetched in order to execute this WorkItem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataflowPackage> packages;

  /**
   * Identifies the cloud project this WorkItem belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Recommended reporting interval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String reportStatusInterval;

  /**
   * Additional information for SeqMapTask WorkItems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SeqMapTask seqMapTask;

  /**
   * Additional information for ShellTask WorkItems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShellTask shellTask;

  /**
   * Additional information for source operation WorkItems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceOperationRequest sourceOperationTask;

  /**
   * Additional information for StreamingComputationTask WorkItems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StreamingComputationTask streamingComputationTask;

  /**
   * Additional information for StreamingConfigTask WorkItems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StreamingConfigTask streamingConfigTask;

  /**
   * Additional information for StreamingSetupTask WorkItems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StreamingSetupTask streamingSetupTask;

  /**
   * Work item-specific configuration as an opaque blob.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfiguration() {
    return configuration;
  }

  /**
   * Work item-specific configuration as an opaque blob.
   * @param configuration configuration or {@code null} for none
   */
  public WorkItem setConfiguration(java.lang.String configuration) {
    this.configuration = configuration;
    return this;
  }

  /**
   * Identifies this WorkItem.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Identifies this WorkItem.
   * @param id id or {@code null} for none
   */
  public WorkItem setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * The initial index to use when reporting the status of the WorkItem.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInitialReportIndex() {
    return initialReportIndex;
  }

  /**
   * The initial index to use when reporting the status of the WorkItem.
   * @param initialReportIndex initialReportIndex or {@code null} for none
   */
  public WorkItem setInitialReportIndex(java.lang.Long initialReportIndex) {
    this.initialReportIndex = initialReportIndex;
    return this;
  }

  /**
   * Identifies the workflow job this WorkItem belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobId() {
    return jobId;
  }

  /**
   * Identifies the workflow job this WorkItem belongs to.
   * @param jobId jobId or {@code null} for none
   */
  public WorkItem setJobId(java.lang.String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Time when the lease on this Work will expire.
   * @return value or {@code null} for none
   */
  public String getLeaseExpireTime() {
    return leaseExpireTime;
  }

  /**
   * Time when the lease on this Work will expire.
   * @param leaseExpireTime leaseExpireTime or {@code null} for none
   */
  public WorkItem setLeaseExpireTime(String leaseExpireTime) {
    this.leaseExpireTime = leaseExpireTime;
    return this;
  }

  /**
   * Additional information for MapTask WorkItems.
   * @return value or {@code null} for none
   */
  public MapTask getMapTask() {
    return mapTask;
  }

  /**
   * Additional information for MapTask WorkItems.
   * @param mapTask mapTask or {@code null} for none
   */
  public WorkItem setMapTask(MapTask mapTask) {
    this.mapTask = mapTask;
    return this;
  }

  /**
   * Any required packages that need to be fetched in order to execute this WorkItem.
   * @return value or {@code null} for none
   */
  public java.util.List<DataflowPackage> getPackages() {
    return packages;
  }

  /**
   * Any required packages that need to be fetched in order to execute this WorkItem.
   * @param packages packages or {@code null} for none
   */
  public WorkItem setPackages(java.util.List<DataflowPackage> packages) {
    this.packages = packages;
    return this;
  }

  /**
   * Identifies the cloud project this WorkItem belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Identifies the cloud project this WorkItem belongs to.
   * @param projectId projectId or {@code null} for none
   */
  public WorkItem setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Recommended reporting interval.
   * @return value or {@code null} for none
   */
  public String getReportStatusInterval() {
    return reportStatusInterval;
  }

  /**
   * Recommended reporting interval.
   * @param reportStatusInterval reportStatusInterval or {@code null} for none
   */
  public WorkItem setReportStatusInterval(String reportStatusInterval) {
    this.reportStatusInterval = reportStatusInterval;
    return this;
  }

  /**
   * Additional information for SeqMapTask WorkItems.
   * @return value or {@code null} for none
   */
  public SeqMapTask getSeqMapTask() {
    return seqMapTask;
  }

  /**
   * Additional information for SeqMapTask WorkItems.
   * @param seqMapTask seqMapTask or {@code null} for none
   */
  public WorkItem setSeqMapTask(SeqMapTask seqMapTask) {
    this.seqMapTask = seqMapTask;
    return this;
  }

  /**
   * Additional information for ShellTask WorkItems.
   * @return value or {@code null} for none
   */
  public ShellTask getShellTask() {
    return shellTask;
  }

  /**
   * Additional information for ShellTask WorkItems.
   * @param shellTask shellTask or {@code null} for none
   */
  public WorkItem setShellTask(ShellTask shellTask) {
    this.shellTask = shellTask;
    return this;
  }

  /**
   * Additional information for source operation WorkItems.
   * @return value or {@code null} for none
   */
  public SourceOperationRequest getSourceOperationTask() {
    return sourceOperationTask;
  }

  /**
   * Additional information for source operation WorkItems.
   * @param sourceOperationTask sourceOperationTask or {@code null} for none
   */
  public WorkItem setSourceOperationTask(SourceOperationRequest sourceOperationTask) {
    this.sourceOperationTask = sourceOperationTask;
    return this;
  }

  /**
   * Additional information for StreamingComputationTask WorkItems.
   * @return value or {@code null} for none
   */
  public StreamingComputationTask getStreamingComputationTask() {
    return streamingComputationTask;
  }

  /**
   * Additional information for StreamingComputationTask WorkItems.
   * @param streamingComputationTask streamingComputationTask or {@code null} for none
   */
  public WorkItem setStreamingComputationTask(StreamingComputationTask streamingComputationTask) {
    this.streamingComputationTask = streamingComputationTask;
    return this;
  }

  /**
   * Additional information for StreamingConfigTask WorkItems.
   * @return value or {@code null} for none
   */
  public StreamingConfigTask getStreamingConfigTask() {
    return streamingConfigTask;
  }

  /**
   * Additional information for StreamingConfigTask WorkItems.
   * @param streamingConfigTask streamingConfigTask or {@code null} for none
   */
  public WorkItem setStreamingConfigTask(StreamingConfigTask streamingConfigTask) {
    this.streamingConfigTask = streamingConfigTask;
    return this;
  }

  /**
   * Additional information for StreamingSetupTask WorkItems.
   * @return value or {@code null} for none
   */
  public StreamingSetupTask getStreamingSetupTask() {
    return streamingSetupTask;
  }

  /**
   * Additional information for StreamingSetupTask WorkItems.
   * @param streamingSetupTask streamingSetupTask or {@code null} for none
   */
  public WorkItem setStreamingSetupTask(StreamingSetupTask streamingSetupTask) {
    this.streamingSetupTask = streamingSetupTask;
    return this;
  }

  @Override
  public WorkItem set(String fieldName, Object value) {
    return (WorkItem) super.set(fieldName, value);
  }

  @Override
  public WorkItem clone() {
    return (WorkItem) super.clone();
  }

}
