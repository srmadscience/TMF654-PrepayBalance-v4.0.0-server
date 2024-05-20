package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.HubApiService;
import io.swagger.api.factories.HubApiServiceFactory;

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
import io.swagger.model.EventSubscription;
import io.swagger.model.EventSubscriptionInput;

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


@Path("/hub")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class HubApi  {
   private final HubApiService delegate;

   public HubApi(@Context ServletConfig servletContext) {
      HubApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("HubApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (HubApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = HubApiServiceFactory.getHubApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Register a listener", description = "Sets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.", tags={ "events subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Subscribed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response registerListener(@Parameter(in = ParameterIn.DEFAULT, description = "Data containing the callback endpoint to deliver the information" ,required=true) EventSubscriptionInput body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.registerListener(body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Unregister a listener", description = "Resets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.", tags={ "events subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Deleted"),
        
        @ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response unregisterListener(@Parameter(in = ParameterIn.PATH, description = "The id of the registered listener",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.unregisterListener(id,securityContext);
    }
}
