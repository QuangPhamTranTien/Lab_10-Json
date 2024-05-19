package Lab10;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

public class MainSerialization {
    public static void main(String[] args) {
        // Create cast members for the first movie
        List<CastMember> cast1 = new ArrayList<>();
        cast1.add(new CastMember("Actor One", "Character One"));
        cast1.add(new CastMember("Actor Two", "Character Two"));

        // Create cast members for the second movie
        List<CastMember> cast2 = new ArrayList<>();
        cast2.add(new CastMember("Actor Three", "Character Three"));
        cast2.add(new CastMember("Actor Four", "Character Four"));

        // Create movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie One", "Director One", 120, cast1));
        movies.add(new Movie("Movie Two", "Director Two", 150, cast2));

        // Serialize the list of movies to JSON with pretty printing
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        String jsonString = gson.toJson(movies);

        // Print the result of the serialization
        System.out.println(jsonString);
    }
}
