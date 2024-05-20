package io.swagger.api.factories;

import io.swagger.api.TransferBalanceApiService;
import io.swagger.api.impl.TransferBalanceApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class TransferBalanceApiServiceFactory {
    private final static TransferBalanceApiService service = new TransferBalanceApiServiceImpl();

    public static TransferBalanceApiService getTransferBalanceApi() {
        return service;
    }
}
