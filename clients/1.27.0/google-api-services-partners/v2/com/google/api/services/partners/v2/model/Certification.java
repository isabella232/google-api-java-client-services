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

package com.google.api.services.partners.v2.model;

/**
 * A user's information on a specific certification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Certification extends com.google.api.client.json.GenericJson {

  /**
   * Whether this certification has been achieved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean achieved;

  /**
   * The type of certification, the area of expertise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificationType;

  /**
   * Date this certification is due to expire.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expiration;

  /**
   * The date the user last achieved certification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastAchieved;

  /**
   * Whether this certification is in the state of warning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean warning;

  /**
   * Whether this certification has been achieved.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAchieved() {
    return achieved;
  }

  /**
   * Whether this certification has been achieved.
   * @param achieved achieved or {@code null} for none
   */
  public Certification setAchieved(java.lang.Boolean achieved) {
    this.achieved = achieved;
    return this;
  }

  /**
   * The type of certification, the area of expertise.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificationType() {
    return certificationType;
  }

  /**
   * The type of certification, the area of expertise.
   * @param certificationType certificationType or {@code null} for none
   */
  public Certification setCertificationType(java.lang.String certificationType) {
    this.certificationType = certificationType;
    return this;
  }

  /**
   * Date this certification is due to expire.
   * @return value or {@code null} for none
   */
  public String getExpiration() {
    return expiration;
  }

  /**
   * Date this certification is due to expire.
   * @param expiration expiration or {@code null} for none
   */
  public Certification setExpiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * The date the user last achieved certification.
   * @return value or {@code null} for none
   */
  public String getLastAchieved() {
    return lastAchieved;
  }

  /**
   * The date the user last achieved certification.
   * @param lastAchieved lastAchieved or {@code null} for none
   */
  public Certification setLastAchieved(String lastAchieved) {
    this.lastAchieved = lastAchieved;
    return this;
  }

  /**
   * Whether this certification is in the state of warning.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWarning() {
    return warning;
  }

  /**
   * Whether this certification is in the state of warning.
   * @param warning warning or {@code null} for none
   */
  public Certification setWarning(java.lang.Boolean warning) {
    this.warning = warning;
    return this;
  }

  @Override
  public Certification set(String fieldName, Object value) {
    return (Certification) super.set(fieldName, value);
  }

  @Override
  public Certification clone() {
    return (Certification) super.clone();
  }

}
