package com.inexture.onetomany;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MyTeacher.class)
public abstract class MyTeacher_ {

	public static volatile ListAttribute<MyTeacher, MyAddress> address;
	public static volatile SingularAttribute<MyTeacher, String> name;
	public static volatile SingularAttribute<MyTeacher, Integer> tid;

	public static final String ADDRESS = "address";
	public static final String NAME = "name";
	public static final String TID = "tid";

}

