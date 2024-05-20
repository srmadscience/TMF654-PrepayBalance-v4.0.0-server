package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Error;
import io.swagger.model.ReserveBalance;
import io.swagger.model.ReserveBalanceCreate;
import io.swagger.model.ReserveBalanceUpdate;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public abstract class ReserveBalanceApiService {
    public abstract Response createReserveBalance(ReserveBalanceCreate body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteReserveBalance(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listReserveBalance( String fields, Integer offset, Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response patchReserveBalance(ReserveBalanceUpdate body,String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveReserveBalance(String id, String fields,SecurityContext securityContext) throws NotFoundException;
}
