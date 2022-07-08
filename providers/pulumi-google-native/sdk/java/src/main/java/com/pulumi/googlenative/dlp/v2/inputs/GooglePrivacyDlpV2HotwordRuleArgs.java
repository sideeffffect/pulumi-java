// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2LikelihoodAdjustmentArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2ProximityArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2RegexArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The rule that adjusts the likelihood of findings within a certain proximity of hotwords.
 * 
 */
public final class GooglePrivacyDlpV2HotwordRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2HotwordRuleArgs Empty = new GooglePrivacyDlpV2HotwordRuleArgs();

    /**
     * Regular expression pattern defining what qualifies as a hotword.
     * 
     */
    @Import(name="hotwordRegex")
    private @Nullable Output<GooglePrivacyDlpV2RegexArgs> hotwordRegex;

    /**
     * @return Regular expression pattern defining what qualifies as a hotword.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2RegexArgs>> hotwordRegex() {
        return Optional.ofNullable(this.hotwordRegex);
    }

    /**
     * Likelihood adjustment to apply to all matching findings.
     * 
     */
    @Import(name="likelihoodAdjustment")
    private @Nullable Output<GooglePrivacyDlpV2LikelihoodAdjustmentArgs> likelihoodAdjustment;

    /**
     * @return Likelihood adjustment to apply to all matching findings.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2LikelihoodAdjustmentArgs>> likelihoodAdjustment() {
        return Optional.ofNullable(this.likelihoodAdjustment);
    }

    /**
     * Proximity of the finding within which the entire hotword must reside. The total length of the window cannot exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be used to match substrings of the finding itself. For example, the certainty of a phone number regex &#34;\(\d{3}\) \d{3}-\d{4}&#34; could be adjusted upwards if the area code is known to be the local area code of a company office using the hotword regex &#34;\(xxx\)&#34;, where &#34;xxx&#34; is the area code in question.
     * 
     */
    @Import(name="proximity")
    private @Nullable Output<GooglePrivacyDlpV2ProximityArgs> proximity;

    /**
     * @return Proximity of the finding within which the entire hotword must reside. The total length of the window cannot exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be used to match substrings of the finding itself. For example, the certainty of a phone number regex &#34;\(\d{3}\) \d{3}-\d{4}&#34; could be adjusted upwards if the area code is known to be the local area code of a company office using the hotword regex &#34;\(xxx\)&#34;, where &#34;xxx&#34; is the area code in question.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2ProximityArgs>> proximity() {
        return Optional.ofNullable(this.proximity);
    }

    private GooglePrivacyDlpV2HotwordRuleArgs() {}

    private GooglePrivacyDlpV2HotwordRuleArgs(GooglePrivacyDlpV2HotwordRuleArgs $) {
        this.hotwordRegex = $.hotwordRegex;
        this.likelihoodAdjustment = $.likelihoodAdjustment;
        this.proximity = $.proximity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2HotwordRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2HotwordRuleArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2HotwordRuleArgs();
        }

        public Builder(GooglePrivacyDlpV2HotwordRuleArgs defaults) {
            $ = new GooglePrivacyDlpV2HotwordRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hotwordRegex Regular expression pattern defining what qualifies as a hotword.
         * 
         * @return builder
         * 
         */
        public Builder hotwordRegex(@Nullable Output<GooglePrivacyDlpV2RegexArgs> hotwordRegex) {
            $.hotwordRegex = hotwordRegex;
            return this;
        }

        /**
         * @param hotwordRegex Regular expression pattern defining what qualifies as a hotword.
         * 
         * @return builder
         * 
         */
        public Builder hotwordRegex(GooglePrivacyDlpV2RegexArgs hotwordRegex) {
            return hotwordRegex(Output.of(hotwordRegex));
        }

        /**
         * @param likelihoodAdjustment Likelihood adjustment to apply to all matching findings.
         * 
         * @return builder
         * 
         */
        public Builder likelihoodAdjustment(@Nullable Output<GooglePrivacyDlpV2LikelihoodAdjustmentArgs> likelihoodAdjustment) {
            $.likelihoodAdjustment = likelihoodAdjustment;
            return this;
        }

        /**
         * @param likelihoodAdjustment Likelihood adjustment to apply to all matching findings.
         * 
         * @return builder
         * 
         */
        public Builder likelihoodAdjustment(GooglePrivacyDlpV2LikelihoodAdjustmentArgs likelihoodAdjustment) {
            return likelihoodAdjustment(Output.of(likelihoodAdjustment));
        }

        /**
         * @param proximity Proximity of the finding within which the entire hotword must reside. The total length of the window cannot exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be used to match substrings of the finding itself. For example, the certainty of a phone number regex &#34;\(\d{3}\) \d{3}-\d{4}&#34; could be adjusted upwards if the area code is known to be the local area code of a company office using the hotword regex &#34;\(xxx\)&#34;, where &#34;xxx&#34; is the area code in question.
         * 
         * @return builder
         * 
         */
        public Builder proximity(@Nullable Output<GooglePrivacyDlpV2ProximityArgs> proximity) {
            $.proximity = proximity;
            return this;
        }

        /**
         * @param proximity Proximity of the finding within which the entire hotword must reside. The total length of the window cannot exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be used to match substrings of the finding itself. For example, the certainty of a phone number regex &#34;\(\d{3}\) \d{3}-\d{4}&#34; could be adjusted upwards if the area code is known to be the local area code of a company office using the hotword regex &#34;\(xxx\)&#34;, where &#34;xxx&#34; is the area code in question.
         * 
         * @return builder
         * 
         */
        public Builder proximity(GooglePrivacyDlpV2ProximityArgs proximity) {
            return proximity(Output.of(proximity));
        }

        public GooglePrivacyDlpV2HotwordRuleArgs build() {
            return $;
        }
    }

}
