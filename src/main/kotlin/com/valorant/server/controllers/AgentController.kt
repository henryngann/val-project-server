package com.valorant.server.controllers

import com.valorant.server.model.Agent
import com.valorant.server.service.AgentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/agents")
class AgentController(private val service: AgentService) {

  @GetMapping
  fun getAgents(): Collection<Agent> {
    return service.getAgents()
  };

  @GetMapping("/{uuid}")
  fun getAgent(@PathVariable uuid: String): Agent {
    return service.getAgent(uuid)
  }

}