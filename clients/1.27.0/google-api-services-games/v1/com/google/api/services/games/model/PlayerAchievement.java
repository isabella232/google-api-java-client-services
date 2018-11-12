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

package com.google.api.services.games.model;

/**
 * This is a JSON template for an achievement object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlayerAchievement extends com.google.api.client.json.GenericJson {

  /**
   * The state of the achievement. Possible values are:   - "HIDDEN" - Achievement is hidden.  -
   * "REVEALED" - Achievement is revealed.  - "UNLOCKED" - Achievement is unlocked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String achievementState;

  /**
   * The current steps for an incremental achievement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer currentSteps;

  /**
   * Experience points earned for the achievement. This field is absent for achievements that have
   * not yet been unlocked and 0 for achievements that have been unlocked by testers but that are
   * unpublished.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long experiencePoints;

  /**
   * The current steps for an incremental achievement as a string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedCurrentStepsString;

  /**
   * The ID of the achievement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerAchievement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The timestamp of the last modification to this achievement's state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastUpdatedTimestamp;

  /**
   * The state of the achievement. Possible values are:   - "HIDDEN" - Achievement is hidden.  -
   * "REVEALED" - Achievement is revealed.  - "UNLOCKED" - Achievement is unlocked.
   * @return value or {@code null} for none
   */
  public java.lang.String getAchievementState() {
    return achievementState;
  }

  /**
   * The state of the achievement. Possible values are:   - "HIDDEN" - Achievement is hidden.  -
   * "REVEALED" - Achievement is revealed.  - "UNLOCKED" - Achievement is unlocked.
   * @param achievementState achievementState or {@code null} for none
   */
  public PlayerAchievement setAchievementState(java.lang.String achievementState) {
    this.achievementState = achievementState;
    return this;
  }

  /**
   * The current steps for an incremental achievement.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCurrentSteps() {
    return currentSteps;
  }

  /**
   * The current steps for an incremental achievement.
   * @param currentSteps currentSteps or {@code null} for none
   */
  public PlayerAchievement setCurrentSteps(java.lang.Integer currentSteps) {
    this.currentSteps = currentSteps;
    return this;
  }

  /**
   * Experience points earned for the achievement. This field is absent for achievements that have
   * not yet been unlocked and 0 for achievements that have been unlocked by testers but that are
   * unpublished.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExperiencePoints() {
    return experiencePoints;
  }

  /**
   * Experience points earned for the achievement. This field is absent for achievements that have
   * not yet been unlocked and 0 for achievements that have been unlocked by testers but that are
   * unpublished.
   * @param experiencePoints experiencePoints or {@code null} for none
   */
  public PlayerAchievement setExperiencePoints(java.lang.Long experiencePoints) {
    this.experiencePoints = experiencePoints;
    return this;
  }

  /**
   * The current steps for an incremental achievement as a string.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedCurrentStepsString() {
    return formattedCurrentStepsString;
  }

  /**
   * The current steps for an incremental achievement as a string.
   * @param formattedCurrentStepsString formattedCurrentStepsString or {@code null} for none
   */
  public PlayerAchievement setFormattedCurrentStepsString(java.lang.String formattedCurrentStepsString) {
    this.formattedCurrentStepsString = formattedCurrentStepsString;
    return this;
  }

  /**
   * The ID of the achievement.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the achievement.
   * @param id id or {@code null} for none
   */
  public PlayerAchievement setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerAchievement.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerAchievement.
   * @param kind kind or {@code null} for none
   */
  public PlayerAchievement setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The timestamp of the last modification to this achievement's state.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  /**
   * The timestamp of the last modification to this achievement's state.
   * @param lastUpdatedTimestamp lastUpdatedTimestamp or {@code null} for none
   */
  public PlayerAchievement setLastUpdatedTimestamp(java.lang.Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  @Override
  public PlayerAchievement set(String fieldName, Object value) {
    return (PlayerAchievement) super.set(fieldName, value);
  }

  @Override
  public PlayerAchievement clone() {
    return (PlayerAchievement) super.clone();
  }

}
