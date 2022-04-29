// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeRegexArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigCustomInfoTypeArgs extends ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigCustomInfoTypeArgs Empty = new PreventionInspectTemplateInspectConfigCustomInfoTypeArgs();

    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="dictionary")
    private @Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs> dictionary;

    /**
     * @return Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs>> dictionary() {
        return Optional.ofNullable(this.dictionary);
    }

    /**
     * If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding to be returned. It still can be used for rules matching.
     * Possible values are `EXCLUSION_TYPE_EXCLUDE`.
     * 
     */
    @Import(name="exclusionType")
    private @Nullable Output<String> exclusionType;

    /**
     * @return If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding to be returned. It still can be used for rules matching.
     * Possible values are `EXCLUSION_TYPE_EXCLUDE`.
     * 
     */
    public Optional<Output<String>> exclusionType() {
        return Optional.ofNullable(this.exclusionType);
    }

    /**
     * CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
     * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
     * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
     * treated as a custom info type.
     * Structure is documented below.
     * 
     */
    @Import(name="infoType", required=true)
    private Output<PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs> infoType;

    /**
     * @return CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
     * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
     * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
     * treated as a custom info type.
     * Structure is documented below.
     * 
     */
    public Output<PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs> infoType() {
        return this.infoType;
    }

    /**
     * Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria
     * specified by the rule.
     * Default value is `VERY_LIKELY`.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
     * 
     */
    @Import(name="likelihood")
    private @Nullable Output<String> likelihood;

    /**
     * @return Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria
     * specified by the rule.
     * Default value is `VERY_LIKELY`.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
     * 
     */
    public Optional<Output<String>> likelihood() {
        return Optional.ofNullable(this.likelihood);
    }

    /**
     * Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeRegexArgs> regex;

    /**
     * @return Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionInspectTemplateInspectConfigCustomInfoTypeRegexArgs>> regex() {
        return Optional.ofNullable(this.regex);
    }

    /**
     * A reference to a StoredInfoType to use with scanning.
     * Structure is documented below.
     * 
     */
    @Import(name="storedType")
    private @Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs> storedType;

    /**
     * @return A reference to a StoredInfoType to use with scanning.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs>> storedType() {
        return Optional.ofNullable(this.storedType);
    }

    private PreventionInspectTemplateInspectConfigCustomInfoTypeArgs() {}

    private PreventionInspectTemplateInspectConfigCustomInfoTypeArgs(PreventionInspectTemplateInspectConfigCustomInfoTypeArgs $) {
        this.dictionary = $.dictionary;
        this.exclusionType = $.exclusionType;
        this.infoType = $.infoType;
        this.likelihood = $.likelihood;
        this.regex = $.regex;
        this.storedType = $.storedType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigCustomInfoTypeArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigCustomInfoTypeArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigCustomInfoTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dictionary Dictionary which defines the rule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dictionary(@Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs> dictionary) {
            $.dictionary = dictionary;
            return this;
        }

        /**
         * @param dictionary Dictionary which defines the rule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dictionary(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs dictionary) {
            return dictionary(Output.of(dictionary));
        }

        /**
         * @param exclusionType If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding to be returned. It still can be used for rules matching.
         * Possible values are `EXCLUSION_TYPE_EXCLUDE`.
         * 
         * @return builder
         * 
         */
        public Builder exclusionType(@Nullable Output<String> exclusionType) {
            $.exclusionType = exclusionType;
            return this;
        }

        /**
         * @param exclusionType If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding to be returned. It still can be used for rules matching.
         * Possible values are `EXCLUSION_TYPE_EXCLUDE`.
         * 
         * @return builder
         * 
         */
        public Builder exclusionType(String exclusionType) {
            return exclusionType(Output.of(exclusionType));
        }

        /**
         * @param infoType CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
         * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
         * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
         * treated as a custom info type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder infoType(Output<PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs> infoType) {
            $.infoType = infoType;
            return this;
        }

        /**
         * @param infoType CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
         * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
         * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
         * treated as a custom info type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder infoType(PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs infoType) {
            return infoType(Output.of(infoType));
        }

        /**
         * @param likelihood Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria
         * specified by the rule.
         * Default value is `VERY_LIKELY`.
         * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
         * 
         * @return builder
         * 
         */
        public Builder likelihood(@Nullable Output<String> likelihood) {
            $.likelihood = likelihood;
            return this;
        }

        /**
         * @param likelihood Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria
         * specified by the rule.
         * Default value is `VERY_LIKELY`.
         * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
         * 
         * @return builder
         * 
         */
        public Builder likelihood(String likelihood) {
            return likelihood(Output.of(likelihood));
        }

        /**
         * @param regex Regular expression which defines the rule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeRegexArgs> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex Regular expression which defines the rule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder regex(PreventionInspectTemplateInspectConfigCustomInfoTypeRegexArgs regex) {
            return regex(Output.of(regex));
        }

        /**
         * @param storedType A reference to a StoredInfoType to use with scanning.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storedType(@Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs> storedType) {
            $.storedType = storedType;
            return this;
        }

        /**
         * @param storedType A reference to a StoredInfoType to use with scanning.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storedType(PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs storedType) {
            return storedType(Output.of(storedType));
        }

        public PreventionInspectTemplateInspectConfigCustomInfoTypeArgs build() {
            $.infoType = Objects.requireNonNull($.infoType, "expected parameter 'infoType' to be non-null");
            return $;
        }
    }

}
