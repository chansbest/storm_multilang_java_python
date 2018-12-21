package com.chandan.storm.multilang;

import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * custom class to test java-python-java object serialization and deserialization
 * @author chans
 *
 */
public class CustomClass implements Serializable{
	
	
	private String name = "chandan";
			
	private LocalDateTime dtTime = LocalDateTime.now();
	
	private int x = 10;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDtTime() {
		return dtTime;
	}

	public void setDtTime(LocalDateTime dtTime) {
		this.dtTime = dtTime;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString()
	{
		return name+dtTime.toString()+x;
		
	}
	
	

}
