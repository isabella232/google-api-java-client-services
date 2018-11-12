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

package com.google.api.services.testing.model;

/**
 * A version of the Android OS
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidVersion extends com.google.api.client.json.GenericJson {

  /**
   * The API level for this Android version. Examples: 18, 19 @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer apiLevel;

  /**
   * The code name for this Android version. Examples: "JellyBean", "KitKat" @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String codeName;

  /**
   * Market share for this version. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Distribution distribution;

  /**
   * An opaque id for this Android version. Use this id to invoke the TestExecutionService.
   * @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The date this Android version became available in the market. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date releaseDate;

  /**
   * Tags for this dimension. Examples: "default", "preview", "deprecated"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * A string representing this version of the Android OS. Examples: "4.3", "4.4" @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionString;

  /**
   * The API level for this Android version. Examples: 18, 19 @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Integer getApiLevel() {
    return apiLevel;
  }

  /**
   * The API level for this Android version. Examples: 18, 19 @OutputOnly
   * @param apiLevel apiLevel or {@code null} for none
   */
  public AndroidVersion setApiLevel(java.lang.Integer apiLevel) {
    this.apiLevel = apiLevel;
    return this;
  }

  /**
   * The code name for this Android version. Examples: "JellyBean", "KitKat" @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getCodeName() {
    return codeName;
  }

  /**
   * The code name for this Android version. Examples: "JellyBean", "KitKat" @OutputOnly
   * @param codeName codeName or {@code null} for none
   */
  public AndroidVersion setCodeName(java.lang.String codeName) {
    this.codeName = codeName;
    return this;
  }

  /**
   * Market share for this version. @OutputOnly
   * @return value or {@code null} for none
   */
  public Distribution getDistribution() {
    return distribution;
  }

  /**
   * Market share for this version. @OutputOnly
   * @param distribution distribution or {@code null} for none
   */
  public AndroidVersion setDistribution(Distribution distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * An opaque id for this Android version. Use this id to invoke the TestExecutionService.
   * @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * An opaque id for this Android version. Use this id to invoke the TestExecutionService.
   * @OutputOnly
   * @param id id or {@code null} for none
   */
  public AndroidVersion setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The date this Android version became available in the market. @OutputOnly
   * @return value or {@code null} for none
   */
  public Date getReleaseDate() {
    return releaseDate;
  }

  /**
   * The date this Android version became available in the market. @OutputOnly
   * @param releaseDate releaseDate or {@code null} for none
   */
  public AndroidVersion setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Tags for this dimension. Examples: "default", "preview", "deprecated"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Tags for this dimension. Examples: "default", "preview", "deprecated"
   * @param tags tags or {@code null} for none
   */
  public AndroidVersion setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * A string representing this version of the Android OS. Examples: "4.3", "4.4" @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionString() {
    return versionString;
  }

  /**
   * A string representing this version of the Android OS. Examples: "4.3", "4.4" @OutputOnly
   * @param versionString versionString or {@code null} for none
   */
  public AndroidVersion setVersionString(java.lang.String versionString) {
    this.versionString = versionString;
    return this;
  }

  @Override
  public AndroidVersion set(String fieldName, Object value) {
    return (AndroidVersion) super.set(fieldName, value);
  }

  @Override
  public AndroidVersion clone() {
    return (AndroidVersion) super.clone();
  }

}
