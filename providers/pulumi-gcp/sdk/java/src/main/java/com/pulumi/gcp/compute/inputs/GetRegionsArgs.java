// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionsArgs Empty = new GetRegionsArgs();

    /**
     * Project from which to list available regions. Defaults to project declared in the provider.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Allows to filter list of regions based on their current status. Status can be either `UP` or `DOWN`.
     * Defaults to no filtering (all available regions - both `UP` and `DOWN`).
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetRegionsArgs() {}

    private GetRegionsArgs(GetRegionsArgs $) {
        this.project = $.project;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionsArgs $;

        public Builder() {
            $ = new GetRegionsArgs();
        }

        public Builder(GetRegionsArgs defaults) {
            $ = new GetRegionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetRegionsArgs build() {
            return $;
        }
    }

}
