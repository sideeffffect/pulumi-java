// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalNetworkEndpointGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalNetworkEndpointGroupArgs Empty = new GetGlobalNetworkEndpointGroupArgs();

    @Import(name="networkEndpointGroup", required=true)
    private Output<String> networkEndpointGroup;

    public Output<String> networkEndpointGroup() {
        return this.networkEndpointGroup;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetGlobalNetworkEndpointGroupArgs() {}

    private GetGlobalNetworkEndpointGroupArgs(GetGlobalNetworkEndpointGroupArgs $) {
        this.networkEndpointGroup = $.networkEndpointGroup;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalNetworkEndpointGroupArgs $;

        public Builder() {
            $ = new GetGlobalNetworkEndpointGroupArgs();
        }

        public Builder(GetGlobalNetworkEndpointGroupArgs defaults) {
            $ = new GetGlobalNetworkEndpointGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkEndpointGroup(Output<String> networkEndpointGroup) {
            $.networkEndpointGroup = networkEndpointGroup;
            return this;
        }

        public Builder networkEndpointGroup(String networkEndpointGroup) {
            return networkEndpointGroup(Output.of(networkEndpointGroup));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetGlobalNetworkEndpointGroupArgs build() {
            $.networkEndpointGroup = Objects.requireNonNull($.networkEndpointGroup, "expected parameter 'networkEndpointGroup' to be non-null");
            return $;
        }
    }

}
