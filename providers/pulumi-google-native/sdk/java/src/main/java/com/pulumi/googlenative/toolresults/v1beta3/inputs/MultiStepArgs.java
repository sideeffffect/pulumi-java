// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.PrimaryStepArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details when multiple steps are run with the same configuration as a group.
 * 
 */
public final class MultiStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultiStepArgs Empty = new MultiStepArgs();

    /**
     * Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
     */
    @Import(name="multistepNumber")
    private @Nullable Output<Integer> multistepNumber;

    /**
     * @return Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
     */
    public Optional<Output<Integer>> multistepNumber() {
        return Optional.ofNullable(this.multistepNumber);
    }

    /**
     * Present if it is a primary (original) step.
     * 
     */
    @Import(name="primaryStep")
    private @Nullable Output<PrimaryStepArgs> primaryStep;

    /**
     * @return Present if it is a primary (original) step.
     * 
     */
    public Optional<Output<PrimaryStepArgs>> primaryStep() {
        return Optional.ofNullable(this.primaryStep);
    }

    /**
     * Step Id of the primary (original) step, which might be this step.
     * 
     */
    @Import(name="primaryStepId")
    private @Nullable Output<String> primaryStepId;

    /**
     * @return Step Id of the primary (original) step, which might be this step.
     * 
     */
    public Optional<Output<String>> primaryStepId() {
        return Optional.ofNullable(this.primaryStepId);
    }

    private MultiStepArgs() {}

    private MultiStepArgs(MultiStepArgs $) {
        this.multistepNumber = $.multistepNumber;
        this.primaryStep = $.primaryStep;
        this.primaryStepId = $.primaryStepId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiStepArgs $;

        public Builder() {
            $ = new MultiStepArgs();
        }

        public Builder(MultiStepArgs defaults) {
            $ = new MultiStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param multistepNumber Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
         * 
         * @return builder
         * 
         */
        public Builder multistepNumber(@Nullable Output<Integer> multistepNumber) {
            $.multistepNumber = multistepNumber;
            return this;
        }

        /**
         * @param multistepNumber Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
         * 
         * @return builder
         * 
         */
        public Builder multistepNumber(Integer multistepNumber) {
            return multistepNumber(Output.of(multistepNumber));
        }

        /**
         * @param primaryStep Present if it is a primary (original) step.
         * 
         * @return builder
         * 
         */
        public Builder primaryStep(@Nullable Output<PrimaryStepArgs> primaryStep) {
            $.primaryStep = primaryStep;
            return this;
        }

        /**
         * @param primaryStep Present if it is a primary (original) step.
         * 
         * @return builder
         * 
         */
        public Builder primaryStep(PrimaryStepArgs primaryStep) {
            return primaryStep(Output.of(primaryStep));
        }

        /**
         * @param primaryStepId Step Id of the primary (original) step, which might be this step.
         * 
         * @return builder
         * 
         */
        public Builder primaryStepId(@Nullable Output<String> primaryStepId) {
            $.primaryStepId = primaryStepId;
            return this;
        }

        /**
         * @param primaryStepId Step Id of the primary (original) step, which might be this step.
         * 
         * @return builder
         * 
         */
        public Builder primaryStepId(String primaryStepId) {
            return primaryStepId(Output.of(primaryStepId));
        }

        public MultiStepArgs build() {
            return $;
        }
    }

}
