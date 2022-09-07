package com.valorant.server.datasource.mock

import com.valorant.server.datasource.AgentDataSource
import com.valorant.server.model.Agent
import org.springframework.stereotype.Repository


//Tells Spring to initialize this bean at runtime
//Responsible for retrieving data and storing data
@Repository
class MockAgentDataSource : AgentDataSource {

  val agents = listOf(
    Agent(
      displayName = "Yoru",
      description = "Annoying",
      uuid = "1",
      displayIcon = "Icon",
      fullPortrait = "port", abilities = emptyList(), backgroundGradientColors = arrayOf("1", "2")
    )


  )

  override fun retrieveAgents(): Collection<Agent> {
    return agents
  }

  override fun retrieveAgent(agentId: String): Agent {
    TODO("Not yet implemented")
  }

}