// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The median automated stopping rule stops a pending trial if the trial&#39;s best objective_value is strictly below the median &#39;performance&#39; of all completed trials reported up to the trial&#39;s last measurement. Currently, &#39;performance&#39; refers to the running average of the objective values reported by the trial in each measurement.
 * 
 */
public final class GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs Empty = new GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs();

    /**
     * If true, the median automated stopping rule applies to measurement.use_elapsed_time, which means the elapsed_time field of the current trial&#39;s latest measurement is used to compute the median objective value for each completed trial.
     * 
     */
    @Import(name="useElapsedTime")
    private @Nullable Output<Boolean> useElapsedTime;

    /**
     * @return If true, the median automated stopping rule applies to measurement.use_elapsed_time, which means the elapsed_time field of the current trial&#39;s latest measurement is used to compute the median objective value for each completed trial.
     * 
     */
    public Optional<Output<Boolean>> useElapsedTime() {
        return Optional.ofNullable(this.useElapsedTime);
    }

    private GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs() {}

    private GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs(GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs $) {
        this.useElapsedTime = $.useElapsedTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs();
        }

        public Builder(GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs defaults) {
            $ = new GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param useElapsedTime If true, the median automated stopping rule applies to measurement.use_elapsed_time, which means the elapsed_time field of the current trial&#39;s latest measurement is used to compute the median objective value for each completed trial.
         * 
         * @return builder
         * 
         */
        public Builder useElapsedTime(@Nullable Output<Boolean> useElapsedTime) {
            $.useElapsedTime = useElapsedTime;
            return this;
        }

        /**
         * @param useElapsedTime If true, the median automated stopping rule applies to measurement.use_elapsed_time, which means the elapsed_time field of the current trial&#39;s latest measurement is used to compute the median objective value for each completed trial.
         * 
         * @return builder
         * 
         */
        public Builder useElapsedTime(Boolean useElapsedTime) {
            return useElapsedTime(Output.of(useElapsedTime));
        }

        public GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigArgs build() {
            return $;
        }
    }

}
