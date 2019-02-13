package org.mines.douai.j2ee.tp.freau_pacqueteau;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="YellowJacketBeam")
public class YellowJacketBeam {
	private String name;
	private String calculatedName;
	
	public String getCalculatedName() {
		return calculatedName;
	}

	public void setCalculatedName(String calculatedName) {
		this.calculatedName = calculatedName;
	}

	public YellowJacketBeam() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
