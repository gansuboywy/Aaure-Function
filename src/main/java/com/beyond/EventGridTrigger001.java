package com.beyond;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Event Grid trigger.
 */
public class EventGridTrigger001 {
    /**
     * This function will be invoked when an event is received from Event Grid.
     */
    @FunctionName("EventGridTrigger001")
    public void run(@EventGridTrigger(name = "eventGridEvent") String message, final ExecutionContext context) {
        context.getLogger().info("Java Event Grid trigger function executed.");
        context.getLogger().info(message);
    }
}
