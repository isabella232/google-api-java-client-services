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

package com.google.api.services.appengine.model;

/**
 * Code and application artifacts used to deploy a version to App Engine.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Deployment extends com.google.api.client.json.GenericJson {

  /**
   * The Docker image for the container that runs the version. Only applicable for instances running
   * in the App Engine flexible environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContainerInfo container;

  /**
   * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
   * All files must be readable using the credentials supplied with this call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, FileInfo> files;

  static {
    // hack to force ProGuard to consider FileInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FileInfo.class);
  }

  /**
   * Origin of the source code for this deployment. There can be more than one source reference per
   * version if source code is distributed among multiple repositories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SourceReference> sourceReferences;

  /**
   * The Docker image for the container that runs the version. Only applicable for instances running
   * in the App Engine flexible environment.
   * @return value or {@code null} for none
   */
  public ContainerInfo getContainer() {
    return container;
  }

  /**
   * The Docker image for the container that runs the version. Only applicable for instances running
   * in the App Engine flexible environment.
   * @param container container or {@code null} for none
   */
  public Deployment setContainer(ContainerInfo container) {
    this.container = container;
    return this;
  }

  /**
   * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
   * All files must be readable using the credentials supplied with this call.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, FileInfo> getFiles() {
    return files;
  }

  /**
   * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
   * All files must be readable using the credentials supplied with this call.
   * @param files files or {@code null} for none
   */
  public Deployment setFiles(java.util.Map<String, FileInfo> files) {
    this.files = files;
    return this;
  }

  /**
   * Origin of the source code for this deployment. There can be more than one source reference per
   * version if source code is distributed among multiple repositories.
   * @return value or {@code null} for none
   */
  public java.util.List<SourceReference> getSourceReferences() {
    return sourceReferences;
  }

  /**
   * Origin of the source code for this deployment. There can be more than one source reference per
   * version if source code is distributed among multiple repositories.
   * @param sourceReferences sourceReferences or {@code null} for none
   */
  public Deployment setSourceReferences(java.util.List<SourceReference> sourceReferences) {
    this.sourceReferences = sourceReferences;
    return this;
  }

  @Override
  public Deployment set(String fieldName, Object value) {
    return (Deployment) super.set(fieldName, value);
  }

  @Override
  public Deployment clone() {
    return (Deployment) super.clone();
  }

}
