// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscalingplans.inputs;

import com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceGetArgs;
import com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScalingPlanState extends com.pulumi.resources.ResourceArgs {

    public static final ScalingPlanState Empty = new ScalingPlanState();

    /**
     * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
     * 
     */
    @Import(name="applicationSource")
    private @Nullable Output<ScalingPlanApplicationSourceGetArgs> applicationSource;

    public Optional<Output<ScalingPlanApplicationSourceGetArgs>> applicationSource() {
        return Optional.ofNullable(this.applicationSource);
    }

    /**
     * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
     * 
     */
    @Import(name="scalingInstructions")
    private @Nullable Output<List<ScalingPlanScalingInstructionGetArgs>> scalingInstructions;

    public Optional<Output<List<ScalingPlanScalingInstructionGetArgs>>> scalingInstructions() {
        return Optional.ofNullable(this.scalingInstructions);
    }

    /**
     * The version number of the scaling plan. This value is always 1.
     * 
     */
    @Import(name="scalingPlanVersion")
    private @Nullable Output<Integer> scalingPlanVersion;

    public Optional<Output<Integer>> scalingPlanVersion() {
        return Optional.ofNullable(this.scalingPlanVersion);
    }

    private ScalingPlanState() {}

    private ScalingPlanState(ScalingPlanState $) {
        this.applicationSource = $.applicationSource;
        this.name = $.name;
        this.scalingInstructions = $.scalingInstructions;
        this.scalingPlanVersion = $.scalingPlanVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingPlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingPlanState $;

        public Builder() {
            $ = new ScalingPlanState();
        }

        public Builder(ScalingPlanState defaults) {
            $ = new ScalingPlanState(Objects.requireNonNull(defaults));
        }

        public Builder applicationSource(@Nullable Output<ScalingPlanApplicationSourceGetArgs> applicationSource) {
            $.applicationSource = applicationSource;
            return this;
        }

        public Builder applicationSource(ScalingPlanApplicationSourceGetArgs applicationSource) {
            return applicationSource(Output.of(applicationSource));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder scalingInstructions(@Nullable Output<List<ScalingPlanScalingInstructionGetArgs>> scalingInstructions) {
            $.scalingInstructions = scalingInstructions;
            return this;
        }

        public Builder scalingInstructions(List<ScalingPlanScalingInstructionGetArgs> scalingInstructions) {
            return scalingInstructions(Output.of(scalingInstructions));
        }

        public Builder scalingInstructions(ScalingPlanScalingInstructionGetArgs... scalingInstructions) {
            return scalingInstructions(List.of(scalingInstructions));
        }

        public Builder scalingPlanVersion(@Nullable Output<Integer> scalingPlanVersion) {
            $.scalingPlanVersion = scalingPlanVersion;
            return this;
        }

        public Builder scalingPlanVersion(Integer scalingPlanVersion) {
            return scalingPlanVersion(Output.of(scalingPlanVersion));
        }

        public ScalingPlanState build() {
            return $;
        }
    }

}
