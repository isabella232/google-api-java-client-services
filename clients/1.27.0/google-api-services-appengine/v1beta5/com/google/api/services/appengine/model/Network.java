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

package com.google.api.services.appengine.model;

/**
 * Extra network settings. Only applicable for VM runtimes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Network extends com.google.api.client.json.GenericJson {

  /**
   * List of ports, or port pairs, to forward from the virtual machine to the application container.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> forwardedPorts;

  /**
   * Tag to apply to the VM instance during creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceTag;

  /**
   * Google Cloud Platform network where the virtual machines are created. Specify the short name,
   * not the resource path.Defaults to default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Google Cloud Platform sub-network where the virtual machines are created. Specify the short
   * name, not the resource path.If a subnetwork name is specified, a network name will also be
   * required unless it is for the default network. If the network the VM instance is being created
   * in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network the
   * VM instance is being created in is an auto Subnet Mode Network, then only network name should
   * be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of
   * the subnetwork that exists in that zone for that network. If the network the VM instance is
   * being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified
   * and the IP address is created from the IPCidrRange of the subnetwork.If specified, the
   * subnetwork must exist in the same region as the Flex app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetworkName;

  /**
   * List of ports, or port pairs, to forward from the virtual machine to the application container.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getForwardedPorts() {
    return forwardedPorts;
  }

  /**
   * List of ports, or port pairs, to forward from the virtual machine to the application container.
   * @param forwardedPorts forwardedPorts or {@code null} for none
   */
  public Network setForwardedPorts(java.util.List<java.lang.String> forwardedPorts) {
    this.forwardedPorts = forwardedPorts;
    return this;
  }

  /**
   * Tag to apply to the VM instance during creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceTag() {
    return instanceTag;
  }

  /**
   * Tag to apply to the VM instance during creation.
   * @param instanceTag instanceTag or {@code null} for none
   */
  public Network setInstanceTag(java.lang.String instanceTag) {
    this.instanceTag = instanceTag;
    return this;
  }

  /**
   * Google Cloud Platform network where the virtual machines are created. Specify the short name,
   * not the resource path.Defaults to default.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Google Cloud Platform network where the virtual machines are created. Specify the short name,
   * not the resource path.Defaults to default.
   * @param name name or {@code null} for none
   */
  public Network setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Google Cloud Platform sub-network where the virtual machines are created. Specify the short
   * name, not the resource path.If a subnetwork name is specified, a network name will also be
   * required unless it is for the default network. If the network the VM instance is being created
   * in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network the
   * VM instance is being created in is an auto Subnet Mode Network, then only network name should
   * be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of
   * the subnetwork that exists in that zone for that network. If the network the VM instance is
   * being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified
   * and the IP address is created from the IPCidrRange of the subnetwork.If specified, the
   * subnetwork must exist in the same region as the Flex app.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetworkName() {
    return subnetworkName;
  }

  /**
   * Google Cloud Platform sub-network where the virtual machines are created. Specify the short
   * name, not the resource path.If a subnetwork name is specified, a network name will also be
   * required unless it is for the default network. If the network the VM instance is being created
   * in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network the
   * VM instance is being created in is an auto Subnet Mode Network, then only network name should
   * be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of
   * the subnetwork that exists in that zone for that network. If the network the VM instance is
   * being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified
   * and the IP address is created from the IPCidrRange of the subnetwork.If specified, the
   * subnetwork must exist in the same region as the Flex app.
   * @param subnetworkName subnetworkName or {@code null} for none
   */
  public Network setSubnetworkName(java.lang.String subnetworkName) {
    this.subnetworkName = subnetworkName;
    return this;
  }

  @Override
  public Network set(String fieldName, Object value) {
    return (Network) super.set(fieldName, value);
  }

  @Override
  public Network clone() {
    return (Network) super.clone();
  }

}
