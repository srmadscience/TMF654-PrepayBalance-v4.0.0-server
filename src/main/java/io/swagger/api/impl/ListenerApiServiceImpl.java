package io.swagger.api.impl;

import org.voltdb.VoltTable;
import org.voltdb.VoltType;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import org.voltdb.client.ClientResponse;
import org.voltdb.client.Client;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import org.voltdb.client.ProcCallException;
import java.io.IOException;
import org.voltdb.client.ClientConfig;
import org.voltdb.client.ClientFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import io.swagger.client.ApiException;
import io.swagger.client.model.*;
import org.voltdb.client.ClientResponseWithPartitionKey;

import io.swagger.api.*;
import io.swagger.model.*;
import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;
import java.io.InputStream;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

public class ListenerApiServiceImpl  extends ListenerApiService {
    
    public static final int RESPONSE_CREATED = 201;
    public static final int RESPONSE_BAD_REQUEST = 400;
    public static final int RESPONSE_UNAUTHORIZED = 401;
    public static final int RESPONSE_FORBIDDEN = 403;
    public static final int RESPONSE_METHOD_NOT_ALLOWED = 405;
    public static final int RESPONSE_CONFLICT = 409;
    public static final int RESPONSE_INTERNAL_SERVER_ERROR = 500;
    public static final int RESPONSE_UNKNOWN = 0;

    
    public static final byte RESPONSE_VOLT_PROC_OK = 9;
    public static final byte RESPONSE_VOLT_PROC_FK_NOT_FOUND = 10;
    public static final byte RESPONSE_VOLT_PROC_NOT_OK = 11;


    Gson json = null;
    Client c = null;


    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToAdjustBalanceCancelEvent(io.swagger.model.AdjustBalanceCancelEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToAdjustBalanceCancelEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToAdjustBalanceCreateEvent(io.swagger.model.AdjustBalanceCreateEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToAdjustBalanceCreateEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToAdjustBalanceFailureEvent(io.swagger.model.AdjustBalanceFailureEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToAdjustBalanceFailureEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToReserveBalanceCancelEvent(io.swagger.model.ReserveBalanceCancelEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToReserveBalanceCancelEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToReserveBalanceCreateEvent(io.swagger.model.ReserveBalanceCreateEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToReserveBalanceCreateEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToReserveBalanceFailureEvent(io.swagger.model.ReserveBalanceFailureEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToReserveBalanceFailureEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToTopupBalanceCancelEvent(io.swagger.model.TopupBalanceCancelEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToTopupBalanceCancelEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToTopupBalanceCreateEvent(io.swagger.model.TopupBalanceCreateEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToTopupBalanceCreateEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToTopupBalanceFailureEvent(io.swagger.model.TopupBalanceFailureEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToTopupBalanceFailureEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToTransferBalanceCancelEvent(io.swagger.model.TransferBalanceCancelEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToTransferBalanceCancelEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToTransferBalanceCreateEvent(io.swagger.model.TransferBalanceCreateEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToTransferBalanceCreateEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public javax.ws.rs.core.Response listenToTransferBalanceFailureEvent(io.swagger.model.TransferBalanceFailureEvent body, javax.ws.rs.core.SecurityContext securityContext) throws io.swagger.api.NotFoundException {
        
        // Return object
        javax.ws.rs.core.Response objectToReturn = null;

        // Type for return object
        final Type response_type = new TypeToken<javax.ws.rs.core.Response>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ListenerApiServiceImpl_listenToTransferBalanceFailureEvent", toJson(body));
            StatusAndData sad = unloadVoltTable( cr, response_type);
            if (sad.statusCode == RESPONSE_CREATED) {
                objectToReturn = (javax.ws.rs.core.Response) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }
    private String toJson(Object thingsToMakeIntoJson) {
        initJson();
        return json.toJson(thingsToMakeIntoJson);
        }

    private Object fromJson(String objectThatIsJson, Type type) throws Exception {
        initJson();
        Object theObject = null;
        try {
            theObject = json.fromJson(objectThatIsJson, type);
        } catch (Exception e) {
            throw new Exception("Unable to parse JSON:" + e.getMessage());
        }

        return theObject;
        }

    private void initJson() {
        if (json == null)
            {
            json = new Gson();
            }
        }


   private StatusAndData unloadVoltTable(ClientResponse cr, Type type) throws Exception {

        StatusAndData sad = new StatusAndData();

        sad.statusCode = RESPONSE_CREATED;

        if (cr.getStatus() == ClientResponse.SUCCESS) {
            
            String payload = null;
            
            if (cr.getResults()[0].getRowCount() == 1) {
                cr.getResults()[0].advanceRow();
                sad.statusCode = cr.getResults()[0].getLong("STATUS_CODE");
                payload = cr.getResults()[0].getString("PAYLOAD");
            } else {
                StringBuffer b = new StringBuffer();
                char sepChar = '[';
                
                while (cr.getResults()[0].advanceRow()) {
                    sad.statusCode = cr.getResults()[0].getLong("STATUS_CODE");
                    b.append(cr.getResults()[0].getString("PAYLOAD"));
                    b.append(sepChar);
                    sepChar = ',';
                }
                b.append(']');
                payload = b.toString();
            }

            if (type != null && payload != null && payload.length() > 0) {
                sad.returnObject = fromJson(payload, type);
            }

        } else { 
            sad.statusCode = RESPONSE_INTERNAL_SERVER_ERROR;
            sad.returnObject = cr.getStatusString();
        } 

        return sad;
    }



    private StatusAndData unloadVoltTable(ClientResponseWithPartitionKey[] cr, Type type) throws Exception {

        StatusAndData sad = new StatusAndData();

        sad.statusCode = RESPONSE_CREATED;

        String payload = null;
        StringBuffer b = new StringBuffer();
        char sepChar = '[';

        for (int i = 0; i < cr.length; i++) {

            if (cr[i].response.getStatus() == ClientResponse.SUCCESS) {

                while (cr[i].response.getResults()[0].advanceRow()) {
                    sad.statusCode = cr[i].response.getResults()[0].getLong("STATUS_CODE");
                    b.append(cr[i].response.getResults()[0].getString("PAYLOAD"));
                    b.append(sepChar);
                    sepChar = ',';
                }

            } else {
                sad.statusCode = RESPONSE_INTERNAL_SERVER_ERROR;
                sad.returnObject = cr[0].response.getStatusString();
                return sad;
            }

        }

        b.append(']');
        payload = b.toString();

        if (type != null && payload != null && payload.length() > 0) {
            sad.returnObject = fromJson(payload, type);
        }

        return sad;
    }
   private Client getClient() throws Exception {

        if (c == null) {
            c = connectVoltDB(System.getenv("voltCommaDelimitedHostnames"));
        }

        return c;
    }

    private static Client connectVoltDB(String commaDelimitedHostnames) throws Exception {
        Client client = null;
        ClientConfig config = null;

        if (commaDelimitedHostnames == null) {
            throw new Exception("No hosts provided...");
            }

        try {

            config = new ClientConfig(); // "admin", "idontknow");
            config.setTopologyChangeAware(true);
            config.setReconnectOnConnectionLoss(true);

            client = ClientFactory.createClient(config);

            String[] hostnameArray = commaDelimitedHostnames.split(",");

            for (String element : hostnameArray) {
                msg("Connect to " + element + "...");
                try {
                    client.createConnection(element);
                } catch (Exception e) {
                    msg(e.getMessage());
                }
            }

            if (client.getConnectedHostList().size() == 0) {
                throw new Exception("No hosts usable...");
            }

            msg("Connected to VoltDB");

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("VoltDB connection failed.." + e.getMessage(), e);
        }

        return client;

    }

    public static void msg(String message) {

        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        System.out.println(strDate + ":" + message);

    }

    public static void msg(Exception e) {

        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        System.out.println(strDate +":" + e.getClass().getName() + ":" + e.getMessage());

    }

     }
