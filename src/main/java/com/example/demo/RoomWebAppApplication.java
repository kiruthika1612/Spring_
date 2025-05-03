package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.Room;
import com.example.demo.repository.RoomRepository;

@SpringBootApplication
public class RoomWebAppApplication implements CommandLineRunner {

	private final RoomRepository roomRepository;

	public RoomWebAppApplication(RoomRepository roomRepository) {
		super();
		this.roomRepository = roomRepository;
	}

	private static final Logger LOG = LoggerFactory.getLogger(RoomWebAppApplication.class);

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			LOG.info("Starting CLR Application");
//
//			ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms", HttpMethod.GET,
//					null, new ParameterizedTypeReference<List<Room>>() {
//					});
//			rooms.getBody().forEach(room -> {
//				LOG.info(room.toString());
//			});
//
//			LOG.info("Completed CLR Application");
//		};
//
//	}

	public static void main(String[] args) {
		LOG.info("Starting CLR Application");
		SpringApplication.run(RoomWebAppApplication.class, args);
		LOG.info("Completed CLR Application");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("\n Seeding.....");
		if (roomRepository.count() == 0) {
			Room room1 = new Room(101, "RoomKiru", "R1", "Q");
			roomRepository.save(room1);
			System.out.println("Default room created.");
		} else {
			System.out.println("else block... Skipping seeding.");
		}

	}

}
