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

package com.google.api.services.servicemanagement.model;

/**
 * Generic specification of a source configuration file
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigFile extends com.google.api.client.json.GenericJson {

  /**
   * The bytes that constitute the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileContents;

  /**
   * The file name of the configuration file (full or relative path).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filePath;

  /**
   * The type of configuration file this represents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileType;

  /**
   * The bytes that constitute the file.
   * @see #decodeFileContents()
   * @return value or {@code null} for none
   */
  public java.lang.String getFileContents() {
    return fileContents;
  }

  /**
   * The bytes that constitute the file.
   * @see #getFileContents()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFileContents() {
    return com.google.api.client.util.Base64.decodeBase64(fileContents);
  }

  /**
   * The bytes that constitute the file.
   * @see #encodeFileContents()
   * @param fileContents fileContents or {@code null} for none
   */
  public ConfigFile setFileContents(java.lang.String fileContents) {
    this.fileContents = fileContents;
    return this;
  }

  /**
   * The bytes that constitute the file.
   * @see #setFileContents()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ConfigFile encodeFileContents(byte[] fileContents) {
    this.fileContents = com.google.api.client.util.Base64.encodeBase64URLSafeString(fileContents);
    return this;
  }

  /**
   * The file name of the configuration file (full or relative path).
   * @return value or {@code null} for none
   */
  public java.lang.String getFilePath() {
    return filePath;
  }

  /**
   * The file name of the configuration file (full or relative path).
   * @param filePath filePath or {@code null} for none
   */
  public ConfigFile setFilePath(java.lang.String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * The type of configuration file this represents.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileType() {
    return fileType;
  }

  /**
   * The type of configuration file this represents.
   * @param fileType fileType or {@code null} for none
   */
  public ConfigFile setFileType(java.lang.String fileType) {
    this.fileType = fileType;
    return this;
  }

  @Override
  public ConfigFile set(String fieldName, Object value) {
    return (ConfigFile) super.set(fieldName, value);
  }

  @Override
  public ConfigFile clone() {
    return (ConfigFile) super.clone();
  }

}
