package zaiCodeChallenges.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import zaiCodeChallenges.dto.failOverBean.FailOverBean;
import zaiCodeChallenges.dto.primary.PrimaryBean;
import zaiCodeChallenges.model.Weather;
import zaiCodeChallenges.model.WeatherResponse;
import zaiCodeChallenges.repository.WeatherRepository;

@RestController
public class ReportWeatherController 
{	
	private String primaryAPIHost = "http://api.weatherstack.com/current?access_key=58527a99d8e3ea6a52682bd5d8d7bf58&query=";
	
	private String failoverAPIHost = "http://api.openweathermap.org/data/2.5/weather?q=%s,AU&units=metric&appid=2326504fb9b100bee21400190e4dbe6d";
	
//	@Autowired
//    WeatherRepository weatherRepository;
	
	@RequestMapping(value = "/v1/weather", method = RequestMethod.GET)
	public ResponseEntity<WeatherResponse> getWeather(@RequestParam String city) {
		
		WeatherResponse response = null;
		PrimaryBean pBean = getWeathFromPrimaryURL(city);		
		Boolean primaryURLSuccess = Boolean.FALSE;
		
		//auto switch over, if primary is not work, switch to failover url, if primary and failover not work, inquiry from db record
		if(pBean.getCurrent() != null) {
			response = new WeatherResponse(pBean.getCurrent().getWindSpeed(), pBean.getCurrent().getTemperature());
			primaryURLSuccess = Boolean.TRUE;
			
	        //weatherRepository.save(new Weather(city, pBean.getCurrent().getWindSpeed(), pBean.getCurrent().getTemperature()));
		} else if(primaryURLSuccess != Boolean.TRUE) {
			FailOverBean sBean = getWeathFromFailOverURL(city);
			//Convert to km/sec
			Double winSpeed = sBean.getWind().getSpeed() * 3.6;
			
			response = new WeatherResponse(winSpeed.intValue(), pBean.getCurrent().getTemperature());
			
		//Weather weather = new Weather(city, winSpeed.intValue(), pBean.getCurrent().getTemperature());
	        //weatherRepository.save(weather);
		} else {
//			Weather weather = weatherRepository.findByCity(city);
//			response = new WeatherResponse(weather.getWindSpeed(), weather.getTemperatureDegrees());			
		}
      
		return new ResponseEntity<WeatherResponse> (response, HttpStatus.OK);
	}
	
	private PrimaryBean getWeathFromPrimaryURL(String city) {
		
		StringBuilder sbURL = new StringBuilder(primaryAPIHost);
		sbURL.append(city);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<PrimaryBean> resp = null;
		
		try {
			resp = restTemplate.getForEntity(sbURL.toString(), PrimaryBean.class);
		}catch(Exception e) {
			System.out.print(e);
		}
		return resp.getStatusCode() == HttpStatus.OK ? resp.getBody() : null;
	}
	
	private FailOverBean getWeathFromFailOverURL(String city) {
		
		String failOverURL = String.format(failoverAPIHost, city);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<FailOverBean> resp = null;

		try {
			
			resp = restTemplate.getForEntity(failOverURL, FailOverBean.class);				
		}catch(Exception e) {
			System.out.print(e);
		}
		return resp.getStatusCode() == HttpStatus.OK ? resp.getBody() : null;
	}
	
}
