package hooks;

import baseUrl.JsonPlaceHolderBaseApi;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public  void setUp() {

        JsonPlaceHolderBaseApi.setUp();
    }

}
