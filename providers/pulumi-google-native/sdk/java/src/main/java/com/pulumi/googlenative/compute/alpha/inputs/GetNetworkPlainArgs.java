// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkPlainArgs Empty = new GetNetworkPlainArgs();

    @Import(name="network", required=true)
    private String network;

    public String network() {
        return this.network;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetNetworkPlainArgs() {}

    private GetNetworkPlainArgs(GetNetworkPlainArgs $) {
        this.network = $.network;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkPlainArgs $;

        public Builder() {
            $ = new GetNetworkPlainArgs();
        }

        public Builder(GetNetworkPlainArgs defaults) {
            $ = new GetNetworkPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder network(String network) {
            $.network = network;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetNetworkPlainArgs build() {
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            return $;
        }
    }

}
