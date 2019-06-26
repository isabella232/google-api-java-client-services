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

package com.google.api.services.drive.model;

/**
 * Information about a Drive user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class User extends com.google.api.client.json.GenericJson {

  /**
   * A plain text displayable name for this user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The email address of the user. This may not be present in certain contexts if the user has not
   * made their email address visible to the requester.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emailAddress;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#user".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Whether this user is the requesting user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean me;

  /**
   * The user's ID as visible in Permission resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permissionId;

  /**
   * A link to the user's profile photo, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photoLink;

  /**
   * A plain text displayable name for this user.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A plain text displayable name for this user.
   * @param displayName displayName or {@code null} for none
   */
  public User setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The email address of the user. This may not be present in certain contexts if the user has not
   * made their email address visible to the requester.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailAddress() {
    return emailAddress;
  }

  /**
   * The email address of the user. This may not be present in certain contexts if the user has not
   * made their email address visible to the requester.
   * @param emailAddress emailAddress or {@code null} for none
   */
  public User setEmailAddress(java.lang.String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#user".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#user".
   * @param kind kind or {@code null} for none
   */
  public User setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Whether this user is the requesting user.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMe() {
    return me;
  }

  /**
   * Whether this user is the requesting user.
   * @param me me or {@code null} for none
   */
  public User setMe(java.lang.Boolean me) {
    this.me = me;
    return this;
  }

  /**
   * The user's ID as visible in Permission resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getPermissionId() {
    return permissionId;
  }

  /**
   * The user's ID as visible in Permission resources.
   * @param permissionId permissionId or {@code null} for none
   */
  public User setPermissionId(java.lang.String permissionId) {
    this.permissionId = permissionId;
    return this;
  }

  /**
   * A link to the user's profile photo, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhotoLink() {
    return photoLink;
  }

  /**
   * A link to the user's profile photo, if available.
   * @param photoLink photoLink or {@code null} for none
   */
  public User setPhotoLink(java.lang.String photoLink) {
    this.photoLink = photoLink;
    return this;
  }

  @Override
  public User set(String fieldName, Object value) {
    return (User) super.set(fieldName, value);
  }

  @Override
  public User clone() {
    return (User) super.clone();
  }

}
