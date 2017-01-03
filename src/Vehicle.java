/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public interface Vehicle {
    public int numberOfWheels();
    public VehicleType getType();
    public ProducerDetail getProducer();
    public boolean canFly();
    public boolean canSwim();
    public Integer numberOfPassengers();
}
