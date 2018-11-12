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

package com.google.api.services.adexchangebuyer;

/**
 * Service definition for AdExchangeBuyer (v1.2).
 *
 * <p>
 * Accesses your bidding-account information, submits creatives for validation, finds available direct deals, and retrieves performance reports.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/ad-exchange/buyer-rest" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AdExchangeBuyerRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class AdExchangeBuyer extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.27.0 of the Ad Exchange Buyer API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "adexchangebuyer/v1.2/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch/adexchangebuyer/v1.2";

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
  public AdExchangeBuyer(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  AdExchangeBuyer(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Accounts collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code AdExchangeBuyer adexchangebuyer = new AdExchangeBuyer(...);}
   *   {@code AdExchangeBuyer.Accounts.List request = adexchangebuyer.accounts().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Accounts accounts() {
    return new Accounts();
  }

  /**
   * The "accounts" collection of methods.
   */
  public class Accounts {

    /**
     * Gets one account by ID.
     *
     * Create a request for the method "accounts.get".
     *
     * This request holds the parameters needed by the adexchangebuyer server.  After setting any
     * optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param id The account id
     * @return the request
     */
    public Get get(java.lang.Integer id) throws java.io.IOException {
      Get result = new Get(id);
      initialize(result);
      return result;
    }

    public class Get extends AdExchangeBuyerRequest<com.google.api.services.adexchangebuyer.model.Account> {

      private static final String REST_PATH = "accounts/{id}";

      /**
       * Gets one account by ID.
       *
       * Create a request for the method "accounts.get".
       *
       * This request holds the parameters needed by the the adexchangebuyer server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id The account id
       * @since 1.13
       */
      protected Get(java.lang.Integer id) {
        super(AdExchangeBuyer.this, "GET", REST_PATH, null, com.google.api.services.adexchangebuyer.model.Account.class);
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

      /** The account id */
      @com.google.api.client.util.Key
      private java.lang.Integer id;

      /** The account id
       */
      public java.lang.Integer getId() {
        return id;
      }

      /** The account id */
      public Get setId(java.lang.Integer id) {
        this.id = id;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Retrieves the authenticated user's list of accounts.
     *
     * Create a request for the method "accounts.list".
     *
     * This request holds the parameters needed by the adexchangebuyer server.  After setting any
     * optional parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends AdExchangeBuyerRequest<com.google.api.services.adexchangebuyer.model.AccountsList> {

      private static final String REST_PATH = "accounts";

      /**
       * Retrieves the authenticated user's list of accounts.
       *
       * Create a request for the method "accounts.list".
       *
       * This request holds the parameters needed by the the adexchangebuyer server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(AdExchangeBuyer.this, "GET", REST_PATH, null, com.google.api.services.adexchangebuyer.model.AccountsList.class);
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
     * Updates an existing account. This method supports patch semantics.
     *
     * Create a request for the method "accounts.patch".
     *
     * This request holds the parameters needed by the adexchangebuyer server.  After setting any
     * optional parameters, call the {@link Patch#execute()} method to invoke the remote operation.
     *
     * @param id The account id
     * @param content the {@link com.google.api.services.adexchangebuyer.model.Account}
     * @return the request
     */
    public Patch patch(java.lang.Integer id, com.google.api.services.adexchangebuyer.model.Account content) throws java.io.IOException {
      Patch result = new Patch(id, content);
      initialize(result);
      return result;
    }

    public class Patch extends AdExchangeBuyerRequest<com.google.api.services.adexchangebuyer.model.Account> {

      private static final String REST_PATH = "accounts/{id}";

      /**
       * Updates an existing account. This method supports patch semantics.
       *
       * Create a request for the method "accounts.patch".
       *
       * This request holds the parameters needed by the the adexchangebuyer server.  After setting any
       * optional parameters, call the {@link Patch#execute()} method to invoke the remote operation.
       * <p> {@link
       * Patch#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id The account id
       * @param content the {@link com.google.api.services.adexchangebuyer.model.Account}
       * @since 1.13
       */
      protected Patch(java.lang.Integer id, com.google.api.services.adexchangebuyer.model.Account content) {
        super(AdExchangeBuyer.this, "PATCH", REST_PATH, content, com.google.api.services.adexchangebuyer.model.Account.class);
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

      /** The account id */
      @com.google.api.client.util.Key
      private java.lang.Integer id;

      /** The account id
       */
      public java.lang.Integer getId() {
        return id;
      }

      /** The account id */
      public Patch setId(java.lang.Integer id) {
        this.id = id;
        return this;
      }

      @Override
      public Patch set(String parameterName, Object value) {
        return (Patch) super.set(parameterName, value);
      }
    }
    /**
     * Updates an existing account.
     *
     * Create a request for the method "accounts.update".
     *
     * This request holds the parameters needed by the adexchangebuyer server.  After setting any
     * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
     *
     * @param id The account id
     * @param content the {@link com.google.api.services.adexchangebuyer.model.Account}
     * @return the request
     */
    public Update update(java.lang.Integer id, com.google.api.services.adexchangebuyer.model.Account content) throws java.io.IOException {
      Update result = new Update(id, content);
      initialize(result);
      return result;
    }

    public class Update extends AdExchangeBuyerRequest<com.google.api.services.adexchangebuyer.model.Account> {

      private static final String REST_PATH = "accounts/{id}";

      /**
       * Updates an existing account.
       *
       * Create a request for the method "accounts.update".
       *
       * This request holds the parameters needed by the the adexchangebuyer server.  After setting any
       * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
       * <p> {@link
       * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id The account id
       * @param content the {@link com.google.api.services.adexchangebuyer.model.Account}
       * @since 1.13
       */
      protected Update(java.lang.Integer id, com.google.api.services.adexchangebuyer.model.Account content) {
        super(AdExchangeBuyer.this, "PUT", REST_PATH, content, com.google.api.services.adexchangebuyer.model.Account.class);
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

      /** The account id */
      @com.google.api.client.util.Key
      private java.lang.Integer id;

      /** The account id
       */
      public java.lang.Integer getId() {
        return id;
      }

      /** The account id */
      public Update setId(java.lang.Integer id) {
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
   * An accessor for creating requests from the Creatives collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code AdExchangeBuyer adexchangebuyer = new AdExchangeBuyer(...);}
   *   {@code AdExchangeBuyer.Creatives.List request = adexchangebuyer.creatives().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Creatives creatives() {
    return new Creatives();
  }

  /**
   * The "creatives" collection of methods.
   */
  public class Creatives {

    /**
     * Gets the status for a single creative. A creative will be available 30-40 minutes after
     * submission.
     *
     * Create a request for the method "creatives.get".
     *
     * This request holds the parameters needed by the adexchangebuyer server.  After setting any
     * optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param accountId The id for the account that will serve this creative.
     * @param buyerCreativeId The buyer-specific id for this creative.
     * @return the request
     */
    public Get get(java.lang.Integer accountId, java.lang.String buyerCreativeId) throws java.io.IOException {
      Get result = new Get(accountId, buyerCreativeId);
      initialize(result);
      return result;
    }

    public class Get extends AdExchangeBuyerRequest<com.google.api.services.adexchangebuyer.model.Creative> {

      private static final String REST_PATH = "creatives/{accountId}/{buyerCreativeId}";

      /**
       * Gets the status for a single creative. A creative will be available 30-40 minutes after
       * submission.
       *
       * Create a request for the method "creatives.get".
       *
       * This request holds the parameters needed by the the adexchangebuyer server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param accountId The id for the account that will serve this creative.
       * @param buyerCreativeId The buyer-specific id for this creative.
       * @since 1.13
       */
      protected Get(java.lang.Integer accountId, java.lang.String buyerCreativeId) {
        super(AdExchangeBuyer.this, "GET", REST_PATH, null, com.google.api.services.adexchangebuyer.model.Creative.class);
        this.accountId = com.google.api.client.util.Preconditions.checkNotNull(accountId, "Required parameter accountId must be specified.");
        this.buyerCreativeId = com.google.api.client.util.Preconditions.checkNotNull(buyerCreativeId, "Required parameter buyerCreativeId must be specified.");
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

      /** The id for the account that will serve this creative. */
      @com.google.api.client.util.Key
      private java.lang.Integer accountId;

      /** The id for the account that will serve this creative.
       */
      public java.lang.Integer getAccountId() {
        return accountId;
      }

      /** The id for the account that will serve this creative. */
      public Get setAccountId(java.lang.Integer accountId) {
        this.accountId = accountId;
        return this;
      }

      /** The buyer-specific id for this creative. */
      @com.google.api.client.util.Key
      private java.lang.String buyerCreativeId;

      /** The buyer-specific id for this creative.
       */
      public java.lang.String getBuyerCreativeId() {
        return buyerCreativeId;
      }

      /** The buyer-specific id for this creative. */
      public Get setBuyerCreativeId(java.lang.String buyerCreativeId) {
        this.buyerCreativeId = buyerCreativeId;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Submit a new creative.
     *
     * Create a request for the method "creatives.insert".
     *
     * This request holds the parameters needed by the adexchangebuyer server.  After setting any
     * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.adexchangebuyer.model.Creative}
     * @return the request
     */
    public Insert insert(com.google.api.services.adexchangebuyer.model.Creative content) throws java.io.IOException {
      Insert result = new Insert(content);
      initialize(result);
      return result;
    }

    public class Insert extends AdExchangeBuyerRequest<com.google.api.services.adexchangebuyer.model.Creative> {

      private static final String REST_PATH = "creatives";

      /**
       * Submit a new creative.
       *
       * Create a request for the method "creatives.insert".
       *
       * This request holds the parameters needed by the the adexchangebuyer server.  After setting any
       * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
       * <p> {@link
       * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.adexchangebuyer.model.Creative}
       * @since 1.13
       */
      protected Insert(com.google.api.services.adexchangebuyer.model.Creative content) {
        super(AdExchangeBuyer.this, "POST", REST_PATH, content, com.google.api.services.adexchangebuyer.model.Creative.class);
        checkRequiredParameter(content, "content");
        checkRequiredParameter(content.getAccountId(), "Creative.getAccountId()");
        checkRequiredParameter(content, "content");
        checkRequiredParameter(content.getAdvertiserName(), "Creative.getAdvertiserName()");
        checkRequiredParameter(content, "content");
        checkRequiredParameter(content.getBuyerCreativeId(), "Creative.getBuyerCreativeId()");
        checkRequiredParameter(content, "content");
        checkRequiredParameter(content.getHeight(), "Creative.getHeight()");
        checkRequiredParameter(content, "content");
        checkRequiredParameter(content.getWidth(), "Creative.getWidth()");
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

      @Override
      public Insert set(String parameterName, Object value) {
        return (Insert) super.set(parameterName, value);
      }
    }
    /**
     * Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40
     * minutes after submission.
     *
     * Create a request for the method "creatives.list".
     *
     * This request holds the parameters needed by the adexchangebuyer server.  After setting any
     * optional parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends AdExchangeBuyerRequest<com.google.api.services.adexchangebuyer.model.CreativesList> {

      private static final String REST_PATH = "creatives";

      /**
       * Retrieves a list of the authenticated user's active creatives. A creative will be available
       * 30-40 minutes after submission.
       *
       * Create a request for the method "creatives.list".
       *
       * This request holds the parameters needed by the the adexchangebuyer server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(AdExchangeBuyer.this, "GET", REST_PATH, null, com.google.api.services.adexchangebuyer.model.CreativesList.class);
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

      /**
       * Maximum number of entries returned on one result page. If not set, the default is 100.
       * Optional.
       */
      @com.google.api.client.util.Key
      private java.lang.Long maxResults;

      /** Maximum number of entries returned on one result page. If not set, the default is 100. Optional.

     [minimum: 1] [maximum: 1000]
       */
      public java.lang.Long getMaxResults() {
        return maxResults;
      }

      /**
       * Maximum number of entries returned on one result page. If not set, the default is 100.
       * Optional.
       */
      public List setMaxResults(java.lang.Long maxResults) {
        this.maxResults = maxResults;
        return this;
      }

      /**
       * A continuation token, used to page through ad clients. To retrieve the next page, set this
       * parameter to the value of "nextPageToken" from the previous response. Optional.
       */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** A continuation token, used to page through ad clients. To retrieve the next page, set this
     parameter to the value of "nextPageToken" from the previous response. Optional.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /**
       * A continuation token, used to page through ad clients. To retrieve the next page, set this
       * parameter to the value of "nextPageToken" from the previous response. Optional.
       */
      public List setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      /** When specified, only creatives having the given status are returned. */
      @com.google.api.client.util.Key
      private java.lang.String statusFilter;

      /** When specified, only creatives having the given status are returned.
       */
      public java.lang.String getStatusFilter() {
        return statusFilter;
      }

      /** When specified, only creatives having the given status are returned. */
      public List setStatusFilter(java.lang.String statusFilter) {
        this.statusFilter = statusFilter;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link AdExchangeBuyer}.
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

    /** Builds a new instance of {@link AdExchangeBuyer}. */
    @Override
    public AdExchangeBuyer build() {
      return new AdExchangeBuyer(this);
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
     * Set the {@link AdExchangeBuyerRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAdExchangeBuyerRequestInitializer(
        AdExchangeBuyerRequestInitializer adexchangebuyerRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(adexchangebuyerRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
