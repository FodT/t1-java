/*******************************************************************************
 * Copyright 2016 MediaMath
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.mediamath.terminalone.models.reporting.meta;

import com.mediamath.terminalone.models.reporting.meta.MetaStructure;

import java.util.ArrayList;

public class MetaData {

  String Description;

  String Name;

  String Type;

  String URI_Data;

  String URI_Meta;

  String Version;

  String currency;

  String data_retention;

  MetaStructure structure = new MetaStructure();

  String time_aggregations;

  ArrayList<String> time_rollups;

  ArrayList<String> time_windows;

  String timezone;

  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getURIData() {
    return URI_Data;
  }

  public void setURIData(String uRI_Data) {
    URI_Data = uRI_Data;
  }

  public String getURIMeta() {
    return URI_Meta;
  }

  public void setURIMeta(String uRI_Meta) {
    URI_Meta = uRI_Meta;
  }

  public String getVersion() {
    return Version;
  }

  public void setVersion(String version) {
    Version = version;
  }

  public String getType() {
    return Type;
  }

  public void setType(String type) {
    Type = type;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getDataRetention() {
    return data_retention;
  }

  public void setDataRetention(String data_retention) {
    this.data_retention = data_retention;
  }

  public MetaStructure getStructure() {
    return structure;
  }

  public void setStructure(MetaStructure structure) {
    this.structure = structure;
  }

  public String getTimeAggregations() {
    return time_aggregations;
  }

  public void setTimeAggregations(String time_aggregations) {
    this.time_aggregations = time_aggregations;
  }

  public ArrayList<String> getTimeRollups() {
    return time_rollups;
  }

  public void setTimeRollups(ArrayList<String> time_rollups) {
    this.time_rollups = time_rollups;
  }

  public ArrayList<String> getTimeWindows() {
    return time_windows;
  }

  public void setTimeWindows(ArrayList<String> time_windows) {
    this.time_windows = time_windows;
  }

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

}
