package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.BalanceActionHistory;
import io.swagger.model.Error;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public abstract class BalanceActionHistoryApiService {
    public abstract Response listBalanceActionHistory( String fields, Integer offset, Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveBalanceActionHistory(String id, String fields,SecurityContext securityContext) throws NotFoundException;
}
