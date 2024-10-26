
/*
Create on Sat Oct 07 21:00:29 EDT 2023
*Copyright (C) 123.
@author yo
@author yo
@author  
@since 1.8
@version1.0.0.0
@version  %I%, %G%
*<p>Description: Employee’s hamblet </p>
*/

package com.bpm.employee.pojo;

import java.util.Objects;


public class HierarchicalTreePojo {

    private Long id;

    private String positioName;
    private String positioCode;
    private Integer positionNumber;
    private String areaDivision;
    private String subAreaDivision;
    private String description;
    private Boolean activo;

    private Integer hierarchyOfAreas;

    public HierarchicalTreePojo() {
    }


    public HierarchicalTreePojo(String positioName, String positioCode, Integer positionNumber, String areaDivision, String subAreaDivision, String description, Integer hierarchyOfAreas) {
        this.positioName = positioName;
        this.positioCode = positioCode;
        this.positionNumber = positionNumber;
        this.areaDivision = areaDivision;
        this.subAreaDivision = subAreaDivision;
        this.description = description;
        this.hierarchyOfAreas = hierarchyOfAreas;
        this.activo = true;
    }

    public Integer getHierarchyOfAreas() {
        return hierarchyOfAreas;
    }

    public void setHierarchyOfAreas(Integer hierarchyOfAreas) {
        this.hierarchyOfAreas = hierarchyOfAreas;
    }

    public Boolean isActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPositioCode() {
        return positioCode;
    }

    public void setPositioCode(String positioCode) {
        this.positioCode = positioCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPositioName() {
        return positioName;
    }

    public void setPositioName(String positioName) {
        this.positioName = positioName;
    }

    public Integer getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(Integer positionNumber) {
        this.positionNumber = positionNumber;
    }

    public String getAreaOrDivision() {
        return areaDivision;
    }

    public void setAreaOrDivision(String areaOrDivision) {
        this.areaDivision = areaOrDivision;
    }

    public String getSubAreaOrDivision() {
        return subAreaDivision;
    }

    public void setSubAreaOrDivision(String subAreaOrDivision) {
        this.subAreaDivision = subAreaOrDivision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HierarchicalTreePojo)) return false;
        HierarchicalTreePojo that = (HierarchicalTreePojo) o;
        return Objects.equals(id, that.id) && Objects.equals(positioName, that.positioName) && Objects.equals(positioCode, that.positioCode) && Objects.equals(positionNumber, that.positionNumber) && Objects.equals(areaDivision, that.areaDivision) && Objects.equals(subAreaDivision, that.subAreaDivision) && Objects.equals(description, that.description) && Objects.equals(activo, that.activo) && Objects.equals(hierarchyOfAreas, that.hierarchyOfAreas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, positioName, positioCode, positionNumber, areaDivision, subAreaDivision, description, activo, hierarchyOfAreas);
    }
}
 /*
 Copyright (C) 2008 Google Inc.
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

