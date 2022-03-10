// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Contains the configuration for FHIR profiles and validation.
 * 
 */
public final class ValidationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValidationConfigResponse Empty = new ValidationConfigResponse();

    /**
     * Whether to disable FHIRPath validation for incoming resources. Set this to true to disable checking incoming resources for conformance against FHIRPath requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    @InputImport(name="disableFhirpathValidation", required=true)
      private final Boolean disableFhirpathValidation;

    public Boolean getDisableFhirpathValidation() {
        return this.disableFhirpathValidation;
    }

    /**
     * Whether to disable profile validation for this FHIR store. Set this to true to disable checking incoming resources for conformance against structure definitions in this FHIR store.
     * 
     */
    @InputImport(name="disableProfileValidation", required=true)
      private final Boolean disableProfileValidation;

    public Boolean getDisableProfileValidation() {
        return this.disableProfileValidation;
    }

    /**
     * Whether to disable reference type validation for incoming resources. Set this to true to disable checking incoming resources for conformance against reference type requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    @InputImport(name="disableReferenceTypeValidation", required=true)
      private final Boolean disableReferenceTypeValidation;

    public Boolean getDisableReferenceTypeValidation() {
        return this.disableReferenceTypeValidation;
    }

    /**
     * Whether to disable required fields validation for incoming resources. Set this to true to disable checking incoming resources for conformance against required fields requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    @InputImport(name="disableRequiredFieldValidation", required=true)
      private final Boolean disableRequiredFieldValidation;

    public Boolean getDisableRequiredFieldValidation() {
        return this.disableRequiredFieldValidation;
    }

    /**
     * A list of implementation guide URLs in this FHIR store that are used to configure the profiles to use for validation. For example, to use the US Core profiles for validation, set `enabled_implementation_guides` to `["http://hl7.org/fhir/us/core/ImplementationGuide/ig"]`. If `enabled_implementation_guides` is empty or omitted, then incoming resources are only required to conform to the base FHIR profiles. Otherwise, a resource must conform to at least one profile listed in the `global` property of one of the enabled ImplementationGuides. The Cloud Healthcare API does not currently enforce all of the rules in a StructureDefinition. The following rules are supported: - min/max - minValue/maxValue - maxLength - type - fixed[x] - pattern[x] on simple types - slicing, when using "value" as the discriminator type When a URL cannot be resolved (for example, in a type assertion), the server does not return an error.
     * 
     */
    @InputImport(name="enabledImplementationGuides", required=true)
      private final List<String> enabledImplementationGuides;

    public List<String> getEnabledImplementationGuides() {
        return this.enabledImplementationGuides;
    }

    public ValidationConfigResponse(
        Boolean disableFhirpathValidation,
        Boolean disableProfileValidation,
        Boolean disableReferenceTypeValidation,
        Boolean disableRequiredFieldValidation,
        List<String> enabledImplementationGuides) {
        this.disableFhirpathValidation = Objects.requireNonNull(disableFhirpathValidation, "expected parameter 'disableFhirpathValidation' to be non-null");
        this.disableProfileValidation = Objects.requireNonNull(disableProfileValidation, "expected parameter 'disableProfileValidation' to be non-null");
        this.disableReferenceTypeValidation = Objects.requireNonNull(disableReferenceTypeValidation, "expected parameter 'disableReferenceTypeValidation' to be non-null");
        this.disableRequiredFieldValidation = Objects.requireNonNull(disableRequiredFieldValidation, "expected parameter 'disableRequiredFieldValidation' to be non-null");
        this.enabledImplementationGuides = Objects.requireNonNull(enabledImplementationGuides, "expected parameter 'enabledImplementationGuides' to be non-null");
    }

    private ValidationConfigResponse() {
        this.disableFhirpathValidation = null;
        this.disableProfileValidation = null;
        this.disableReferenceTypeValidation = null;
        this.disableRequiredFieldValidation = null;
        this.enabledImplementationGuides = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableFhirpathValidation;
        private Boolean disableProfileValidation;
        private Boolean disableReferenceTypeValidation;
        private Boolean disableRequiredFieldValidation;
        private List<String> enabledImplementationGuides;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableFhirpathValidation = defaults.disableFhirpathValidation;
    	      this.disableProfileValidation = defaults.disableProfileValidation;
    	      this.disableReferenceTypeValidation = defaults.disableReferenceTypeValidation;
    	      this.disableRequiredFieldValidation = defaults.disableRequiredFieldValidation;
    	      this.enabledImplementationGuides = defaults.enabledImplementationGuides;
        }

        public Builder disableFhirpathValidation(Boolean disableFhirpathValidation) {
            this.disableFhirpathValidation = Objects.requireNonNull(disableFhirpathValidation);
            return this;
        }

        public Builder disableProfileValidation(Boolean disableProfileValidation) {
            this.disableProfileValidation = Objects.requireNonNull(disableProfileValidation);
            return this;
        }

        public Builder disableReferenceTypeValidation(Boolean disableReferenceTypeValidation) {
            this.disableReferenceTypeValidation = Objects.requireNonNull(disableReferenceTypeValidation);
            return this;
        }

        public Builder disableRequiredFieldValidation(Boolean disableRequiredFieldValidation) {
            this.disableRequiredFieldValidation = Objects.requireNonNull(disableRequiredFieldValidation);
            return this;
        }

        public Builder enabledImplementationGuides(List<String> enabledImplementationGuides) {
            this.enabledImplementationGuides = Objects.requireNonNull(enabledImplementationGuides);
            return this;
        }
        public ValidationConfigResponse build() {
            return new ValidationConfigResponse(disableFhirpathValidation, disableProfileValidation, disableReferenceTypeValidation, disableRequiredFieldValidation, enabledImplementationGuides);
        }
    }
}
