package com.valorant.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class ServerApplication{
	@Bean
	fun restTemplate(builder:RestTemplateBuilder): RestTemplate = builder.build()
}

//WEB Layer -> Controllers, REST mappings
//SERVICE layer -> Services, Business Logic ^
//Data Source -> Data retrieval, storage    ^
//DATA layer -> Models, Serialization	      ^


fun main(args: Array<String>) {



	runApplication<ServerApplication>(*args)
}
