package com.bpm.engine.relief.validation;

import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.bpm.engine.relief.model.ReliefAssignedModel;

@Service
public class ReliefAssignedValidation {
	
	private static final Logger logger = LogManager.getLogger(ReliefAssignedValidation.class);

	public ReliefAssignedModel valid(ReliefAssignedModel relief) {
		
		logger.info("Relief Assigned Validation... ");
		
		ReliefAssignedModel pojo = null;
		
		try {
			
			if (relief != null && relief.getUserCode() != null && !relief.getUnsuscribe() &&
				relief.getUserReliefCode() != null && relief.getUserCreateCode() != null) {
					pojo = relief;
				}
			
			if (relief != null && relief.getUnsuscribe()){
				pojo = relief;
			}
			
			return pojo;
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Relief Assigned Validation Error: ", e + " ...");
			return pojo;
		}
	}


	public Long valida_id(String poder) {
		Long id_Delete = 0l;
		try {
			if (poder != null) {
				if (poder.length() > 0 && !Pattern.matches("[a-zA-Z]+", poder)) {
					id_Delete = Long.parseLong(poder);
				}
			}
			return id_Delete;
		} catch (Exception e) {
			e.printStackTrace();
			return id_Delete;
		}
	}

	public <T> Object validation(T t) {
		T elemento = null;
		try {
			if (t != null) {
				elemento = t;
			}
			return elemento;
		} catch (Exception e) {
			e.printStackTrace();
			return elemento;
		}
	}

}
