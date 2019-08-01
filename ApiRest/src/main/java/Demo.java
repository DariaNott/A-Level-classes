import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        String url = "https://github.com/";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpclient.execute(httpGet);

        System.out.println("Status code: " + response.getStatusLine().getStatusCode());
        System.out.println("Reason phrase: " + response.getStatusLine().getReasonPhrase());
        for (Header header : response.getAllHeaders()) {
            System.out.println(header.getName() + " : " + header.getValue());
        }

        HttpEntity entity = response.getEntity();
        if (entity != null) {
            String data = IOUtils.toString(entity.getContent(), "utf8");
            System.out.println("Data: " + data);
        } else {
            System.out.println("Empty response");
        }
    }
}
