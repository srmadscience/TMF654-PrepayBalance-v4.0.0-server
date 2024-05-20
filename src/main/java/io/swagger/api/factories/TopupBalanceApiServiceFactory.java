package io.swagger.api.factories;

import io.swagger.api.TopupBalanceApiService;
import io.swagger.api.impl.TopupBalanceApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class TopupBalanceApiServiceFactory {
    private final static TopupBalanceApiService service = new TopupBalanceApiServiceImpl();

    public static TopupBalanceApiService getTopupBalanceApi() {
        return service;
    }
}
