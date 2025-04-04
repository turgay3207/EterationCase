package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class JsonPlaceHolderBaseApi {
    public static RequestSpecification spec;


    public static  void setUp() {
        spec = new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com").
                setContentType(ContentType.JSON).
                build();
    }


}
