// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainBackupIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainBackupIamPolicyPlainArgs Empty = new GetDomainBackupIamPolicyPlainArgs();

    @Import(name="backupId", required=true)
    private String backupId;

    public String backupId() {
        return this.backupId;
    }

    @Import(name="domainId", required=true)
    private String domainId;

    public String domainId() {
        return this.domainId;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDomainBackupIamPolicyPlainArgs() {}

    private GetDomainBackupIamPolicyPlainArgs(GetDomainBackupIamPolicyPlainArgs $) {
        this.backupId = $.backupId;
        this.domainId = $.domainId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainBackupIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainBackupIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetDomainBackupIamPolicyPlainArgs();
        }

        public Builder(GetDomainBackupIamPolicyPlainArgs defaults) {
            $ = new GetDomainBackupIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupId(String backupId) {
            $.backupId = backupId;
            return this;
        }

        public Builder domainId(String domainId) {
            $.domainId = domainId;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDomainBackupIamPolicyPlainArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.domainId = Objects.requireNonNull($.domainId, "expected parameter 'domainId' to be non-null");
            return $;
        }
    }

}
