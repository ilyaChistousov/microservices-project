package com.example.kafkaconsumerservice.enitity;

import lombok.Data;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@Entity(name = "file")
public class File extends BaseEntity {

	@OneToOne(cascade = CascadeType.ALL)
	private Document document;
	private String sendingDateTime;
	private String version;
	private String fileId;


}