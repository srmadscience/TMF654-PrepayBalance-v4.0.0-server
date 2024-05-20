package io.swagger.api.factories;

import io.swagger.api.ReserveBalanceApiService;
import io.swagger.api.impl.ReserveBalanceApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class ReserveBalanceApiServiceFactory {
    private final static ReserveBalanceApiService service = new ReserveBalanceApiServiceImpl();

    public static ReserveBalanceApiService getReserveBalanceApi() {
        return service;
    }
}
