package com.valorant.server.controllers

import com.valorant.server.model.Agent
import com.valorant.server.service.AgentService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api")
class AgentController(private val service: AgentService) {
  @CrossOrigin(origins = ["http://localhost:8080"])
  @GetMapping("/agents")
  fun getAgents(): Collection<Agent> {
    return service.getAgents()
  };

  @GetMapping("/{uuId}")
  fun getAgent(@PathVariable uuId: String): Agent {
    return service.getAgent(uuId)
  }

}