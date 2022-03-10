// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopePathStatementRequestArgs;
import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopeAccessScopePathRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopeAccessScopePathRequestArgs Empty = new NetworkInsightsAccessScopeAccessScopePathRequestArgs();

    @InputImport(name="destination")
      private final @Nullable Input<NetworkInsightsAccessScopePathStatementRequestArgs> destination;

    public Input<NetworkInsightsAccessScopePathStatementRequestArgs> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    @InputImport(name="source")
      private final @Nullable Input<NetworkInsightsAccessScopePathStatementRequestArgs> source;

    public Input<NetworkInsightsAccessScopePathStatementRequestArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    @InputImport(name="throughResources")
      private final @Nullable Input<List<NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs>> throughResources;

    public Input<List<NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs>> getThroughResources() {
        return this.throughResources == null ? Input.empty() : this.throughResources;
    }

    public NetworkInsightsAccessScopeAccessScopePathRequestArgs(
        @Nullable Input<NetworkInsightsAccessScopePathStatementRequestArgs> destination,
        @Nullable Input<NetworkInsightsAccessScopePathStatementRequestArgs> source,
        @Nullable Input<List<NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs>> throughResources) {
        this.destination = destination;
        this.source = source;
        this.throughResources = throughResources;
    }

    private NetworkInsightsAccessScopeAccessScopePathRequestArgs() {
        this.destination = Input.empty();
        this.source = Input.empty();
        this.throughResources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopeAccessScopePathRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NetworkInsightsAccessScopePathStatementRequestArgs> destination;
        private @Nullable Input<NetworkInsightsAccessScopePathStatementRequestArgs> source;
        private @Nullable Input<List<NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs>> throughResources;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopeAccessScopePathRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.source = defaults.source;
    	      this.throughResources = defaults.throughResources;
        }

        public Builder destination(@Nullable Input<NetworkInsightsAccessScopePathStatementRequestArgs> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(@Nullable NetworkInsightsAccessScopePathStatementRequestArgs destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder source(@Nullable Input<NetworkInsightsAccessScopePathStatementRequestArgs> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable NetworkInsightsAccessScopePathStatementRequestArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder throughResources(@Nullable Input<List<NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs>> throughResources) {
            this.throughResources = throughResources;
            return this;
        }

        public Builder throughResources(@Nullable List<NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs> throughResources) {
            this.throughResources = Input.ofNullable(throughResources);
            return this;
        }
        public NetworkInsightsAccessScopeAccessScopePathRequestArgs build() {
            return new NetworkInsightsAccessScopeAccessScopePathRequestArgs(destination, source, throughResources);
        }
    }
}
