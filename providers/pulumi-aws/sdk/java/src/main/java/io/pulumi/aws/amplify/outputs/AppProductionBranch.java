// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppProductionBranch {
    /**
     * The branch name for the production branch.
     * 
     */
    private final @Nullable String branchName;
    /**
     * The last deploy time of the production branch.
     * 
     */
    private final @Nullable String lastDeployTime;
    /**
     * The status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
     * 
     */
    private final @Nullable String status;
    /**
     * The thumbnail URL for the production branch.
     * 
     */
    private final @Nullable String thumbnailUrl;

    @CustomType.Constructor
    private AppProductionBranch(
        @CustomType.Parameter("branchName") @Nullable String branchName,
        @CustomType.Parameter("lastDeployTime") @Nullable String lastDeployTime,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("thumbnailUrl") @Nullable String thumbnailUrl) {
        this.branchName = branchName;
        this.lastDeployTime = lastDeployTime;
        this.status = status;
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * The branch name for the production branch.
     * 
    */
    public Optional<String> branchName() {
        return Optional.ofNullable(this.branchName);
    }
    /**
     * The last deploy time of the production branch.
     * 
    */
    public Optional<String> lastDeployTime() {
        return Optional.ofNullable(this.lastDeployTime);
    }
    /**
     * The status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The thumbnail URL for the production branch.
     * 
    */
    public Optional<String> thumbnailUrl() {
        return Optional.ofNullable(this.thumbnailUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppProductionBranch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branchName;
        private @Nullable String lastDeployTime;
        private @Nullable String status;
        private @Nullable String thumbnailUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AppProductionBranch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.lastDeployTime = defaults.lastDeployTime;
    	      this.status = defaults.status;
    	      this.thumbnailUrl = defaults.thumbnailUrl;
        }

        public Builder branchName(@Nullable String branchName) {
            this.branchName = branchName;
            return this;
        }
        public Builder lastDeployTime(@Nullable String lastDeployTime) {
            this.lastDeployTime = lastDeployTime;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder thumbnailUrl(@Nullable String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }        public AppProductionBranch build() {
            return new AppProductionBranch(branchName, lastDeployTime, status, thumbnailUrl);
        }
    }
}
