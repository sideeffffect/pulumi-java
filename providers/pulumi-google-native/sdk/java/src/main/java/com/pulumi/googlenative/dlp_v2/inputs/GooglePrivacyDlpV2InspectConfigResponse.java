// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CustomInfoTypeResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FindingLimitsResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectionRuleSetResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration description of the scanning process. When used with redactContent only info_types and min_likelihood are currently used.
 * 
 */
public final class GooglePrivacyDlpV2InspectConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InspectConfigResponse Empty = new GooglePrivacyDlpV2InspectConfigResponse();

    /**
     * CustomInfoTypes provided by the user. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     * 
     */
    @Import(name="customInfoTypes", required=true)
    private List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes;

    public List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes() {
        return this.customInfoTypes;
    }

    /**
     * When true, excludes type information of the findings. This is not used for data profiling.
     * 
     */
    @Import(name="excludeInfoTypes", required=true)
    private Boolean excludeInfoTypes;

    public Boolean excludeInfoTypes() {
        return this.excludeInfoTypes;
    }

    /**
     * When true, a contextual quote from the data that triggered a finding is included in the response; see Finding.quote. This is not used for data profiling.
     * 
     */
    @Import(name="includeQuote", required=true)
    private Boolean includeQuote;

    public Boolean includeQuote() {
        return this.includeQuote;
    }

    /**
     * Restricts what info_types to look for. The values must correspond to InfoType values returned by ListInfoTypes or listed at https://cloud.google.com/dlp/docs/infotypes-reference. When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated. If you need precise control and predictability as to what detectors are run you should specify specific InfoTypes listed in the reference, otherwise a default list will be used, which may change over time.
     * 
     */
    @Import(name="infoTypes", required=true)
    private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;

    public List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes() {
        return this.infoTypes;
    }

    /**
     * Configuration to control the number of findings returned. This is not used for data profiling.
     * 
     */
    @Import(name="limits", required=true)
    private GooglePrivacyDlpV2FindingLimitsResponse limits;

    public GooglePrivacyDlpV2FindingLimitsResponse limits() {
        return this.limits;
    }

    /**
     * Only returns findings equal or above this threshold. The default is POSSIBLE. See https://cloud.google.com/dlp/docs/likelihood to learn more.
     * 
     */
    @Import(name="minLikelihood", required=true)
    private String minLikelihood;

    public String minLikelihood() {
        return this.minLikelihood;
    }

    /**
     * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end, other rules are executed in the order they are specified for each info type.
     * 
     */
    @Import(name="ruleSet", required=true)
    private List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet;

    public List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet() {
        return this.ruleSet;
    }

    private GooglePrivacyDlpV2InspectConfigResponse() {}

    private GooglePrivacyDlpV2InspectConfigResponse(GooglePrivacyDlpV2InspectConfigResponse $) {
        this.customInfoTypes = $.customInfoTypes;
        this.excludeInfoTypes = $.excludeInfoTypes;
        this.includeQuote = $.includeQuote;
        this.infoTypes = $.infoTypes;
        this.limits = $.limits;
        this.minLikelihood = $.minLikelihood;
        this.ruleSet = $.ruleSet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2InspectConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InspectConfigResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2InspectConfigResponse();
        }

        public Builder(GooglePrivacyDlpV2InspectConfigResponse defaults) {
            $ = new GooglePrivacyDlpV2InspectConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder customInfoTypes(List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes) {
            $.customInfoTypes = customInfoTypes;
            return this;
        }

        public Builder customInfoTypes(GooglePrivacyDlpV2CustomInfoTypeResponse... customInfoTypes) {
            return customInfoTypes(List.of(customInfoTypes));
        }

        public Builder excludeInfoTypes(Boolean excludeInfoTypes) {
            $.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        public Builder includeQuote(Boolean includeQuote) {
            $.includeQuote = includeQuote;
            return this;
        }

        public Builder infoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            $.infoTypes = infoTypes;
            return this;
        }

        public Builder infoTypes(GooglePrivacyDlpV2InfoTypeResponse... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }

        public Builder limits(GooglePrivacyDlpV2FindingLimitsResponse limits) {
            $.limits = limits;
            return this;
        }

        public Builder minLikelihood(String minLikelihood) {
            $.minLikelihood = minLikelihood;
            return this;
        }

        public Builder ruleSet(List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet) {
            $.ruleSet = ruleSet;
            return this;
        }

        public Builder ruleSet(GooglePrivacyDlpV2InspectionRuleSetResponse... ruleSet) {
            return ruleSet(List.of(ruleSet));
        }

        public GooglePrivacyDlpV2InspectConfigResponse build() {
            $.customInfoTypes = Objects.requireNonNull($.customInfoTypes, "expected parameter 'customInfoTypes' to be non-null");
            $.excludeInfoTypes = Objects.requireNonNull($.excludeInfoTypes, "expected parameter 'excludeInfoTypes' to be non-null");
            $.includeQuote = Objects.requireNonNull($.includeQuote, "expected parameter 'includeQuote' to be non-null");
            $.infoTypes = Objects.requireNonNull($.infoTypes, "expected parameter 'infoTypes' to be non-null");
            $.limits = Objects.requireNonNull($.limits, "expected parameter 'limits' to be non-null");
            $.minLikelihood = Objects.requireNonNull($.minLikelihood, "expected parameter 'minLikelihood' to be non-null");
            $.ruleSet = Objects.requireNonNull($.ruleSet, "expected parameter 'ruleSet' to be non-null");
            return $;
        }
    }

}
