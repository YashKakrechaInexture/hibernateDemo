package com.inexture.onetomany;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MyStudent.class)
public abstract class MyStudent_ {

	public static volatile ListAttribute<MyStudent, MyAddress> address;
	public static volatile SingularAttribute<MyStudent, String> name;
	public static volatile SingularAttribute<MyStudent, Integer> sid;

	public static final String ADDRESS = "address";
	public static final String NAME = "name";
	public static final String SID = "sid";

}

