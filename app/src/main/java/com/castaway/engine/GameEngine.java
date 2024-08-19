package com.castaway.engine;

import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;

public class GameEngine {
  public static void main(String[] args) {
    DiscordClient client = DiscordClient
        .create("");
    Mono<Void> login = client.withGateway((GatewayDiscordClient gateway) -> Mono.empty());

    login.block();

  }
}
