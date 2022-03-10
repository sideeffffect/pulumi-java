// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DetectionRuleResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DictionaryResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RegexResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2StoredTypeResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2SurrogateTypeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Custom information type provided by the user. Used to find domain-specific sensitive information configurable to the data in question.
 * 
 */
public final class GooglePrivacyDlpV2CustomInfoTypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2CustomInfoTypeResponse Empty = new GooglePrivacyDlpV2CustomInfoTypeResponse();

    /**
     * Set of detection rules to apply to all findings of this CustomInfoType. Rules are applied in order that they are specified. Not supported for the `surrogate_type` CustomInfoType.
     * 
     */
    @InputImport(name="detectionRules", required=true)
      private final List<GooglePrivacyDlpV2DetectionRuleResponse> detectionRules;

    public List<GooglePrivacyDlpV2DetectionRuleResponse> getDetectionRules() {
        return this.detectionRules;
    }

    /**
     * A list of phrases to detect as a CustomInfoType.
     * 
     */
    @InputImport(name="dictionary", required=true)
      private final GooglePrivacyDlpV2DictionaryResponse dictionary;

    public GooglePrivacyDlpV2DictionaryResponse getDictionary() {
        return this.dictionary;
    }

    /**
     * If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding to be returned. It still can be used for rules matching.
     * 
     */
    @InputImport(name="exclusionType", required=true)
      private final String exclusionType;

    public String getExclusionType() {
        return this.exclusionType;
    }

    /**
     * CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing infoTypes and that infoType is specified in `InspectContent.info_types` field. Specifying the latter adds findings to the one detected by the system. If built-in info type is not specified in `InspectContent.info_types` list then the name is treated as a custom info type.
     * 
     */
    @InputImport(name="infoType", required=true)
      private final GooglePrivacyDlpV2InfoTypeResponse infoType;

    public GooglePrivacyDlpV2InfoTypeResponse getInfoType() {
        return this.infoType;
    }

    /**
     * Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria specified by the rule. Defaults to `VERY_LIKELY` if not specified.
     * 
     */
    @InputImport(name="likelihood", required=true)
      private final String likelihood;

    public String getLikelihood() {
        return this.likelihood;
    }

    /**
     * Regular expression based CustomInfoType.
     * 
     */
    @InputImport(name="regex", required=true)
      private final GooglePrivacyDlpV2RegexResponse regex;

    public GooglePrivacyDlpV2RegexResponse getRegex() {
        return this.regex;
    }

    /**
     * Load an existing `StoredInfoType` resource for use in `InspectDataSource`. Not currently supported in `InspectContent`.
     * 
     */
    @InputImport(name="storedType", required=true)
      private final GooglePrivacyDlpV2StoredTypeResponse storedType;

    public GooglePrivacyDlpV2StoredTypeResponse getStoredType() {
        return this.storedType;
    }

    /**
     * Message for detecting output from deidentification transformations that support reversing.
     * 
     */
    @InputImport(name="surrogateType", required=true)
      private final GooglePrivacyDlpV2SurrogateTypeResponse surrogateType;

    public GooglePrivacyDlpV2SurrogateTypeResponse getSurrogateType() {
        return this.surrogateType;
    }

    public GooglePrivacyDlpV2CustomInfoTypeResponse(
        List<GooglePrivacyDlpV2DetectionRuleResponse> detectionRules,
        GooglePrivacyDlpV2DictionaryResponse dictionary,
        String exclusionType,
        GooglePrivacyDlpV2InfoTypeResponse infoType,
        String likelihood,
        GooglePrivacyDlpV2RegexResponse regex,
        GooglePrivacyDlpV2StoredTypeResponse storedType,
        GooglePrivacyDlpV2SurrogateTypeResponse surrogateType) {
        this.detectionRules = Objects.requireNonNull(detectionRules, "expected parameter 'detectionRules' to be non-null");
        this.dictionary = Objects.requireNonNull(dictionary, "expected parameter 'dictionary' to be non-null");
        this.exclusionType = Objects.requireNonNull(exclusionType, "expected parameter 'exclusionType' to be non-null");
        this.infoType = Objects.requireNonNull(infoType, "expected parameter 'infoType' to be non-null");
        this.likelihood = Objects.requireNonNull(likelihood, "expected parameter 'likelihood' to be non-null");
        this.regex = Objects.requireNonNull(regex, "expected parameter 'regex' to be non-null");
        this.storedType = Objects.requireNonNull(storedType, "expected parameter 'storedType' to be non-null");
        this.surrogateType = Objects.requireNonNull(surrogateType, "expected parameter 'surrogateType' to be non-null");
    }

    private GooglePrivacyDlpV2CustomInfoTypeResponse() {
        this.detectionRules = List.of();
        this.dictionary = null;
        this.exclusionType = null;
        this.infoType = null;
        this.likelihood = null;
        this.regex = null;
        this.storedType = null;
        this.surrogateType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CustomInfoTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2DetectionRuleResponse> detectionRules;
        private GooglePrivacyDlpV2DictionaryResponse dictionary;
        private String exclusionType;
        private GooglePrivacyDlpV2InfoTypeResponse infoType;
        private String likelihood;
        private GooglePrivacyDlpV2RegexResponse regex;
        private GooglePrivacyDlpV2StoredTypeResponse storedType;
        private GooglePrivacyDlpV2SurrogateTypeResponse surrogateType;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CustomInfoTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectionRules = defaults.detectionRules;
    	      this.dictionary = defaults.dictionary;
    	      this.exclusionType = defaults.exclusionType;
    	      this.infoType = defaults.infoType;
    	      this.likelihood = defaults.likelihood;
    	      this.regex = defaults.regex;
    	      this.storedType = defaults.storedType;
    	      this.surrogateType = defaults.surrogateType;
        }

        public Builder detectionRules(List<GooglePrivacyDlpV2DetectionRuleResponse> detectionRules) {
            this.detectionRules = Objects.requireNonNull(detectionRules);
            return this;
        }

        public Builder dictionary(GooglePrivacyDlpV2DictionaryResponse dictionary) {
            this.dictionary = Objects.requireNonNull(dictionary);
            return this;
        }

        public Builder exclusionType(String exclusionType) {
            this.exclusionType = Objects.requireNonNull(exclusionType);
            return this;
        }

        public Builder infoType(GooglePrivacyDlpV2InfoTypeResponse infoType) {
            this.infoType = Objects.requireNonNull(infoType);
            return this;
        }

        public Builder likelihood(String likelihood) {
            this.likelihood = Objects.requireNonNull(likelihood);
            return this;
        }

        public Builder regex(GooglePrivacyDlpV2RegexResponse regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }

        public Builder storedType(GooglePrivacyDlpV2StoredTypeResponse storedType) {
            this.storedType = Objects.requireNonNull(storedType);
            return this;
        }

        public Builder surrogateType(GooglePrivacyDlpV2SurrogateTypeResponse surrogateType) {
            this.surrogateType = Objects.requireNonNull(surrogateType);
            return this;
        }
        public GooglePrivacyDlpV2CustomInfoTypeResponse build() {
            return new GooglePrivacyDlpV2CustomInfoTypeResponse(detectionRules, dictionary, exclusionType, infoType, likelihood, regex, storedType, surrogateType);
        }
    }
}
