// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.spanner_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceBackupIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceBackupIamPolicyArgs Empty = new GetInstanceBackupIamPolicyArgs();

    @Import(name="backupId", required=true)
    private String backupId;

    public String backupId() {
        return this.backupId;
    }

    @Import(name="instanceId", required=true)
    private String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInstanceBackupIamPolicyArgs() {}

    private GetInstanceBackupIamPolicyArgs(GetInstanceBackupIamPolicyArgs $) {
        this.backupId = $.backupId;
        this.instanceId = $.instanceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceBackupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceBackupIamPolicyArgs $;

        public Builder() {
            $ = new GetInstanceBackupIamPolicyArgs();
        }

        public Builder(GetInstanceBackupIamPolicyArgs defaults) {
            $ = new GetInstanceBackupIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupId(String backupId) {
            $.backupId = backupId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetInstanceBackupIamPolicyArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
