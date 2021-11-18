package zaiCodeChallenges.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zaiCodeChallenges.model.Weather;


@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {
    
	Weather findByCity(String city);
}

