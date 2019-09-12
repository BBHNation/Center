package com.binhan.center.tech;

import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

public class TechControllerTest extends WebApiTest {

    @Test
    public void shouldReturnSuccess_whenRequestHealth() throws IOException {
        // given
        HttpUriRequest request = new HttpGet(getBaseUrl() + "/tech/health");

        // when
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        // then
        Assert.assertEquals(response.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
        Assert.assertEquals(
                convert(response.getEntity().getContent(), Charset.defaultCharset()), "ok");
    }

    @Test
    public void shouldReturnSuccess_whenRequestWhoAmI() throws IOException {
        // given
        HttpUriRequest request = new HttpGet(getBaseUrl() + "/tech/whoami");

        // when
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        // then
        Assert.assertEquals(response.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
        Assert.assertEquals(
                convert(response.getEntity().getContent(), Charset.defaultCharset()),
                "I am Hancock");
    }
}
