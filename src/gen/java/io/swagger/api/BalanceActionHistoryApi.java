package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BalanceActionHistoryApiService;
import io.swagger.api.factories.BalanceActionHistoryApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.BalanceActionHistory;
import io.swagger.model.Error;

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


@Path("/balanceActionHistory")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class BalanceActionHistoryApi  {
   private final BalanceActionHistoryApiService delegate;

   public BalanceActionHistoryApi(@Context ServletConfig servletContext) {
      BalanceActionHistoryApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BalanceActionHistoryApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BalanceActionHistoryApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BalanceActionHistoryApiServiceFactory.getBalanceActionHistoryApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List or find BalanceActionHistory objects", description = "This operation list or find BalanceActionHistory entities", tags={ "balanceActionHistory" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", array = @ArraySchema(schema = @Schema(implementation = BalanceActionHistory.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listBalanceActionHistory(@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response") @QueryParam("fields") String fields
,@Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response") @QueryParam("offset") Integer offset
,@Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response") @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listBalanceActionHistory(fields,offset,limit,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Retrieves a BalanceActionHistory by ID", description = "This operation retrieves a BalanceActionHistory entity. Attribute selection is enabled for all first level attributes.", tags={ "balanceActionHistory" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = BalanceActionHistory.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response retrieveBalanceActionHistory(@Parameter(in = ParameterIn.PATH, description = "Identifier of the BalanceActionHistory",required=true) @PathParam("id") String id
,@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response") @QueryParam("fields") String fields
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.retrieveBalanceActionHistory(id,fields,securityContext);
    }
}
