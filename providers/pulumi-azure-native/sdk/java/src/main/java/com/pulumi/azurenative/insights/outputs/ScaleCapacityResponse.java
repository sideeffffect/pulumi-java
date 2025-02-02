// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScaleCapacityResponse {
    /**
     * @return the number of instances that will be set if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default.
     * 
     */
    private final String default_;
    /**
     * @return the maximum number of instances for the resource. The actual maximum number of instances is limited by the cores that are available in the subscription.
     * 
     */
    private final String maximum;
    /**
     * @return the minimum number of instances for the resource.
     * 
     */
    private final String minimum;

    @CustomType.Constructor
    private ScaleCapacityResponse(
        @CustomType.Parameter("default") String default_,
        @CustomType.Parameter("maximum") String maximum,
        @CustomType.Parameter("minimum") String minimum) {
        this.default_ = default_;
        this.maximum = maximum;
        this.minimum = minimum;
    }

    /**
     * @return the number of instances that will be set if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default.
     * 
     */
    public String default_() {
        return this.default_;
    }
    /**
     * @return the maximum number of instances for the resource. The actual maximum number of instances is limited by the cores that are available in the subscription.
     * 
     */
    public String maximum() {
        return this.maximum;
    }
    /**
     * @return the minimum number of instances for the resource.
     * 
     */
    public String minimum() {
        return this.minimum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String default_;
        private String maximum;
        private String minimum;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
        }

        public Builder default_(String default_) {
            this.default_ = Objects.requireNonNull(default_);
            return this;
        }
        public Builder maximum(String maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }
        public Builder minimum(String minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }        public ScaleCapacityResponse build() {
            return new ScaleCapacityResponse(default_, maximum, minimum);
        }
    }
}
