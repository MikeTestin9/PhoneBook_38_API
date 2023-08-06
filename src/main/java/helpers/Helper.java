package helpers;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

import java.util.Random;

public interface Helper {

    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();

    String TOKEN =  "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibWJAZ21haWwuY29tIiwiaXNzIjoiUmVndWxhaXQiLCJleHAiOjE2OTE5MzQwMTIsImlhdCI6MTY5MTMzNDAxMn0.xn48XA0DPbozhPMQ8RVq3DYAedhU4z0h08kWqKJQZIY";

    String BASE_URI = "https://contactapp-telran-backend.herokuapp.com";
    String PATH = "v1";

    String authHeader = "Authorization";

    int i = new Random().nextInt(1000) + 1000;

}