package Lab10;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URISyntaxException;

public class MainAPICall {
    public static void main(String[] args) {
        try {
            JokeApiClient client = new JokeApiClient();
            String response = client.jokeApiRequest();

            Gson gson = new Gson();
            Joke joke = gson.fromJson(response, Joke.class);

            System.out.println(joke);
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
