/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public class CarBase implements Car, HasProducer{
    private int wheels;
    private Integer passengers;
    private VehicleType vehicleType;
    private ProducerDetail producerDetail;
    
    public ProducerDetail getProducer(){
        return producerDetail;
    }
    
    public int numberOfWheels(){
        return wheels;
    }
    
    public VehicleType getType(){
        return vehicleType;
    }
    
    public boolean canFly(){
        return false;
    }
    
    public boolean canSwim(){
        return false;
    }
    
    public Integer numberOfPassengers(){
        return passengers;
    }
}
