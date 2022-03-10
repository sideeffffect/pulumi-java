// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConformancePackInputParameter {
    /**
     * The input key.
     * 
     */
    private final String parameterName;
    /**
     * The input value.
     * 
     */
    private final String parameterValue;

    @OutputCustomType.Constructor
    private ConformancePackInputParameter(
        @OutputCustomType.Parameter("parameterName") String parameterName,
        @OutputCustomType.Parameter("parameterValue") String parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    /**
     * The input key.
     * 
    */
    public String getParameterName() {
        return this.parameterName;
    }
    /**
     * The input value.
     * 
    */
    public String getParameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConformancePackInputParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterName;
        private String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ConformancePackInputParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }
        public ConformancePackInputParameter build() {
            return new ConformancePackInputParameter(parameterName, parameterValue);
        }
    }
}
