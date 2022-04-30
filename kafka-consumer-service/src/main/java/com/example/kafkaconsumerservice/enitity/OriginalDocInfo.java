package com.example.kafkaconsumerservice.enitity;

import com.sun.xml.txw2.annotation.XmlElement;
import lombok.Data;
import javax.persistence.Entity;

@Data
@XmlElement
@Entity(name = "original_doc_info")
public class OriginalDocInfo extends BaseEntity{
	private String docName;
	private String docNumber;
	private String docDate;
}