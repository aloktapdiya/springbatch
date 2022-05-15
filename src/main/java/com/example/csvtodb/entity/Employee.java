package com.example.csvtodb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {

    @Id
    private Integer empId;
    private String name;
    private Integer age;
    private String country;
    private Date creationTs;

    public Employee(Integer empId, String name, Integer age, String country, Date time) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.country = country;
        this.creationTs = time;
    }

    public Employee() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("empId=").append(empId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", country=").append(country);
        sb.append('}');
        return sb.toString();
    }

    public Date getTime() {
        return creationTs;
    }

    public void setTime(Date time) {
        this.creationTs = time;
    }
}

