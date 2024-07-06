package com.MicroService.ForecastService.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="forecast")
public class Forecast {
	
	


	@Id
	private Long forecastId;
    private String date;
    private String forecast;
  //  private String forecastId;
    
    @ManyToOne
    public Weather weather;
    
    public Forecast() {
		
	}
   
    
	public Forecast(Long forecastId, String date, String forecast,Long weatherId) {
		super();
		this.forecastId = forecastId;
		this.date = date;
		this.forecast = forecast;
		//this.forecastId = forecastId;
	    this.weather = new Weather(weatherId,"","");
	}

	
//
//	public String getForecastId() {
//		return forecastId;
//	}
//
//
//	public void setForecastId(String forecastId) {
//		this.forecastId = forecastId;
//	}




	public String getDate() {
		return date;
	}


	public Long getForecastId() {
		return forecastId;
	}


	public void setForecastId(Long forecastId) {
		this.forecastId = forecastId;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getForecast() {
		return forecast;
	}


	public void setForecast(String forecast) {
		this.forecast = forecast;
	}


	public Weather getWeather() {
		return weather;
	}


	public void setWeather(Weather weather) {
		this.weather = weather;
	}


	@Override
	public String toString() {
		return "Forecast [forecastId=" + forecastId + ", date=" + date + ", forecast=" + forecast + ", weather="
				+ weather + "]";
	}
	

	
}
	 


	