package com.company;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
     public class HttpClientAPI

        {

        public static <InterruptedExceptione> void main(String[] args)

        {

        String uri="https://httpbin.org/get";
        HttpRequest req=HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .GET()
        .version(HttpClient.Version.HTTP_2)
        .build();
        HttpClient client=HttpClient.newBuilder()
        .build();
        try
        {
        HttpResponse<String>response=client.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
        }catch (IOException | InterruptedException e)
        {
        e.printStackTrace();
        }
        }
        }

