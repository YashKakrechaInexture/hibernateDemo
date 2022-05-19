package com.inexture.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
@Table(name="myTeachers")
public class MyTeacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tid;
	@Column(name="tname")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<MyAddress> address;
	
	MyTeacher(){
		
	}

	public MyTeacher(int tid, String name, List<MyAddress> address) {
		this.tid = tid;
		this.name = name;
		this.address = address;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MyAddress> getAddress() {
		return address;
	}

	public void setAddress(List<MyAddress> address) {
		this.address = address;
	}
	
	
	
}
