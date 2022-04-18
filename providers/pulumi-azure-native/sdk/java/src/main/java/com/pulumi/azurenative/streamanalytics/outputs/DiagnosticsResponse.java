// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.azurenative.streamanalytics.outputs.DiagnosticConditionResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DiagnosticsResponse {
    /**
     * A collection of zero or more conditions applicable to the resource, or to the job overall, that warrant customer attention.
     * 
     */
    private final List<DiagnosticConditionResponse> conditions;

    @CustomType.Constructor
    private DiagnosticsResponse(@CustomType.Parameter("conditions") List<DiagnosticConditionResponse> conditions) {
        this.conditions = conditions;
    }

    /**
     * A collection of zero or more conditions applicable to the resource, or to the job overall, that warrant customer attention.
     * 
    */
    public List<DiagnosticConditionResponse> conditions() {
        return this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DiagnosticConditionResponse> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder conditions(List<DiagnosticConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(DiagnosticConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }        public DiagnosticsResponse build() {
            return new DiagnosticsResponse(conditions);
        }
    }
}
