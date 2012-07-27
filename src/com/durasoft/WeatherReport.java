package com.durasoft;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/reporter")
public class WeatherReport {
	@GET
	public String getInfo(){
		return "This is weather reporter service";
	}
	
	@GET
	@Path("/info2")
	public String getInfo2(){
		return "This is info2";
	}
	
	@GET
	@Path("{city}")
	public String getTemparature(@PathParam("city")String city){
		return "Temparature of "+city+" is "+Math.random()*100;
	}
	
	@GET
	@Path("{country}/{city}")
	public String getTemparature(@PathParam("country")String country, @PathParam("city")String city){
		return "Temparature of "+city+" in "+country+" is "+Math.random()*100;
	}
	
	@GET
	@Path("/summary/{city}")
	@Produces(MediaType.APPLICATION_JSON)
	public Summary getSummary(@PathParam("city")String city){
		Summary summary = new Summary();
		summary.setCity(city);
		summary.setTemparature(""+Math.random()*100);
		return summary;
		
	}
}
