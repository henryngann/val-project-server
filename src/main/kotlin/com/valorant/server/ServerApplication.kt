package com.valorant.server

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import org.springframework.web.server.ServerWebExchange
import org.springframework.web.server.WebFilterChain
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import javax.servlet.annotation.WebFilter

@SpringBootApplication
class ServerApplication{
	@Bean
	fun restTemplate(builder:RestTemplateBuilder): RestTemplate = builder.build()
	@Configuration
	class WebServerConfiguration {


		private val corsOriginPatterns: String = "http://localhost:3000"

		@Bean
		fun addCorsConfig(): WebMvcConfigurer {
			return object : WebMvcConfigurer {
				override fun addCorsMappings(registry: CorsRegistry) {
					val allowedOrigins = corsOriginPatterns.split(",").toTypedArray()
					registry.addMapping("/**")
						.allowedMethods("*")
						.allowedOriginPatterns(*allowedOrigins)
						.allowCredentials(true)
				}
			}
		}
	}
}




//WEB Layer -> Controllers, REST mappings
//SERVICE layer -> Services, Business Logic ^
//Data Source -> Data retrieval, storage    ^
//DATA layer -> Models, Serialization	      ^


fun main(args: Array<String>) {



	runApplication<ServerApplication>(*args)
}
