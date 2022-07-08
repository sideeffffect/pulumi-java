// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions.v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFunctionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionArgs Empty = new GetFunctionArgs();

    @Import(name="functionId", required=true)
    private Output<String> functionId;

    public Output<String> functionId() {
        return this.functionId;
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

    private GetFunctionArgs() {}

    private GetFunctionArgs(GetFunctionArgs $) {
        this.functionId = $.functionId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionArgs $;

        public Builder() {
            $ = new GetFunctionArgs();
        }

        public Builder(GetFunctionArgs defaults) {
            $ = new GetFunctionArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionId(Output<String> functionId) {
            $.functionId = functionId;
            return this;
        }

        public Builder functionId(String functionId) {
            return functionId(Output.of(functionId));
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

        public GetFunctionArgs build() {
            $.functionId = Objects.requireNonNull($.functionId, "expected parameter 'functionId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
