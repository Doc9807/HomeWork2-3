package service;

import model.Transport;

public class ServiceStation {
    public void check (Transport transport) {
        System.out.println("В обслуживании: " + transport.getModelName());
        transport.service();
    }
}
