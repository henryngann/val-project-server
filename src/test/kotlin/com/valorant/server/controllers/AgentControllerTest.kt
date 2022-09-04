package com.valorant.server.controllers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.web.servlet.function.RequestPredicates.contentType
import java.awt.PageAttributes.MediaType

//Expensive Test - Runs the whole application context
@SpringBootTest // Will only initalize your own application beans, NOT the MOCKMVC
@AutoConfigureMockMvc // Therefore, we need the @AutoConfigureMockMvc annotation
internal class AgentControllerTest {
  //Only used in tests
  //Make mock requests to your REST api without http calls.
  //Mock MVC comes with Spring

  //Spring will initialize an object of this type and assign it to mockMvc.
  @Autowired
  lateinit var mockMvc: MockMvc

  @Test
  fun `should return all agents`() {
    //given
    mockMvc.get("/api/agents")
      .andDo { print() }
      .andExpect {
        status { isOk() }
        content { contentType(org.springframework.http.MediaType.APPLICATION_JSON) }

      }
    
    //when

    // then

  }
  @Test
  fun `should return the agent with the given uid`(){
    //given
    val agentNumber = "1"


    //when
    mockMvc.get("/api/agents/$id")
      .andDo{print()}
      .andExpect { status { isOk() } }

    // then

   }
  
  
}