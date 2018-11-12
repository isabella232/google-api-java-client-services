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
 * A Google Compute Engine disk resource specification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Disk extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. Disks created by the Pipelines API will be deleted at the end of the pipeline run,
   * regardless of what this field is set to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoDelete;

  /**
   * Required at create time and cannot be overridden at run time. Specifies the path in the docker
   * container where files on this disk should be located. For example, if `mountPoint` is
   * `/mnt/disk`, and the parameter has `localPath` `inputs/file.txt`, the docker container can
   * access the data at `/mnt/disk/inputs/file.txt`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mountPoint;

  /**
   * Required. The name of the disk that can be used in the pipeline parameters. Must be 1 - 63
   * characters. The name "boot" is reserved for system use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Specifies how a sourced-base persistent disk will be mounted. See
   * https://cloud.google.com/compute/docs/disks/persistent-disks#use_multi_instances for more
   * details. Can only be set at create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean readOnly;

  /**
   * The size of the disk. Defaults to 500 (GB). This field is not applicable for local SSD.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sizeGb;

  /**
   * The full or partial URL of the persistent disk to attach. See
   * https://cloud.google.com/compute/docs/reference/latest/instances#resource and
   * https://cloud.google.com/compute/docs/disks/persistent-disks#snapshots for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Required. The type of the disk to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Deprecated. Disks created by the Pipelines API will be deleted at the end of the pipeline run,
   * regardless of what this field is set to.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoDelete() {
    return autoDelete;
  }

  /**
   * Deprecated. Disks created by the Pipelines API will be deleted at the end of the pipeline run,
   * regardless of what this field is set to.
   * @param autoDelete autoDelete or {@code null} for none
   */
  public Disk setAutoDelete(java.lang.Boolean autoDelete) {
    this.autoDelete = autoDelete;
    return this;
  }

  /**
   * Required at create time and cannot be overridden at run time. Specifies the path in the docker
   * container where files on this disk should be located. For example, if `mountPoint` is
   * `/mnt/disk`, and the parameter has `localPath` `inputs/file.txt`, the docker container can
   * access the data at `/mnt/disk/inputs/file.txt`.
   * @return value or {@code null} for none
   */
  public java.lang.String getMountPoint() {
    return mountPoint;
  }

  /**
   * Required at create time and cannot be overridden at run time. Specifies the path in the docker
   * container where files on this disk should be located. For example, if `mountPoint` is
   * `/mnt/disk`, and the parameter has `localPath` `inputs/file.txt`, the docker container can
   * access the data at `/mnt/disk/inputs/file.txt`.
   * @param mountPoint mountPoint or {@code null} for none
   */
  public Disk setMountPoint(java.lang.String mountPoint) {
    this.mountPoint = mountPoint;
    return this;
  }

  /**
   * Required. The name of the disk that can be used in the pipeline parameters. Must be 1 - 63
   * characters. The name "boot" is reserved for system use.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the disk that can be used in the pipeline parameters. Must be 1 - 63
   * characters. The name "boot" is reserved for system use.
   * @param name name or {@code null} for none
   */
  public Disk setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies how a sourced-base persistent disk will be mounted. See
   * https://cloud.google.com/compute/docs/disks/persistent-disks#use_multi_instances for more
   * details. Can only be set at create time.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * Specifies how a sourced-base persistent disk will be mounted. See
   * https://cloud.google.com/compute/docs/disks/persistent-disks#use_multi_instances for more
   * details. Can only be set at create time.
   * @param readOnly readOnly or {@code null} for none
   */
  public Disk setReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * The size of the disk. Defaults to 500 (GB). This field is not applicable for local SSD.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSizeGb() {
    return sizeGb;
  }

  /**
   * The size of the disk. Defaults to 500 (GB). This field is not applicable for local SSD.
   * @param sizeGb sizeGb or {@code null} for none
   */
  public Disk setSizeGb(java.lang.Integer sizeGb) {
    this.sizeGb = sizeGb;
    return this;
  }

  /**
   * The full or partial URL of the persistent disk to attach. See
   * https://cloud.google.com/compute/docs/reference/latest/instances#resource and
   * https://cloud.google.com/compute/docs/disks/persistent-disks#snapshots for more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * The full or partial URL of the persistent disk to attach. See
   * https://cloud.google.com/compute/docs/reference/latest/instances#resource and
   * https://cloud.google.com/compute/docs/disks/persistent-disks#snapshots for more details.
   * @param source source or {@code null} for none
   */
  public Disk setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * Required. The type of the disk to create.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The type of the disk to create.
   * @param type type or {@code null} for none
   */
  public Disk setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Disk set(String fieldName, Object value) {
    return (Disk) super.set(fieldName, value);
  }

  @Override
  public Disk clone() {
    return (Disk) super.clone();
  }

}
