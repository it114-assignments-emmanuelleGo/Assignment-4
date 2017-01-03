/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public class JetEngineBase implements JetEngine, HasProducer{
    private ProducerDetail producerDetail;
    private Integer hp;
    
    public ProducerDetail getProducer(){
        return producerDetail;
    }
    
    public Integer getHp() {
        return hp;
    }
}
