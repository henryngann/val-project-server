package com.valorant.server.datasource

import com.valorant.server.model.Agent


interface AgentDataSource {

  fun retrieveAgents(): Collection<Agent>
  fun retrieveAgent(agentId: String): Agent

}