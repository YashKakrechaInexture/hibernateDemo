package com.inexture.onetomany;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MyAddress.class)
public abstract class MyAddress_ {

	public static volatile SingularAttribute<MyAddress, String> country;
	public static volatile SingularAttribute<MyAddress, MyTeacher> teacher;
	public static volatile SingularAttribute<MyAddress, MyStudent> student;
	public static volatile SingularAttribute<MyAddress, Integer> aid;
	public static volatile SingularAttribute<MyAddress, String> home;

	public static final String COUNTRY = "country";
	public static final String TEACHER = "teacher";
	public static final String STUDENT = "student";
	public static final String AID = "aid";
	public static final String HOME = "home";

}

