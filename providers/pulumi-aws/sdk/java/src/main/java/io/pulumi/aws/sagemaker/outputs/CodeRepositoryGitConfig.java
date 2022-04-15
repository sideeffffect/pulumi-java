// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CodeRepositoryGitConfig {
    /**
     * The default branch for the Git repository.
     * 
     */
    private final @Nullable String branch;
    /**
     * The URL where the Git repository is located.
     * 
     */
    private final String repositoryUrl;
    /**
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format: `{"username": UserName, "password": Password}`
     * 
     */
    private final @Nullable String secretArn;

    @CustomType.Constructor
    private CodeRepositoryGitConfig(
        @CustomType.Parameter("branch") @Nullable String branch,
        @CustomType.Parameter("repositoryUrl") String repositoryUrl,
        @CustomType.Parameter("secretArn") @Nullable String secretArn) {
        this.branch = branch;
        this.repositoryUrl = repositoryUrl;
        this.secretArn = secretArn;
    }

    /**
     * The default branch for the Git repository.
     * 
    */
    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * The URL where the Git repository is located.
     * 
    */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }
    /**
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format: `{"username": UserName, "password": Password}`
     * 
    */
    public Optional<String> secretArn() {
        return Optional.ofNullable(this.secretArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeRepositoryGitConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branch;
        private String repositoryUrl;
        private @Nullable String secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeRepositoryGitConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder branch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }
        public Builder secretArn(@Nullable String secretArn) {
            this.secretArn = secretArn;
            return this;
        }        public CodeRepositoryGitConfig build() {
            return new CodeRepositoryGitConfig(branch, repositoryUrl, secretArn);
        }
    }
}
