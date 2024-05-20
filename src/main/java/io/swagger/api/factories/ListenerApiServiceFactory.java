package io.swagger.api.factories;

import io.swagger.api.ListenerApiService;
import io.swagger.api.impl.ListenerApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class ListenerApiServiceFactory {
    private final static ListenerApiService service = new ListenerApiServiceImpl();

    public static ListenerApiService getListenerApi() {
        return service;
    }
}
