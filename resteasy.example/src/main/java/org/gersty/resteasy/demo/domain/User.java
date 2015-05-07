package org.gersty.resteasy.demo.domain;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	private Integer id;
	private String name;
	private String email;
	private Date dob;

	public User(){};
	
	public User(Integer id, String name, String email, Date dob){
		this.id=id;
		this.name=name;
		this.email=email;
		this.dob=dob;
	}

	public Integer getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getEmail(){
		return this.email;
	}	

	public void setEmail(String email){
		this.email = email;
	}

	public Date getDob(){
		return this.dob;
	}	
	
	public void setDob(Date dob){
		this.dob=dob;
	}
	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}		
}
