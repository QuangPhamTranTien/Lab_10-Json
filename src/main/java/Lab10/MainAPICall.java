package Lab10;

import com.google.gson.Gson;
import java.io.IOException;

public class MainAPICall {
    public static void main(String[] args) {
        JokeApiClient client = new JokeApiClient();
        try {

            String jsonResponse = client.jokeApiRequest();

            Gson gson = new Gson();
            Joke joke = gson.fromJson(jsonResponse, Joke.class);

            System.out.println(joke);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
