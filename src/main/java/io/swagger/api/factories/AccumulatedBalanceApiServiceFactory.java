package io.swagger.api.factories;

import io.swagger.api.AccumulatedBalanceApiService;
import io.swagger.api.impl.AccumulatedBalanceApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class AccumulatedBalanceApiServiceFactory {
    private final static AccumulatedBalanceApiService service = new AccumulatedBalanceApiServiceImpl();

    public static AccumulatedBalanceApiService getAccumulatedBalanceApi() {
        return service;
    }
}
