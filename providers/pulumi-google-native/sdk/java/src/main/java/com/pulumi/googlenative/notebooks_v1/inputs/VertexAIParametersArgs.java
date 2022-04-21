// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters used in Vertex AI JobType executions.
 * 
 */
public final class VertexAIParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final VertexAIParametersArgs Empty = new VertexAIParametersArgs();

    /**
     * Environment variables. At most 100 environment variables can be specified and unique. Example: GCP_BUCKET=gs://my-bucket/samples/
     * 
     */
    @Import(name="env")
    private @Nullable Output<Map<String,String>> env;

    public Optional<Output<Map<String,String>>> env() {
        return Optional.ofNullable(this.env);
    }

    /**
     * The full name of the Compute Engine [network](/compute/docs/networks-and-firewalls#networks) to which the Job should be peered. For example, `projects/12345/global/networks/myVPC`. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert) is of the form `projects/{project}/global/networks/{network}`. Where {project} is a project number, as in `12345`, and {network} is a network name. Private services access must already be configured for the network. If left unspecified, the job is not peered with any network.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    private VertexAIParametersArgs() {}

    private VertexAIParametersArgs(VertexAIParametersArgs $) {
        this.env = $.env;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VertexAIParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VertexAIParametersArgs $;

        public Builder() {
            $ = new VertexAIParametersArgs();
        }

        public Builder(VertexAIParametersArgs defaults) {
            $ = new VertexAIParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder env(@Nullable Output<Map<String,String>> env) {
            $.env = env;
            return this;
        }

        public Builder env(Map<String,String> env) {
            return env(Output.of(env));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public VertexAIParametersArgs build() {
            return $;
        }
    }

}
