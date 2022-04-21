// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoScaleSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoScaleSettingsResponse Empty = new AutoScaleSettingsResponse();

    /**
     * If omitted, the default value is 15 minutes (PT15M).
     * 
     */
    @Import(name="evaluationInterval")
    private @Nullable String evaluationInterval;

    public Optional<String> evaluationInterval() {
        return Optional.ofNullable(this.evaluationInterval);
    }

    @Import(name="formula", required=true)
    private String formula;

    public String formula() {
        return this.formula;
    }

    private AutoScaleSettingsResponse() {}

    private AutoScaleSettingsResponse(AutoScaleSettingsResponse $) {
        this.evaluationInterval = $.evaluationInterval;
        this.formula = $.formula;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoScaleSettingsResponse $;

        public Builder() {
            $ = new AutoScaleSettingsResponse();
        }

        public Builder(AutoScaleSettingsResponse defaults) {
            $ = new AutoScaleSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder evaluationInterval(@Nullable String evaluationInterval) {
            $.evaluationInterval = evaluationInterval;
            return this;
        }

        public Builder formula(String formula) {
            $.formula = formula;
            return this;
        }

        public AutoScaleSettingsResponse build() {
            $.formula = Objects.requireNonNull($.formula, "expected parameter 'formula' to be non-null");
            return $;
        }
    }

}
