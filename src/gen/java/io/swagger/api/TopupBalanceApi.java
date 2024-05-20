package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TopupBalanceApiService;
import io.swagger.api.factories.TopupBalanceApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Error;
import io.swagger.model.TopupBalance;
import io.swagger.model.TopupBalanceCreate;
import io.swagger.model.TopupBalanceUpdate;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/topupBalance")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class TopupBalanceApi  {
   private final TopupBalanceApiService delegate;

   public TopupBalanceApi(@Context ServletConfig servletContext) {
      TopupBalanceApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TopupBalanceApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TopupBalanceApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = TopupBalanceApiServiceFactory.getTopupBalanceApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Creates a TopupBalance", description = "This operation creates a TopupBalance entity.", tags={ "topupBalance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = TopupBalance.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response createTopupBalance(@Parameter(in = ParameterIn.DEFAULT, description = "The TopupBalance to be created" ,required=true) TopupBalanceCreate body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTopupBalance(body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Deletes a TopupBalance", description = "This operation deletes a TopupBalance entity.", tags={ "topupBalance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Deleted"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response deleteTopupBalance(@Parameter(in = ParameterIn.PATH, description = "Identifier of the TopupBalance",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteTopupBalance(id,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List or find TopupBalance objects", description = "This operation list or find TopupBalance entities", tags={ "topupBalance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", array = @ArraySchema(schema = @Schema(implementation = TopupBalance.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listTopupBalance(@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response") @QueryParam("fields") String fields
,@Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response") @QueryParam("offset") Integer offset
,@Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response") @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listTopupBalance(fields,offset,limit,securityContext);
    }
    @PATCH
    @Path("/{id}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Updates partially a TopupBalance", description = "This operation updates partially a TopupBalance entity.", tags={ "topupBalance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = TopupBalance.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response patchTopupBalance(@Parameter(in = ParameterIn.DEFAULT, description = "The TopupBalance to be updated" ,required=true) TopupBalanceUpdate body

,@Parameter(in = ParameterIn.PATH, description = "Identifier of the TopupBalance",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchTopupBalance(body,id,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Retrieves a TopupBalance by ID", description = "This operation retrieves a TopupBalance entity. Attribute selection is enabled for all first level attributes.", tags={ "topupBalance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = TopupBalance.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response retrieveTopupBalance(@Parameter(in = ParameterIn.PATH, description = "Identifier of the TopupBalance",required=true) @PathParam("id") String id
,@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response") @QueryParam("fields") String fields
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.retrieveTopupBalance(id,fields,securityContext);
    }
}
