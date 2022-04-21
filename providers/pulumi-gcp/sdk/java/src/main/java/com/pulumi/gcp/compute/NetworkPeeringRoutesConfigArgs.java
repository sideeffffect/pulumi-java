// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkPeeringRoutesConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPeeringRoutesConfigArgs Empty = new NetworkPeeringRoutesConfigArgs();

    /**
     * Whether to export the custom routes to the peer network.
     * 
     */
    @Import(name="exportCustomRoutes", required=true)
    private Output<Boolean> exportCustomRoutes;

    public Output<Boolean> exportCustomRoutes() {
        return this.exportCustomRoutes;
    }

    /**
     * Whether to import the custom routes to the peer network.
     * 
     */
    @Import(name="importCustomRoutes", required=true)
    private Output<Boolean> importCustomRoutes;

    public Output<Boolean> importCustomRoutes() {
        return this.importCustomRoutes;
    }

    /**
     * The name of the primary network for the peering.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    public Output<String> network() {
        return this.network;
    }

    /**
     * Name of the peering.
     * 
     */
    @Import(name="peering", required=true)
    private Output<String> peering;

    public Output<String> peering() {
        return this.peering;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private NetworkPeeringRoutesConfigArgs() {}

    private NetworkPeeringRoutesConfigArgs(NetworkPeeringRoutesConfigArgs $) {
        this.exportCustomRoutes = $.exportCustomRoutes;
        this.importCustomRoutes = $.importCustomRoutes;
        this.network = $.network;
        this.peering = $.peering;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPeeringRoutesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPeeringRoutesConfigArgs $;

        public Builder() {
            $ = new NetworkPeeringRoutesConfigArgs();
        }

        public Builder(NetworkPeeringRoutesConfigArgs defaults) {
            $ = new NetworkPeeringRoutesConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder exportCustomRoutes(Output<Boolean> exportCustomRoutes) {
            $.exportCustomRoutes = exportCustomRoutes;
            return this;
        }

        public Builder exportCustomRoutes(Boolean exportCustomRoutes) {
            return exportCustomRoutes(Output.of(exportCustomRoutes));
        }

        public Builder importCustomRoutes(Output<Boolean> importCustomRoutes) {
            $.importCustomRoutes = importCustomRoutes;
            return this;
        }

        public Builder importCustomRoutes(Boolean importCustomRoutes) {
            return importCustomRoutes(Output.of(importCustomRoutes));
        }

        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder peering(Output<String> peering) {
            $.peering = peering;
            return this;
        }

        public Builder peering(String peering) {
            return peering(Output.of(peering));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public NetworkPeeringRoutesConfigArgs build() {
            $.exportCustomRoutes = Objects.requireNonNull($.exportCustomRoutes, "expected parameter 'exportCustomRoutes' to be non-null");
            $.importCustomRoutes = Objects.requireNonNull($.importCustomRoutes, "expected parameter 'importCustomRoutes' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            $.peering = Objects.requireNonNull($.peering, "expected parameter 'peering' to be non-null");
            return $;
        }
    }

}
