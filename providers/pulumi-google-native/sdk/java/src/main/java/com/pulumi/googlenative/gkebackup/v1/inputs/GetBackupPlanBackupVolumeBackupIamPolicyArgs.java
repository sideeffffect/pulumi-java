// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackupPlanBackupVolumeBackupIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupPlanBackupVolumeBackupIamPolicyArgs Empty = new GetBackupPlanBackupVolumeBackupIamPolicyArgs();

    @Import(name="backupId", required=true)
    private Output<String> backupId;

    public Output<String> backupId() {
        return this.backupId;
    }

    @Import(name="backupPlanId", required=true)
    private Output<String> backupPlanId;

    public Output<String> backupPlanId() {
        return this.backupPlanId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="volumeBackupId", required=true)
    private Output<String> volumeBackupId;

    public Output<String> volumeBackupId() {
        return this.volumeBackupId;
    }

    private GetBackupPlanBackupVolumeBackupIamPolicyArgs() {}

    private GetBackupPlanBackupVolumeBackupIamPolicyArgs(GetBackupPlanBackupVolumeBackupIamPolicyArgs $) {
        this.backupId = $.backupId;
        this.backupPlanId = $.backupPlanId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.volumeBackupId = $.volumeBackupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupPlanBackupVolumeBackupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupPlanBackupVolumeBackupIamPolicyArgs $;

        public Builder() {
            $ = new GetBackupPlanBackupVolumeBackupIamPolicyArgs();
        }

        public Builder(GetBackupPlanBackupVolumeBackupIamPolicyArgs defaults) {
            $ = new GetBackupPlanBackupVolumeBackupIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupId(Output<String> backupId) {
            $.backupId = backupId;
            return this;
        }

        public Builder backupId(String backupId) {
            return backupId(Output.of(backupId));
        }

        public Builder backupPlanId(Output<String> backupPlanId) {
            $.backupPlanId = backupPlanId;
            return this;
        }

        public Builder backupPlanId(String backupPlanId) {
            return backupPlanId(Output.of(backupPlanId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder volumeBackupId(Output<String> volumeBackupId) {
            $.volumeBackupId = volumeBackupId;
            return this;
        }

        public Builder volumeBackupId(String volumeBackupId) {
            return volumeBackupId(Output.of(volumeBackupId));
        }

        public GetBackupPlanBackupVolumeBackupIamPolicyArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.backupPlanId = Objects.requireNonNull($.backupPlanId, "expected parameter 'backupPlanId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.volumeBackupId = Objects.requireNonNull($.volumeBackupId, "expected parameter 'volumeBackupId' to be non-null");
            return $;
        }
    }

}
