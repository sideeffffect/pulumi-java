// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse Empty = new GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse();

    /**
     * Must be specified if type is `CATEGORICAL`. The list of possible categories.
     * 
     */
    @InputImport(name="values", required=true)
      private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse(List<String> values) {
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse() {
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse(values);
        }
    }
}
