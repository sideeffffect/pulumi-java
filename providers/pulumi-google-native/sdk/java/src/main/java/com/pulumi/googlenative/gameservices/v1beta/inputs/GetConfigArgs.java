// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigArgs Empty = new GetConfigArgs();

    @Import(name="configId", required=true)
    private Output<String> configId;

    public Output<String> configId() {
        return this.configId;
    }

    @Import(name="gameServerDeploymentId", required=true)
    private Output<String> gameServerDeploymentId;

    public Output<String> gameServerDeploymentId() {
        return this.gameServerDeploymentId;
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

    private GetConfigArgs() {}

    private GetConfigArgs(GetConfigArgs $) {
        this.configId = $.configId;
        this.gameServerDeploymentId = $.gameServerDeploymentId;
        this.location = $.location;
        this.project = $.project;
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

        public Builder configId(Output<String> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(String configId) {
            return configId(Output.of(configId));
        }

        public Builder gameServerDeploymentId(Output<String> gameServerDeploymentId) {
            $.gameServerDeploymentId = gameServerDeploymentId;
            return this;
        }

        public Builder gameServerDeploymentId(String gameServerDeploymentId) {
            return gameServerDeploymentId(Output.of(gameServerDeploymentId));
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

        public GetConfigArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.gameServerDeploymentId = Objects.requireNonNull($.gameServerDeploymentId, "expected parameter 'gameServerDeploymentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
