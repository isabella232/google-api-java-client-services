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

package com.google.api.services.safebrowsing.model;

/**
 * Details about the user that encountered the threat.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserInfo extends com.google.api.client.json.GenericJson {

  /**
   * The UN M.49 region code associated with the user's location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Unique user identifier defined by the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * The UN M.49 region code associated with the user's location.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * The UN M.49 region code associated with the user's location.
   * @param regionCode regionCode or {@code null} for none
   */
  public UserInfo setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Unique user identifier defined by the client.
   * @see #decodeUserId()
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Unique user identifier defined by the client.
   * @see #getUserId()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeUserId() {
    return com.google.api.client.util.Base64.decodeBase64(userId);
  }

  /**
   * Unique user identifier defined by the client.
   * @see #encodeUserId()
   * @param userId userId or {@code null} for none
   */
  public UserInfo setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Unique user identifier defined by the client.
   * @see #setUserId()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public UserInfo encodeUserId(byte[] userId) {
    this.userId = com.google.api.client.util.Base64.encodeBase64URLSafeString(userId);
    return this;
  }

  @Override
  public UserInfo set(String fieldName, Object value) {
    return (UserInfo) super.set(fieldName, value);
  }

  @Override
  public UserInfo clone() {
    return (UserInfo) super.clone();
  }

}
