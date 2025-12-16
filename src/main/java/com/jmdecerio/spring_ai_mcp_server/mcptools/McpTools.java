package com.jmdecerio.spring_ai_mcp_server.mcptools;

import lombok.extern.slf4j.Slf4j;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class McpTools {

    @McpTool(description = "Suma dos enteros")
    public int add(
            @McpToolParam(description = "Primer sumando", required = true) int a,
            @McpToolParam(description = "Segundo sumando", required = true) int b) {
        log.info("Sumando: {} + {} = {}", a, b, a+b);
        return a + b;
    }
}

