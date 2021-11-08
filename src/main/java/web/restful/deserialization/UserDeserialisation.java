package web.restful.deserialization;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import web.restful.domain.User;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDeserialisation {

    private final static String url = "http://jsonplaceholder.typicode.com/posts";

    ObjectMapper objectMapper = new ObjectMapper();

    List<User> userList = new ArrayList<>();

    public List<User> readUser(){

        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        try {
            // user= objectMapper.readValue(new URL(url),User.class);

            userList = objectMapper.readValue(new URL(url), new TypeReference<List<User>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userList ;

    }

}
