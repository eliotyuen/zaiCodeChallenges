package zaiCodeChallenges;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 

@SpringBootApplication 
public class ReportWeatherApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ReportWeatherApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ReportWeatherApplication.class, args);
    }
}
