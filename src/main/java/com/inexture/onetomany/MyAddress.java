package com.inexture.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
@Table(name="Address")
public class MyAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	private String home;
	private String country;
	
	@ManyToOne
	private MyStudent student;
	
	@ManyToOne
	private MyTeacher teacher;
	
	public MyAddress() {
		
	}

	public MyAddress(int aid, String home, String country, MyStudent student, MyTeacher teacher) {
		this.aid = aid;
		this.home = home;
		this.country = country;
		this.student = student;
		this.teacher = teacher;
	}

	public MyAddress(String home, String country) {
		this.home = home;
		this.country = country;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public MyStudent getStudent() {
		return student;
	}

	public void setStudent(MyStudent student) {
		this.student = student;
	}

	public MyTeacher getTeacher() {
		return teacher;
	}

	public void setTeacher(MyTeacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", home=" + home + ", country=" + country + "]";
	}
	
	
}
