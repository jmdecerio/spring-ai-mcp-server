package com.jmdecerio.spring_ai_mcp_server.mcptools;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Service;

@Service
public class McpTools {

    @McpTool(description = "Suma dos enteros")
    public int add(
            @McpToolParam(description = "Primer sumando", required = true) int a,
            @McpToolParam(description = "Segundo sumando", required = true) int b) {
        return a + b;
    }
}

