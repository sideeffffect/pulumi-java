// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.policysimulator_v1beta1.inputs.GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplayArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplayArgs Empty = new ReplayArgs();

    /**
     * The configuration used for the `Replay`.
     * 
     */
    @Import(name="config", required=true)
    private Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config;

    public Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config() {
        return this.config;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ReplayArgs() {}

    private ReplayArgs(ReplayArgs $) {
        this.config = $.config;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplayArgs $;

        public Builder() {
            $ = new ReplayArgs();
        }

        public Builder(ReplayArgs defaults) {
            $ = new ReplayArgs(Objects.requireNonNull(defaults));
        }

        public Builder config(Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder location(@Nullable Output<String> location) {
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

        public ReplayArgs build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            return $;
        }
    }

}
