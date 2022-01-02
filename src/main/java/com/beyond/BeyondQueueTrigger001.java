package com.beyond;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Azure Blob trigger.
 */
public class BeyondQueueTrigger001 {
    /**
     * This function will be invoked when a new or updated blob is detected at the specified path. The blob contents are provided as input to this function.
     */
    @FunctionName("BeyondQueueTrigger001")
    @StorageAccount("empty")
    public void run(
        @BlobTrigger(name = "content", path = "mycontainer/{name}", dataType = "binary") byte[] content,
        @BindingName("name") String name,
        final ExecutionContext context
    ) {
        context.getLogger().info("Java Blob trigger function processed a blob. Name: " + name + "\n  Size: " + content.length + " Bytes");
    }
}
