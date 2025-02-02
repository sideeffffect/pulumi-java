// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FunctionJavascriptUdaInput {
    /**
     * @return The input data type of this JavaScript Function. Possible values include `any`, `array`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FunctionJavascriptUdaInput(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * @return The input data type of this JavaScript Function. Possible values include `any`, `array`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionJavascriptUdaInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionJavascriptUdaInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FunctionJavascriptUdaInput build() {
            return new FunctionJavascriptUdaInput(type);
        }
    }
}
