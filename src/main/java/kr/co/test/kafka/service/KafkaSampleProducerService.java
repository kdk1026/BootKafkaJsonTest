package kr.co.test.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import kr.co.test.kafka.model.User;

/**
 * <pre>
 * -----------------------------------
 * 개정이력
 * -----------------------------------
 * 2022. 7. 19. kdk	최초작성
 * </pre>
 * 
 *
 * @author kdk
 */
@Service
public class KafkaSampleProducerService {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public void sendMessage(User user) {
		System.out.println("send message : " +  user.toString());        
		kafkaTemplate.send("test2", user);
	}
	
}
