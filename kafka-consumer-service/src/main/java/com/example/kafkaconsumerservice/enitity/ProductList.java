package com.example.kafkaconsumerservice.enitity;

import java.util.List;
import com.sun.xml.txw2.annotation.XmlElement;
import lombok.Data;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Data
@XmlElement
@Entity(name = "product_list")
public class ProductList extends BaseEntity{

	@javax.xml.bind.annotation.XmlElement(name = "iCode")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_list_id")
	private List<ICodeItem> iCode;
}