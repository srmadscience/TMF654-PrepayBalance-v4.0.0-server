package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Error;
import io.swagger.model.TopupBalance;
import io.swagger.model.TopupBalanceCreate;
import io.swagger.model.TopupBalanceUpdate;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public abstract class TopupBalanceApiService {
    public abstract Response createTopupBalance(TopupBalanceCreate body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteTopupBalance(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listTopupBalance( String fields, Integer offset, Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response patchTopupBalance(TopupBalanceUpdate body,String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveTopupBalance(String id, String fields,SecurityContext securityContext) throws NotFoundException;
}
