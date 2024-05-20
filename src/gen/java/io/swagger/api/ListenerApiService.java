package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-10-06T18:35:16.707674+01:00[Europe/Dublin]")public abstract class ListenerApiService {
    public abstract Response listenToAdjustBalanceCancelEvent(AdjustBalanceCancelEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToAdjustBalanceCreateEvent(AdjustBalanceCreateEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToAdjustBalanceFailureEvent(AdjustBalanceFailureEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToReserveBalanceCancelEvent(ReserveBalanceCancelEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToReserveBalanceCreateEvent(ReserveBalanceCreateEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToReserveBalanceFailureEvent(ReserveBalanceFailureEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToTopupBalanceCancelEvent(TopupBalanceCancelEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToTopupBalanceCreateEvent(TopupBalanceCreateEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToTopupBalanceFailureEvent(TopupBalanceFailureEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToTransferBalanceCancelEvent(TransferBalanceCancelEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToTransferBalanceCreateEvent(TransferBalanceCreateEvent body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listenToTransferBalanceFailureEvent(TransferBalanceFailureEvent body,SecurityContext securityContext) throws NotFoundException;
}
