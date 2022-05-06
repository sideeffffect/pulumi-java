// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.EventHubDataConnectionArgs;
import com.pulumi.azurenative.synapse.outputs.SystemDataResponse;
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
 * Class representing an event hub data connection.
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * ### KustoPoolDataConnectionsCreateOrUpdate.json
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
 *         var eventHubDataConnection = new EventHubDataConnection(&#34;eventHubDataConnection&#34;, EventHubDataConnectionArgs.builder()        
 *             .consumerGroup(&#34;testConsumerGroup1&#34;)
 *             .dataConnectionName(&#34;DataConnections8&#34;)
 *             .databaseName(&#34;KustoDatabase8&#34;)
 *             .eventHubResourceId(&#34;/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.EventHub/namespaces/eventhubTestns1/eventhubs/eventhubTest1&#34;)
 *             .kind(&#34;EventHub&#34;)
 *             .kustoPoolName(&#34;kustoclusterrptest4&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;kustorptest&#34;)
 *             .workspaceName(&#34;synapseWorkspaceName&#34;)
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
 * $ pulumi import azure-native:synapse:EventHubDataConnection KustoClusterRPTest4/KustoDatabase8/DataConnections8 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Synapse/workspaces/synapseWorkspaceName/kustopools/KustoClusterRPTest4/Databases/KustoDatabase8/DataConnections/DataConnections8 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:EventHubDataConnection")
public class EventHubDataConnection extends com.pulumi.resources.CustomResource {
    /**
     * The event hub messages compression type
     * 
     */
    @Export(name="compression", type=String.class, parameters={})
    private Output</* @Nullable */ String> compression;

    /**
     * @return The event hub messages compression type
     * 
     */
    public Output<Optional<String>> compression() {
        return Codegen.optional(this.compression);
    }
    /**
     * The event hub consumer group.
     * 
     */
    @Export(name="consumerGroup", type=String.class, parameters={})
    private Output<String> consumerGroup;

    /**
     * @return The event hub consumer group.
     * 
     */
    public Output<String> consumerGroup() {
        return this.consumerGroup;
    }
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @Export(name="dataFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataFormat;

    /**
     * @return The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    public Output<Optional<String>> dataFormat() {
        return Codegen.optional(this.dataFormat);
    }
    /**
     * The resource ID of the event hub to be used to create a data connection.
     * 
     */
    @Export(name="eventHubResourceId", type=String.class, parameters={})
    private Output<String> eventHubResourceId;

    /**
     * @return The resource ID of the event hub to be used to create a data connection.
     * 
     */
    public Output<String> eventHubResourceId() {
        return this.eventHubResourceId;
    }
    /**
     * System properties of the event hub
     * 
     */
    @Export(name="eventSystemProperties", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> eventSystemProperties;

    /**
     * @return System properties of the event hub
     * 
     */
    public Output<Optional<List<String>>> eventSystemProperties() {
        return Codegen.optional(this.eventSystemProperties);
    }
    /**
     * Kind of the endpoint for the data connection
     * Expected value is &#39;EventHub&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of the endpoint for the data connection
     * Expected value is &#39;EventHub&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @Export(name="mappingRuleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> mappingRuleName;

    /**
     * @return The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    public Output<Optional<String>> mappingRuleName() {
        return Codegen.optional(this.mappingRuleName);
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
     * The provisioned state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableName;

    /**
     * @return The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    public Output<Optional<String>> tableName() {
        return Codegen.optional(this.tableName);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventHubDataConnection(String name) {
        this(name, EventHubDataConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventHubDataConnection(String name, EventHubDataConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventHubDataConnection(String name, EventHubDataConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:EventHubDataConnection", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private EventHubDataConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:EventHubDataConnection", name, null, makeResourceOptions(options, id));
    }

    private static EventHubDataConnectionArgs makeArgs(EventHubDataConnectionArgs args) {
        var builder = args == null ? EventHubDataConnectionArgs.builder() : EventHubDataConnectionArgs.builder(args);
        return builder
            .kind("EventHub")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:EventHubDataConnection").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:EventHubDataConnection").build())
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
    public static EventHubDataConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventHubDataConnection(name, id, options);
    }
}
