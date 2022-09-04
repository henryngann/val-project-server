package com.valorant.server.service

import com.valorant.server.datasource.AgentDataSource
import com.valorant.server.model.Agent
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

//Tells Spring to make this Object available at runtime.
//Therefore, it will be available in the application context and injected via dependency injection.

//Primary Constructor - Needs some Object of type dataSource
@Service
class AgentService(@Qualifier("network") private val dataSource: AgentDataSource) {

  fun getAgents(): Collection<Agent> {
    return dataSource.retrieveAgents()
  }

  fun getAgent(uuid: String): Agent {
    return dataSource.retrieveAgent(uuid)
  }

}