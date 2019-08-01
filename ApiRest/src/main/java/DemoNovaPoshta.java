import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DemoNovaPoshta {

    @Test
    public void api() throws URISyntaxException, IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        URIBuilder builder = new URIBuilder();
        builder.setScheme("https")
                .setHost("api.novaposhta.ua")
                .setPath("v2.0/json/")
                .setParameter("apiKey", "f0a8ed3fd5f618970de71afbc1d9828c");
        URI uri = builder.build();
        HttpPost httpPost = new HttpPost(uri);
        String body = "{\n" +
                "    \"modelName\": \"Address\",\n" +
                "    \"calledMethod\": \"searchSettlements\",\n" +
                "    \"methodProperties\": {\n" +
                "        \"CityName\": \"київ\",\n" +
                "        \"Limit\": 5\n" +
                "    }\n" +
                "}";
        httpPost.setEntity(new StringEntity(body, ContentType.APPLICATION_JSON));
        CloseableHttpResponse response = httpClient.execute(httpPost);

        System.out.println("Status code: " + response.getStatusLine().getStatusCode());
        System.out.println("Reason phrase: " + response.getStatusLine().getReasonPhrase());
        for (Header header : response.getAllHeaders()) {
            System.out.println(header.getName() + ": " + header.getValue());
        }

        HttpEntity entity = response.getEntity();

        if (entity != null) {
            String data = IOUtils.toString(entity.getContent(), "utf8");
            DocumentContext docCtx = JsonPath.parse(data);
            String firstArea = docCtx.read("$..Addresses[0].Area").toString();
            String firstWarehouses = docCtx.read("$..Addresses[0].Warehouses").toString();
            String firstStreetsAvailability = docCtx.read("$..Addresses[0].StreetsAvailability").toString();
            Assert.assertEquals("[\"Київська\"]", firstArea);
            Assert.assertEquals("[644]", firstWarehouses);
            Assert.assertEquals("[true]", firstStreetsAvailability);
        } else {
            System.out.println("Empty response");
        }
    }
}
