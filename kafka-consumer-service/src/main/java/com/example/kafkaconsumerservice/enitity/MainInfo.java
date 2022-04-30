package com.example.kafkaconsumerservice.enitity;

import com.sun.xml.txw2.annotation.XmlElement;
import lombok.Data;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@XmlElement
@Entity(name = "main_info")
public class MainInfo extends BaseEntity{
	private String reason;
	@OneToOne(cascade = CascadeType.ALL)
	private OriginalDocInfo originalDocInfo;
	@OneToOne(cascade = CascadeType.ALL)
	private ParticipantInfo participantInfo;
}