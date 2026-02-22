package payload;

import java.util.HashMap;
import java.util.Map;

public class CartPayload {

    public static Map<String, Object> addItemPayload(int productId, int quantity) {

        Map<String, Object> body = new HashMap<>();

        body.put("productId", productId);
        body.put("quantity", quantity);

        return body;
    }


    public static Map<String, Object> modifyItemPayload(int quantity) {

        Map<String, Object> body = new HashMap<>();

        body.put("quantity", quantity);

        return body;
    }

}
