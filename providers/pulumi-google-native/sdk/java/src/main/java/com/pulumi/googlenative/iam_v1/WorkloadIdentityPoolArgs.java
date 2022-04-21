// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadIdentityPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadIdentityPoolArgs Empty = new WorkloadIdentityPoolArgs();

    /**
     * A description of the pool. Cannot exceed 256 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the pool is disabled. You cannot use a disabled pool to exchange tokens, or use existing tokens to access resources. If the pool is re-enabled, existing tokens grant access again.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * A display name for the pool. Cannot exceed 32 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
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

    @Import(name="workloadIdentityPoolId", required=true)
    private Output<String> workloadIdentityPoolId;

    public Output<String> workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    private WorkloadIdentityPoolArgs() {}

    private WorkloadIdentityPoolArgs(WorkloadIdentityPoolArgs $) {
        this.description = $.description;
        this.disabled = $.disabled;
        this.displayName = $.displayName;
        this.location = $.location;
        this.project = $.project;
        this.workloadIdentityPoolId = $.workloadIdentityPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadIdentityPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadIdentityPoolArgs $;

        public Builder() {
            $ = new WorkloadIdentityPoolArgs();
        }

        public Builder(WorkloadIdentityPoolArgs defaults) {
            $ = new WorkloadIdentityPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
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

        public Builder workloadIdentityPoolId(Output<String> workloadIdentityPoolId) {
            $.workloadIdentityPoolId = workloadIdentityPoolId;
            return this;
        }

        public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
            return workloadIdentityPoolId(Output.of(workloadIdentityPoolId));
        }

        public WorkloadIdentityPoolArgs build() {
            $.workloadIdentityPoolId = Objects.requireNonNull($.workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
            return $;
        }
    }

}
