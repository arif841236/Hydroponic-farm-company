package com.hydroponicwebsite.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="farm_Structure")
public class HydroFarmInfrastructure {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="infrastructure_id")
	private int infrastructureId;
	
	@Column(name="water")
	private String waterAvailability;
	
	@Column(name="food")
	private String food;
	
	@Column(name="soil")
	private String soilQuality;
}
