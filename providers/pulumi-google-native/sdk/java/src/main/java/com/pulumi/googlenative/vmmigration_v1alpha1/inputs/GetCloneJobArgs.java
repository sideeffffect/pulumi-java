// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloneJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloneJobArgs Empty = new GetCloneJobArgs();

    @Import(name="cloneJobId", required=true)
    private String cloneJobId;

    public String cloneJobId() {
        return this.cloneJobId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="migratingVmId", required=true)
    private String migratingVmId;

    public String migratingVmId() {
        return this.migratingVmId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sourceId", required=true)
    private String sourceId;

    public String sourceId() {
        return this.sourceId;
    }

    private GetCloneJobArgs() {}

    private GetCloneJobArgs(GetCloneJobArgs $) {
        this.cloneJobId = $.cloneJobId;
        this.location = $.location;
        this.migratingVmId = $.migratingVmId;
        this.project = $.project;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloneJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloneJobArgs $;

        public Builder() {
            $ = new GetCloneJobArgs();
        }

        public Builder(GetCloneJobArgs defaults) {
            $ = new GetCloneJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloneJobId(String cloneJobId) {
            $.cloneJobId = cloneJobId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder migratingVmId(String migratingVmId) {
            $.migratingVmId = migratingVmId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder sourceId(String sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public GetCloneJobArgs build() {
            $.cloneJobId = Objects.requireNonNull($.cloneJobId, "expected parameter 'cloneJobId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.migratingVmId = Objects.requireNonNull($.migratingVmId, "expected parameter 'migratingVmId' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}
