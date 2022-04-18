// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.inputs.SecurityAssessmentMetadataPartnerDataResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes properties of an assessment metadata.
 * 
 */
public final class SecurityAssessmentMetadataPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecurityAssessmentMetadataPropertiesResponse Empty = new SecurityAssessmentMetadataPropertiesResponse();

    /**
     * BuiltIn if the assessment based on built-in Azure Policy definition, Custom if the assessment based on custom Azure Policy definition
     * 
     */
    @Import(name="assessmentType", required=true)
      private final String assessmentType;

    public String assessmentType() {
        return this.assessmentType;
    }

    @Import(name="categories")
      private final @Nullable List<String> categories;

    public List<String> categories() {
        return this.categories == null ? List.of() : this.categories;
    }

    /**
     * Human readable description of the assessment
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * User friendly display name of the assessment
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * The implementation effort required to remediate this assessment
     * 
     */
    @Import(name="implementationEffort")
      private final @Nullable String implementationEffort;

    public Optional<String> implementationEffort() {
        return this.implementationEffort == null ? Optional.empty() : Optional.ofNullable(this.implementationEffort);
    }

    /**
     * Describes the partner that created the assessment
     * 
     */
    @Import(name="partnerData")
      private final @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData;

    public Optional<SecurityAssessmentMetadataPartnerDataResponse> partnerData() {
        return this.partnerData == null ? Optional.empty() : Optional.ofNullable(this.partnerData);
    }

    /**
     * Azure resource ID of the policy definition that turns this assessment calculation on
     * 
     */
    @Import(name="policyDefinitionId", required=true)
      private final String policyDefinitionId;

    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * True if this assessment is in preview release status
     * 
     */
    @Import(name="preview")
      private final @Nullable Boolean preview;

    public Optional<Boolean> preview() {
        return this.preview == null ? Optional.empty() : Optional.ofNullable(this.preview);
    }

    /**
     * Human readable description of what you should do to mitigate this security issue
     * 
     */
    @Import(name="remediationDescription")
      private final @Nullable String remediationDescription;

    public Optional<String> remediationDescription() {
        return this.remediationDescription == null ? Optional.empty() : Optional.ofNullable(this.remediationDescription);
    }

    /**
     * The severity level of the assessment
     * 
     */
    @Import(name="severity", required=true)
      private final String severity;

    public String severity() {
        return this.severity;
    }

    @Import(name="threats")
      private final @Nullable List<String> threats;

    public List<String> threats() {
        return this.threats == null ? List.of() : this.threats;
    }

    /**
     * The user impact of the assessment
     * 
     */
    @Import(name="userImpact")
      private final @Nullable String userImpact;

    public Optional<String> userImpact() {
        return this.userImpact == null ? Optional.empty() : Optional.ofNullable(this.userImpact);
    }

    public SecurityAssessmentMetadataPropertiesResponse(
        String assessmentType,
        @Nullable List<String> categories,
        @Nullable String description,
        String displayName,
        @Nullable String implementationEffort,
        @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData,
        String policyDefinitionId,
        @Nullable Boolean preview,
        @Nullable String remediationDescription,
        String severity,
        @Nullable List<String> threats,
        @Nullable String userImpact) {
        this.assessmentType = Objects.requireNonNull(assessmentType, "expected parameter 'assessmentType' to be non-null");
        this.categories = categories;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.implementationEffort = implementationEffort;
        this.partnerData = partnerData;
        this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId, "expected parameter 'policyDefinitionId' to be non-null");
        this.preview = preview;
        this.remediationDescription = remediationDescription;
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.threats = threats;
        this.userImpact = userImpact;
    }

    private SecurityAssessmentMetadataPropertiesResponse() {
        this.assessmentType = null;
        this.categories = List.of();
        this.description = null;
        this.displayName = null;
        this.implementationEffort = null;
        this.partnerData = null;
        this.policyDefinitionId = null;
        this.preview = null;
        this.remediationDescription = null;
        this.severity = null;
        this.threats = List.of();
        this.userImpact = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityAssessmentMetadataPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assessmentType;
        private @Nullable List<String> categories;
        private @Nullable String description;
        private String displayName;
        private @Nullable String implementationEffort;
        private @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData;
        private String policyDefinitionId;
        private @Nullable Boolean preview;
        private @Nullable String remediationDescription;
        private String severity;
        private @Nullable List<String> threats;
        private @Nullable String userImpact;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityAssessmentMetadataPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentType = defaults.assessmentType;
    	      this.categories = defaults.categories;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.implementationEffort = defaults.implementationEffort;
    	      this.partnerData = defaults.partnerData;
    	      this.policyDefinitionId = defaults.policyDefinitionId;
    	      this.preview = defaults.preview;
    	      this.remediationDescription = defaults.remediationDescription;
    	      this.severity = defaults.severity;
    	      this.threats = defaults.threats;
    	      this.userImpact = defaults.userImpact;
        }

        public Builder assessmentType(String assessmentType) {
            this.assessmentType = Objects.requireNonNull(assessmentType);
            return this;
        }
        public Builder categories(@Nullable List<String> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder implementationEffort(@Nullable String implementationEffort) {
            this.implementationEffort = implementationEffort;
            return this;
        }
        public Builder partnerData(@Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData) {
            this.partnerData = partnerData;
            return this;
        }
        public Builder policyDefinitionId(String policyDefinitionId) {
            this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId);
            return this;
        }
        public Builder preview(@Nullable Boolean preview) {
            this.preview = preview;
            return this;
        }
        public Builder remediationDescription(@Nullable String remediationDescription) {
            this.remediationDescription = remediationDescription;
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder threats(@Nullable List<String> threats) {
            this.threats = threats;
            return this;
        }
        public Builder threats(String... threats) {
            return threats(List.of(threats));
        }
        public Builder userImpact(@Nullable String userImpact) {
            this.userImpact = userImpact;
            return this;
        }        public SecurityAssessmentMetadataPropertiesResponse build() {
            return new SecurityAssessmentMetadataPropertiesResponse(assessmentType, categories, description, displayName, implementationEffort, partnerData, policyDefinitionId, preview, remediationDescription, severity, threats, userImpact);
        }
    }
}
