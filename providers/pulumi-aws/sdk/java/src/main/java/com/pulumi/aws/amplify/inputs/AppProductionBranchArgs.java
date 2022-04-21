// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppProductionBranchArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppProductionBranchArgs Empty = new AppProductionBranchArgs();

    /**
     * The branch name for the production branch.
     * 
     */
    @Import(name="branchName")
    private @Nullable Output<String> branchName;

    public Optional<Output<String>> branchName() {
        return Optional.ofNullable(this.branchName);
    }

    /**
     * The last deploy time of the production branch.
     * 
     */
    @Import(name="lastDeployTime")
    private @Nullable Output<String> lastDeployTime;

    public Optional<Output<String>> lastDeployTime() {
        return Optional.ofNullable(this.lastDeployTime);
    }

    /**
     * The status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The thumbnail URL for the production branch.
     * 
     */
    @Import(name="thumbnailUrl")
    private @Nullable Output<String> thumbnailUrl;

    public Optional<Output<String>> thumbnailUrl() {
        return Optional.ofNullable(this.thumbnailUrl);
    }

    private AppProductionBranchArgs() {}

    private AppProductionBranchArgs(AppProductionBranchArgs $) {
        this.branchName = $.branchName;
        this.lastDeployTime = $.lastDeployTime;
        this.status = $.status;
        this.thumbnailUrl = $.thumbnailUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppProductionBranchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppProductionBranchArgs $;

        public Builder() {
            $ = new AppProductionBranchArgs();
        }

        public Builder(AppProductionBranchArgs defaults) {
            $ = new AppProductionBranchArgs(Objects.requireNonNull(defaults));
        }

        public Builder branchName(@Nullable Output<String> branchName) {
            $.branchName = branchName;
            return this;
        }

        public Builder branchName(String branchName) {
            return branchName(Output.of(branchName));
        }

        public Builder lastDeployTime(@Nullable Output<String> lastDeployTime) {
            $.lastDeployTime = lastDeployTime;
            return this;
        }

        public Builder lastDeployTime(String lastDeployTime) {
            return lastDeployTime(Output.of(lastDeployTime));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder thumbnailUrl(@Nullable Output<String> thumbnailUrl) {
            $.thumbnailUrl = thumbnailUrl;
            return this;
        }

        public Builder thumbnailUrl(String thumbnailUrl) {
            return thumbnailUrl(Output.of(thumbnailUrl));
        }

        public AppProductionBranchArgs build() {
            return $;
        }
    }

}
