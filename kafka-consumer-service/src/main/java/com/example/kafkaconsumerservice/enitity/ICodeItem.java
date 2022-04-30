package com.example.kafkaconsumerservice.enitity;

import com.sun.xml.txw2.annotation.XmlElement;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Data
@XmlElement
@Entity(name = "i_code_item")
public class ICodeItem extends BaseEntity{
	private String count;
	private String text;
//	@ManyToOne(fetch = FetchType.LAZY)
//	private ProductList productList;
}