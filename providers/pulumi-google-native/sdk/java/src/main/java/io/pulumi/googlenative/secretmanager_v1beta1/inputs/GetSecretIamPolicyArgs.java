// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretIamPolicyArgs Empty = new GetSecretIamPolicyArgs();

    @InputImport(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="secretId", required=true)
      private final String secretId;

    public String getSecretId() {
        return this.secretId;
    }

    public GetSecretIamPolicyArgs(
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String secretId) {
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
    }

    private GetSecretIamPolicyArgs() {
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.secretId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String secretId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.secretId = defaults.secretId;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder secretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }
        public GetSecretIamPolicyArgs build() {
            return new GetSecretIamPolicyArgs(optionsRequestedPolicyVersion, project, secretId);
        }
    }
}
