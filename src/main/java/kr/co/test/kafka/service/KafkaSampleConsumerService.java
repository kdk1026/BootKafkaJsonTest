package kr.co.test.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
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
public class KafkaSampleConsumerService {

	@KafkaListener(topics = "test2", groupId = "group2")
	public void consume(User user) {
		System.out.println("receive message : " + user.toString());
	}
	
}
