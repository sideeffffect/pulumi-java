// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricMetricDescriptorLabelArgs extends ResourceArgs {

    public static final MetricMetricDescriptorLabelArgs Empty = new MetricMetricDescriptorLabelArgs();

    /**
     * A description of this metric, which is used in documentation. The maximum length of the
     * description is 8000 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of this metric, which is used in documentation. The maximum length of the
     * description is 8000 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The label key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The label key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `BOOL`, `INT64`, and `STRING`.
     * 
     */
    @Import(name="valueType")
    private @Nullable Output<String> valueType;

    /**
     * @return The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `BOOL`, `INT64`, and `STRING`.
     * 
     */
    public Optional<Output<String>> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    private MetricMetricDescriptorLabelArgs() {}

    private MetricMetricDescriptorLabelArgs(MetricMetricDescriptorLabelArgs $) {
        this.description = $.description;
        this.key = $.key;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricMetricDescriptorLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricMetricDescriptorLabelArgs $;

        public Builder() {
            $ = new MetricMetricDescriptorLabelArgs();
        }

        public Builder(MetricMetricDescriptorLabelArgs defaults) {
            $ = new MetricMetricDescriptorLabelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of this metric, which is used in documentation. The maximum length of the
         * description is 8000 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of this metric, which is used in documentation. The maximum length of the
         * description is 8000 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param key The label key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The label key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param valueType The type of data that can be assigned to the label.
         * Default value is `STRING`.
         * Possible values are `BOOL`, `INT64`, and `STRING`.
         * 
         * @return builder
         * 
         */
        public Builder valueType(@Nullable Output<String> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType The type of data that can be assigned to the label.
         * Default value is `STRING`.
         * Possible values are `BOOL`, `INT64`, and `STRING`.
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            return valueType(Output.of(valueType));
        }

        public MetricMetricDescriptorLabelArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
