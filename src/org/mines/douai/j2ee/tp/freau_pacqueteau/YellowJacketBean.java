package org.mines.douai.j2ee.tp.freau_pacqueteau;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
@ApplicationScoped
@ManagedBean(name="YellowJacketBean")
public class YellowJacketBean {
	private int deployedNumber = 12;
	private String pays;


	public int getDeployedNumber() {
		return deployedNumber;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public void setDeployedNumber(int deployedNumber) {
		this.deployedNumber = deployedNumber;
	}


	public YellowJacketBean() {
		
	}
	
	public String toString() {
		return String.valueOf(this.deployedNumber);
	}
}
