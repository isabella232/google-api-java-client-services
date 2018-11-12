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

package com.google.api.services.siteVerification;

/**
 * Service definition for SiteVerification (v1).
 *
 * <p>
 * Verifies ownership of websites or domains with Google.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/site-verification/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link SiteVerificationRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class SiteVerification extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.27.0 of the Google Site Verification API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "siteVerification/v1/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch/siteVerification/v1";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public SiteVerification(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  SiteVerification(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the WebResource collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code SiteVerification siteVerification = new SiteVerification(...);}
   *   {@code SiteVerification.WebResource.List request = siteVerification.webResource().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public WebResource webResource() {
    return new WebResource();
  }

  /**
   * The "webResource" collection of methods.
   */
  public class WebResource {

    /**
     * Relinquish ownership of a website or domain.
     *
     * Create a request for the method "webResource.delete".
     *
     * This request holds the parameters needed by the siteVerification server.  After setting any
     * optional parameters, call the {@link Delete#execute()} method to invoke the remote operation.
     *
     * @param id The id of a verified site or domain.
     * @return the request
     */
    public Delete delete(java.lang.String id) throws java.io.IOException {
      Delete result = new Delete(id);
      initialize(result);
      return result;
    }

    public class Delete extends SiteVerificationRequest<Void> {

      private static final String REST_PATH = "webResource/{id}";

      /**
       * Relinquish ownership of a website or domain.
       *
       * Create a request for the method "webResource.delete".
       *
       * This request holds the parameters needed by the the siteVerification server.  After setting any
       * optional parameters, call the {@link Delete#execute()} method to invoke the remote operation.
       * <p> {@link
       * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id The id of a verified site or domain.
       * @since 1.13
       */
      protected Delete(java.lang.String id) {
        super(SiteVerification.this, "DELETE", REST_PATH, null, Void.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public Delete setAlt(java.lang.String alt) {
        return (Delete) super.setAlt(alt);
      }

      @Override
      public Delete setFields(java.lang.String fields) {
        return (Delete) super.setFields(fields);
      }

      @Override
      public Delete setKey(java.lang.String key) {
        return (Delete) super.setKey(key);
      }

      @Override
      public Delete setOauthToken(java.lang.String oauthToken) {
        return (Delete) super.setOauthToken(oauthToken);
      }

      @Override
      public Delete setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Delete) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Delete setQuotaUser(java.lang.String quotaUser) {
        return (Delete) super.setQuotaUser(quotaUser);
      }

      @Override
      public Delete setUserIp(java.lang.String userIp) {
        return (Delete) super.setUserIp(userIp);
      }

      /** The id of a verified site or domain. */
      @com.google.api.client.util.Key
      private java.lang.String id;

      /** The id of a verified site or domain.
       */
      public java.lang.String getId() {
        return id;
      }

      /** The id of a verified site or domain. */
      public Delete setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public Delete set(String parameterName, Object value) {
        return (Delete) super.set(parameterName, value);
      }
    }
    /**
     * Get the most current data for a website or domain.
     *
     * Create a request for the method "webResource.get".
     *
     * This request holds the parameters needed by the siteVerification server.  After setting any
     * optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param id The id of a verified site or domain.
     * @return the request
     */
    public Get get(java.lang.String id) throws java.io.IOException {
      Get result = new Get(id);
      initialize(result);
      return result;
    }

    public class Get extends SiteVerificationRequest<com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource> {

      private static final String REST_PATH = "webResource/{id}";

      /**
       * Get the most current data for a website or domain.
       *
       * Create a request for the method "webResource.get".
       *
       * This request holds the parameters needed by the the siteVerification server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id The id of a verified site or domain.
       * @since 1.13
       */
      protected Get(java.lang.String id) {
        super(SiteVerification.this, "GET", REST_PATH, null, com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      /** The id of a verified site or domain. */
      @com.google.api.client.util.Key
      private java.lang.String id;

      /** The id of a verified site or domain.
       */
      public java.lang.String getId() {
        return id;
      }

      /** The id of a verified site or domain. */
      public Get setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Get a verification token for placing on a website or domain.
     *
     * Create a request for the method "webResource.getToken".
     *
     * This request holds the parameters needed by the siteVerification server.  After setting any
     * optional parameters, call the {@link GetToken#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.siteVerification.model.SiteVerificationWebResourceGettokenRequest}
     * @return the request
     */
    public GetToken getToken(com.google.api.services.siteVerification.model.SiteVerificationWebResourceGettokenRequest content) throws java.io.IOException {
      GetToken result = new GetToken(content);
      initialize(result);
      return result;
    }

    public class GetToken extends SiteVerificationRequest<com.google.api.services.siteVerification.model.SiteVerificationWebResourceGettokenResponse> {

      private static final String REST_PATH = "token";

      /**
       * Get a verification token for placing on a website or domain.
       *
       * Create a request for the method "webResource.getToken".
       *
       * This request holds the parameters needed by the the siteVerification server.  After setting any
       * optional parameters, call the {@link GetToken#execute()} method to invoke the remote operation.
       * <p> {@link
       * GetToken#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.siteVerification.model.SiteVerificationWebResourceGettokenRequest}
       * @since 1.13
       */
      protected GetToken(com.google.api.services.siteVerification.model.SiteVerificationWebResourceGettokenRequest content) {
        super(SiteVerification.this, "POST", REST_PATH, content, com.google.api.services.siteVerification.model.SiteVerificationWebResourceGettokenResponse.class);
      }

      @Override
      public GetToken setAlt(java.lang.String alt) {
        return (GetToken) super.setAlt(alt);
      }

      @Override
      public GetToken setFields(java.lang.String fields) {
        return (GetToken) super.setFields(fields);
      }

      @Override
      public GetToken setKey(java.lang.String key) {
        return (GetToken) super.setKey(key);
      }

      @Override
      public GetToken setOauthToken(java.lang.String oauthToken) {
        return (GetToken) super.setOauthToken(oauthToken);
      }

      @Override
      public GetToken setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetToken) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetToken setQuotaUser(java.lang.String quotaUser) {
        return (GetToken) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetToken setUserIp(java.lang.String userIp) {
        return (GetToken) super.setUserIp(userIp);
      }

      @Override
      public GetToken set(String parameterName, Object value) {
        return (GetToken) super.set(parameterName, value);
      }
    }
    /**
     * Attempt verification of a website or domain.
     *
     * Create a request for the method "webResource.insert".
     *
     * This request holds the parameters needed by the siteVerification server.  After setting any
     * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
     *
     * @param verificationMethod The method to use for verifying a site or domain.
     * @param content the {@link com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource}
     * @return the request
     */
    public Insert insert(java.lang.String verificationMethod, com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource content) throws java.io.IOException {
      Insert result = new Insert(verificationMethod, content);
      initialize(result);
      return result;
    }

    public class Insert extends SiteVerificationRequest<com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource> {

      private static final String REST_PATH = "webResource";

      /**
       * Attempt verification of a website or domain.
       *
       * Create a request for the method "webResource.insert".
       *
       * This request holds the parameters needed by the the siteVerification server.  After setting any
       * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
       * <p> {@link
       * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param verificationMethod The method to use for verifying a site or domain.
       * @param content the {@link com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource}
       * @since 1.13
       */
      protected Insert(java.lang.String verificationMethod, com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource content) {
        super(SiteVerification.this, "POST", REST_PATH, content, com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource.class);
        this.verificationMethod = com.google.api.client.util.Preconditions.checkNotNull(verificationMethod, "Required parameter verificationMethod must be specified.");
      }

      @Override
      public Insert setAlt(java.lang.String alt) {
        return (Insert) super.setAlt(alt);
      }

      @Override
      public Insert setFields(java.lang.String fields) {
        return (Insert) super.setFields(fields);
      }

      @Override
      public Insert setKey(java.lang.String key) {
        return (Insert) super.setKey(key);
      }

      @Override
      public Insert setOauthToken(java.lang.String oauthToken) {
        return (Insert) super.setOauthToken(oauthToken);
      }

      @Override
      public Insert setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Insert) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Insert setQuotaUser(java.lang.String quotaUser) {
        return (Insert) super.setQuotaUser(quotaUser);
      }

      @Override
      public Insert setUserIp(java.lang.String userIp) {
        return (Insert) super.setUserIp(userIp);
      }

      /** The method to use for verifying a site or domain. */
      @com.google.api.client.util.Key
      private java.lang.String verificationMethod;

      /** The method to use for verifying a site or domain.
       */
      public java.lang.String getVerificationMethod() {
        return verificationMethod;
      }

      /** The method to use for verifying a site or domain. */
      public Insert setVerificationMethod(java.lang.String verificationMethod) {
        this.verificationMethod = verificationMethod;
        return this;
      }

      @Override
      public Insert set(String parameterName, Object value) {
        return (Insert) super.set(parameterName, value);
      }
    }
    /**
     * Get the list of your verified websites and domains.
     *
     * Create a request for the method "webResource.list".
     *
     * This request holds the parameters needed by the siteVerification server.  After setting any
     * optional parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends SiteVerificationRequest<com.google.api.services.siteVerification.model.SiteVerificationWebResourceListResponse> {

      private static final String REST_PATH = "webResource";

      /**
       * Get the list of your verified websites and domains.
       *
       * Create a request for the method "webResource.list".
       *
       * This request holds the parameters needed by the the siteVerification server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(SiteVerification.this, "GET", REST_PATH, null, com.google.api.services.siteVerification.model.SiteVerificationWebResourceListResponse.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUserIp(java.lang.String userIp) {
        return (List) super.setUserIp(userIp);
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }
    /**
     * Modify the list of owners for your website or domain. This method supports patch semantics.
     *
     * Create a request for the method "webResource.patch".
     *
     * This request holds the parameters needed by the siteVerification server.  After setting any
     * optional parameters, call the {@link Patch#execute()} method to invoke the remote operation.
     *
     * @param id The id of a verified site or domain.
     * @param content the {@link com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource}
     * @return the request
     */
    public Patch patch(java.lang.String id, com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource content) throws java.io.IOException {
      Patch result = new Patch(id, content);
      initialize(result);
      return result;
    }

    public class Patch extends SiteVerificationRequest<com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource> {

      private static final String REST_PATH = "webResource/{id}";

      /**
       * Modify the list of owners for your website or domain. This method supports patch semantics.
       *
       * Create a request for the method "webResource.patch".
       *
       * This request holds the parameters needed by the the siteVerification server.  After setting any
       * optional parameters, call the {@link Patch#execute()} method to invoke the remote operation.
       * <p> {@link
       * Patch#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id The id of a verified site or domain.
       * @param content the {@link com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource}
       * @since 1.13
       */
      protected Patch(java.lang.String id, com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource content) {
        super(SiteVerification.this, "PATCH", REST_PATH, content, com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public Patch setAlt(java.lang.String alt) {
        return (Patch) super.setAlt(alt);
      }

      @Override
      public Patch setFields(java.lang.String fields) {
        return (Patch) super.setFields(fields);
      }

      @Override
      public Patch setKey(java.lang.String key) {
        return (Patch) super.setKey(key);
      }

      @Override
      public Patch setOauthToken(java.lang.String oauthToken) {
        return (Patch) super.setOauthToken(oauthToken);
      }

      @Override
      public Patch setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Patch) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Patch setQuotaUser(java.lang.String quotaUser) {
        return (Patch) super.setQuotaUser(quotaUser);
      }

      @Override
      public Patch setUserIp(java.lang.String userIp) {
        return (Patch) super.setUserIp(userIp);
      }

      /** The id of a verified site or domain. */
      @com.google.api.client.util.Key
      private java.lang.String id;

      /** The id of a verified site or domain.
       */
      public java.lang.String getId() {
        return id;
      }

      /** The id of a verified site or domain. */
      public Patch setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public Patch set(String parameterName, Object value) {
        return (Patch) super.set(parameterName, value);
      }
    }
    /**
     * Modify the list of owners for your website or domain.
     *
     * Create a request for the method "webResource.update".
     *
     * This request holds the parameters needed by the siteVerification server.  After setting any
     * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
     *
     * @param id The id of a verified site or domain.
     * @param content the {@link com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource}
     * @return the request
     */
    public Update update(java.lang.String id, com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource content) throws java.io.IOException {
      Update result = new Update(id, content);
      initialize(result);
      return result;
    }

    public class Update extends SiteVerificationRequest<com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource> {

      private static final String REST_PATH = "webResource/{id}";

      /**
       * Modify the list of owners for your website or domain.
       *
       * Create a request for the method "webResource.update".
       *
       * This request holds the parameters needed by the the siteVerification server.  After setting any
       * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
       * <p> {@link
       * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id The id of a verified site or domain.
       * @param content the {@link com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource}
       * @since 1.13
       */
      protected Update(java.lang.String id, com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource content) {
        super(SiteVerification.this, "PUT", REST_PATH, content, com.google.api.services.siteVerification.model.SiteVerificationWebResourceResource.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public Update setAlt(java.lang.String alt) {
        return (Update) super.setAlt(alt);
      }

      @Override
      public Update setFields(java.lang.String fields) {
        return (Update) super.setFields(fields);
      }

      @Override
      public Update setKey(java.lang.String key) {
        return (Update) super.setKey(key);
      }

      @Override
      public Update setOauthToken(java.lang.String oauthToken) {
        return (Update) super.setOauthToken(oauthToken);
      }

      @Override
      public Update setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Update) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Update setQuotaUser(java.lang.String quotaUser) {
        return (Update) super.setQuotaUser(quotaUser);
      }

      @Override
      public Update setUserIp(java.lang.String userIp) {
        return (Update) super.setUserIp(userIp);
      }

      /** The id of a verified site or domain. */
      @com.google.api.client.util.Key
      private java.lang.String id;

      /** The id of a verified site or domain.
       */
      public java.lang.String getId() {
        return id;
      }

      /** The id of a verified site or domain. */
      public Update setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public Update set(String parameterName, Object value) {
        return (Update) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link SiteVerification}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link SiteVerification}. */
    @Override
    public SiteVerification build() {
      return new SiteVerification(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link SiteVerificationRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setSiteVerificationRequestInitializer(
        SiteVerificationRequestInitializer siteverificationRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(siteverificationRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
