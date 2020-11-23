package pet_app.crypto.coderService;

import org.springframework.stereotype.Component;
import pet_app.crypto.model.Input;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class GoogleTranslate implements Encoder, Decoder {
    String queryUkr = "key=AIzaSyB2HijQLlsmI1udH9ARl45oC5eAj4XfjTw"
            + "&source=uk"
            + "&target=en"
            + "&q=";
    String queryEng = "key=AIzaSyB2HijQLlsmI1udH9ARl45oC5eAj4XfjTw"
            + "&source=en"
            + "&target=uk"
            + "&q=";

    @Override
    public String encode(Input input) throws IOException, InterruptedException {
        String q = queryEng+ input.getInput();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.googleapis.com/language/translate/v2?" + q))
                .header("Referer", "https://www.daytranslations.com/free-translation-online/")
                .GET()
                .build();
        return HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString())
                .body();
    }

    @Override
    public String decode(Input input) throws IOException, InterruptedException {
        String q = queryUkr + input.getInput();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.googleapis.com/language/translate/v2?" + q))
                .header("Referer", "https://www.daytranslations.com/free-translation-online/")
                .GET()
                .build();
        return HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString())
                .body();
    }


}
