
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

import java.util.List;

import com.bpm.employee.entitys.Alergia;
import com.bpm.employee.entitys.Enfermedad;
import com.bpm.employee.entitys.FichaMedica;


public interface FichaMedicaService{
 
		public FichaMedica findByPeso(Long peso);

		public FichaMedica  findByAltura(Long altura);

		public FichaMedica  findByGenero(String genero);

		public FichaMedica  findByEtnia(String etnia);

		public FichaMedica  findByEdad(Long edad);

		public FichaMedica  findBySeguroMedicoComp(String seguroMedicoComp);

		public FichaMedica  findBySeguroMedicoPersonal(String seguroMedicoPersonal);

		public List<FichaMedica>  findByPesoContaining(Long peso);

		public List<FichaMedica>  findByAlturaContaining(Long altura);

		public List<FichaMedica>  findByGeneroContaining(String genero);

		public List<FichaMedica>  findByEtniaContaining(String etnia);

		public List<FichaMedica>  findByEdadContaining(Long edad);

		public List<FichaMedica>  findBySeguroMedicoCompContaining(String seguroMedicoComp);

		public List<FichaMedica>  findBySeguroMedicoPersonalContaining(String seguroMedicoPersonal);

		public FichaMedica findById(Long id);
		public boolean saveFichaMedica(FichaMedica fichamedica);
		public List<FichaMedica> getAllFichaMedica();
		public boolean updateFichaMedica(FichaMedica fichamedica);
 		public boolean saveOrUpdateFichaMedica(FichaMedica fichamedica);

		public List<FichaMedica>  findByAlergiaContaining(Alergia alergias);
		public List<FichaMedica>  findByEnfermedadContaining(Enfermedad enfermedades);
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


