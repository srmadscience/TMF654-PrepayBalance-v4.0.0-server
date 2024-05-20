package io.swagger.api.factories;

import io.swagger.api.AdjustBalanceApiService;
import io.swagger.api.impl.AdjustBalanceApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class AdjustBalanceApiServiceFactory {
    private final static AdjustBalanceApiService service = new AdjustBalanceApiServiceImpl();

    public static AdjustBalanceApiService getAdjustBalanceApi() {
        return service;
    }
}
