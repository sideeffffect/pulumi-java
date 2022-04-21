// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.enums.AssessmentType;
import com.pulumi.azurenative.security.enums.Categories;
import com.pulumi.azurenative.security.enums.ImplementationEffort;
import com.pulumi.azurenative.security.enums.Severity;
import com.pulumi.azurenative.security.enums.Threats;
import com.pulumi.azurenative.security.enums.UserImpact;
import com.pulumi.azurenative.security.inputs.SecurityAssessmentMetadataPartnerDataArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
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
public final class SecurityAssessmentMetadataPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityAssessmentMetadataPropertiesArgs Empty = new SecurityAssessmentMetadataPropertiesArgs();

    /**
     * BuiltIn if the assessment based on built-in Azure Policy definition, Custom if the assessment based on custom Azure Policy definition
     * 
     */
    @Import(name="assessmentType", required=true)
    private Output<Either<String,AssessmentType>> assessmentType;

    public Output<Either<String,AssessmentType>> assessmentType() {
        return this.assessmentType;
    }

    @Import(name="categories")
    private @Nullable Output<List<Either<String,Categories>>> categories;

    public Optional<Output<List<Either<String,Categories>>>> categories() {
        return Optional.ofNullable(this.categories);
    }

    /**
     * Human readable description of the assessment
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User friendly display name of the assessment
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The implementation effort required to remediate this assessment
     * 
     */
    @Import(name="implementationEffort")
    private @Nullable Output<Either<String,ImplementationEffort>> implementationEffort;

    public Optional<Output<Either<String,ImplementationEffort>>> implementationEffort() {
        return Optional.ofNullable(this.implementationEffort);
    }

    /**
     * Describes the partner that created the assessment
     * 
     */
    @Import(name="partnerData")
    private @Nullable Output<SecurityAssessmentMetadataPartnerDataArgs> partnerData;

    public Optional<Output<SecurityAssessmentMetadataPartnerDataArgs>> partnerData() {
        return Optional.ofNullable(this.partnerData);
    }

    /**
     * True if this assessment is in preview release status
     * 
     */
    @Import(name="preview")
    private @Nullable Output<Boolean> preview;

    public Optional<Output<Boolean>> preview() {
        return Optional.ofNullable(this.preview);
    }

    /**
     * Human readable description of what you should do to mitigate this security issue
     * 
     */
    @Import(name="remediationDescription")
    private @Nullable Output<String> remediationDescription;

    public Optional<Output<String>> remediationDescription() {
        return Optional.ofNullable(this.remediationDescription);
    }

    /**
     * The severity level of the assessment
     * 
     */
    @Import(name="severity", required=true)
    private Output<Either<String,Severity>> severity;

    public Output<Either<String,Severity>> severity() {
        return this.severity;
    }

    @Import(name="threats")
    private @Nullable Output<List<Either<String,Threats>>> threats;

    public Optional<Output<List<Either<String,Threats>>>> threats() {
        return Optional.ofNullable(this.threats);
    }

    /**
     * The user impact of the assessment
     * 
     */
    @Import(name="userImpact")
    private @Nullable Output<Either<String,UserImpact>> userImpact;

    public Optional<Output<Either<String,UserImpact>>> userImpact() {
        return Optional.ofNullable(this.userImpact);
    }

    private SecurityAssessmentMetadataPropertiesArgs() {}

    private SecurityAssessmentMetadataPropertiesArgs(SecurityAssessmentMetadataPropertiesArgs $) {
        this.assessmentType = $.assessmentType;
        this.categories = $.categories;
        this.description = $.description;
        this.displayName = $.displayName;
        this.implementationEffort = $.implementationEffort;
        this.partnerData = $.partnerData;
        this.preview = $.preview;
        this.remediationDescription = $.remediationDescription;
        this.severity = $.severity;
        this.threats = $.threats;
        this.userImpact = $.userImpact;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityAssessmentMetadataPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityAssessmentMetadataPropertiesArgs $;

        public Builder() {
            $ = new SecurityAssessmentMetadataPropertiesArgs();
        }

        public Builder(SecurityAssessmentMetadataPropertiesArgs defaults) {
            $ = new SecurityAssessmentMetadataPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder assessmentType(Output<Either<String,AssessmentType>> assessmentType) {
            $.assessmentType = assessmentType;
            return this;
        }

        public Builder assessmentType(Either<String,AssessmentType> assessmentType) {
            return assessmentType(Output.of(assessmentType));
        }

        public Builder categories(@Nullable Output<List<Either<String,Categories>>> categories) {
            $.categories = categories;
            return this;
        }

        public Builder categories(List<Either<String,Categories>> categories) {
            return categories(Output.of(categories));
        }

        public Builder categories(Either<String,Categories>... categories) {
            return categories(List.of(categories));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder implementationEffort(@Nullable Output<Either<String,ImplementationEffort>> implementationEffort) {
            $.implementationEffort = implementationEffort;
            return this;
        }

        public Builder implementationEffort(Either<String,ImplementationEffort> implementationEffort) {
            return implementationEffort(Output.of(implementationEffort));
        }

        public Builder partnerData(@Nullable Output<SecurityAssessmentMetadataPartnerDataArgs> partnerData) {
            $.partnerData = partnerData;
            return this;
        }

        public Builder partnerData(SecurityAssessmentMetadataPartnerDataArgs partnerData) {
            return partnerData(Output.of(partnerData));
        }

        public Builder preview(@Nullable Output<Boolean> preview) {
            $.preview = preview;
            return this;
        }

        public Builder preview(Boolean preview) {
            return preview(Output.of(preview));
        }

        public Builder remediationDescription(@Nullable Output<String> remediationDescription) {
            $.remediationDescription = remediationDescription;
            return this;
        }

        public Builder remediationDescription(String remediationDescription) {
            return remediationDescription(Output.of(remediationDescription));
        }

        public Builder severity(Output<Either<String,Severity>> severity) {
            $.severity = severity;
            return this;
        }

        public Builder severity(Either<String,Severity> severity) {
            return severity(Output.of(severity));
        }

        public Builder threats(@Nullable Output<List<Either<String,Threats>>> threats) {
            $.threats = threats;
            return this;
        }

        public Builder threats(List<Either<String,Threats>> threats) {
            return threats(Output.of(threats));
        }

        public Builder threats(Either<String,Threats>... threats) {
            return threats(List.of(threats));
        }

        public Builder userImpact(@Nullable Output<Either<String,UserImpact>> userImpact) {
            $.userImpact = userImpact;
            return this;
        }

        public Builder userImpact(Either<String,UserImpact> userImpact) {
            return userImpact(Output.of(userImpact));
        }

        public SecurityAssessmentMetadataPropertiesArgs build() {
            $.assessmentType = Objects.requireNonNull($.assessmentType, "expected parameter 'assessmentType' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.severity = Objects.requireNonNull($.severity, "expected parameter 'severity' to be non-null");
            return $;
        }
    }

}
