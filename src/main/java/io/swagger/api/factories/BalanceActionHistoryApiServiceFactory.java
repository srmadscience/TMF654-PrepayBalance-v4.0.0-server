package io.swagger.api.factories;

import io.swagger.api.BalanceActionHistoryApiService;
import io.swagger.api.impl.BalanceActionHistoryApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class BalanceActionHistoryApiServiceFactory {
    private final static BalanceActionHistoryApiService service = new BalanceActionHistoryApiServiceImpl();

    public static BalanceActionHistoryApiService getBalanceActionHistoryApi() {
        return service;
    }
}
