// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sourcerepo_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepoIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepoIamPolicyArgs Empty = new GetRepoIamPolicyArgs();

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

    @Import(name="repoId", required=true)
    private String repoId;

    public String repoId() {
        return this.repoId;
    }

    private GetRepoIamPolicyArgs() {}

    private GetRepoIamPolicyArgs(GetRepoIamPolicyArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.repoId = $.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepoIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepoIamPolicyArgs $;

        public Builder() {
            $ = new GetRepoIamPolicyArgs();
        }

        public Builder(GetRepoIamPolicyArgs defaults) {
            $ = new GetRepoIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder repoId(String repoId) {
            $.repoId = repoId;
            return this;
        }

        public GetRepoIamPolicyArgs build() {
            $.repoId = Objects.requireNonNull($.repoId, "expected parameter 'repoId' to be non-null");
            return $;
        }
    }

}
