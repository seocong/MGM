package com.gam.mgm.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RacePlanDto {
	private Body body;

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
	@XmlRootElement(name="body")
	public static class Body{
		private List<RacePlanitemDto> items;

		@XmlElementWrapper(name="items")
		@XmlElement(name="item")
		public List<RacePlanitemDto> getItems() {
			return items;
		}

		public void setItems(List<RacePlanitemDto> items) {
			this.items = items;
		}	
	}
}
