package io.swagger.api.factories;

import io.swagger.api.BucketApiService;
import io.swagger.api.impl.BucketApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class BucketApiServiceFactory {
    private final static BucketApiService service = new BucketApiServiceImpl();

    public static BucketApiService getBucketApi() {
        return service;
    }
}
