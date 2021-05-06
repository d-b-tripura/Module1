package com.cg.eis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cg.eis.bean.*;

public class EmployeeServiceImp implements EmployeeService{

	List<Employee> empList = new ArrayList<Employee>();
	HashMap<String, List<Employee>> hMap= new HashMap<>();
	List<Employee> sa = new ArrayList<Employee>();
	List<Employee> p = new ArrayList<Employee>();
	List<Employee> m = new ArrayList<Employee>();
	List<Employee> ns = new ArrayList<Employee>();
	
	public boolean insertEmployee(Employee e) throws EmployeeException {
		// TODO Auto-generated method stub
		if(e.getSalary() > 5000 && e.getSalary() < 20000 && e.getDesignation().equals("System Associate")) {
			e.setInsuranceScheme("Scheme C");
			sa.add(e);
			hMap.put(e.getInsuranceScheme(), sa);
			//System.out.println(hMap);
		}
		else if(e.getSalary() >= 20000 && e.getSalary() < 40000 && e.getDesignation().equals("Programmer")) {
			e.setInsuranceScheme("Scheme B");
			p.add(e);
			hMap.put(e.getInsuranceScheme(), p);
		}
		else if(e.getSalary() >= 40000 && e.getDesignation().equals("Manager")) {
			e.setInsuranceScheme("Scheme A");
			m.add(e);
			hMap.put(e.getInsuranceScheme(), m);
		}
		else if(e.getSalary() <= 5000 && e.getDesignation().equals("Clerk")) {
			e.setInsuranceScheme("No Scheme");
			ns.add(e);
			hMap.put(e.getInsuranceScheme(), ns);
		} else {
			throw new EmployeeException(e.getInsuranceScheme());
		}
		boolean x = empList.add(e);
		return x;
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		
		return empList;
	}
	
	public List<Employee> getAllEmployeesByInsurance(String insurance) {
		
		List<Employee> em = new ArrayList<Employee>();
		/*for(Employee e : empList) {
			if(e.getInsuranceScheme().equals(insurance)) {
				em.add(e);
			}
 		}
		return em;*/
		for (Entry<String, List<Employee>> e : hMap.entrySet()) {
			if(e.getKey().equals(insurance)) {
				em = e.getValue();
				break;
			}
		}
		return em;
	}


	public List<Employee> deleteEmployee(int id, String name) {
		for(Employee e : empList) {
			if(e.getId() == id && e.getName().equals(name)) {
				if(e.getDesignation().equals("System Associate")) {
					sa.remove(e);
					hMap.put(e.getInsuranceScheme(), sa);
				}
				else if(e.getDesignation().equals("Programmer")) {
					p.remove(e);
					hMap.put(e.getInsuranceScheme(), p);
				}
				else if(e.getDesignation().equals("Manager")) {
					m.remove(e);
					hMap.put(e.getInsuranceScheme(), m);
				}
				else if(e.getDesignation().equals("Clerk")) {
					ns.remove(e);
					hMap.put(e.getInsuranceScheme(), ns);
				}
				
				empList.remove(e);
				break;
				
			}
		}
		return empList;
	}

}