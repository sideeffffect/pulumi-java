// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class EventDestinationCloudwatchDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventDestinationCloudwatchDestinationGetArgs Empty = new EventDestinationCloudwatchDestinationGetArgs();

    /**
     * The default value for the event
     * 
     */
    @Import(name="defaultValue", required=true)
      private final Output<String> defaultValue;

    public Output<String> defaultValue() {
        return this.defaultValue;
    }

    /**
     * The name for the dimension
     * 
     */
    @Import(name="dimensionName", required=true)
      private final Output<String> dimensionName;

    public Output<String> dimensionName() {
        return this.dimensionName;
    }

    /**
     * The source for the value. May be any of `"messageTag"`, `"emailHeader"` or `"linkTag"`.
     * 
     */
    @Import(name="valueSource", required=true)
      private final Output<String> valueSource;

    public Output<String> valueSource() {
        return this.valueSource;
    }

    public EventDestinationCloudwatchDestinationGetArgs(
        Output<String> defaultValue,
        Output<String> dimensionName,
        Output<String> valueSource) {
        this.defaultValue = Objects.requireNonNull(defaultValue, "expected parameter 'defaultValue' to be non-null");
        this.dimensionName = Objects.requireNonNull(dimensionName, "expected parameter 'dimensionName' to be non-null");
        this.valueSource = Objects.requireNonNull(valueSource, "expected parameter 'valueSource' to be non-null");
    }

    private EventDestinationCloudwatchDestinationGetArgs() {
        this.defaultValue = Codegen.empty();
        this.dimensionName = Codegen.empty();
        this.valueSource = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDestinationCloudwatchDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> defaultValue;
        private Output<String> dimensionName;
        private Output<String> valueSource;

        public Builder() {
    	      // Empty
        }

        public Builder(EventDestinationCloudwatchDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.dimensionName = defaults.dimensionName;
    	      this.valueSource = defaults.valueSource;
        }

        public Builder defaultValue(Output<String> defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = Output.of(Objects.requireNonNull(defaultValue));
            return this;
        }
        public Builder dimensionName(Output<String> dimensionName) {
            this.dimensionName = Objects.requireNonNull(dimensionName);
            return this;
        }
        public Builder dimensionName(String dimensionName) {
            this.dimensionName = Output.of(Objects.requireNonNull(dimensionName));
            return this;
        }
        public Builder valueSource(Output<String> valueSource) {
            this.valueSource = Objects.requireNonNull(valueSource);
            return this;
        }
        public Builder valueSource(String valueSource) {
            this.valueSource = Output.of(Objects.requireNonNull(valueSource));
            return this;
        }        public EventDestinationCloudwatchDestinationGetArgs build() {
            return new EventDestinationCloudwatchDestinationGetArgs(defaultValue, dimensionName, valueSource);
        }
    }
}
