/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public class VehicleFactory extends AbstractFactory{
    private VehicleType vt;
    private VehicleProducerName vpn;
    private ModelName mn;
    
    private EngineType et;
    private EngineProducerName epn;
    private ModelName emn;

    @Override
    public Vehicle getVehicleFactory(VehicleType vt, VehicleProducerName vpn, ModelName mn) {
        this.vt = vt;
        this.vpn = vpn;
        this.mn = mn;
        
        switch (vt) {
            case CAR:
                switch (vpn) {
                    case BMW:
                        switch (mn) {
                                case _323:
                                    return new _323();
                        }
                    case TOYOTA:
                        switch (mn) {
                            case CAMRY:
                                return new Camry();
                        }
                }
            case BICYCLE:
                switch (vpn) {
                    case SCHWINN:
                        switch (mn) {
                            case STINGRAY:
                                return new Stingray();
                        }
                }
            case MOTORCYCLE:
                switch (vpn) {
                    case HARLEY:
                        switch (mn) {
                            case ROADKING:
                                return new Roadking();
                        }
                }
            case AIRPLANE:
                switch (vpn) {
                    case BOEING:
                        switch (mn) {
                            case B747:
                                return new B747();
                        }
                }
        }
        return null; // Should none of the enums work, this will return null.
    }

    @Override
    public Engine getEngineFactory(EngineType et, EngineProducerName epn, ModelName mn) {
        this.et = et;
        this.epn = epn;
        this.mn = mn;
        
        switch (et){
            case JET:
                switch (epn) {
                    case GE:
                        switch (mn) {
                            case GE90:
                                return new GE90();
                        }
                }
            case GASIC:
                switch (epn) {
                    case BMW:
                        switch (mn) {
                            case I4_1SI:
                                return new I4_1SI();
                        }
                }
            case DIESELIC:
                switch (epn) {
                    case TOYOTA:
                        switch (mn) {
                            case M50:
                                return new M50();
                        }
                }
         
        }
        
        return null;
    }
  
    
}
