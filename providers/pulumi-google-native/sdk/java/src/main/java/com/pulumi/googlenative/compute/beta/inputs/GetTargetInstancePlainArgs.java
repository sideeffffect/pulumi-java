// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetInstancePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetInstancePlainArgs Empty = new GetTargetInstancePlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="targetInstance", required=true)
    private String targetInstance;

    public String targetInstance() {
        return this.targetInstance;
    }

    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private GetTargetInstancePlainArgs() {}

    private GetTargetInstancePlainArgs(GetTargetInstancePlainArgs $) {
        this.project = $.project;
        this.targetInstance = $.targetInstance;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetInstancePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetInstancePlainArgs $;

        public Builder() {
            $ = new GetTargetInstancePlainArgs();
        }

        public Builder(GetTargetInstancePlainArgs defaults) {
            $ = new GetTargetInstancePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder targetInstance(String targetInstance) {
            $.targetInstance = targetInstance;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetTargetInstancePlainArgs build() {
            $.targetInstance = Objects.requireNonNull($.targetInstance, "expected parameter 'targetInstance' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
