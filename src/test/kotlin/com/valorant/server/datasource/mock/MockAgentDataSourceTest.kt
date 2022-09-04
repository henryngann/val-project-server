package com.valorant.server.datasource.mock

import com.valorant.server.model.Agent
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.function.Consumer
import java.util.function.Predicate

//Test Driven Development -> Make your test fails first then fix
//Live Template -> Added test shortcut

internal class MockAgentDataSourceTest {
  //Instantiating this object manually
  //Testing our Data Source as a POJO -> Regular JUNIT5 testcase w/o SpringBoot Dependencies

  private val mockAgentDataSource: MockAgentDataSource = MockAgentDataSource();

  @Test
  fun `Should provide a collection of agents`() {
    //given

    //when
    val agents = mockAgentDataSource.retrieveAgents()

    // then
    Assertions.assertThat(agents).isNotEmpty
  }

  @Test
  fun `Should provide some mock data`() {
    //given


    //when
    val agents = mockAgentDataSource.retrieveAgents()

    // then
    Assertions.assertThat(agents).allMatch(Predicate { it.displayName.isNotBlank() })
    Assertions.assertThat(agents).anyMatch(Predicate { it.description.isNotBlank() })
  }
}