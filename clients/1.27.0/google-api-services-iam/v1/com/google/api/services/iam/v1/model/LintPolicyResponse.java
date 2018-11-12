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

package com.google.api.services.iam.v1.model;

/**
 * The response of a lint operation. An empty response indicates the operation was able to fully
 * execute and no lint issue was found.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LintPolicyResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of lint results sorted by a composite  key, descending order of severity and ascending
   * order of binding_ordinal. There is no certain order among the same keys.
   *
   * For cross-binding results (only if the input object to lint is instance of
   * google.iam.v1.Policy), there will be a google.iam.admin.v1.LintResult for each of the involved
   * bindings, and the associated debug_message may enumerate the other involved binding ordinal
   * number(s).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LintResult> lintResults;

  static {
    // hack to force ProGuard to consider LintResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LintResult.class);
  }

  /**
   * List of lint results sorted by a composite  key, descending order of severity and ascending
   * order of binding_ordinal. There is no certain order among the same keys.
   *
   * For cross-binding results (only if the input object to lint is instance of
   * google.iam.v1.Policy), there will be a google.iam.admin.v1.LintResult for each of the involved
   * bindings, and the associated debug_message may enumerate the other involved binding ordinal
   * number(s).
   * @return value or {@code null} for none
   */
  public java.util.List<LintResult> getLintResults() {
    return lintResults;
  }

  /**
   * List of lint results sorted by a composite  key, descending order of severity and ascending
   * order of binding_ordinal. There is no certain order among the same keys.
   *
   * For cross-binding results (only if the input object to lint is instance of
   * google.iam.v1.Policy), there will be a google.iam.admin.v1.LintResult for each of the involved
   * bindings, and the associated debug_message may enumerate the other involved binding ordinal
   * number(s).
   * @param lintResults lintResults or {@code null} for none
   */
  public LintPolicyResponse setLintResults(java.util.List<LintResult> lintResults) {
    this.lintResults = lintResults;
    return this;
  }

  @Override
  public LintPolicyResponse set(String fieldName, Object value) {
    return (LintPolicyResponse) super.set(fieldName, value);
  }

  @Override
  public LintPolicyResponse clone() {
    return (LintPolicyResponse) super.clone();
  }

}
