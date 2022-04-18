// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.policysimulator_v1.ReplayArgs;
import com.pulumi.googlenative.policysimulator_v1.outputs.GoogleCloudPolicysimulatorV1ReplayConfigResponse;
import com.pulumi.googlenative.policysimulator_v1.outputs.GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates and starts a Replay using the given ReplayConfig.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:policysimulator/v1:Replay")
public class Replay extends com.pulumi.resources.CustomResource {
    /**
     * The configuration used for the `Replay`.
     * 
     */
    @Export(name="config", type=GoogleCloudPolicysimulatorV1ReplayConfigResponse.class, parameters={})
    private Output<GoogleCloudPolicysimulatorV1ReplayConfigResponse> config;

    /**
     * @return The configuration used for the `Replay`.
     * 
     */
    public Output<GoogleCloudPolicysimulatorV1ReplayConfigResponse> config() {
        return this.config;
    }
    /**
     * The resource name of the `Replay`, which has the following format: `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`, where `{resource-id}` is the ID of the project, folder, or organization that owns the Replay. Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the `Replay`, which has the following format: `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`, where `{resource-id}` is the ID of the project, folder, or organization that owns the Replay. Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Summary statistics about the replayed log entries.
     * 
     */
    @Export(name="resultsSummary", type=GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse.class, parameters={})
    private Output<GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse> resultsSummary;

    /**
     * @return Summary statistics about the replayed log entries.
     * 
     */
    public Output<GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse> resultsSummary() {
        return this.resultsSummary;
    }
    /**
     * The current state of the `Replay`.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the `Replay`.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Replay(String name) {
        this(name, ReplayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Replay(String name, ReplayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Replay(String name, ReplayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:policysimulator/v1:Replay", name, args == null ? ReplayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Replay(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:policysimulator/v1:Replay", name, null, makeResourceOptions(options, id));
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
    public static Replay get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Replay(name, id, options);
    }
}
