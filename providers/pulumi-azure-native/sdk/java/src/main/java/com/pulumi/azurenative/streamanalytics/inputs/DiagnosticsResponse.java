// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.DiagnosticConditionResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
 * 
 */
public final class DiagnosticsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiagnosticsResponse Empty = new DiagnosticsResponse();

    /**
     * A collection of zero or more conditions applicable to the resource, or to the job overall, that warrant customer attention.
     * 
     */
    @Import(name="conditions", required=true)
    private List<DiagnosticConditionResponse> conditions;

    public List<DiagnosticConditionResponse> conditions() {
        return this.conditions;
    }

    private DiagnosticsResponse() {}

    private DiagnosticsResponse(DiagnosticsResponse $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticsResponse $;

        public Builder() {
            $ = new DiagnosticsResponse();
        }

        public Builder(DiagnosticsResponse defaults) {
            $ = new DiagnosticsResponse(Objects.requireNonNull(defaults));
        }

        public Builder conditions(List<DiagnosticConditionResponse> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(DiagnosticConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }

        public DiagnosticsResponse build() {
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            return $;
        }
    }

}
