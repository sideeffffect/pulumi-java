// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionNotificationEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionNotificationEndpointArgs Empty = new GetRegionNotificationEndpointArgs();

    @Import(name="notificationEndpoint", required=true)
    private Output<String> notificationEndpoint;

    public Output<String> notificationEndpoint() {
        return this.notificationEndpoint;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    private GetRegionNotificationEndpointArgs() {}

    private GetRegionNotificationEndpointArgs(GetRegionNotificationEndpointArgs $) {
        this.notificationEndpoint = $.notificationEndpoint;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionNotificationEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionNotificationEndpointArgs $;

        public Builder() {
            $ = new GetRegionNotificationEndpointArgs();
        }

        public Builder(GetRegionNotificationEndpointArgs defaults) {
            $ = new GetRegionNotificationEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder notificationEndpoint(Output<String> notificationEndpoint) {
            $.notificationEndpoint = notificationEndpoint;
            return this;
        }

        public Builder notificationEndpoint(String notificationEndpoint) {
            return notificationEndpoint(Output.of(notificationEndpoint));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetRegionNotificationEndpointArgs build() {
            $.notificationEndpoint = Objects.requireNonNull($.notificationEndpoint, "expected parameter 'notificationEndpoint' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
