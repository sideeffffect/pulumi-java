// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm.inputs;

import com.pulumi.awsnative.ssm.inputs.ResourceDataSyncAwsOrganizationsSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceDataSyncSyncSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceDataSyncSyncSourceArgs Empty = new ResourceDataSyncSyncSourceArgs();

    @Import(name="awsOrganizationsSource")
    private @Nullable Output<ResourceDataSyncAwsOrganizationsSourceArgs> awsOrganizationsSource;

    public Optional<Output<ResourceDataSyncAwsOrganizationsSourceArgs>> awsOrganizationsSource() {
        return Optional.ofNullable(this.awsOrganizationsSource);
    }

    @Import(name="includeFutureRegions")
    private @Nullable Output<Boolean> includeFutureRegions;

    public Optional<Output<Boolean>> includeFutureRegions() {
        return Optional.ofNullable(this.includeFutureRegions);
    }

    @Import(name="sourceRegions", required=true)
    private Output<List<String>> sourceRegions;

    public Output<List<String>> sourceRegions() {
        return this.sourceRegions;
    }

    @Import(name="sourceType", required=true)
    private Output<String> sourceType;

    public Output<String> sourceType() {
        return this.sourceType;
    }

    private ResourceDataSyncSyncSourceArgs() {}

    private ResourceDataSyncSyncSourceArgs(ResourceDataSyncSyncSourceArgs $) {
        this.awsOrganizationsSource = $.awsOrganizationsSource;
        this.includeFutureRegions = $.includeFutureRegions;
        this.sourceRegions = $.sourceRegions;
        this.sourceType = $.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceDataSyncSyncSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceDataSyncSyncSourceArgs $;

        public Builder() {
            $ = new ResourceDataSyncSyncSourceArgs();
        }

        public Builder(ResourceDataSyncSyncSourceArgs defaults) {
            $ = new ResourceDataSyncSyncSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsOrganizationsSource(@Nullable Output<ResourceDataSyncAwsOrganizationsSourceArgs> awsOrganizationsSource) {
            $.awsOrganizationsSource = awsOrganizationsSource;
            return this;
        }

        public Builder awsOrganizationsSource(ResourceDataSyncAwsOrganizationsSourceArgs awsOrganizationsSource) {
            return awsOrganizationsSource(Output.of(awsOrganizationsSource));
        }

        public Builder includeFutureRegions(@Nullable Output<Boolean> includeFutureRegions) {
            $.includeFutureRegions = includeFutureRegions;
            return this;
        }

        public Builder includeFutureRegions(Boolean includeFutureRegions) {
            return includeFutureRegions(Output.of(includeFutureRegions));
        }

        public Builder sourceRegions(Output<List<String>> sourceRegions) {
            $.sourceRegions = sourceRegions;
            return this;
        }

        public Builder sourceRegions(List<String> sourceRegions) {
            return sourceRegions(Output.of(sourceRegions));
        }

        public Builder sourceRegions(String... sourceRegions) {
            return sourceRegions(List.of(sourceRegions));
        }

        public Builder sourceType(Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        public ResourceDataSyncSyncSourceArgs build() {
            $.sourceRegions = Objects.requireNonNull($.sourceRegions, "expected parameter 'sourceRegions' to be non-null");
            $.sourceType = Objects.requireNonNull($.sourceType, "expected parameter 'sourceType' to be non-null");
            return $;
        }
    }

}
