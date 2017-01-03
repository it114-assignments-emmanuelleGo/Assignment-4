/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public abstract class AbstractFactory {
    public abstract Vehicle getVehicleFactory (VehicleType vt, VehicleProducerName vpn, ModelName mn);
    public abstract Engine getEngineFactory(EngineType et, EngineProducerName epn, ModelName mn);
}
