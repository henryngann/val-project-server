package com.valorant.server.service

import com.valorant.server.datasource.AgentDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AgentServiceTest {


  //mockk object - relaxed = return a default value
  private val dataSource: AgentDataSource = mockk(relaxed = true)

  //POJO
  private val agentService = AgentService(dataSource)

  @Test
  fun `should call its data source to retrieve agents`() {
    //given

// explicitly saying what you want to return if relaxed = false
// every { dataSource.retrieveAgents() } returns emptyList()

    //when
    agentService.getAgents()

    // then

    //Comes from MOCKK - Verifies that the Method call is being done in your test realm
    //exactly 1 ensures it is called once
    verify(exactly = 1) { dataSource.retrieveAgents() }

  }
}