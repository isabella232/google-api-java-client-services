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

package com.google.api.services.accesscontextmanager.v1beta.model;

/**
 * A condition necessary for an `AccessLevel` to be granted. The Condition is an AND over its
 * fields. So a Condition is true if: 1) the request IP is from one of the listed subnetworks AND 2)
 * the originating device complies with the listed device policy AND 3) all listed access levels are
 * granted AND 4) the request was sent at a time allowed by the DateTimeRestriction.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Condition extends com.google.api.client.json.GenericJson {

  /**
   * Device specific restrictions, all restrictions must hold for the Condition to be true. If not
   * specified, all devices are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DevicePolicy devicePolicy;

  /**
   * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address
   * block, the specified IP address portion must be properly truncated (i.e. all the host bits must
   * be zero) or the input is considered malformed. For example, "192.0.2.0/24" is accepted but
   * "192.0.2.1/24" is not. Similarly, for IPv6, "2001:db8::/32" is accepted whereas
   * "2001:db8::1/32" is not. The originating IP of a request must be in one of the listed subnets
   * in order for this Condition to be true. If empty, all IP addresses are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ipSubnetworks;

  /**
   * The signed-in user originating the request must be a part of one of the provided members.
   * Syntax: `user:{emailid}` `group:{emailid}` `serviceAccount:{emailid}` If not specified, a
   * request may come from any user (logged in/not logged in, not present in any groups, etc.).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> members;

  /**
   * Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty
   * fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean negate;

  /**
   * A list of other access levels defined in the same `Policy`, referenced by resource name.
   * Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be
   * granted for the Condition to be true. Example:
   * "`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME"`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> requiredAccessLevels;

  /**
   * Device specific restrictions, all restrictions must hold for the Condition to be true. If not
   * specified, all devices are allowed.
   * @return value or {@code null} for none
   */
  public DevicePolicy getDevicePolicy() {
    return devicePolicy;
  }

  /**
   * Device specific restrictions, all restrictions must hold for the Condition to be true. If not
   * specified, all devices are allowed.
   * @param devicePolicy devicePolicy or {@code null} for none
   */
  public Condition setDevicePolicy(DevicePolicy devicePolicy) {
    this.devicePolicy = devicePolicy;
    return this;
  }

  /**
   * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address
   * block, the specified IP address portion must be properly truncated (i.e. all the host bits must
   * be zero) or the input is considered malformed. For example, "192.0.2.0/24" is accepted but
   * "192.0.2.1/24" is not. Similarly, for IPv6, "2001:db8::/32" is accepted whereas
   * "2001:db8::1/32" is not. The originating IP of a request must be in one of the listed subnets
   * in order for this Condition to be true. If empty, all IP addresses are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIpSubnetworks() {
    return ipSubnetworks;
  }

  /**
   * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address
   * block, the specified IP address portion must be properly truncated (i.e. all the host bits must
   * be zero) or the input is considered malformed. For example, "192.0.2.0/24" is accepted but
   * "192.0.2.1/24" is not. Similarly, for IPv6, "2001:db8::/32" is accepted whereas
   * "2001:db8::1/32" is not. The originating IP of a request must be in one of the listed subnets
   * in order for this Condition to be true. If empty, all IP addresses are allowed.
   * @param ipSubnetworks ipSubnetworks or {@code null} for none
   */
  public Condition setIpSubnetworks(java.util.List<java.lang.String> ipSubnetworks) {
    this.ipSubnetworks = ipSubnetworks;
    return this;
  }

  /**
   * The signed-in user originating the request must be a part of one of the provided members.
   * Syntax: `user:{emailid}` `group:{emailid}` `serviceAccount:{emailid}` If not specified, a
   * request may come from any user (logged in/not logged in, not present in any groups, etc.).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMembers() {
    return members;
  }

  /**
   * The signed-in user originating the request must be a part of one of the provided members.
   * Syntax: `user:{emailid}` `group:{emailid}` `serviceAccount:{emailid}` If not specified, a
   * request may come from any user (logged in/not logged in, not present in any groups, etc.).
   * @param members members or {@code null} for none
   */
  public Condition setMembers(java.util.List<java.lang.String> members) {
    this.members = members;
    return this;
  }

  /**
   * Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty
   * fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNegate() {
    return negate;
  }

  /**
   * Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty
   * fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
   * @param negate negate or {@code null} for none
   */
  public Condition setNegate(java.lang.Boolean negate) {
    this.negate = negate;
    return this;
  }

  /**
   * A list of other access levels defined in the same `Policy`, referenced by resource name.
   * Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be
   * granted for the Condition to be true. Example:
   * "`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME"`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRequiredAccessLevels() {
    return requiredAccessLevels;
  }

  /**
   * A list of other access levels defined in the same `Policy`, referenced by resource name.
   * Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be
   * granted for the Condition to be true. Example:
   * "`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME"`
   * @param requiredAccessLevels requiredAccessLevels or {@code null} for none
   */
  public Condition setRequiredAccessLevels(java.util.List<java.lang.String> requiredAccessLevels) {
    this.requiredAccessLevels = requiredAccessLevels;
    return this;
  }

  @Override
  public Condition set(String fieldName, Object value) {
    return (Condition) super.set(fieldName, value);
  }

  @Override
  public Condition clone() {
    return (Condition) super.clone();
  }

}
