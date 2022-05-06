// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.streamanalytics.InputArgs;
import com.pulumi.azurenative.streamanalytics.outputs.ReferenceInputPropertiesResponse;
import com.pulumi.azurenative.streamanalytics.outputs.StreamInputPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An input object, containing all information associated with the named input. All inputs are contained under a streaming job.
 * API Version: 2016-03-01.
 * 
 * ## Example Usage
 * ### Create a reference blob input with CSV serialization
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
 *         var input = new Input(&#34;input&#34;, InputArgs.builder()        
 *             .inputName(&#34;input7225&#34;)
 *             .jobName(&#34;sj9597&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;datasource&#34;, Map.ofEntries(
 *                     Map.entry(&#34;container&#34;, &#34;state&#34;),
 *                     Map.entry(&#34;dateFormat&#34;, &#34;yyyy/MM/dd&#34;),
 *                     Map.entry(&#34;pathPattern&#34;, &#34;{date}/{time}&#34;),
 *                     Map.entry(&#34;storageAccounts&#34;, Map.ofEntries(
 *                         Map.entry(&#34;accountKey&#34;, &#34;someAccountKey==&#34;),
 *                         Map.entry(&#34;accountName&#34;, &#34;someAccountName&#34;)
 *                     )),
 *                     Map.entry(&#34;timeFormat&#34;, &#34;HH&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Microsoft.Storage/Blob&#34;)
 *                 )),
 *                 Map.entry(&#34;serialization&#34;, Map.ofEntries(
 *                     Map.entry(&#34;encoding&#34;, &#34;UTF8&#34;),
 *                     Map.entry(&#34;fieldDelimiter&#34;, &#34;,&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Csv&#34;)
 *                 )),
 *                 Map.entry(&#34;type&#34;, &#34;Reference&#34;)
 *             ))
 *             .resourceGroupName(&#34;sjrg8440&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a stream Event Hub input with JSON serialization
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
 *         var input = new Input(&#34;input&#34;, InputArgs.builder()        
 *             .inputName(&#34;input7425&#34;)
 *             .jobName(&#34;sj197&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;datasource&#34;, Map.ofEntries(
 *                     Map.entry(&#34;consumerGroupName&#34;, &#34;sdkconsumergroup&#34;),
 *                     Map.entry(&#34;eventHubName&#34;, &#34;sdkeventhub&#34;),
 *                     Map.entry(&#34;serviceBusNamespace&#34;, &#34;sdktest&#34;),
 *                     Map.entry(&#34;sharedAccessPolicyKey&#34;, &#34;someSharedAccessPolicyKey==&#34;),
 *                     Map.entry(&#34;sharedAccessPolicyName&#34;, &#34;RootManageSharedAccessKey&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Microsoft.ServiceBus/EventHub&#34;)
 *                 )),
 *                 Map.entry(&#34;serialization&#34;, Map.ofEntries(
 *                     Map.entry(&#34;encoding&#34;, &#34;UTF8&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Json&#34;)
 *                 )),
 *                 Map.entry(&#34;type&#34;, &#34;Stream&#34;)
 *             ))
 *             .resourceGroupName(&#34;sjrg3139&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a stream IoT Hub input with Avro serialization
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
 *         var input = new Input(&#34;input&#34;, InputArgs.builder()        
 *             .inputName(&#34;input7970&#34;)
 *             .jobName(&#34;sj9742&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;datasource&#34;, Map.ofEntries(
 *                     Map.entry(&#34;consumerGroupName&#34;, &#34;sdkconsumergroup&#34;),
 *                     Map.entry(&#34;endpoint&#34;, &#34;messages/events&#34;),
 *                     Map.entry(&#34;iotHubNamespace&#34;, &#34;iothub&#34;),
 *                     Map.entry(&#34;sharedAccessPolicyKey&#34;, &#34;sharedAccessPolicyKey=&#34;),
 *                     Map.entry(&#34;sharedAccessPolicyName&#34;, &#34;owner&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Microsoft.Devices/IotHubs&#34;)
 *                 )),
 *                 Map.entry(&#34;serialization&#34;, Map.of(&#34;type&#34;, &#34;Avro&#34;)),
 *                 Map.entry(&#34;type&#34;, &#34;Stream&#34;)
 *             ))
 *             .resourceGroupName(&#34;sjrg3467&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a stream blob input with CSV serialization
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
 *         var input = new Input(&#34;input&#34;, InputArgs.builder()        
 *             .inputName(&#34;input8899&#34;)
 *             .jobName(&#34;sj6695&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;datasource&#34;, Map.ofEntries(
 *                     Map.entry(&#34;container&#34;, &#34;state&#34;),
 *                     Map.entry(&#34;dateFormat&#34;, &#34;yyyy/MM/dd&#34;),
 *                     Map.entry(&#34;pathPattern&#34;, &#34;{date}/{time}&#34;),
 *                     Map.entry(&#34;sourcePartitionCount&#34;, 16),
 *                     Map.entry(&#34;storageAccounts&#34;, Map.ofEntries(
 *                         Map.entry(&#34;accountKey&#34;, &#34;someAccountKey==&#34;),
 *                         Map.entry(&#34;accountName&#34;, &#34;someAccountName&#34;)
 *                     )),
 *                     Map.entry(&#34;timeFormat&#34;, &#34;HH&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Microsoft.Storage/Blob&#34;)
 *                 )),
 *                 Map.entry(&#34;serialization&#34;, Map.ofEntries(
 *                     Map.entry(&#34;encoding&#34;, &#34;UTF8&#34;),
 *                     Map.entry(&#34;fieldDelimiter&#34;, &#34;,&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Csv&#34;)
 *                 )),
 *                 Map.entry(&#34;type&#34;, &#34;Stream&#34;)
 *             ))
 *             .resourceGroupName(&#34;sjrg8161&#34;)
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
 * $ pulumi import azure-native:streamanalytics:Input input8899 /subscriptions/56b5e0a9-b645-407d-99b0-c64f86013e3d/resourceGroups/sjrg8161/providers/Microsoft.StreamAnalytics/streamingjobs/sj6695/inputs/input8899 
 * ```
 * 
 */
@ResourceType(type="azure-native:streamanalytics:Input")
public class Input extends com.pulumi.resources.CustomResource {
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Export(name="properties", type=Either.class, parameters={ReferenceInputPropertiesResponse.class, StreamInputPropertiesResponse.class})
    private Output<Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse>> properties;

    /**
     * @return The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Output<Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse>> properties() {
        return this.properties;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Input(String name) {
        this(name, InputArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Input(String name, InputArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Input(String name, InputArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:Input", name, args == null ? InputArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Input(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:Input", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20160301:Input").build()),
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20170401preview:Input").build()),
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20200301:Input").build()),
                Output.of(Alias.builder().type("azure-native:streamanalytics/v20211001preview:Input").build())
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
    public static Input get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Input(name, id, options);
    }
}
