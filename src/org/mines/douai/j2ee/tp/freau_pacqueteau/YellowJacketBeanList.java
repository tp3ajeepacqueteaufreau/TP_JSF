package org.mines.douai.j2ee.tp.freau_pacqueteau;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
@ApplicationScoped
@ManagedBean(name="YellowJacketBeanList")
public class YellowJacketBeanList {
	private List<YellowJacketBean> list= new ArrayList<>();
	
	public List<YellowJacketBean> getList() {
		return list;
	}
	
	public String getListStr() {
		
		return "test";
	}
	
	public YellowJacketBeanList() {
		YellowJacketBean france = new YellowJacketBean();
		YellowJacketBean allemagne = new YellowJacketBean();
		YellowJacketBean pologne = new YellowJacketBean();

		france.setPays("France");
		allemagne.setPays("Allemagne");
		pologne.setPays("Pologne");

		this.list.add(france);
		//this.list.add(allemagne);
		this.list.add(pologne);
	}
	
	
}
