// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v3.inputs.GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for auto rollout.
 * 
 */
public final class GoogleCloudDialogflowCxV3RolloutConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3RolloutConfigArgs Empty = new GoogleCloudDialogflowCxV3RolloutConfigArgs();

    /**
     * The conditions that are used to evaluate the failure of a rollout step. If not specified, no rollout steps will fail. E.g. &#34;containment_rate &lt; 10% OR average_turn_count &lt; 3&#34;. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    @Import(name="failureCondition")
    private @Nullable Output<String> failureCondition;

    /**
     * @return The conditions that are used to evaluate the failure of a rollout step. If not specified, no rollout steps will fail. E.g. &#34;containment_rate &lt; 10% OR average_turn_count &lt; 3&#34;. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    public Optional<Output<String>> failureCondition() {
        return Optional.ofNullable(this.failureCondition);
    }

    /**
     * The conditions that are used to evaluate the success of a rollout step. If not specified, all rollout steps will proceed to the next one unless failure conditions are met. E.g. &#34;containment_rate &gt; 60% AND callback_rate &lt; 20%&#34;. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    @Import(name="rolloutCondition")
    private @Nullable Output<String> rolloutCondition;

    /**
     * @return The conditions that are used to evaluate the success of a rollout step. If not specified, all rollout steps will proceed to the next one unless failure conditions are met. E.g. &#34;containment_rate &gt; 60% AND callback_rate &lt; 20%&#34;. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    public Optional<Output<String>> rolloutCondition() {
        return Optional.ofNullable(this.rolloutCondition);
    }

    /**
     * Steps to roll out a flow version. Steps should be sorted by percentage in ascending order.
     * 
     */
    @Import(name="rolloutSteps")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs>> rolloutSteps;

    /**
     * @return Steps to roll out a flow version. Steps should be sorted by percentage in ascending order.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs>>> rolloutSteps() {
        return Optional.ofNullable(this.rolloutSteps);
    }

    private GoogleCloudDialogflowCxV3RolloutConfigArgs() {}

    private GoogleCloudDialogflowCxV3RolloutConfigArgs(GoogleCloudDialogflowCxV3RolloutConfigArgs $) {
        this.failureCondition = $.failureCondition;
        this.rolloutCondition = $.rolloutCondition;
        this.rolloutSteps = $.rolloutSteps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3RolloutConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3RolloutConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3RolloutConfigArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3RolloutConfigArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3RolloutConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failureCondition The conditions that are used to evaluate the failure of a rollout step. If not specified, no rollout steps will fail. E.g. &#34;containment_rate &lt; 10% OR average_turn_count &lt; 3&#34;. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
         * 
         * @return builder
         * 
         */
        public Builder failureCondition(@Nullable Output<String> failureCondition) {
            $.failureCondition = failureCondition;
            return this;
        }

        /**
         * @param failureCondition The conditions that are used to evaluate the failure of a rollout step. If not specified, no rollout steps will fail. E.g. &#34;containment_rate &lt; 10% OR average_turn_count &lt; 3&#34;. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
         * 
         * @return builder
         * 
         */
        public Builder failureCondition(String failureCondition) {
            return failureCondition(Output.of(failureCondition));
        }

        /**
         * @param rolloutCondition The conditions that are used to evaluate the success of a rollout step. If not specified, all rollout steps will proceed to the next one unless failure conditions are met. E.g. &#34;containment_rate &gt; 60% AND callback_rate &lt; 20%&#34;. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
         * 
         * @return builder
         * 
         */
        public Builder rolloutCondition(@Nullable Output<String> rolloutCondition) {
            $.rolloutCondition = rolloutCondition;
            return this;
        }

        /**
         * @param rolloutCondition The conditions that are used to evaluate the success of a rollout step. If not specified, all rollout steps will proceed to the next one unless failure conditions are met. E.g. &#34;containment_rate &gt; 60% AND callback_rate &lt; 20%&#34;. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
         * 
         * @return builder
         * 
         */
        public Builder rolloutCondition(String rolloutCondition) {
            return rolloutCondition(Output.of(rolloutCondition));
        }

        /**
         * @param rolloutSteps Steps to roll out a flow version. Steps should be sorted by percentage in ascending order.
         * 
         * @return builder
         * 
         */
        public Builder rolloutSteps(@Nullable Output<List<GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs>> rolloutSteps) {
            $.rolloutSteps = rolloutSteps;
            return this;
        }

        /**
         * @param rolloutSteps Steps to roll out a flow version. Steps should be sorted by percentage in ascending order.
         * 
         * @return builder
         * 
         */
        public Builder rolloutSteps(List<GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs> rolloutSteps) {
            return rolloutSteps(Output.of(rolloutSteps));
        }

        /**
         * @param rolloutSteps Steps to roll out a flow version. Steps should be sorted by percentage in ascending order.
         * 
         * @return builder
         * 
         */
        public Builder rolloutSteps(GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs... rolloutSteps) {
            return rolloutSteps(List.of(rolloutSteps));
        }

        public GoogleCloudDialogflowCxV3RolloutConfigArgs build() {
            return $;
        }
    }

}
