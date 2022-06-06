package com.promineotech.jeep.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data	


public class Jeep {
	
		private Long modelPK;
		private JeepModel modelId;
		private String trimLevel;
		private int numDoors;
		private int wheelSize;
		private BigDecimal basePrice;
		
		@JsonIgnore
		public Long getModelPK() {
			return modelPK;
			
		}
		
}

