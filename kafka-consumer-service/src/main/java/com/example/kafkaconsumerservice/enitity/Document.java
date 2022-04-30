package com.example.kafkaconsumerservice.enitity;

import com.sun.xml.txw2.annotation.XmlElement;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@XmlElement
@Entity(name = "document")
public class Document extends BaseEntity{
	@OneToOne(cascade = CascadeType.ALL)
	private MainInfo mainInfo;
	@OneToOne(cascade = CascadeType.ALL)
	private ProductList productList;
}