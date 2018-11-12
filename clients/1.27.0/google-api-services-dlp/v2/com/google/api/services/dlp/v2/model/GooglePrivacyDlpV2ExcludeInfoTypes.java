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

package com.google.api.services.dlp.v2.model;

/**
 * List of exclude infoTypes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2ExcludeInfoTypes extends com.google.api.client.json.GenericJson {

  /**
   * InfoType list in ExclusionRule rule drops a finding when it overlaps or contained within with a
   * finding of an infoType from this list. For example, for `InspectionRuleSet.info_types`
   * containing "PHONE_NUMBER"` and `exclusion_rule` containing `exclude_info_types.info_types` with
   * "EMAIL_ADDRESS" the phone number findings are dropped if they overlap with EMAIL_ADDRESS
   * finding. That leads to "555-222-2222@example.org" to generate only a single finding, namely
   * email address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2InfoType> infoTypes;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2InfoType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2InfoType.class);
  }

  /**
   * InfoType list in ExclusionRule rule drops a finding when it overlaps or contained within with a
   * finding of an infoType from this list. For example, for `InspectionRuleSet.info_types`
   * containing "PHONE_NUMBER"` and `exclusion_rule` containing `exclude_info_types.info_types` with
   * "EMAIL_ADDRESS" the phone number findings are dropped if they overlap with EMAIL_ADDRESS
   * finding. That leads to "555-222-2222@example.org" to generate only a single finding, namely
   * email address.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2InfoType> getInfoTypes() {
    return infoTypes;
  }

  /**
   * InfoType list in ExclusionRule rule drops a finding when it overlaps or contained within with a
   * finding of an infoType from this list. For example, for `InspectionRuleSet.info_types`
   * containing "PHONE_NUMBER"` and `exclusion_rule` containing `exclude_info_types.info_types` with
   * "EMAIL_ADDRESS" the phone number findings are dropped if they overlap with EMAIL_ADDRESS
   * finding. That leads to "555-222-2222@example.org" to generate only a single finding, namely
   * email address.
   * @param infoTypes infoTypes or {@code null} for none
   */
  public GooglePrivacyDlpV2ExcludeInfoTypes setInfoTypes(java.util.List<GooglePrivacyDlpV2InfoType> infoTypes) {
    this.infoTypes = infoTypes;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2ExcludeInfoTypes set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2ExcludeInfoTypes) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2ExcludeInfoTypes clone() {
    return (GooglePrivacyDlpV2ExcludeInfoTypes) super.clone();
  }

}
