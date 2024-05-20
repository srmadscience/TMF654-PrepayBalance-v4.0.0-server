package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BucketApiService;
import io.swagger.api.factories.BucketApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Bucket;
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


@Path("/bucket")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class BucketApi  {
   private final BucketApiService delegate;

   public BucketApi(@Context ServletConfig servletContext) {
      BucketApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BucketApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BucketApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BucketApiServiceFactory.getBucketApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List or find Bucket objects", description = "This operation list or find Bucket entities", tags={ "bucket" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", array = @ArraySchema(schema = @Schema(implementation = Bucket.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listBucket(@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response") @QueryParam("fields") String fields
,@Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response") @QueryParam("offset") Integer offset
,@Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response") @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listBucket(fields,offset,limit,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Retrieves a Bucket by ID", description = "This operation retrieves a Bucket entity. Attribute selection is enabled for all first level attributes.", tags={ "bucket" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Bucket.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response retrieveBucket(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Bucket",required=true) @PathParam("id") String id
,@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response") @QueryParam("fields") String fields
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.retrieveBucket(id,fields,securityContext);
    }
}
