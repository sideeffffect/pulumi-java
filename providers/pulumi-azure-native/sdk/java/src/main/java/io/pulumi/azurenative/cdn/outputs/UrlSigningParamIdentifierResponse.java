// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UrlSigningParamIdentifierResponse {
    /**
     * Indicates the purpose of the parameter
     * 
     */
    private final String paramIndicator;
    /**
     * Parameter name
     * 
     */
    private final String paramName;

    @OutputCustomType.Constructor
    private UrlSigningParamIdentifierResponse(
        @OutputCustomType.Parameter("paramIndicator") String paramIndicator,
        @OutputCustomType.Parameter("paramName") String paramName) {
        this.paramIndicator = paramIndicator;
        this.paramName = paramName;
    }

    /**
     * Indicates the purpose of the parameter
     * 
    */
    public String getParamIndicator() {
        return this.paramIndicator;
    }
    /**
     * Parameter name
     * 
    */
    public String getParamName() {
        return this.paramName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningParamIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String paramIndicator;
        private String paramName;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningParamIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paramIndicator = defaults.paramIndicator;
    	      this.paramName = defaults.paramName;
        }

        public Builder paramIndicator(String paramIndicator) {
            this.paramIndicator = Objects.requireNonNull(paramIndicator);
            return this;
        }

        public Builder paramName(String paramName) {
            this.paramName = Objects.requireNonNull(paramName);
            return this;
        }
        public UrlSigningParamIdentifierResponse build() {
            return new UrlSigningParamIdentifierResponse(paramIndicator, paramName);
        }
    }
}
