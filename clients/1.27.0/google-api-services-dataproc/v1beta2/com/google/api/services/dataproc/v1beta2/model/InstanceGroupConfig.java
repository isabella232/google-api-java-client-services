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

package com.google.api.services.dataproc.v1beta2.model;

/**
 * Optional. The config settings for Compute Engine resources in an instance group, such as a master
 * or worker group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceGroupConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The Compute Engine accelerator configuration for these instances.Beta Feature: This
   * feature is still under development. It may be changed before final release.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AcceleratorConfig> accelerators;

  /**
   * Optional. Disk option config settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DiskConfig diskConfig;

  /**
   * Optional. The Compute Engine image resource used for cluster instances. It can be specified or
   * may be inferred from SoftwareConfig.image_version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUri;

  /**
   * Output only. The list of instance names. Cloud Dataproc derives the names from cluster_name,
   * num_instances, and the instance group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> instanceNames;

  /**
   * Optional. Specifies that this instance group contains preemptible instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPreemptible;

  /**
   * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI,
   * or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Cloud
   * Dataproc Auto Zone Placement feature, you must use the short name of the machine type resource,
   * for example, n1-standard-2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineTypeUri;

  /**
   * Output only. The config for Compute Engine Instance Group Manager that manages this group. This
   * is only used for preemptible instance groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedGroupConfig managedGroupConfig;

  /**
   * Optional. Specifies the minimum cpu platform for the Instance Group. See Cloud DataprocMinimum
   * CPU Platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minCpuPlatform;

  /**
   * Optional. The number of VM instances in the instance group. For master instance groups, must be
   * set to 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numInstances;

  /**
   * Optional. The Compute Engine accelerator configuration for these instances.Beta Feature: This
   * feature is still under development. It may be changed before final release.
   * @return value or {@code null} for none
   */
  public java.util.List<AcceleratorConfig> getAccelerators() {
    return accelerators;
  }

  /**
   * Optional. The Compute Engine accelerator configuration for these instances.Beta Feature: This
   * feature is still under development. It may be changed before final release.
   * @param accelerators accelerators or {@code null} for none
   */
  public InstanceGroupConfig setAccelerators(java.util.List<AcceleratorConfig> accelerators) {
    this.accelerators = accelerators;
    return this;
  }

  /**
   * Optional. Disk option config settings.
   * @return value or {@code null} for none
   */
  public DiskConfig getDiskConfig() {
    return diskConfig;
  }

  /**
   * Optional. Disk option config settings.
   * @param diskConfig diskConfig or {@code null} for none
   */
  public InstanceGroupConfig setDiskConfig(DiskConfig diskConfig) {
    this.diskConfig = diskConfig;
    return this;
  }

  /**
   * Optional. The Compute Engine image resource used for cluster instances. It can be specified or
   * may be inferred from SoftwareConfig.image_version.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUri() {
    return imageUri;
  }

  /**
   * Optional. The Compute Engine image resource used for cluster instances. It can be specified or
   * may be inferred from SoftwareConfig.image_version.
   * @param imageUri imageUri or {@code null} for none
   */
  public InstanceGroupConfig setImageUri(java.lang.String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  /**
   * Output only. The list of instance names. Cloud Dataproc derives the names from cluster_name,
   * num_instances, and the instance group.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInstanceNames() {
    return instanceNames;
  }

  /**
   * Output only. The list of instance names. Cloud Dataproc derives the names from cluster_name,
   * num_instances, and the instance group.
   * @param instanceNames instanceNames or {@code null} for none
   */
  public InstanceGroupConfig setInstanceNames(java.util.List<java.lang.String> instanceNames) {
    this.instanceNames = instanceNames;
    return this;
  }

  /**
   * Optional. Specifies that this instance group contains preemptible instances.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPreemptible() {
    return isPreemptible;
  }

  /**
   * Optional. Specifies that this instance group contains preemptible instances.
   * @param isPreemptible isPreemptible or {@code null} for none
   */
  public InstanceGroupConfig setIsPreemptible(java.lang.Boolean isPreemptible) {
    this.isPreemptible = isPreemptible;
    return this;
  }

  /**
   * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI,
   * or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Cloud
   * Dataproc Auto Zone Placement feature, you must use the short name of the machine type resource,
   * for example, n1-standard-2.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineTypeUri() {
    return machineTypeUri;
  }

  /**
   * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI,
   * or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Cloud
   * Dataproc Auto Zone Placement feature, you must use the short name of the machine type resource,
   * for example, n1-standard-2.
   * @param machineTypeUri machineTypeUri or {@code null} for none
   */
  public InstanceGroupConfig setMachineTypeUri(java.lang.String machineTypeUri) {
    this.machineTypeUri = machineTypeUri;
    return this;
  }

  /**
   * Output only. The config for Compute Engine Instance Group Manager that manages this group. This
   * is only used for preemptible instance groups.
   * @return value or {@code null} for none
   */
  public ManagedGroupConfig getManagedGroupConfig() {
    return managedGroupConfig;
  }

  /**
   * Output only. The config for Compute Engine Instance Group Manager that manages this group. This
   * is only used for preemptible instance groups.
   * @param managedGroupConfig managedGroupConfig or {@code null} for none
   */
  public InstanceGroupConfig setManagedGroupConfig(ManagedGroupConfig managedGroupConfig) {
    this.managedGroupConfig = managedGroupConfig;
    return this;
  }

  /**
   * Optional. Specifies the minimum cpu platform for the Instance Group. See Cloud DataprocMinimum
   * CPU Platform.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinCpuPlatform() {
    return minCpuPlatform;
  }

  /**
   * Optional. Specifies the minimum cpu platform for the Instance Group. See Cloud DataprocMinimum
   * CPU Platform.
   * @param minCpuPlatform minCpuPlatform or {@code null} for none
   */
  public InstanceGroupConfig setMinCpuPlatform(java.lang.String minCpuPlatform) {
    this.minCpuPlatform = minCpuPlatform;
    return this;
  }

  /**
   * Optional. The number of VM instances in the instance group. For master instance groups, must be
   * set to 1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumInstances() {
    return numInstances;
  }

  /**
   * Optional. The number of VM instances in the instance group. For master instance groups, must be
   * set to 1.
   * @param numInstances numInstances or {@code null} for none
   */
  public InstanceGroupConfig setNumInstances(java.lang.Integer numInstances) {
    this.numInstances = numInstances;
    return this;
  }

  @Override
  public InstanceGroupConfig set(String fieldName, Object value) {
    return (InstanceGroupConfig) super.set(fieldName, value);
  }

  @Override
  public InstanceGroupConfig clone() {
    return (InstanceGroupConfig) super.clone();
  }

}
