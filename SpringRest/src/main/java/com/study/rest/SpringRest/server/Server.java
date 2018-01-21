package com.study.rest.SpringRest.server;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;
 
@Component
public class Server implements EmbeddedServletContainerCustomizer {
 
 public void customize(ConfigurableEmbeddedServletContainer container) 
 {
 container.setPort(8081);
 }
}