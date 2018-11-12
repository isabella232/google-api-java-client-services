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

package com.google.api.services.genomics.model;

/**
 * Model definition for Program.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Program extends com.google.api.client.json.GenericJson {

  /**
   * The command line used to run this program.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commandLine;

  /**
   * The user specified locally unique ID of the program. Used along with `prevProgramId` to define
   * an ordering between programs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The display name of the program. This is typically the colloquial name of the tool used, for
   * example 'bwa' or 'picard'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The ID of the program run before this one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prevProgramId;

  /**
   * The version of the program run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * The command line used to run this program.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommandLine() {
    return commandLine;
  }

  /**
   * The command line used to run this program.
   * @param commandLine commandLine or {@code null} for none
   */
  public Program setCommandLine(java.lang.String commandLine) {
    this.commandLine = commandLine;
    return this;
  }

  /**
   * The user specified locally unique ID of the program. Used along with `prevProgramId` to define
   * an ordering between programs.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The user specified locally unique ID of the program. Used along with `prevProgramId` to define
   * an ordering between programs.
   * @param id id or {@code null} for none
   */
  public Program setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The display name of the program. This is typically the colloquial name of the tool used, for
   * example 'bwa' or 'picard'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The display name of the program. This is typically the colloquial name of the tool used, for
   * example 'bwa' or 'picard'.
   * @param name name or {@code null} for none
   */
  public Program setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The ID of the program run before this one.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrevProgramId() {
    return prevProgramId;
  }

  /**
   * The ID of the program run before this one.
   * @param prevProgramId prevProgramId or {@code null} for none
   */
  public Program setPrevProgramId(java.lang.String prevProgramId) {
    this.prevProgramId = prevProgramId;
    return this;
  }

  /**
   * The version of the program run.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The version of the program run.
   * @param version version or {@code null} for none
   */
  public Program setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public Program set(String fieldName, Object value) {
    return (Program) super.set(fieldName, value);
  }

  @Override
  public Program clone() {
    return (Program) super.clone();
  }

}
