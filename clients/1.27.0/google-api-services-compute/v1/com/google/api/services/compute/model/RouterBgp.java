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

package com.google.api.services.compute.model;

/**
 * Model definition for RouterBgp.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterBgp extends com.google.api.client.json.GenericJson {

  /**
   * User-specified flag to indicate which mode to use for advertisement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String advertiseMode;

  /**
   * User-specified list of prefix groups to advertise in custom mode. This field can only be
   * populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
   * groups will be advertised in addition to any specified prefixes. Leave this field blank to
   * advertise no custom groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> advertisedGroups;

  /**
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be
   * populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP
   * ranges will be advertised in addition to any specified groups. Leave this field blank to
   * advertise no custom IP ranges.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RouterAdvertisedIpRange> advertisedIpRanges;

  static {
    // hack to force ProGuard to consider RouterAdvertisedIpRange used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RouterAdvertisedIpRange.class);
  }

  /**
   * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or
   * 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this
   * router will have the same local ASN.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long asn;

  /**
   * User-specified flag to indicate which mode to use for advertisement.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdvertiseMode() {
    return advertiseMode;
  }

  /**
   * User-specified flag to indicate which mode to use for advertisement.
   * @param advertiseMode advertiseMode or {@code null} for none
   */
  public RouterBgp setAdvertiseMode(java.lang.String advertiseMode) {
    this.advertiseMode = advertiseMode;
    return this;
  }

  /**
   * User-specified list of prefix groups to advertise in custom mode. This field can only be
   * populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
   * groups will be advertised in addition to any specified prefixes. Leave this field blank to
   * advertise no custom groups.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdvertisedGroups() {
    return advertisedGroups;
  }

  /**
   * User-specified list of prefix groups to advertise in custom mode. This field can only be
   * populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
   * groups will be advertised in addition to any specified prefixes. Leave this field blank to
   * advertise no custom groups.
   * @param advertisedGroups advertisedGroups or {@code null} for none
   */
  public RouterBgp setAdvertisedGroups(java.util.List<java.lang.String> advertisedGroups) {
    this.advertisedGroups = advertisedGroups;
    return this;
  }

  /**
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be
   * populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP
   * ranges will be advertised in addition to any specified groups. Leave this field blank to
   * advertise no custom IP ranges.
   * @return value or {@code null} for none
   */
  public java.util.List<RouterAdvertisedIpRange> getAdvertisedIpRanges() {
    return advertisedIpRanges;
  }

  /**
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be
   * populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP
   * ranges will be advertised in addition to any specified groups. Leave this field blank to
   * advertise no custom IP ranges.
   * @param advertisedIpRanges advertisedIpRanges or {@code null} for none
   */
  public RouterBgp setAdvertisedIpRanges(java.util.List<RouterAdvertisedIpRange> advertisedIpRanges) {
    this.advertisedIpRanges = advertisedIpRanges;
    return this;
  }

  /**
   * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or
   * 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this
   * router will have the same local ASN.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAsn() {
    return asn;
  }

  /**
   * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or
   * 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this
   * router will have the same local ASN.
   * @param asn asn or {@code null} for none
   */
  public RouterBgp setAsn(java.lang.Long asn) {
    this.asn = asn;
    return this;
  }

  @Override
  public RouterBgp set(String fieldName, Object value) {
    return (RouterBgp) super.set(fieldName, value);
  }

  @Override
  public RouterBgp clone() {
    return (RouterBgp) super.clone();
  }

}
