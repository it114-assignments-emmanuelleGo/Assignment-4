/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public class GasICEngineBase implements GasICEngine, HasProducer{
    private ProducerDetail producerDetail;
    private Integer hp;
    
    public ProducerDetail getProducer() {
        return producerDetail;
    }
    
    public Integer getHp() {
        return hp;
    }
    
}
