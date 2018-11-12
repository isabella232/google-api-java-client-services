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

package com.google.api.services.logging.v2beta1.model;

/**
 * Additional information about the source code location that produced the log entry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Logging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogEntrySourceLocation extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Source file name. Depending on the runtime environment, this might be a simple name
   * or a fully-qualified name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String file;

  /**
   * Optional. Human-readable name of the function or method being invoked, with optional context
   * such as the class or package name. This information may be used in contexts such as the logs
   * viewer, where a file and line number are less meaningful. The format can vary by language. For
   * example: qual.if.ied.Class.method (Java), dir/package.func (Go), function (Python).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String function;

  /**
   * Optional. Line within the source file. 1-based; 0 indicates no line number available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long line;

  /**
   * Optional. Source file name. Depending on the runtime environment, this might be a simple name
   * or a fully-qualified name.
   * @return value or {@code null} for none
   */
  public java.lang.String getFile() {
    return file;
  }

  /**
   * Optional. Source file name. Depending on the runtime environment, this might be a simple name
   * or a fully-qualified name.
   * @param file file or {@code null} for none
   */
  public LogEntrySourceLocation setFile(java.lang.String file) {
    this.file = file;
    return this;
  }

  /**
   * Optional. Human-readable name of the function or method being invoked, with optional context
   * such as the class or package name. This information may be used in contexts such as the logs
   * viewer, where a file and line number are less meaningful. The format can vary by language. For
   * example: qual.if.ied.Class.method (Java), dir/package.func (Go), function (Python).
   * @return value or {@code null} for none
   */
  public java.lang.String getFunction() {
    return function;
  }

  /**
   * Optional. Human-readable name of the function or method being invoked, with optional context
   * such as the class or package name. This information may be used in contexts such as the logs
   * viewer, where a file and line number are less meaningful. The format can vary by language. For
   * example: qual.if.ied.Class.method (Java), dir/package.func (Go), function (Python).
   * @param function function or {@code null} for none
   */
  public LogEntrySourceLocation setFunction(java.lang.String function) {
    this.function = function;
    return this;
  }

  /**
   * Optional. Line within the source file. 1-based; 0 indicates no line number available.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLine() {
    return line;
  }

  /**
   * Optional. Line within the source file. 1-based; 0 indicates no line number available.
   * @param line line or {@code null} for none
   */
  public LogEntrySourceLocation setLine(java.lang.Long line) {
    this.line = line;
    return this;
  }

  @Override
  public LogEntrySourceLocation set(String fieldName, Object value) {
    return (LogEntrySourceLocation) super.set(fieldName, value);
  }

  @Override
  public LogEntrySourceLocation clone() {
    return (LogEntrySourceLocation) super.clone();
  }

}
