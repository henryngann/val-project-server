package com.valorant.server.controllers

import com.valorant.server.model.Agent
import com.valorant.server.service.AgentService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/agents")
class AgentController(private val service: AgentService) {
  @CrossOrigin(origins = ["http://localhost:8080"])
  @GetMapping
  fun getAgents(): Collection<Agent> {
    return service.getAgents()
  };

  @GetMapping("/{agentId}")
  fun getAgent(@PathVariable uuid: String): Agent {
    return service.getAgent(uuid)
  }

}