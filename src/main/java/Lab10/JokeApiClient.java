package Lab10;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JokeApiClient {
    private static final String JOKE_API_URL = "https://official-joke-api.appspot.com/random_joke";
    private final HttpClient httpClient;

    public JokeApiClient() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public String jokeApiRequest() throws IOException, InterruptedException, URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(JOKE_API_URL))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return response.body();
        } else {
            throw new RuntimeException("Failed to get a joke from the API: " + response.statusCode());
        }
    }
}