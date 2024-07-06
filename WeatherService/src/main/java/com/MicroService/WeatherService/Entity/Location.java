package com.MicroService.WeatherService.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="location")
public class Location {
	@Id
	 private Long id;
	    private String city;
	    private String country;
	    private Long weatherId;
	   


		@Transient
	    Weather weather;
	    
	    @Transient
	    Forecast forecast;
	    
	    
	    public Weather getWeather() {
			return weather;
		}



		public void setWeather(Weather weather) {
			this.weather = weather;
		}



		public Forecast getForecast() {
			return forecast;
		}



		public void setForecast(Forecast forecast) {
			this.forecast = forecast;
		}



		public Location() {
		}  
	    


	public Location(Long id, String city, String country,Long weatherId) {
		super();
		this.id = id;
		this.city = city;
		this.country = country;
		this.weatherId=weatherId;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}

	 public Long getWeatherId() {
			return weatherId;
		}



		public void setWeatherId(Long weatherId) {
			this.weatherId = weatherId;
		}
	
	    
	
	    

}



