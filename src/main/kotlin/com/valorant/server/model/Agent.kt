package com.valorant.server.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.stereotype.Component

//Data Transfer Object -> Goes over the Network
//This Agent class gets serialized into a JSON and sent over.

//Kotlin -> Primary Constructors -> Constructor Parameters defined in Class Header

//Keyword Private is not needed -> Kotlin exposes getters and setters publicly
//Val is still private and hidden for security practices

//Data Class -> automatically creates equals, toString, hashcode
//Data Class -> Main purpose is to hold data.

data class Agent(
  @JsonProperty("displayName")
   val displayName: String?,
  @JsonProperty("trust")
   val description: String?,
  @JsonProperty("uuid")
   val uuid: String?,
  ) {

}