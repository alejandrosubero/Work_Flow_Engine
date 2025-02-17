
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

import java.util.Date;
import java.util.Objects;


public class EmployeeReliefPojo {

    private Long id;

    private String employeeToBeRelieved;

    private String employeeRelief;

	private Date createDate;

	private Boolean active;


	public EmployeeReliefPojo() {
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeToBeRelieved() {
        return employeeToBeRelieved;
    }

    public void setEmployeeToBeRelieved(String employeeToBeRelieved) {
        this.employeeToBeRelieved = employeeToBeRelieved;
    }

    public String getEmployeeRelief() {
        return employeeRelief;
    }

    public void setEmployeeRelief(String employeeRelief) {
        this.employeeRelief = employeeRelief;
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof EmployeeReliefPojo)) return false;
		EmployeeReliefPojo that = (EmployeeReliefPojo) o;
		return Objects.equals(id, that.id) && Objects.equals(employeeToBeRelieved, that.employeeToBeRelieved) && Objects.equals(employeeRelief, that.employeeRelief) && Objects.equals(createDate, that.createDate) && Objects.equals(active, that.active);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, employeeToBeRelieved, employeeRelief, createDate, active);
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

