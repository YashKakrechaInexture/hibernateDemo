package com.inexture.onetomany;

import java.util.List;

import javax.persistence.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
@Table(name="myStudents")
public class MyStudent {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	@Column(name="sname")
	private String name;
	@Transient
	private String city;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<MyAddress> address;
	
	public MyStudent() {
		
	}

	public MyStudent(int sid, String name, String city) {
		this.sid = sid;
		this.name = name;
		this.city = city;
	}

	public MyStudent(int sid, String name, String city, List<MyAddress> address) {
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setId(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<MyAddress> getAddress() {
		return address;
	}

	public void setAddress(List<MyAddress> address) {
		this.address = address;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", city=" + city + ", address=" + address + "]";
	}

	
	
	
}
