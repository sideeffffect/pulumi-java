// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


/**
 * Represents the spec to match discrete values from parent parameter.
 * 
 */
public final class GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse Empty = new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse();

    /**
     * Matches values of the parent parameter with type &#39;DISCRETE&#39;. All values must exist in `discrete_value_spec` of parent parameter.
     * 
     */
    @Import(name="values", required=true)
    private List<Double> values;

    public List<Double> values() {
        return this.values;
    }

    private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse() {}

    private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse $;

        public Builder() {
            $ = new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse();
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse defaults) {
            $ = new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse(Objects.requireNonNull(defaults));
        }

        public Builder values(List<Double> values) {
            $.values = values;
            return this;
        }

        public Builder values(Double... values) {
            return values(List.of(values));
        }

        public GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse build() {
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
