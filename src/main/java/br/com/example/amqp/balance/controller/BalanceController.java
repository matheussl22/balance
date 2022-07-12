package br.com.example.amqp.balance.controller;

import br.com.example.amqp.balance.model.Balance;
import br.com.example.amqp.balance.service.BalanceService;
import org.jboss.resteasy.annotations.Body;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;

@Path("/balance")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BalanceController {

    @Inject
    BalanceService balanceService;

    @POST
    public void getById(Balance balance) {
        balanceService.save(balance);
    }

    @GET
    @Path("/{id}")
    public Balance getById(@PathParam("id") Integer id) {
        return balanceService.findById(id);
    }

}
