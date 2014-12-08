package org.jboss.as.quickstarts.kitchensink.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@XmlRootElement
public class Relations implements Serializable {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@NotEmpty
	@ManyToOne
	private Member member;
	
	@NotNull
	@NotEmpty
	@Enumerated(EnumType.STRING)
	private RelationState relationState;
	
	@NotNull
	@NotEmpty
	@ManyToOne
	private Classes classes;
	
	public long getId() {
		return this.id;
	}
	
	public Member getMember() {
		return this.member;
	}
	
	public RelationState getRS() {
		return this.relationState;
	}
	
	public void setRS(RelationState rs) {
		this.relationState=rs;
	}
	
	public Classes getClasses() {
		return this.classes;
	}

}
