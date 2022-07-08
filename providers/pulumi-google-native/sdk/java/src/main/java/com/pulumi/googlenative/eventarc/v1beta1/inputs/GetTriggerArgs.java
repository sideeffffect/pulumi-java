// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTriggerArgs Empty = new GetTriggerArgs();

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

    @Import(name="triggerId", required=true)
    private Output<String> triggerId;

    public Output<String> triggerId() {
        return this.triggerId;
    }

    private GetTriggerArgs() {}

    private GetTriggerArgs(GetTriggerArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.triggerId = $.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTriggerArgs $;

        public Builder() {
            $ = new GetTriggerArgs();
        }

        public Builder(GetTriggerArgs defaults) {
            $ = new GetTriggerArgs(Objects.requireNonNull(defaults));
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

        public Builder triggerId(Output<String> triggerId) {
            $.triggerId = triggerId;
            return this;
        }

        public Builder triggerId(String triggerId) {
            return triggerId(Output.of(triggerId));
        }

        public GetTriggerArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.triggerId = Objects.requireNonNull($.triggerId, "expected parameter 'triggerId' to be non-null");
            return $;
        }
    }

}
