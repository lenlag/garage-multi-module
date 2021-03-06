package fr.afpa.formation.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Entity
@Table(name = "Vehicle")
public class Vehicle extends Car {

		
	@Column(name = "Number_Plate", nullable = false, length = 11)
	private String numberPlate;
	
	
	public Vehicle() {
		
	}

	public Vehicle(Long id, String model, String brand, Date year, String numberPlate) {
		super(id, model, brand, year);
		this.numberPlate = numberPlate;
		
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}


	@Override
	public String toString() {
		return  super.toString() + " owner : " + "number plate : "  + getNumberPlate();
	}

	

	
}
