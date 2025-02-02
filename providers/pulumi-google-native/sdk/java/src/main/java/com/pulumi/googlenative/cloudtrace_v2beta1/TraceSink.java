// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtrace_v2beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudtrace_v2beta1.TraceSinkArgs;
import com.pulumi.googlenative.cloudtrace_v2beta1.outputs.OutputConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a sink that exports trace spans to a destination. The export of newly-ingested traces begins immediately, unless the sink&#39;s `writer_identity` is not permitted to write to the destination. A sink can export traces only from the resource owning the sink (the &#39;parent&#39;).
 * 
 */
@ResourceType(type="google-native:cloudtrace/v2beta1:TraceSink")
public class TraceSink extends com.pulumi.resources.CustomResource {
    /**
     * The canonical sink resource name, unique within the project. Must be of the form: projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `&#34;projects/12345/traceSinks/my-project-trace-sink&#34;`. Sink identifiers are limited to 256 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The canonical sink resource name, unique within the project. Must be of the form: projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `&#34;projects/12345/traceSinks/my-project-trace-sink&#34;`. Sink identifiers are limited to 256 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The export destination.
     * 
     */
    @Export(name="outputConfig", type=OutputConfigResponse.class, parameters={})
    private Output<OutputConfigResponse> outputConfig;

    /**
     * @return The export destination.
     * 
     */
    public Output<OutputConfigResponse> outputConfig() {
        return this.outputConfig;
    }
    /**
     * A service account name for exporting the data. This field is set by sinks.create and sinks.update. The service account will need to be granted write access to the destination specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create tables and to write data, this account needs the `dataEditor` role. Read more about roles in the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.: &#34;service-00000001@00000002.iam.gserviceaccount.com&#34;
     * 
     */
    @Export(name="writerIdentity", type=String.class, parameters={})
    private Output<String> writerIdentity;

    /**
     * @return A service account name for exporting the data. This field is set by sinks.create and sinks.update. The service account will need to be granted write access to the destination specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create tables and to write data, this account needs the `dataEditor` role. Read more about roles in the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.: &#34;service-00000001@00000002.iam.gserviceaccount.com&#34;
     * 
     */
    public Output<String> writerIdentity() {
        return this.writerIdentity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TraceSink(String name) {
        this(name, TraceSinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TraceSink(String name, TraceSinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TraceSink(String name, TraceSinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtrace/v2beta1:TraceSink", name, args == null ? TraceSinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TraceSink(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtrace/v2beta1:TraceSink", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static TraceSink get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TraceSink(name, id, options);
    }
}
