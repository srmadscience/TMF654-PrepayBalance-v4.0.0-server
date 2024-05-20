package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ListenerApiService;
import io.swagger.api.factories.ListenerApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.AdjustBalanceCancelEvent;
import io.swagger.model.AdjustBalanceCreateEvent;
import io.swagger.model.AdjustBalanceFailureEvent;
import io.swagger.model.Error;
import io.swagger.model.EventSubscription;
import io.swagger.model.ReserveBalanceCancelEvent;
import io.swagger.model.ReserveBalanceCreateEvent;
import io.swagger.model.ReserveBalanceFailureEvent;
import io.swagger.model.TopupBalanceCancelEvent;
import io.swagger.model.TopupBalanceCreateEvent;
import io.swagger.model.TopupBalanceFailureEvent;
import io.swagger.model.TransferBalanceCancelEvent;
import io.swagger.model.TransferBalanceCreateEvent;
import io.swagger.model.TransferBalanceFailureEvent;

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


@Path("/listener")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public class ListenerApi  {
   private final ListenerApiService delegate;

   public ListenerApi(@Context ServletConfig servletContext) {
      ListenerApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ListenerApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ListenerApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ListenerApiServiceFactory.getListenerApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/adjustBalanceCancelEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity AdjustBalanceCancelEvent", description = "Example of a client listener for receiving the notification AdjustBalanceCancelEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToAdjustBalanceCancelEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) AdjustBalanceCancelEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToAdjustBalanceCancelEvent(body,securityContext);
    }
    @POST
    @Path("/adjustBalanceCreateEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity AdjustBalanceCreateEvent", description = "Example of a client listener for receiving the notification AdjustBalanceCreateEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToAdjustBalanceCreateEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) AdjustBalanceCreateEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToAdjustBalanceCreateEvent(body,securityContext);
    }
    @POST
    @Path("/adjustBalanceFailureEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity AdjustBalanceFailureEvent", description = "Example of a client listener for receiving the notification AdjustBalanceFailureEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToAdjustBalanceFailureEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) AdjustBalanceFailureEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToAdjustBalanceFailureEvent(body,securityContext);
    }
    @POST
    @Path("/reserveBalanceCancelEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity ReserveBalanceCancelEvent", description = "Example of a client listener for receiving the notification ReserveBalanceCancelEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToReserveBalanceCancelEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) ReserveBalanceCancelEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToReserveBalanceCancelEvent(body,securityContext);
    }
    @POST
    @Path("/reserveBalanceCreateEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity ReserveBalanceCreateEvent", description = "Example of a client listener for receiving the notification ReserveBalanceCreateEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToReserveBalanceCreateEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) ReserveBalanceCreateEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToReserveBalanceCreateEvent(body,securityContext);
    }
    @POST
    @Path("/reserveBalanceFailureEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity ReserveBalanceFailureEvent", description = "Example of a client listener for receiving the notification ReserveBalanceFailureEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToReserveBalanceFailureEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) ReserveBalanceFailureEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToReserveBalanceFailureEvent(body,securityContext);
    }
    @POST
    @Path("/topupBalanceCancelEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity TopupBalanceCancelEvent", description = "Example of a client listener for receiving the notification TopupBalanceCancelEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToTopupBalanceCancelEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) TopupBalanceCancelEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToTopupBalanceCancelEvent(body,securityContext);
    }
    @POST
    @Path("/topupBalanceCreateEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity TopupBalanceCreateEvent", description = "Example of a client listener for receiving the notification TopupBalanceCreateEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToTopupBalanceCreateEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) TopupBalanceCreateEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToTopupBalanceCreateEvent(body,securityContext);
    }
    @POST
    @Path("/topupBalanceFailureEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity TopupBalanceFailureEvent", description = "Example of a client listener for receiving the notification TopupBalanceFailureEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToTopupBalanceFailureEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) TopupBalanceFailureEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToTopupBalanceFailureEvent(body,securityContext);
    }
    @POST
    @Path("/transferBalanceCancelEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity TransferBalanceCancelEvent", description = "Example of a client listener for receiving the notification TransferBalanceCancelEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToTransferBalanceCancelEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) TransferBalanceCancelEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToTransferBalanceCancelEvent(body,securityContext);
    }
    @POST
    @Path("/transferBalanceCreateEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity TransferBalanceCreateEvent", description = "Example of a client listener for receiving the notification TransferBalanceCreateEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToTransferBalanceCreateEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) TransferBalanceCreateEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToTransferBalanceCreateEvent(body,securityContext);
    }
    @POST
    @Path("/transferBalanceFailureEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Client listener for entity TransferBalanceFailureEvent", description = "Example of a client listener for receiving the notification TransferBalanceFailureEvent", tags={ "notification listeners (client side)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Notified", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = EventSubscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    public Response listenToTransferBalanceFailureEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data" ,required=true) TransferBalanceFailureEvent body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listenToTransferBalanceFailureEvent(body,securityContext);
    }
}
