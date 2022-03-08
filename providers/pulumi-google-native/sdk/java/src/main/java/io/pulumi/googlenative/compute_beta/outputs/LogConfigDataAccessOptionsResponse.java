// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LogConfigDataAccessOptionsResponse {
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String logMode;

    @OutputCustomType.Constructor({"logMode"})
    private LogConfigDataAccessOptionsResponse(String logMode) {
        this.logMode = logMode;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getLogMode() {
        return this.logMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigDataAccessOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logMode;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigDataAccessOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logMode = defaults.logMode;
        }

        public Builder setLogMode(String logMode) {
            this.logMode = Objects.requireNonNull(logMode);
            return this;
        }
        public LogConfigDataAccessOptionsResponse build() {
            return new LogConfigDataAccessOptionsResponse(logMode);
        }
    }
}
