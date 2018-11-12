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

package com.google.api.services.books.model;

/**
 * Model definition for Series.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Series extends com.google.api.client.json.GenericJson {

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SeriesSeries> series;

  static {
    // hack to force ProGuard to consider SeriesSeries used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SeriesSeries.class);
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public Series setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<SeriesSeries> getSeries() {
    return series;
  }

  /**
   * @param series series or {@code null} for none
   */
  public Series setSeries(java.util.List<SeriesSeries> series) {
    this.series = series;
    return this;
  }

  @Override
  public Series set(String fieldName, Object value) {
    return (Series) super.set(fieldName, value);
  }

  @Override
  public Series clone() {
    return (Series) super.clone();
  }

  /**
   * Model definition for SeriesSeries.
   */
  public static final class SeriesSeries extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String bannerImageUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String imageUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String seriesId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String seriesType;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBannerImageUrl() {
      return bannerImageUrl;
    }

    /**
     * @param bannerImageUrl bannerImageUrl or {@code null} for none
     */
    public SeriesSeries setBannerImageUrl(java.lang.String bannerImageUrl) {
      this.bannerImageUrl = bannerImageUrl;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getImageUrl() {
      return imageUrl;
    }

    /**
     * @param imageUrl imageUrl or {@code null} for none
     */
    public SeriesSeries setImageUrl(java.lang.String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSeriesId() {
      return seriesId;
    }

    /**
     * @param seriesId seriesId or {@code null} for none
     */
    public SeriesSeries setSeriesId(java.lang.String seriesId) {
      this.seriesId = seriesId;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSeriesType() {
      return seriesType;
    }

    /**
     * @param seriesType seriesType or {@code null} for none
     */
    public SeriesSeries setSeriesType(java.lang.String seriesType) {
      this.seriesType = seriesType;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getTitle() {
      return title;
    }

    /**
     * @param title title or {@code null} for none
     */
    public SeriesSeries setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    @Override
    public SeriesSeries set(String fieldName, Object value) {
      return (SeriesSeries) super.set(fieldName, value);
    }

    @Override
    public SeriesSeries clone() {
      return (SeriesSeries) super.clone();
    }

  }

}
