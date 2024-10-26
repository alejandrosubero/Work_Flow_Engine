
/*
Create on Mon Aug 08 06:22:32 EDT 2022
*Copyright (C) 122.
@author Alejandro subero
@author JSH
@author  
@since 11.0
@version1.0.0.0
@version  %I%, %G%
*<p>Description: Employee’s hamblet </p>
*/


package com.bpm.employee.service;

import java.util.Date;

import java.util.List;

import com.bpm.employee.entitys.Enfermedad;


public interface EnfermedadService{
 
		public Enfermedad findByName(String name);

		public Enfermedad  findByDateEnfermedad(Date dateEnfermedad);

		public Enfermedad  findByDianostico(String dianostico);

		public Enfermedad  findByNotas(String notas);

		public Enfermedad  findByCronica(Boolean cronica);

		public List<Enfermedad>  findByNameContaining(String name);

		public List<Enfermedad>  findByDateEnfermedadContaining(Date dateEnfermedad);

		public List<Enfermedad>  findByDianosticoContaining(String dianostico);

		public List<Enfermedad>  findByNotasContaining(String notas);

		public List<Enfermedad>  findByCronicaContaining(Boolean cronica);

		public Enfermedad findById(Long id);
		public boolean saveEnfermedad(Enfermedad enfermedad);
		public List<Enfermedad> getAllEnfermedad();
		public boolean updateEnfermedad(Enfermedad enfermedad);
 		public boolean saveOrUpdateEnfermedad(Enfermedad enfermedad);

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


