// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventDestinationCloudwatchDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventDestinationCloudwatchDestinationArgs Empty = new EventDestinationCloudwatchDestinationArgs();

    /**
     * The default value for the event
     * 
     */
    @Import(name="defaultValue", required=true)
    private Output<String> defaultValue;

    public Output<String> defaultValue() {
        return this.defaultValue;
    }

    /**
     * The name for the dimension
     * 
     */
    @Import(name="dimensionName", required=true)
    private Output<String> dimensionName;

    public Output<String> dimensionName() {
        return this.dimensionName;
    }

    /**
     * The source for the value. May be any of `&#34;messageTag&#34;`, `&#34;emailHeader&#34;` or `&#34;linkTag&#34;`.
     * 
     */
    @Import(name="valueSource", required=true)
    private Output<String> valueSource;

    public Output<String> valueSource() {
        return this.valueSource;
    }

    private EventDestinationCloudwatchDestinationArgs() {}

    private EventDestinationCloudwatchDestinationArgs(EventDestinationCloudwatchDestinationArgs $) {
        this.defaultValue = $.defaultValue;
        this.dimensionName = $.dimensionName;
        this.valueSource = $.valueSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventDestinationCloudwatchDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventDestinationCloudwatchDestinationArgs $;

        public Builder() {
            $ = new EventDestinationCloudwatchDestinationArgs();
        }

        public Builder(EventDestinationCloudwatchDestinationArgs defaults) {
            $ = new EventDestinationCloudwatchDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultValue(Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        public Builder dimensionName(Output<String> dimensionName) {
            $.dimensionName = dimensionName;
            return this;
        }

        public Builder dimensionName(String dimensionName) {
            return dimensionName(Output.of(dimensionName));
        }

        public Builder valueSource(Output<String> valueSource) {
            $.valueSource = valueSource;
            return this;
        }

        public Builder valueSource(String valueSource) {
            return valueSource(Output.of(valueSource));
        }

        public EventDestinationCloudwatchDestinationArgs build() {
            $.defaultValue = Objects.requireNonNull($.defaultValue, "expected parameter 'defaultValue' to be non-null");
            $.dimensionName = Objects.requireNonNull($.dimensionName, "expected parameter 'dimensionName' to be non-null");
            $.valueSource = Objects.requireNonNull($.valueSource, "expected parameter 'valueSource' to be non-null");
            return $;
        }
    }

}
