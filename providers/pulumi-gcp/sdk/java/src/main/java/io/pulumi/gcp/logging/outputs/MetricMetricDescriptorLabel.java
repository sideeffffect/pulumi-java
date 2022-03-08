// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricMetricDescriptorLabel {
    /**
     * A description of this metric, which is used in documentation. The maximum length of the
     * description is 8000 characters.
     * 
     */
    private final @Nullable String description;
    /**
     * The label key.
     * 
     */
    private final String key;
    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `BOOL`, `INT64`, and `STRING`.
     * 
     */
    private final @Nullable String valueType;

    @OutputCustomType.Constructor({"description","key","valueType"})
    private MetricMetricDescriptorLabel(
        @Nullable String description,
        String key,
        @Nullable String valueType) {
        this.description = description;
        this.key = key;
        this.valueType = valueType;
    }

    /**
     * A description of this metric, which is used in documentation. The maximum length of the
     * description is 8000 characters.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The label key.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `BOOL`, `INT64`, and `STRING`.
     * 
    */
    public Optional<String> getValueType() {
        return Optional.ofNullable(this.valueType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricMetricDescriptorLabel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String key;
        private @Nullable String valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricMetricDescriptorLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.key = defaults.key;
    	      this.valueType = defaults.valueType;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValueType(@Nullable String valueType) {
            this.valueType = valueType;
            return this;
        }
        public MetricMetricDescriptorLabel build() {
            return new MetricMetricDescriptorLabel(description, key, valueType);
        }
    }
}
