package zaiCodeChallenges.dto.primary;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {

    @JsonProperty("observation_time")
    private String observationTime;
    private int temperature;
    @JsonProperty("weather_code")
    private int weatherCode;
    @JsonProperty("weather_icons")
    private List<String> weatherIcons;
    @JsonProperty("weather_descriptions")
    private List<String> weatherDescriptions;
    @JsonProperty("wind_speed")
    private int windSpeed;
    @JsonProperty("wind_degree")
    private int windDegree;
    @JsonProperty("wind_dir")
    private String windDir;
    private int pressure;
    private int precip;
    private int humidity;
    private int cloudcover;
    private int feelslike;
    @JsonProperty("uv_index")
    private int uvIndex;
    private int visibility;
    @JsonProperty("is_day")
    private String isDay;
    public void setObservationTime(String observationTime) {
         this.observationTime = observationTime;
     }
     public String getObservationTime() {
         return observationTime;
     }

    public void setTemperature(int temperature) {
         this.temperature = temperature;
     }
     public int getTemperature() {
         return temperature;
     }

    public void setWeatherCode(int weatherCode) {
         this.weatherCode = weatherCode;
     }
     public int getWeatherCode() {
         return weatherCode;
     }

    public void setWeatherIcons(List<String> weatherIcons) {
         this.weatherIcons = weatherIcons;
     }
     public List<String> getWeatherIcons() {
         return weatherIcons;
     }

    public void setWeatherDescriptions(List<String> weatherDescriptions) {
         this.weatherDescriptions = weatherDescriptions;
     }
     public List<String> getWeatherDescriptions() {
         return weatherDescriptions;
     }

    public void setWindSpeed(int windSpeed) {
         this.windSpeed = windSpeed;
     }
     public int getWindSpeed() {
         return windSpeed;
     }

    public void setWindDegree(int windDegree) {
         this.windDegree = windDegree;
     }
     public int getWindDegree() {
         return windDegree;
     }

    public void setWindDir(String windDir) {
         this.windDir = windDir;
     }
     public String getWindDir() {
         return windDir;
     }

    public void setPressure(int pressure) {
         this.pressure = pressure;
     }
     public int getPressure() {
         return pressure;
     }

    public void setPrecip(int precip) {
         this.precip = precip;
     }
     public int getPrecip() {
         return precip;
     }

    public void setHumidity(int humidity) {
         this.humidity = humidity;
     }
     public int getHumidity() {
         return humidity;
     }

    public void setCloudcover(int cloudcover) {
         this.cloudcover = cloudcover;
     }
     public int getCloudcover() {
         return cloudcover;
     }

    public void setFeelslike(int feelslike) {
         this.feelslike = feelslike;
     }
     public int getFeelslike() {
         return feelslike;
     }

    public void setUvIndex(int uvIndex) {
         this.uvIndex = uvIndex;
     }
     public int getUvIndex() {
         return uvIndex;
     }

    public void setVisibility(int visibility) {
         this.visibility = visibility;
     }
     public int getVisibility() {
         return visibility;
     }

    public void setIsDay(String isDay) {
         this.isDay = isDay;
     }
     public String getIsDay() {
         return isDay;
     }

}