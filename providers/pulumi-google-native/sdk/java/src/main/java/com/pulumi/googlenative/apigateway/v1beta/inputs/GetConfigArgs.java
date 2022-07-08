// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigArgs Empty = new GetConfigArgs();

    @Import(name="apiId", required=true)
    private Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
    }

    @Import(name="configId", required=true)
    private Output<String> configId;

    public Output<String> configId() {
        return this.configId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="view")
    private @Nullable Output<String> view;

    public Optional<Output<String>> view() {
        return Optional.ofNullable(this.view);
    }

    private GetConfigArgs() {}

    private GetConfigArgs(GetConfigArgs $) {
        this.apiId = $.apiId;
        this.configId = $.configId;
        this.location = $.location;
        this.project = $.project;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigArgs $;

        public Builder() {
            $ = new GetConfigArgs();
        }

        public Builder(GetConfigArgs defaults) {
            $ = new GetConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        public Builder configId(Output<String> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(String configId) {
            return configId(Output.of(configId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder view(@Nullable Output<String> view) {
            $.view = view;
            return this;
        }

        public Builder view(String view) {
            return view(Output.of(view));
        }

        public GetConfigArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
