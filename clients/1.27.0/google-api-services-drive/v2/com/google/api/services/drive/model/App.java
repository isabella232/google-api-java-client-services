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
 * The apps resource provides a list of the apps that a user has installed, with information about
 * each app's supported MIME types, file extensions, and other details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class App extends com.google.api.client.json.GenericJson {

  /**
   * Whether the app is authorized to access data on the user's Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean authorized;

  /**
   * The template url to create a new file with this app in a given folder. The template will
   * contain {folderId} to be replaced by the folder to create the new file in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createInFolderTemplate;

  /**
   * The url to create a new file with this app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createUrl;

  /**
   * Whether the app has drive-wide scope. An app with drive-wide scope can access all files in the
   * user's drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasDriveWideScope;

  /**
   * The various icons for the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Icons> icons;

  static {
    // hack to force ProGuard to consider Icons used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Icons.class);
  }

  /**
   * The ID of the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Whether the app is installed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean installed;

  /**
   * This is always drive#app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A long description of the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String longDescription;

  /**
   * The name of the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The type of object this app creates (e.g. Chart). If empty, the app name should be used
   * instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectType;

  /**
   * The template url for opening files with this app. The template will contain {ids} and/or
   * {exportIds} to be replaced by the actual file ids. See  Open Files  for the full documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String openUrlTemplate;

  /**
   * The list of primary file extensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> primaryFileExtensions;

  /**
   * The list of primary mime types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> primaryMimeTypes;

  /**
   * The ID of the product listing for this app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * A link to the product listing for this app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productUrl;

  /**
   * The list of secondary file extensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> secondaryFileExtensions;

  /**
   * The list of secondary mime types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> secondaryMimeTypes;

  /**
   * A short description of the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shortDescription;

  /**
   * Whether this app supports creating new objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportsCreate;

  /**
   * Whether this app supports importing Google Docs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportsImport;

  /**
   * Whether this app supports opening more than one file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportsMultiOpen;

  /**
   * Whether this app supports creating new files when offline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportsOfflineCreate;

  /**
   * Whether the app is selected as the default handler for the types it supports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useByDefault;

  /**
   * Whether the app is authorized to access data on the user's Drive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAuthorized() {
    return authorized;
  }

  /**
   * Whether the app is authorized to access data on the user's Drive.
   * @param authorized authorized or {@code null} for none
   */
  public App setAuthorized(java.lang.Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

  /**
   * The template url to create a new file with this app in a given folder. The template will
   * contain {folderId} to be replaced by the folder to create the new file in.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreateInFolderTemplate() {
    return createInFolderTemplate;
  }

  /**
   * The template url to create a new file with this app in a given folder. The template will
   * contain {folderId} to be replaced by the folder to create the new file in.
   * @param createInFolderTemplate createInFolderTemplate or {@code null} for none
   */
  public App setCreateInFolderTemplate(java.lang.String createInFolderTemplate) {
    this.createInFolderTemplate = createInFolderTemplate;
    return this;
  }

  /**
   * The url to create a new file with this app.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreateUrl() {
    return createUrl;
  }

  /**
   * The url to create a new file with this app.
   * @param createUrl createUrl or {@code null} for none
   */
  public App setCreateUrl(java.lang.String createUrl) {
    this.createUrl = createUrl;
    return this;
  }

  /**
   * Whether the app has drive-wide scope. An app with drive-wide scope can access all files in the
   * user's drive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasDriveWideScope() {
    return hasDriveWideScope;
  }

  /**
   * Whether the app has drive-wide scope. An app with drive-wide scope can access all files in the
   * user's drive.
   * @param hasDriveWideScope hasDriveWideScope or {@code null} for none
   */
  public App setHasDriveWideScope(java.lang.Boolean hasDriveWideScope) {
    this.hasDriveWideScope = hasDriveWideScope;
    return this;
  }

  /**
   * The various icons for the app.
   * @return value or {@code null} for none
   */
  public java.util.List<Icons> getIcons() {
    return icons;
  }

  /**
   * The various icons for the app.
   * @param icons icons or {@code null} for none
   */
  public App setIcons(java.util.List<Icons> icons) {
    this.icons = icons;
    return this;
  }

  /**
   * The ID of the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the app.
   * @param id id or {@code null} for none
   */
  public App setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Whether the app is installed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInstalled() {
    return installed;
  }

  /**
   * Whether the app is installed.
   * @param installed installed or {@code null} for none
   */
  public App setInstalled(java.lang.Boolean installed) {
    this.installed = installed;
    return this;
  }

  /**
   * This is always drive#app.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always drive#app.
   * @param kind kind or {@code null} for none
   */
  public App setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A long description of the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getLongDescription() {
    return longDescription;
  }

  /**
   * A long description of the app.
   * @param longDescription longDescription or {@code null} for none
   */
  public App setLongDescription(java.lang.String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

  /**
   * The name of the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the app.
   * @param name name or {@code null} for none
   */
  public App setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The type of object this app creates (e.g. Chart). If empty, the app name should be used
   * instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectType() {
    return objectType;
  }

  /**
   * The type of object this app creates (e.g. Chart). If empty, the app name should be used
   * instead.
   * @param objectType objectType or {@code null} for none
   */
  public App setObjectType(java.lang.String objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * The template url for opening files with this app. The template will contain {ids} and/or
   * {exportIds} to be replaced by the actual file ids. See  Open Files  for the full documentation.
   * @return value or {@code null} for none
   */
  public java.lang.String getOpenUrlTemplate() {
    return openUrlTemplate;
  }

  /**
   * The template url for opening files with this app. The template will contain {ids} and/or
   * {exportIds} to be replaced by the actual file ids. See  Open Files  for the full documentation.
   * @param openUrlTemplate openUrlTemplate or {@code null} for none
   */
  public App setOpenUrlTemplate(java.lang.String openUrlTemplate) {
    this.openUrlTemplate = openUrlTemplate;
    return this;
  }

  /**
   * The list of primary file extensions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrimaryFileExtensions() {
    return primaryFileExtensions;
  }

  /**
   * The list of primary file extensions.
   * @param primaryFileExtensions primaryFileExtensions or {@code null} for none
   */
  public App setPrimaryFileExtensions(java.util.List<java.lang.String> primaryFileExtensions) {
    this.primaryFileExtensions = primaryFileExtensions;
    return this;
  }

  /**
   * The list of primary mime types.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrimaryMimeTypes() {
    return primaryMimeTypes;
  }

  /**
   * The list of primary mime types.
   * @param primaryMimeTypes primaryMimeTypes or {@code null} for none
   */
  public App setPrimaryMimeTypes(java.util.List<java.lang.String> primaryMimeTypes) {
    this.primaryMimeTypes = primaryMimeTypes;
    return this;
  }

  /**
   * The ID of the product listing for this app.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product listing for this app.
   * @param productId productId or {@code null} for none
   */
  public App setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * A link to the product listing for this app.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductUrl() {
    return productUrl;
  }

  /**
   * A link to the product listing for this app.
   * @param productUrl productUrl or {@code null} for none
   */
  public App setProductUrl(java.lang.String productUrl) {
    this.productUrl = productUrl;
    return this;
  }

  /**
   * The list of secondary file extensions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSecondaryFileExtensions() {
    return secondaryFileExtensions;
  }

  /**
   * The list of secondary file extensions.
   * @param secondaryFileExtensions secondaryFileExtensions or {@code null} for none
   */
  public App setSecondaryFileExtensions(java.util.List<java.lang.String> secondaryFileExtensions) {
    this.secondaryFileExtensions = secondaryFileExtensions;
    return this;
  }

  /**
   * The list of secondary mime types.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSecondaryMimeTypes() {
    return secondaryMimeTypes;
  }

  /**
   * The list of secondary mime types.
   * @param secondaryMimeTypes secondaryMimeTypes or {@code null} for none
   */
  public App setSecondaryMimeTypes(java.util.List<java.lang.String> secondaryMimeTypes) {
    this.secondaryMimeTypes = secondaryMimeTypes;
    return this;
  }

  /**
   * A short description of the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getShortDescription() {
    return shortDescription;
  }

  /**
   * A short description of the app.
   * @param shortDescription shortDescription or {@code null} for none
   */
  public App setShortDescription(java.lang.String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Whether this app supports creating new objects.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportsCreate() {
    return supportsCreate;
  }

  /**
   * Whether this app supports creating new objects.
   * @param supportsCreate supportsCreate or {@code null} for none
   */
  public App setSupportsCreate(java.lang.Boolean supportsCreate) {
    this.supportsCreate = supportsCreate;
    return this;
  }

  /**
   * Whether this app supports importing Google Docs.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportsImport() {
    return supportsImport;
  }

  /**
   * Whether this app supports importing Google Docs.
   * @param supportsImport supportsImport or {@code null} for none
   */
  public App setSupportsImport(java.lang.Boolean supportsImport) {
    this.supportsImport = supportsImport;
    return this;
  }

  /**
   * Whether this app supports opening more than one file.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportsMultiOpen() {
    return supportsMultiOpen;
  }

  /**
   * Whether this app supports opening more than one file.
   * @param supportsMultiOpen supportsMultiOpen or {@code null} for none
   */
  public App setSupportsMultiOpen(java.lang.Boolean supportsMultiOpen) {
    this.supportsMultiOpen = supportsMultiOpen;
    return this;
  }

  /**
   * Whether this app supports creating new files when offline.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportsOfflineCreate() {
    return supportsOfflineCreate;
  }

  /**
   * Whether this app supports creating new files when offline.
   * @param supportsOfflineCreate supportsOfflineCreate or {@code null} for none
   */
  public App setSupportsOfflineCreate(java.lang.Boolean supportsOfflineCreate) {
    this.supportsOfflineCreate = supportsOfflineCreate;
    return this;
  }

  /**
   * Whether the app is selected as the default handler for the types it supports.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseByDefault() {
    return useByDefault;
  }

  /**
   * Whether the app is selected as the default handler for the types it supports.
   * @param useByDefault useByDefault or {@code null} for none
   */
  public App setUseByDefault(java.lang.Boolean useByDefault) {
    this.useByDefault = useByDefault;
    return this;
  }

  @Override
  public App set(String fieldName, Object value) {
    return (App) super.set(fieldName, value);
  }

  @Override
  public App clone() {
    return (App) super.clone();
  }

  /**
   * Model definition for AppIcons.
   */
  public static final class Icons extends com.google.api.client.json.GenericJson {

    /**
     * Category of the icon. Allowed values are: - application - icon for the application  - document
     * - icon for a file associated with the app  - documentShared - icon for a shared file associated
     * with the app
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String category;

    /**
     * URL for the icon.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String iconUrl;

    /**
     * Size of the icon. Represented as the maximum of the width and height.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer size;

    /**
     * Category of the icon. Allowed values are: - application - icon for the application  - document
     * - icon for a file associated with the app  - documentShared - icon for a shared file associated
     * with the app
     * @return value or {@code null} for none
     */
    public java.lang.String getCategory() {
      return category;
    }

    /**
     * Category of the icon. Allowed values are: - application - icon for the application  - document
     * - icon for a file associated with the app  - documentShared - icon for a shared file associated
     * with the app
     * @param category category or {@code null} for none
     */
    public Icons setCategory(java.lang.String category) {
      this.category = category;
      return this;
    }

    /**
     * URL for the icon.
     * @return value or {@code null} for none
     */
    public java.lang.String getIconUrl() {
      return iconUrl;
    }

    /**
     * URL for the icon.
     * @param iconUrl iconUrl or {@code null} for none
     */
    public Icons setIconUrl(java.lang.String iconUrl) {
      this.iconUrl = iconUrl;
      return this;
    }

    /**
     * Size of the icon. Represented as the maximum of the width and height.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getSize() {
      return size;
    }

    /**
     * Size of the icon. Represented as the maximum of the width and height.
     * @param size size or {@code null} for none
     */
    public Icons setSize(java.lang.Integer size) {
      this.size = size;
      return this;
    }

    @Override
    public Icons set(String fieldName, Object value) {
      return (Icons) super.set(fieldName, value);
    }

    @Override
    public Icons clone() {
      return (Icons) super.clone();
    }

  }

}
