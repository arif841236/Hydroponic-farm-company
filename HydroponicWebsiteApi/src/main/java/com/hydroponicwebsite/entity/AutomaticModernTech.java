package com.hydroponicwebsite.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="automation")
public class AutomaticModernTech {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer automationId;
	
	@Column(name="equipment_name")
	private String equipmentName;
	
	@Column(name="protocol_type")
	private String protocolType;
	
	@Column(name="lighting_comp")
	private String lightingComp;
}
