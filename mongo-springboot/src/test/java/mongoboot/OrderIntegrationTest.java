package mongoboot;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class OrderIntegrationTest {

	@Autowired
	TestRestTemplate restClient;

	@Autowired
	@Value("classpath:order2.json")
	Resource orderPostBody;

	@Test
	public void postOrder() throws IOException {
		// gegeben sei
		byte[] body = IOUtils.toByteArray(orderPostBody.getURI());

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

		// wenn
		ResponseEntity<String> response = restClient.exchange("/api/orders", HttpMethod.POST, new HttpEntity<>(body, headers), String.class);

		// dann
		assertThat(response.getStatusCode(), is(HttpStatus.CREATED));
	}

}
