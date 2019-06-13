package com.sls.web.controller;

import com.sls.service.Ticket2Service;
import com.sls.service.TicketService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sls
 **/
@RestController
public class BuyTicket {

    @Resource
    private TicketService ticketService;
    @Resource
    private Ticket2Service ticket2Service;

    @PostMapping("/buy")
    public void buy() {
        ticketService.buy();
    }

    @PostMapping("/buy2")
    public void buy2() {
        ticket2Service.execute();
    }


}
