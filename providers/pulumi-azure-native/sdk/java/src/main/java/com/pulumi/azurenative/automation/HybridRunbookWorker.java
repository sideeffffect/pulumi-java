// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.automation.HybridRunbookWorkerArgs;
import com.pulumi.azurenative.automation.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Definition of hybrid runbook worker.
 * API Version: 2021-06-22.
 * 
 * ## Example Usage
 * ### Create a V2 hybrid runbook worker
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var hybridRunbookWorker = new HybridRunbookWorker(&#34;hybridRunbookWorker&#34;, HybridRunbookWorkerArgs.builder()        
 *             .automationAccountName(&#34;testaccount&#34;)
 *             .hybridRunbookWorkerGroupName(&#34;TestHybridGroup&#34;)
 *             .hybridRunbookWorkerId(&#34;c010ad12-ef14-4a2a-aa9e-ef22c4745ddd&#34;)
 *             .resourceGroupName(&#34;rg&#34;)
 *             .vmResourceId(&#34;/subscriptions/vmsubid/resourceGroups/vmrg/providers/Microsoft.Compute/virtualMachines/vmname&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:HybridRunbookWorker c010ad12-ef14-4a2a-aa9e-ef22c4745ddd /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/testaccount/hybridRunbookWorkerGroups/TestHybridGroup/hybridRunbookWorkers/c010ad12-ef14-4a2a-aa9e-ef22c4745ddd 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:HybridRunbookWorker")
public class HybridRunbookWorker extends com.pulumi.resources.CustomResource {
    /**
     * Gets or sets the assigned machine IP address.
     * 
     */
    @Export(name="ip", type=String.class, parameters={})
    private Output</* @Nullable */ String> ip;

    /**
     * @return Gets or sets the assigned machine IP address.
     * 
     */
    public Output<Optional<String>> ip() {
        return Codegen.optional(this.ip);
    }
    /**
     * Last Heartbeat from the Worker
     * 
     */
    @Export(name="lastSeenDateTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastSeenDateTime;

    /**
     * @return Last Heartbeat from the Worker
     * 
     */
    public Output<Optional<String>> lastSeenDateTime() {
        return Codegen.optional(this.lastSeenDateTime);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Gets or sets the registration time of the worker machine.
     * 
     */
    @Export(name="registeredDateTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> registeredDateTime;

    /**
     * @return Gets or sets the registration time of the worker machine.
     * 
     */
    public Output<Optional<String>> registeredDateTime() {
        return Codegen.optional(this.registeredDateTime);
    }
    /**
     * Resource system metadata.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Resource system metadata.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Azure Resource Manager Id for a virtual machine.
     * 
     */
    @Export(name="vmResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmResourceId;

    /**
     * @return Azure Resource Manager Id for a virtual machine.
     * 
     */
    public Output<Optional<String>> vmResourceId() {
        return Codegen.optional(this.vmResourceId);
    }
    /**
     * Name of the HybridWorker.
     * 
     */
    @Export(name="workerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> workerName;

    /**
     * @return Name of the HybridWorker.
     * 
     */
    public Output<Optional<String>> workerName() {
        return Codegen.optional(this.workerName);
    }
    /**
     * Type of the HybridWorker.
     * 
     */
    @Export(name="workerType", type=String.class, parameters={})
    private Output</* @Nullable */ String> workerType;

    /**
     * @return Type of the HybridWorker.
     * 
     */
    public Output<Optional<String>> workerType() {
        return Codegen.optional(this.workerType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HybridRunbookWorker(String name) {
        this(name, HybridRunbookWorkerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HybridRunbookWorker(String name, HybridRunbookWorkerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HybridRunbookWorker(String name, HybridRunbookWorkerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:HybridRunbookWorker", name, args == null ? HybridRunbookWorkerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HybridRunbookWorker(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:HybridRunbookWorker", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automation/v20210622:HybridRunbookWorker").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HybridRunbookWorker get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HybridRunbookWorker(name, id, options);
    }
}
