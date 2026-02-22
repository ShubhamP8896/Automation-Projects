package endpoints;

public class Routes
{
	public static String BASE_URL = "https://simple-grocery-store-api.click";

    // Status
    public static String STATUS = "/status";

    // Auth
    public static String AUTH = "/api-clients";

    // Products
    public static String GET_ALL_PRODUCTS = "/products";
    public static String GET_SINGLE_PRODUCT = "/products/{productId}";

    // Cart
    public static String CREATE_CART = "/carts";
    public static String ADD_ITEM = "/carts/{cartId}/items";
    public static String GET_CART = "/carts/{cartId}";
    public static String GET_CART_ITEMS = "/carts/{cartId}/items";
    public static String MODIFY_ITEM = "/carts/{cartId}/items/{itemId}";
    public static String REPLACE_ITEM = "/carts/{cartId}/items/{itemId}";

    // Orders
    public static String CREATE_ORDER = "/orders";
    public static String GET_ALL_ORDERS = "/orders";
    public static String GET_SINGLE_ORDER = "/orders/{orderId}";
    public static String UPDATE_ORDER = "/orders/{orderId}";
    public static String DELETE_ORDER = "/orders/{orderId}";

}
