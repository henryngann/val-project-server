package com.valorant.server.network

import com.valorant.server.datasource.AgentDataSource
import com.valorant.server.model.Agent
import com.valorant.server.network.dto.AgentList
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForEntity
import java.io.IOException


@Repository("network")
class NetworkDataSource(@Autowired private val restTemplate: RestTemplate) : AgentDataSource {

  override fun retrieveAgents(): Collection<Agent> {

  val response: ResponseEntity<AgentList> =  restTemplate.getForEntity<AgentList>("https://valorant-api.com/v1/agents?isPlayableCharacter=true")
    return response.body?.data
      ?: throw IOException("Could not fetch agents from the network")
  }

  override fun retrieveAgent(agentId: String): Agent {
    TODO("Not yet implemented")
  }
}