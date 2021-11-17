package zaiCodeChallenges.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

//@Entity
//@Table(name="weather")
public class Weather implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String cityName;

    @NotBlank
    private Integer windSpeed;

    @NotBlank
    private Integer temperatureDegrees;

    public Weather() {
    }

    public Weather(@NotBlank String cityName, @NotBlank Integer windSpeed, @NotBlank Integer temperatureDegrees) {
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.temperatureDegrees = temperatureDegrees;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Integer windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Integer getTemperatureDegrees() {
		return temperatureDegrees;
	}

	public void setTemperatureDegrees(Integer temperatureDegrees) {
		this.temperatureDegrees = temperatureDegrees;
	}

}
