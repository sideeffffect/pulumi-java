// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2LikelihoodAdjustmentResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ProximityResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2RegexResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2HotwordRuleResponse {
    /**
     * Regular expression pattern defining what qualifies as a hotword.
     * 
     */
    private final GooglePrivacyDlpV2RegexResponse hotwordRegex;
    /**
     * Likelihood adjustment to apply to all matching findings.
     * 
     */
    private final GooglePrivacyDlpV2LikelihoodAdjustmentResponse likelihoodAdjustment;
    /**
     * Proximity of the finding within which the entire hotword must reside. The total length of the window cannot exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be used to match substrings of the finding itself. For example, the certainty of a phone number regex "\(\d{3}\) \d{3}-\d{4}" could be adjusted upwards if the area code is known to be the local area code of a company office using the hotword regex "\(xxx\)", where "xxx" is the area code in question.
     * 
     */
    private final GooglePrivacyDlpV2ProximityResponse proximity;

    @OutputCustomType.Constructor({"hotwordRegex","likelihoodAdjustment","proximity"})
    private GooglePrivacyDlpV2HotwordRuleResponse(
        GooglePrivacyDlpV2RegexResponse hotwordRegex,
        GooglePrivacyDlpV2LikelihoodAdjustmentResponse likelihoodAdjustment,
        GooglePrivacyDlpV2ProximityResponse proximity) {
        this.hotwordRegex = hotwordRegex;
        this.likelihoodAdjustment = likelihoodAdjustment;
        this.proximity = proximity;
    }

    /**
     * Regular expression pattern defining what qualifies as a hotword.
     * 
    */
    public GooglePrivacyDlpV2RegexResponse getHotwordRegex() {
        return this.hotwordRegex;
    }
    /**
     * Likelihood adjustment to apply to all matching findings.
     * 
    */
    public GooglePrivacyDlpV2LikelihoodAdjustmentResponse getLikelihoodAdjustment() {
        return this.likelihoodAdjustment;
    }
    /**
     * Proximity of the finding within which the entire hotword must reside. The total length of the window cannot exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be used to match substrings of the finding itself. For example, the certainty of a phone number regex "\(\d{3}\) \d{3}-\d{4}" could be adjusted upwards if the area code is known to be the local area code of a company office using the hotword regex "\(xxx\)", where "xxx" is the area code in question.
     * 
    */
    public GooglePrivacyDlpV2ProximityResponse getProximity() {
        return this.proximity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2HotwordRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RegexResponse hotwordRegex;
        private GooglePrivacyDlpV2LikelihoodAdjustmentResponse likelihoodAdjustment;
        private GooglePrivacyDlpV2ProximityResponse proximity;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2HotwordRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hotwordRegex = defaults.hotwordRegex;
    	      this.likelihoodAdjustment = defaults.likelihoodAdjustment;
    	      this.proximity = defaults.proximity;
        }

        public Builder setHotwordRegex(GooglePrivacyDlpV2RegexResponse hotwordRegex) {
            this.hotwordRegex = Objects.requireNonNull(hotwordRegex);
            return this;
        }

        public Builder setLikelihoodAdjustment(GooglePrivacyDlpV2LikelihoodAdjustmentResponse likelihoodAdjustment) {
            this.likelihoodAdjustment = Objects.requireNonNull(likelihoodAdjustment);
            return this;
        }

        public Builder setProximity(GooglePrivacyDlpV2ProximityResponse proximity) {
            this.proximity = Objects.requireNonNull(proximity);
            return this;
        }
        public GooglePrivacyDlpV2HotwordRuleResponse build() {
            return new GooglePrivacyDlpV2HotwordRuleResponse(hotwordRegex, likelihoodAdjustment, proximity);
        }
    }
}
