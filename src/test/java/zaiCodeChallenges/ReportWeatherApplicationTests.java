package zaiCodeChallenges;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import zaiCodeChallenges.controller.ReportWeatherController;
import zaiCodeChallenges.dto.failOverBean.FailOverBean;
import zaiCodeChallenges.dto.primary.PrimaryBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportWeatherApplicationTests {
	
	@Autowired
	ReportWeatherController controller;

	@Test
	public void contextLoads() {
	}
	
//	@Test
//	public void testPrimaryURL() {
//		PrimaryBean bean = controller.getWeathFromPrimaryURL("Melbourne");
//		assertNotNull(bean.getCurrent());
//	}
//	
//	@Test
//	public void testFailOverURL() {
//		FailOverBean bean = controller.getWeathFromFailOverURL("Melbourne");
//		assertNotNull(bean.getClouds());
//	}

}
