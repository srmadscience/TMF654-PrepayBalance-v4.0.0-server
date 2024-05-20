package io.swagger.api.factories;

import io.swagger.api.HubApiService;
import io.swagger.api.impl.HubApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class HubApiServiceFactory {
    private final static HubApiService service = new HubApiServiceImpl();

    public static HubApiService getHubApi() {
        return service;
    }
}
