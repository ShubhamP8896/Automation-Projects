package payload;

import java.util.HashMap;
import java.util.Map;

public class AuthPayload {

    public static Map<String, Object> createClientPayload(String name, String email) {

        Map<String, Object> body = new HashMap<>();

        body.put("clientName", name);
        body.put("clientEmail", email);

        return body;
    }
}