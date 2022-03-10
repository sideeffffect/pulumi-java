// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.AsyncOptionsResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.InputMappingResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.ValidationOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Options allows customized resource handling by Deployment Manager.
 * 
 */
public final class OptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final OptionsResponse Empty = new OptionsResponse();

    /**
     * Options regarding how to thread async requests.
     * 
     */
    @InputImport(name="asyncOptions", required=true)
      private final List<AsyncOptionsResponse> asyncOptions;

    public List<AsyncOptionsResponse> getAsyncOptions() {
        return this.asyncOptions;
    }

    /**
     * The mappings that apply for requests.
     * 
     */
    @InputImport(name="inputMappings", required=true)
      private final List<InputMappingResponse> inputMappings;

    public List<InputMappingResponse> getInputMappings() {
        return this.inputMappings;
    }

    /**
     * The json path to the field in the resource JSON body into which the resource name should be mapped. Leaving this empty indicates that there should be no mapping performed.
     * 
     */
    @InputImport(name="nameProperty", required=true)
      private final String nameProperty;

    public String getNameProperty() {
        return this.nameProperty;
    }

    /**
     * Options for how to validate and process properties on a resource.
     * 
     */
    @InputImport(name="validationOptions", required=true)
      private final ValidationOptionsResponse validationOptions;

    public ValidationOptionsResponse getValidationOptions() {
        return this.validationOptions;
    }

    public OptionsResponse(
        List<AsyncOptionsResponse> asyncOptions,
        List<InputMappingResponse> inputMappings,
        String nameProperty,
        ValidationOptionsResponse validationOptions) {
        this.asyncOptions = Objects.requireNonNull(asyncOptions, "expected parameter 'asyncOptions' to be non-null");
        this.inputMappings = Objects.requireNonNull(inputMappings, "expected parameter 'inputMappings' to be non-null");
        this.nameProperty = Objects.requireNonNull(nameProperty, "expected parameter 'nameProperty' to be non-null");
        this.validationOptions = Objects.requireNonNull(validationOptions, "expected parameter 'validationOptions' to be non-null");
    }

    private OptionsResponse() {
        this.asyncOptions = List.of();
        this.inputMappings = List.of();
        this.nameProperty = null;
        this.validationOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AsyncOptionsResponse> asyncOptions;
        private List<InputMappingResponse> inputMappings;
        private String nameProperty;
        private ValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asyncOptions = defaults.asyncOptions;
    	      this.inputMappings = defaults.inputMappings;
    	      this.nameProperty = defaults.nameProperty;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder asyncOptions(List<AsyncOptionsResponse> asyncOptions) {
            this.asyncOptions = Objects.requireNonNull(asyncOptions);
            return this;
        }

        public Builder inputMappings(List<InputMappingResponse> inputMappings) {
            this.inputMappings = Objects.requireNonNull(inputMappings);
            return this;
        }

        public Builder nameProperty(String nameProperty) {
            this.nameProperty = Objects.requireNonNull(nameProperty);
            return this;
        }

        public Builder validationOptions(ValidationOptionsResponse validationOptions) {
            this.validationOptions = Objects.requireNonNull(validationOptions);
            return this;
        }
        public OptionsResponse build() {
            return new OptionsResponse(asyncOptions, inputMappings, nameProperty, validationOptions);
        }
    }
}
