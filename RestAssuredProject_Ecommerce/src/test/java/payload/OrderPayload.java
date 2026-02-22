package payload;

import java.util.HashMap;
import java.util.Map;

public class OrderPayload {

    public static Map<String, Object> createOrderPayload(String cartId, String customerName) {

        Map<String, Object> body = new HashMap<>();

        body.put("cartId", cartId);
        body.put("customerName", customerName);

        return body;
    }


    public static Map<String, Object> updateOrderPayload(String customerName, String comment) {

        Map<String, Object> body = new HashMap<>();

        body.put("customerName", customerName);
        body.put("comment", comment);

        return body;
    }

}
