package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ReserveBalanceApiService;
import io.swagger.api.factories.ReserveBalanceApiServiceFactory;

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
import io.swagger.model.ReserveBalance;
import io.swagger.model.ReserveBalanceCreate;
import io.swagger.model.ReserveBalanceUpdate;

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


@Path("/reserveBalance")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class ReserveBalanceApi  {
   private final ReserveBalanceApiService delegate;

   public ReserveBalanceApi(@Context ServletConfig servletContext) {
      ReserveBalanceApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ReserveBalanceApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ReserveBalanceApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ReserveBalanceApiServiceFactory.getReserveBalanceApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Creates a ReserveBalance", description = "This operation creates a ReserveBalance entity.", tags={ "reserveBalance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = ReserveBalance.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response createReserveBalance(@Parameter(in = ParameterIn.DEFAULT, description = "The ReserveBalance to be created" ,required=true) ReserveBalanceCreate body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createReserveBalance(body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Deletes a ReserveBalance", description = "This operation deletes a ReserveBalance entity.", tags={ "reserveBalance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Deleted"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response deleteReserveBalance(@Parameter(in = ParameterIn.PATH, description = "Identifier of the ReserveBalance",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteReserveBalance(id,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List or find ReserveBalance objects", description = "This operation list or find ReserveBalance entities", tags={ "reserveBalance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", array = @ArraySchema(schema = @Schema(implementation = ReserveBalance.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listReserveBalance(@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response") @QueryParam("fields") String fields
,@Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response") @QueryParam("offset") Integer offset
,@Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response") @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listReserveBalance(fields,offset,limit,securityContext);
    }
    @PATCH
    @Path("/{id}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Updates partially a ReserveBalance", description = "This operation updates partially a ReserveBalance entity.", tags={ "reserveBalance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = ReserveBalance.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response patchReserveBalance(@Parameter(in = ParameterIn.DEFAULT, description = "The ReserveBalance to be updated" ,required=true) ReserveBalanceUpdate body

,@Parameter(in = ParameterIn.PATH, description = "Identifier of the ReserveBalance",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchReserveBalance(body,id,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Retrieves a ReserveBalance by ID", description = "This operation retrieves a ReserveBalance entity. Attribute selection is enabled for all first level attributes.", tags={ "reserveBalance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = ReserveBalance.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response retrieveReserveBalance(@Parameter(in = ParameterIn.PATH, description = "Identifier of the ReserveBalance",required=true) @PathParam("id") String id
,@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response") @QueryParam("fields") String fields
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.retrieveReserveBalance(id,fields,securityContext);
    }
}
