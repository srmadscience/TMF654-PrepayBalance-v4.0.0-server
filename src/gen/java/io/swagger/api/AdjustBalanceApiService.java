package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.AdjustBalance;
import io.swagger.model.AdjustBalanceCreate;
import io.swagger.model.AdjustBalanceUpdate;
import io.swagger.model.Error;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public abstract class AdjustBalanceApiService {
    public abstract Response createAdjustBalance(AdjustBalanceCreate body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteAdjustBalance(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listAdjustBalance( String fields, Integer offset, Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response patchAdjustBalance(AdjustBalanceUpdate body,String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveAdjustBalance(String id, String fields,SecurityContext securityContext) throws NotFoundException;
}
