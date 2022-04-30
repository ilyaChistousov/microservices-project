package com.example.kafkaconsumerservice.enitity;

import com.sun.xml.txw2.annotation.XmlElement;
import lombok.Data;
import javax.persistence.Entity;

@XmlElement
@Data
@Entity(name = "participant_info")
public class ParticipantInfo extends BaseEntity{
	private String participantIdentificationCode;
	private String participantName;
}