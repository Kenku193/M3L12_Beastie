package com.example.m3l12_beastie.exampleRequest;

//import com.fasterxml.jackson.databind.json.JsonMapper;
//import sun.net.www.http.HttpClient;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.List;


public class RequestExample {

//    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";
//    public static final String USERS_URL = BASE_URL + "/users";
//    public static final String POSTS_URL = BASE_URL + "/posts";
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//        //1
//        HttpClient client = HttpClient.newHttpClient();
//        //2,3
//        HttpResponse<String> response = client.send(
//                                HttpRequest.newBuilder()
//                .uri(URI.create(USERS_URL))
//                .GET()
//                .build(), HttpResponse.BodyHandlers.ofString());
//        //4
//        System.out.println(getUsersFromResponse(response));
//
//    }
//
//    private static List<User> getUsersFromResponse(HttpResponse<String> response) throws IOException {
//        JsonMapper mapper = new JsonMapper();
//        User[] users = mapper.readValue(response.body(), User[].class);
//        return List.of(users);
//    }

}
