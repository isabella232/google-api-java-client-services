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

package com.google.api.services.serviceconsumermanagement.v1.model;

/**
 * This structure defines a tenant project to be added to the specified tenancy unit and its initial
 * configuration and properties. A project lien will be created for the tenant project to prevent
 * the tenant project from being deleted accidentally. The lien will be deleted as part of tenant
 * project removal.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TenantProjectConfig extends com.google.api.client.json.GenericJson {

  /**
   * Billing account properties.  Billing account must be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BillingConfig billingConfig;

  /**
   * Folder where project in this tenancy unit must be located This folder must have been previously
   * created with proper permissions for the caller to create and configure a project in it. Valid
   * folder resource names have the format `folders/{folder_number}` (for example,
   * `folders/123456`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String folder;

  /**
   * Labels that will be applied to this project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Configuration for IAM service account on tenant project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceAccountConfig serviceAccountConfig;

  /**
   * Google Cloud API names of services that will be activated on this project during provisioning.
   * If any of these services can not be activated, request will fail. For example:
   * 'compute.googleapis.com','cloudfunctions.googleapis.com'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> services;

  /**
   * Describes ownership and policies for the new tenant project. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TenantProjectPolicy tenantProjectPolicy;

  /**
   * Billing account properties.  Billing account must be specified.
   * @return value or {@code null} for none
   */
  public BillingConfig getBillingConfig() {
    return billingConfig;
  }

  /**
   * Billing account properties.  Billing account must be specified.
   * @param billingConfig billingConfig or {@code null} for none
   */
  public TenantProjectConfig setBillingConfig(BillingConfig billingConfig) {
    this.billingConfig = billingConfig;
    return this;
  }

  /**
   * Folder where project in this tenancy unit must be located This folder must have been previously
   * created with proper permissions for the caller to create and configure a project in it. Valid
   * folder resource names have the format `folders/{folder_number}` (for example,
   * `folders/123456`).
   * @return value or {@code null} for none
   */
  public java.lang.String getFolder() {
    return folder;
  }

  /**
   * Folder where project in this tenancy unit must be located This folder must have been previously
   * created with proper permissions for the caller to create and configure a project in it. Valid
   * folder resource names have the format `folders/{folder_number}` (for example,
   * `folders/123456`).
   * @param folder folder or {@code null} for none
   */
  public TenantProjectConfig setFolder(java.lang.String folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Labels that will be applied to this project.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels that will be applied to this project.
   * @param labels labels or {@code null} for none
   */
  public TenantProjectConfig setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Configuration for IAM service account on tenant project.
   * @return value or {@code null} for none
   */
  public ServiceAccountConfig getServiceAccountConfig() {
    return serviceAccountConfig;
  }

  /**
   * Configuration for IAM service account on tenant project.
   * @param serviceAccountConfig serviceAccountConfig or {@code null} for none
   */
  public TenantProjectConfig setServiceAccountConfig(ServiceAccountConfig serviceAccountConfig) {
    this.serviceAccountConfig = serviceAccountConfig;
    return this;
  }

  /**
   * Google Cloud API names of services that will be activated on this project during provisioning.
   * If any of these services can not be activated, request will fail. For example:
   * 'compute.googleapis.com','cloudfunctions.googleapis.com'
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServices() {
    return services;
  }

  /**
   * Google Cloud API names of services that will be activated on this project during provisioning.
   * If any of these services can not be activated, request will fail. For example:
   * 'compute.googleapis.com','cloudfunctions.googleapis.com'
   * @param services services or {@code null} for none
   */
  public TenantProjectConfig setServices(java.util.List<java.lang.String> services) {
    this.services = services;
    return this;
  }

  /**
   * Describes ownership and policies for the new tenant project. Required.
   * @return value or {@code null} for none
   */
  public TenantProjectPolicy getTenantProjectPolicy() {
    return tenantProjectPolicy;
  }

  /**
   * Describes ownership and policies for the new tenant project. Required.
   * @param tenantProjectPolicy tenantProjectPolicy or {@code null} for none
   */
  public TenantProjectConfig setTenantProjectPolicy(TenantProjectPolicy tenantProjectPolicy) {
    this.tenantProjectPolicy = tenantProjectPolicy;
    return this;
  }

  @Override
  public TenantProjectConfig set(String fieldName, Object value) {
    return (TenantProjectConfig) super.set(fieldName, value);
  }

  @Override
  public TenantProjectConfig clone() {
    return (TenantProjectConfig) super.clone();
  }

}
