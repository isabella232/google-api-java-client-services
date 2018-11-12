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
 * A ForwardingRule resource. A ForwardingRule resource specifies which pool of target virtual
 * machines to forward a packet to if it matches the given [IPAddress, IPProtocol, ports] tuple. (==
 * resource_for beta.forwardingRules ==) (== resource_for v1.forwardingRules ==) (== resource_for
 * beta.globalForwardingRules ==) (== resource_for v1.globalForwardingRules ==) (== resource_for
 * beta.regionForwardingRules ==) (== resource_for v1.regionForwardingRules ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ForwardingRule extends com.google.api.client.json.GenericJson {

  /**
   * The IP address that this forwarding rule is serving on behalf of.
   *
   * Addresses are restricted based on the forwarding rule's load balancing scheme (EXTERNAL or
   * INTERNAL) and scope (global or regional).
   *
   * When the load balancing scheme is EXTERNAL, for global forwarding rules, the address must be a
   * global IP, and for regional forwarding rules, the address must live in the same region as the
   * forwarding rule. If this field is empty, an ephemeral IPv4 address from the same scope (global
   * or regional) will be assigned. A regional forwarding rule supports IPv4 only. A global
   * forwarding rule supports either IPv4 or IPv6.
   *
   * When the load balancing scheme is INTERNAL_SELF_MANAGED, this must be a URL reference to an
   * existing Address resource ( internal regional static IP address), with a purpose of
   * GCE_END_POINT and address_type of INTERNAL.
   *
   * When the load balancing scheme is INTERNAL, this can only be an RFC 1918 IP address belonging
   * to the network/subnet configured for the forwarding rule. By default, if this field is empty,
   * an ephemeral internal IP address will be automatically allocated from the IP range of the
   * subnet or network configured for this forwarding rule.
   *
   * An address can be specified either by a literal IP address or a URL reference to an existing
   * Address resource. The following examples are all valid:   - 100.1.2.3  -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region/addresses/address  -
   * projects/project/regions/region/addresses/address  - regions/region/addresses/address  -
   * global/addresses/address  - address
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("IPAddress")
  private java.lang.String iPAddress;

  /**
   * The IP protocol to which this rule applies. Valid options are TCP, UDP, ESP, AH, SCTP or ICMP.
   *
   * When the load balancing scheme is INTERNAL, only TCP and UDP are valid. When the load balancing
   * scheme is INTERNAL_SELF_MANAGED, only TCPis valid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("IPProtocol")
  private java.lang.String iPProtocol;

  /**
   * This field is only used for INTERNAL load balancing.
   *
   * For internal load balancing, this field identifies the BackendService resource to receive the
   * matched traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backendService;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This
   * can only be specified for an external global forwarding rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipVersion;

  /**
   * [Output Only] Type of the resource. Always compute#forwardingRule for Forwarding Rule
   * resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * This signifies what the ForwardingRule will be used for and can only take the following values:
   * INTERNAL, INTERNAL_SELF_MANAGED, EXTERNAL. The value of INTERNAL means that this will be used
   * for Internal Network Load Balancing (TCP, UDP). The value of INTERNAL_SELF_MANAGED means that
   * this will be used for Internal Global HTTP(S) LB. The value of EXTERNAL means that this will be
   * used for External Load Balancing (HTTP(S) LB, External TCP/UDP LB, SSL Proxy)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String loadBalancingScheme;

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * This field is not used for external load balancing.
   *
   * For INTERNAL and INTERNAL_SELF_MANAGED load balancing, this field identifies the network that
   * the load balanced IP should belong to for this Forwarding Rule. If this field is not specified,
   * the default network will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * This signifies the networking tier used for configuring this load balancer and can only take
   * the following values: PREMIUM , STANDARD.
   *
   * For regional ForwardingRule, the valid values are PREMIUM and STANDARD. For
   * GlobalForwardingRule, the valid value is PREMIUM.
   *
   * If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this
   * value must be equal to the networkTier of the Address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkTier;

  /**
   * This field is used along with the target field for TargetHttpProxy, TargetHttpsProxy,
   * TargetSslProxy, TargetTcpProxy, TargetVpnGateway, TargetPool, TargetInstance.
   *
   * Applicable only when IPProtocol is TCP, UDP, or SCTP, only packets addressed to ports in the
   * specified range will be forwarded to target. Forwarding rules with the same [IPAddress,
   * IPProtocol] pair must have disjoint port ranges.
   *
   * Some types of forwarding target have constraints on the acceptable ports:   - TargetHttpProxy:
   * 80, 8080  - TargetHttpsProxy: 443  - TargetTcpProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700,
   * 993, 995, 1688, 1883, 5222  - TargetSslProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700, 993,
   * 995, 1688, 1883, 5222  - TargetVpnGateway: 500, 4500
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String portRange;

  /**
   * This field is used along with the backend_service field for internal load balancing.
   *
   * When the load balancing scheme is INTERNAL, a single port or a comma separated list of ports
   * can be configured. Only packets addressed to these ports will be forwarded to the backends
   * configured with this forwarding rule.
   *
   * You may specify a maximum of up to 5 ports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ports;

  /**
   * [Output Only] URL of the region where the regional forwarding rule resides. This field is not
   * applicable to global forwarding rules. You must specify this field as part of the HTTP request
   * URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * This field is only used for INTERNAL load balancing.
   *
   * For internal load balancing, this field identifies the subnetwork that the load balanced IP
   * should belong to for this Forwarding Rule.
   *
   * If the network specified is in auto subnet mode, this field is optional. However, if the
   * network is in custom subnet mode, a subnetwork must be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * The URL of the target resource to receive the matched traffic. For regional forwarding rules,
   * this target must live in the same region as the forwarding rule. For global forwarding rules,
   * this target must be a global load balancing resource. The forwarded traffic must be of a type
   * appropriate to the target object. For INTERNAL_SELF_MANAGED" load balancing, only HTTP and
   * HTTPS targets are valid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * The IP address that this forwarding rule is serving on behalf of.
   *
   * Addresses are restricted based on the forwarding rule's load balancing scheme (EXTERNAL or
   * INTERNAL) and scope (global or regional).
   *
   * When the load balancing scheme is EXTERNAL, for global forwarding rules, the address must be a
   * global IP, and for regional forwarding rules, the address must live in the same region as the
   * forwarding rule. If this field is empty, an ephemeral IPv4 address from the same scope (global
   * or regional) will be assigned. A regional forwarding rule supports IPv4 only. A global
   * forwarding rule supports either IPv4 or IPv6.
   *
   * When the load balancing scheme is INTERNAL_SELF_MANAGED, this must be a URL reference to an
   * existing Address resource ( internal regional static IP address), with a purpose of
   * GCE_END_POINT and address_type of INTERNAL.
   *
   * When the load balancing scheme is INTERNAL, this can only be an RFC 1918 IP address belonging
   * to the network/subnet configured for the forwarding rule. By default, if this field is empty,
   * an ephemeral internal IP address will be automatically allocated from the IP range of the
   * subnet or network configured for this forwarding rule.
   *
   * An address can be specified either by a literal IP address or a URL reference to an existing
   * Address resource. The following examples are all valid:   - 100.1.2.3  -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region/addresses/address  -
   * projects/project/regions/region/addresses/address  - regions/region/addresses/address  -
   * global/addresses/address  - address
   * @return value or {@code null} for none
   */
  public java.lang.String getIPAddress() {
    return iPAddress;
  }

  /**
   * The IP address that this forwarding rule is serving on behalf of.
   *
   * Addresses are restricted based on the forwarding rule's load balancing scheme (EXTERNAL or
   * INTERNAL) and scope (global or regional).
   *
   * When the load balancing scheme is EXTERNAL, for global forwarding rules, the address must be a
   * global IP, and for regional forwarding rules, the address must live in the same region as the
   * forwarding rule. If this field is empty, an ephemeral IPv4 address from the same scope (global
   * or regional) will be assigned. A regional forwarding rule supports IPv4 only. A global
   * forwarding rule supports either IPv4 or IPv6.
   *
   * When the load balancing scheme is INTERNAL_SELF_MANAGED, this must be a URL reference to an
   * existing Address resource ( internal regional static IP address), with a purpose of
   * GCE_END_POINT and address_type of INTERNAL.
   *
   * When the load balancing scheme is INTERNAL, this can only be an RFC 1918 IP address belonging
   * to the network/subnet configured for the forwarding rule. By default, if this field is empty,
   * an ephemeral internal IP address will be automatically allocated from the IP range of the
   * subnet or network configured for this forwarding rule.
   *
   * An address can be specified either by a literal IP address or a URL reference to an existing
   * Address resource. The following examples are all valid:   - 100.1.2.3  -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region/addresses/address  -
   * projects/project/regions/region/addresses/address  - regions/region/addresses/address  -
   * global/addresses/address  - address
   * @param iPAddress iPAddress or {@code null} for none
   */
  public ForwardingRule setIPAddress(java.lang.String iPAddress) {
    this.iPAddress = iPAddress;
    return this;
  }

  /**
   * The IP protocol to which this rule applies. Valid options are TCP, UDP, ESP, AH, SCTP or ICMP.
   *
   * When the load balancing scheme is INTERNAL, only TCP and UDP are valid. When the load balancing
   * scheme is INTERNAL_SELF_MANAGED, only TCPis valid.
   * @return value or {@code null} for none
   */
  public java.lang.String getIPProtocol() {
    return iPProtocol;
  }

  /**
   * The IP protocol to which this rule applies. Valid options are TCP, UDP, ESP, AH, SCTP or ICMP.
   *
   * When the load balancing scheme is INTERNAL, only TCP and UDP are valid. When the load balancing
   * scheme is INTERNAL_SELF_MANAGED, only TCPis valid.
   * @param iPProtocol iPProtocol or {@code null} for none
   */
  public ForwardingRule setIPProtocol(java.lang.String iPProtocol) {
    this.iPProtocol = iPProtocol;
    return this;
  }

  /**
   * This field is only used for INTERNAL load balancing.
   *
   * For internal load balancing, this field identifies the BackendService resource to receive the
   * matched traffic.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackendService() {
    return backendService;
  }

  /**
   * This field is only used for INTERNAL load balancing.
   *
   * For internal load balancing, this field identifies the BackendService resource to receive the
   * matched traffic.
   * @param backendService backendService or {@code null} for none
   */
  public ForwardingRule setBackendService(java.lang.String backendService) {
    this.backendService = backendService;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public ForwardingRule setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public ForwardingRule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public ForwardingRule setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This
   * can only be specified for an external global forwarding rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpVersion() {
    return ipVersion;
  }

  /**
   * The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This
   * can only be specified for an external global forwarding rule.
   * @param ipVersion ipVersion or {@code null} for none
   */
  public ForwardingRule setIpVersion(java.lang.String ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#forwardingRule for Forwarding Rule
   * resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#forwardingRule for Forwarding Rule
   * resources.
   * @param kind kind or {@code null} for none
   */
  public ForwardingRule setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * This signifies what the ForwardingRule will be used for and can only take the following values:
   * INTERNAL, INTERNAL_SELF_MANAGED, EXTERNAL. The value of INTERNAL means that this will be used
   * for Internal Network Load Balancing (TCP, UDP). The value of INTERNAL_SELF_MANAGED means that
   * this will be used for Internal Global HTTP(S) LB. The value of EXTERNAL means that this will be
   * used for External Load Balancing (HTTP(S) LB, External TCP/UDP LB, SSL Proxy)
   * @return value or {@code null} for none
   */
  public java.lang.String getLoadBalancingScheme() {
    return loadBalancingScheme;
  }

  /**
   * This signifies what the ForwardingRule will be used for and can only take the following values:
   * INTERNAL, INTERNAL_SELF_MANAGED, EXTERNAL. The value of INTERNAL means that this will be used
   * for Internal Network Load Balancing (TCP, UDP). The value of INTERNAL_SELF_MANAGED means that
   * this will be used for Internal Global HTTP(S) LB. The value of EXTERNAL means that this will be
   * used for External Load Balancing (HTTP(S) LB, External TCP/UDP LB, SSL Proxy)
   * @param loadBalancingScheme loadBalancingScheme or {@code null} for none
   */
  public ForwardingRule setLoadBalancingScheme(java.lang.String loadBalancingScheme) {
    this.loadBalancingScheme = loadBalancingScheme;
    return this;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public ForwardingRule setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * This field is not used for external load balancing.
   *
   * For INTERNAL and INTERNAL_SELF_MANAGED load balancing, this field identifies the network that
   * the load balanced IP should belong to for this Forwarding Rule. If this field is not specified,
   * the default network will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * This field is not used for external load balancing.
   *
   * For INTERNAL and INTERNAL_SELF_MANAGED load balancing, this field identifies the network that
   * the load balanced IP should belong to for this Forwarding Rule. If this field is not specified,
   * the default network will be used.
   * @param network network or {@code null} for none
   */
  public ForwardingRule setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * This signifies the networking tier used for configuring this load balancer and can only take
   * the following values: PREMIUM , STANDARD.
   *
   * For regional ForwardingRule, the valid values are PREMIUM and STANDARD. For
   * GlobalForwardingRule, the valid value is PREMIUM.
   *
   * If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this
   * value must be equal to the networkTier of the Address.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkTier() {
    return networkTier;
  }

  /**
   * This signifies the networking tier used for configuring this load balancer and can only take
   * the following values: PREMIUM , STANDARD.
   *
   * For regional ForwardingRule, the valid values are PREMIUM and STANDARD. For
   * GlobalForwardingRule, the valid value is PREMIUM.
   *
   * If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this
   * value must be equal to the networkTier of the Address.
   * @param networkTier networkTier or {@code null} for none
   */
  public ForwardingRule setNetworkTier(java.lang.String networkTier) {
    this.networkTier = networkTier;
    return this;
  }

  /**
   * This field is used along with the target field for TargetHttpProxy, TargetHttpsProxy,
   * TargetSslProxy, TargetTcpProxy, TargetVpnGateway, TargetPool, TargetInstance.
   *
   * Applicable only when IPProtocol is TCP, UDP, or SCTP, only packets addressed to ports in the
   * specified range will be forwarded to target. Forwarding rules with the same [IPAddress,
   * IPProtocol] pair must have disjoint port ranges.
   *
   * Some types of forwarding target have constraints on the acceptable ports:   - TargetHttpProxy:
   * 80, 8080  - TargetHttpsProxy: 443  - TargetTcpProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700,
   * 993, 995, 1688, 1883, 5222  - TargetSslProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700, 993,
   * 995, 1688, 1883, 5222  - TargetVpnGateway: 500, 4500
   * @return value or {@code null} for none
   */
  public java.lang.String getPortRange() {
    return portRange;
  }

  /**
   * This field is used along with the target field for TargetHttpProxy, TargetHttpsProxy,
   * TargetSslProxy, TargetTcpProxy, TargetVpnGateway, TargetPool, TargetInstance.
   *
   * Applicable only when IPProtocol is TCP, UDP, or SCTP, only packets addressed to ports in the
   * specified range will be forwarded to target. Forwarding rules with the same [IPAddress,
   * IPProtocol] pair must have disjoint port ranges.
   *
   * Some types of forwarding target have constraints on the acceptable ports:   - TargetHttpProxy:
   * 80, 8080  - TargetHttpsProxy: 443  - TargetTcpProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700,
   * 993, 995, 1688, 1883, 5222  - TargetSslProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700, 993,
   * 995, 1688, 1883, 5222  - TargetVpnGateway: 500, 4500
   * @param portRange portRange or {@code null} for none
   */
  public ForwardingRule setPortRange(java.lang.String portRange) {
    this.portRange = portRange;
    return this;
  }

  /**
   * This field is used along with the backend_service field for internal load balancing.
   *
   * When the load balancing scheme is INTERNAL, a single port or a comma separated list of ports
   * can be configured. Only packets addressed to these ports will be forwarded to the backends
   * configured with this forwarding rule.
   *
   * You may specify a maximum of up to 5 ports.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPorts() {
    return ports;
  }

  /**
   * This field is used along with the backend_service field for internal load balancing.
   *
   * When the load balancing scheme is INTERNAL, a single port or a comma separated list of ports
   * can be configured. Only packets addressed to these ports will be forwarded to the backends
   * configured with this forwarding rule.
   *
   * You may specify a maximum of up to 5 ports.
   * @param ports ports or {@code null} for none
   */
  public ForwardingRule setPorts(java.util.List<java.lang.String> ports) {
    this.ports = ports;
    return this;
  }

  /**
   * [Output Only] URL of the region where the regional forwarding rule resides. This field is not
   * applicable to global forwarding rules. You must specify this field as part of the HTTP request
   * URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the regional forwarding rule resides. This field is not
   * applicable to global forwarding rules. You must specify this field as part of the HTTP request
   * URL. It is not settable as a field in the request body.
   * @param region region or {@code null} for none
   */
  public ForwardingRule setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public ForwardingRule setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * This field is only used for INTERNAL load balancing.
   *
   * For internal load balancing, this field identifies the subnetwork that the load balanced IP
   * should belong to for this Forwarding Rule.
   *
   * If the network specified is in auto subnet mode, this field is optional. However, if the
   * network is in custom subnet mode, a subnetwork must be specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * This field is only used for INTERNAL load balancing.
   *
   * For internal load balancing, this field identifies the subnetwork that the load balanced IP
   * should belong to for this Forwarding Rule.
   *
   * If the network specified is in auto subnet mode, this field is optional. However, if the
   * network is in custom subnet mode, a subnetwork must be specified.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public ForwardingRule setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  /**
   * The URL of the target resource to receive the matched traffic. For regional forwarding rules,
   * this target must live in the same region as the forwarding rule. For global forwarding rules,
   * this target must be a global load balancing resource. The forwarded traffic must be of a type
   * appropriate to the target object. For INTERNAL_SELF_MANAGED" load balancing, only HTTP and
   * HTTPS targets are valid.
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * The URL of the target resource to receive the matched traffic. For regional forwarding rules,
   * this target must live in the same region as the forwarding rule. For global forwarding rules,
   * this target must be a global load balancing resource. The forwarded traffic must be of a type
   * appropriate to the target object. For INTERNAL_SELF_MANAGED" load balancing, only HTTP and
   * HTTPS targets are valid.
   * @param target target or {@code null} for none
   */
  public ForwardingRule setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  @Override
  public ForwardingRule set(String fieldName, Object value) {
    return (ForwardingRule) super.set(fieldName, value);
  }

  @Override
  public ForwardingRule clone() {
    return (ForwardingRule) super.clone();
  }

}
