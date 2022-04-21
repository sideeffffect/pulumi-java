// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration options for writing logs to [Stackdriver Logging](https://cloud.google.com/logging/docs/).
 * 
 */
public final class StackdriverLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackdriverLoggingConfigArgs Empty = new StackdriverLoggingConfigArgs();

    /**
     * Specifies the fraction of operations to write to [Stackdriver Logging](https://cloud.google.com/logging/docs/). This field may contain any value between 0.0 and 1.0, inclusive. 0.0 is the default and means that no operations are logged.
     * 
     */
    @Import(name="samplingRatio")
    private @Nullable Output<Double> samplingRatio;

    public Optional<Output<Double>> samplingRatio() {
        return Optional.ofNullable(this.samplingRatio);
    }

    private StackdriverLoggingConfigArgs() {}

    private StackdriverLoggingConfigArgs(StackdriverLoggingConfigArgs $) {
        this.samplingRatio = $.samplingRatio;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackdriverLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackdriverLoggingConfigArgs $;

        public Builder() {
            $ = new StackdriverLoggingConfigArgs();
        }

        public Builder(StackdriverLoggingConfigArgs defaults) {
            $ = new StackdriverLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder samplingRatio(@Nullable Output<Double> samplingRatio) {
            $.samplingRatio = samplingRatio;
            return this;
        }

        public Builder samplingRatio(Double samplingRatio) {
            return samplingRatio(Output.of(samplingRatio));
        }

        public StackdriverLoggingConfigArgs build() {
            return $;
        }
    }

}
