package com.georgehigbie;

import javax.management.monitor.Monitor;

public class Computer {

    private Case theCase;
    private ScreanMonitor monitor;
    private Motherboard motherboard;

    public Computer(Case theCase, ScreanMonitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public ScreanMonitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
