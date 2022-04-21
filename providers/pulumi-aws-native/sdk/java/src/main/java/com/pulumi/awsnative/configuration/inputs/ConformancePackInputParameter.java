// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.configuration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Input parameters in the form of key-value pairs for the conformance pack.
 * 
 */
public final class ConformancePackInputParameter extends com.pulumi.resources.InvokeArgs {

    public static final ConformancePackInputParameter Empty = new ConformancePackInputParameter();

    @Import(name="parameterName", required=true)
    private String parameterName;

    public String parameterName() {
        return this.parameterName;
    }

    @Import(name="parameterValue", required=true)
    private String parameterValue;

    public String parameterValue() {
        return this.parameterValue;
    }

    private ConformancePackInputParameter() {}

    private ConformancePackInputParameter(ConformancePackInputParameter $) {
        this.parameterName = $.parameterName;
        this.parameterValue = $.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConformancePackInputParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConformancePackInputParameter $;

        public Builder() {
            $ = new ConformancePackInputParameter();
        }

        public Builder(ConformancePackInputParameter defaults) {
            $ = new ConformancePackInputParameter(Objects.requireNonNull(defaults));
        }

        public Builder parameterName(String parameterName) {
            $.parameterName = parameterName;
            return this;
        }

        public Builder parameterValue(String parameterValue) {
            $.parameterValue = parameterValue;
            return this;
        }

        public ConformancePackInputParameter build() {
            $.parameterName = Objects.requireNonNull($.parameterName, "expected parameter 'parameterName' to be non-null");
            $.parameterValue = Objects.requireNonNull($.parameterValue, "expected parameter 'parameterValue' to be non-null");
            return $;
        }
    }

}
