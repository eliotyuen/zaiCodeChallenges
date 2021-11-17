package zaiCodeChallenges.dto.failOverBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {

    private double temp;
    @JsonProperty("feels_like")
    private double feelsLike;
    @JsonProperty("temp_min")
    private double tempMin;
    @JsonProperty("temp_max")
    private double tempMax;
    private int pressure;
    private int humidity;
    public void setTemp(double temp) {
         this.temp = temp;
     }
     public double getTemp() {
         return temp;
     }

    public void setFeelsLike(double feelsLike) {
         this.feelsLike = feelsLike;
     }
     public double getFeelsLike() {
         return feelsLike;
     }

    public void setTempMin(double tempMin) {
         this.tempMin = tempMin;
     }
     public double getTempMin() {
         return tempMin;
     }

    public void setTempMax(double tempMax) {
         this.tempMax = tempMax;
     }
     public double getTempMax() {
         return tempMax;
     }

    public void setPressure(int pressure) {
         this.pressure = pressure;
     }
     public int getPressure() {
         return pressure;
     }

    public void setHumidity(int humidity) {
         this.humidity = humidity;
     }
     public int getHumidity() {
         return humidity;
     }

}