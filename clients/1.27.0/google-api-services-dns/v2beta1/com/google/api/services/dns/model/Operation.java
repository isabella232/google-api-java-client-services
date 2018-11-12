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

package com.google.api.services.dns.model;

/**
 * An operation represents a successful mutation performed on a Cloud DNS resource. Operations
 * provide: - An audit log of server resource mutations. - A way to recover/retry API calls in the
 * case where the response is never received by the caller. Use the caller specified
 * client_operation_id.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Operation extends com.google.api.client.json.GenericJson {

  /**
   * Only populated if the operation targeted a DnsKey (output only).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OperationDnsKeyContext dnsKeyContext;

  /**
   * Unique identifier for the resource. This is the client_operation_id if the client specified it
   * when the mutation was initiated, otherwise, it is generated by the server. The name must be
   * 1-63 characters long and match the regular expression [-a-z0-9]? (output only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#operation".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The time that this operation was started by the server. This is in RFC3339 text format (output
   * only).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTime;

  /**
   * Status of the operation. Can be one of the following: "PENDING" or "DONE" (output only).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Type of the operation. Operations include insert, update, and delete (output only).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * User who requested the operation, for example: user@example.com. cloud-dns-system for
   * operations automatically done by the system. (output only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String user;

  /**
   * Only populated if the operation targeted a ManagedZone (output only).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OperationManagedZoneContext zoneContext;

  /**
   * Only populated if the operation targeted a DnsKey (output only).
   * @return value or {@code null} for none
   */
  public OperationDnsKeyContext getDnsKeyContext() {
    return dnsKeyContext;
  }

  /**
   * Only populated if the operation targeted a DnsKey (output only).
   * @param dnsKeyContext dnsKeyContext or {@code null} for none
   */
  public Operation setDnsKeyContext(OperationDnsKeyContext dnsKeyContext) {
    this.dnsKeyContext = dnsKeyContext;
    return this;
  }

  /**
   * Unique identifier for the resource. This is the client_operation_id if the client specified it
   * when the mutation was initiated, otherwise, it is generated by the server. The name must be
   * 1-63 characters long and match the regular expression [-a-z0-9]? (output only)
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier for the resource. This is the client_operation_id if the client specified it
   * when the mutation was initiated, otherwise, it is generated by the server. The name must be
   * 1-63 characters long and match the regular expression [-a-z0-9]? (output only)
   * @param id id or {@code null} for none
   */
  public Operation setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#operation".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#operation".
   * @param kind kind or {@code null} for none
   */
  public Operation setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The time that this operation was started by the server. This is in RFC3339 text format (output
   * only).
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTime() {
    return startTime;
  }

  /**
   * The time that this operation was started by the server. This is in RFC3339 text format (output
   * only).
   * @param startTime startTime or {@code null} for none
   */
  public Operation setStartTime(java.lang.String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Status of the operation. Can be one of the following: "PENDING" or "DONE" (output only).
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the operation. Can be one of the following: "PENDING" or "DONE" (output only).
   * @param status status or {@code null} for none
   */
  public Operation setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of the operation. Operations include insert, update, and delete (output only).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of the operation. Operations include insert, update, and delete (output only).
   * @param type type or {@code null} for none
   */
  public Operation setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * User who requested the operation, for example: user@example.com. cloud-dns-system for
   * operations automatically done by the system. (output only)
   * @return value or {@code null} for none
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * User who requested the operation, for example: user@example.com. cloud-dns-system for
   * operations automatically done by the system. (output only)
   * @param user user or {@code null} for none
   */
  public Operation setUser(java.lang.String user) {
    this.user = user;
    return this;
  }

  /**
   * Only populated if the operation targeted a ManagedZone (output only).
   * @return value or {@code null} for none
   */
  public OperationManagedZoneContext getZoneContext() {
    return zoneContext;
  }

  /**
   * Only populated if the operation targeted a ManagedZone (output only).
   * @param zoneContext zoneContext or {@code null} for none
   */
  public Operation setZoneContext(OperationManagedZoneContext zoneContext) {
    this.zoneContext = zoneContext;
    return this;
  }

  @Override
  public Operation set(String fieldName, Object value) {
    return (Operation) super.set(fieldName, value);
  }

  @Override
  public Operation clone() {
    return (Operation) super.clone();
  }

}
