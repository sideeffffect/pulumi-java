// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.synthetics;

import com.pulumi.awsnative.synthetics.inputs.CanaryArtifactConfigArgs;
import com.pulumi.awsnative.synthetics.inputs.CanaryCodeArgs;
import com.pulumi.awsnative.synthetics.inputs.CanaryRunConfigArgs;
import com.pulumi.awsnative.synthetics.inputs.CanaryScheduleArgs;
import com.pulumi.awsnative.synthetics.inputs.CanaryTagArgs;
import com.pulumi.awsnative.synthetics.inputs.CanaryVPCConfigArgs;
import com.pulumi.awsnative.synthetics.inputs.CanaryVisualReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanaryArgs extends com.pulumi.resources.ResourceArgs {

    public static final CanaryArgs Empty = new CanaryArgs();

    /**
     * Provide artifact configuration
     * 
     */
    @Import(name="artifactConfig")
    private @Nullable Output<CanaryArtifactConfigArgs> artifactConfig;

    public Optional<Output<CanaryArtifactConfigArgs>> artifactConfig() {
        return Optional.ofNullable(this.artifactConfig);
    }

    /**
     * Provide the s3 bucket output location for test results
     * 
     */
    @Import(name="artifactS3Location", required=true)
    private Output<String> artifactS3Location;

    public Output<String> artifactS3Location() {
        return this.artifactS3Location;
    }

    /**
     * Provide the canary script source
     * 
     */
    @Import(name="code", required=true)
    private Output<CanaryCodeArgs> code;

    public Output<CanaryCodeArgs> code() {
        return this.code;
    }

    /**
     * Lambda Execution role used to run your canaries
     * 
     */
    @Import(name="executionRoleArn", required=true)
    private Output<String> executionRoleArn;

    public Output<String> executionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * Retention period of failed canary runs represented in number of days
     * 
     */
    @Import(name="failureRetentionPeriod")
    private @Nullable Output<Integer> failureRetentionPeriod;

    public Optional<Output<Integer>> failureRetentionPeriod() {
        return Optional.ofNullable(this.failureRetentionPeriod);
    }

    /**
     * Name of the canary.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Provide canary run configuration
     * 
     */
    @Import(name="runConfig")
    private @Nullable Output<CanaryRunConfigArgs> runConfig;

    public Optional<Output<CanaryRunConfigArgs>> runConfig() {
        return Optional.ofNullable(this.runConfig);
    }

    /**
     * Runtime version of Synthetics Library
     * 
     */
    @Import(name="runtimeVersion", required=true)
    private Output<String> runtimeVersion;

    public Output<String> runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Frequency to run your canaries
     * 
     */
    @Import(name="schedule", required=true)
    private Output<CanaryScheduleArgs> schedule;

    public Output<CanaryScheduleArgs> schedule() {
        return this.schedule;
    }

    /**
     * Runs canary if set to True. Default is False
     * 
     */
    @Import(name="startCanaryAfterCreation", required=true)
    private Output<Boolean> startCanaryAfterCreation;

    public Output<Boolean> startCanaryAfterCreation() {
        return this.startCanaryAfterCreation;
    }

    /**
     * Retention period of successful canary runs represented in number of days
     * 
     */
    @Import(name="successRetentionPeriod")
    private @Nullable Output<Integer> successRetentionPeriod;

    public Optional<Output<Integer>> successRetentionPeriod() {
        return Optional.ofNullable(this.successRetentionPeriod);
    }

    @Import(name="tags")
    private @Nullable Output<List<CanaryTagArgs>> tags;

    public Optional<Output<List<CanaryTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Provide VPC Configuration if enabled.
     * 
     */
    @Import(name="vPCConfig")
    private @Nullable Output<CanaryVPCConfigArgs> vPCConfig;

    public Optional<Output<CanaryVPCConfigArgs>> vPCConfig() {
        return Optional.ofNullable(this.vPCConfig);
    }

    /**
     * Visual reference configuration for visual testing
     * 
     */
    @Import(name="visualReference")
    private @Nullable Output<CanaryVisualReferenceArgs> visualReference;

    public Optional<Output<CanaryVisualReferenceArgs>> visualReference() {
        return Optional.ofNullable(this.visualReference);
    }

    private CanaryArgs() {}

    private CanaryArgs(CanaryArgs $) {
        this.artifactConfig = $.artifactConfig;
        this.artifactS3Location = $.artifactS3Location;
        this.code = $.code;
        this.executionRoleArn = $.executionRoleArn;
        this.failureRetentionPeriod = $.failureRetentionPeriod;
        this.name = $.name;
        this.runConfig = $.runConfig;
        this.runtimeVersion = $.runtimeVersion;
        this.schedule = $.schedule;
        this.startCanaryAfterCreation = $.startCanaryAfterCreation;
        this.successRetentionPeriod = $.successRetentionPeriod;
        this.tags = $.tags;
        this.vPCConfig = $.vPCConfig;
        this.visualReference = $.visualReference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CanaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CanaryArgs $;

        public Builder() {
            $ = new CanaryArgs();
        }

        public Builder(CanaryArgs defaults) {
            $ = new CanaryArgs(Objects.requireNonNull(defaults));
        }

        public Builder artifactConfig(@Nullable Output<CanaryArtifactConfigArgs> artifactConfig) {
            $.artifactConfig = artifactConfig;
            return this;
        }

        public Builder artifactConfig(CanaryArtifactConfigArgs artifactConfig) {
            return artifactConfig(Output.of(artifactConfig));
        }

        public Builder artifactS3Location(Output<String> artifactS3Location) {
            $.artifactS3Location = artifactS3Location;
            return this;
        }

        public Builder artifactS3Location(String artifactS3Location) {
            return artifactS3Location(Output.of(artifactS3Location));
        }

        public Builder code(Output<CanaryCodeArgs> code) {
            $.code = code;
            return this;
        }

        public Builder code(CanaryCodeArgs code) {
            return code(Output.of(code));
        }

        public Builder executionRoleArn(Output<String> executionRoleArn) {
            $.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder executionRoleArn(String executionRoleArn) {
            return executionRoleArn(Output.of(executionRoleArn));
        }

        public Builder failureRetentionPeriod(@Nullable Output<Integer> failureRetentionPeriod) {
            $.failureRetentionPeriod = failureRetentionPeriod;
            return this;
        }

        public Builder failureRetentionPeriod(Integer failureRetentionPeriod) {
            return failureRetentionPeriod(Output.of(failureRetentionPeriod));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder runConfig(@Nullable Output<CanaryRunConfigArgs> runConfig) {
            $.runConfig = runConfig;
            return this;
        }

        public Builder runConfig(CanaryRunConfigArgs runConfig) {
            return runConfig(Output.of(runConfig));
        }

        public Builder runtimeVersion(Output<String> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        public Builder schedule(Output<CanaryScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        public Builder schedule(CanaryScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        public Builder startCanaryAfterCreation(Output<Boolean> startCanaryAfterCreation) {
            $.startCanaryAfterCreation = startCanaryAfterCreation;
            return this;
        }

        public Builder startCanaryAfterCreation(Boolean startCanaryAfterCreation) {
            return startCanaryAfterCreation(Output.of(startCanaryAfterCreation));
        }

        public Builder successRetentionPeriod(@Nullable Output<Integer> successRetentionPeriod) {
            $.successRetentionPeriod = successRetentionPeriod;
            return this;
        }

        public Builder successRetentionPeriod(Integer successRetentionPeriod) {
            return successRetentionPeriod(Output.of(successRetentionPeriod));
        }

        public Builder tags(@Nullable Output<List<CanaryTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<CanaryTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(CanaryTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder vPCConfig(@Nullable Output<CanaryVPCConfigArgs> vPCConfig) {
            $.vPCConfig = vPCConfig;
            return this;
        }

        public Builder vPCConfig(CanaryVPCConfigArgs vPCConfig) {
            return vPCConfig(Output.of(vPCConfig));
        }

        public Builder visualReference(@Nullable Output<CanaryVisualReferenceArgs> visualReference) {
            $.visualReference = visualReference;
            return this;
        }

        public Builder visualReference(CanaryVisualReferenceArgs visualReference) {
            return visualReference(Output.of(visualReference));
        }

        public CanaryArgs build() {
            $.artifactS3Location = Objects.requireNonNull($.artifactS3Location, "expected parameter 'artifactS3Location' to be non-null");
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.executionRoleArn = Objects.requireNonNull($.executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
            $.runtimeVersion = Objects.requireNonNull($.runtimeVersion, "expected parameter 'runtimeVersion' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            $.startCanaryAfterCreation = Objects.requireNonNull($.startCanaryAfterCreation, "expected parameter 'startCanaryAfterCreation' to be non-null");
            return $;
        }
    }

}
