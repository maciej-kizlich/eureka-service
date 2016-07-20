package pl.maciejkizlich;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.threeloop.poc.EurekaServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EurekaServiceApplication.class)
public class EurekaServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
