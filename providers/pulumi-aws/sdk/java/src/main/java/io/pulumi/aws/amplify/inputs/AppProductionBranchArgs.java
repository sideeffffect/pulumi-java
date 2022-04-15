// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppProductionBranchArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppProductionBranchArgs Empty = new AppProductionBranchArgs();

    /**
     * The branch name for the production branch.
     * 
     */
    @Import(name="branchName")
      private final @Nullable Output<String> branchName;

    public Output<String> branchName() {
        return this.branchName == null ? Codegen.empty() : this.branchName;
    }

    /**
     * The last deploy time of the production branch.
     * 
     */
    @Import(name="lastDeployTime")
      private final @Nullable Output<String> lastDeployTime;

    public Output<String> lastDeployTime() {
        return this.lastDeployTime == null ? Codegen.empty() : this.lastDeployTime;
    }

    /**
     * The status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * The thumbnail URL for the production branch.
     * 
     */
    @Import(name="thumbnailUrl")
      private final @Nullable Output<String> thumbnailUrl;

    public Output<String> thumbnailUrl() {
        return this.thumbnailUrl == null ? Codegen.empty() : this.thumbnailUrl;
    }

    public AppProductionBranchArgs(
        @Nullable Output<String> branchName,
        @Nullable Output<String> lastDeployTime,
        @Nullable Output<String> status,
        @Nullable Output<String> thumbnailUrl) {
        this.branchName = branchName;
        this.lastDeployTime = lastDeployTime;
        this.status = status;
        this.thumbnailUrl = thumbnailUrl;
    }

    private AppProductionBranchArgs() {
        this.branchName = Codegen.empty();
        this.lastDeployTime = Codegen.empty();
        this.status = Codegen.empty();
        this.thumbnailUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppProductionBranchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> branchName;
        private @Nullable Output<String> lastDeployTime;
        private @Nullable Output<String> status;
        private @Nullable Output<String> thumbnailUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AppProductionBranchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.lastDeployTime = defaults.lastDeployTime;
    	      this.status = defaults.status;
    	      this.thumbnailUrl = defaults.thumbnailUrl;
        }

        public Builder branchName(@Nullable Output<String> branchName) {
            this.branchName = branchName;
            return this;
        }
        public Builder branchName(@Nullable String branchName) {
            this.branchName = Codegen.ofNullable(branchName);
            return this;
        }
        public Builder lastDeployTime(@Nullable Output<String> lastDeployTime) {
            this.lastDeployTime = lastDeployTime;
            return this;
        }
        public Builder lastDeployTime(@Nullable String lastDeployTime) {
            this.lastDeployTime = Codegen.ofNullable(lastDeployTime);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder thumbnailUrl(@Nullable Output<String> thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public Builder thumbnailUrl(@Nullable String thumbnailUrl) {
            this.thumbnailUrl = Codegen.ofNullable(thumbnailUrl);
            return this;
        }        public AppProductionBranchArgs build() {
            return new AppProductionBranchArgs(branchName, lastDeployTime, status, thumbnailUrl);
        }
    }
}
