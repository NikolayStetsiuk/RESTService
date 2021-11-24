package web.restful.deserialization;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import web.restful.domain.Users;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDeserialisation {

    private final static String url = "http://jsonplaceholder.typicode.com/posts";

    ObjectMapper objectMapper = new ObjectMapper();

   List<Users> usersList = new ArrayList<>();

    public List<Users> read_JSON_User(){

        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        try {
            // Users= objectMapper.readValue(new URL(url),Users.class);

            usersList = objectMapper.readValue(new URL(url), new TypeReference<List<Users>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return usersList;

    }



}
