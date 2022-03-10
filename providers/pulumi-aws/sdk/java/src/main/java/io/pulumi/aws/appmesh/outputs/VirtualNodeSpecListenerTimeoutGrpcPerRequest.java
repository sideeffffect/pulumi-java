// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecListenerTimeoutGrpcPerRequest {
    /**
     * The unit of time. Valid values: `ms`, `s`.
     * 
     */
    private final String unit;
    /**
     * The number of time units. Minimum value of `0`.
     * 
     */
    private final Integer value;

    @OutputCustomType.Constructor
    private VirtualNodeSpecListenerTimeoutGrpcPerRequest(
        @OutputCustomType.Parameter("unit") String unit,
        @OutputCustomType.Parameter("value") Integer value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * The unit of time. Valid values: `ms`, `s`.
     * 
    */
    public String getUnit() {
        return this.unit;
    }
    /**
     * The number of time units. Minimum value of `0`.
     * 
    */
    public Integer getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutGrpcPerRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String unit;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutGrpcPerRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public VirtualNodeSpecListenerTimeoutGrpcPerRequest build() {
            return new VirtualNodeSpecListenerTimeoutGrpcPerRequest(unit, value);
        }
    }
}
