// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs extends ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs();

    /**
     * Characters to not transform when masking.
     * 
     */
    @Import(name="charactersToSkip")
    private @Nullable Output<String> charactersToSkip;

    /**
     * @return Characters to not transform when masking.
     * 
     */
    public Optional<Output<String>> charactersToSkip() {
        return Optional.ofNullable(this.charactersToSkip);
    }

    /**
     * Common characters to not transform when masking. Useful to avoid removing punctuation.
     * Possible values are `NUMERIC`, `ALPHA_UPPER_CASE`, `ALPHA_LOWER_CASE`, `PUNCTUATION`, and `WHITESPACE`.
     * 
     */
    @Import(name="commonCharactersToIgnore")
    private @Nullable Output<String> commonCharactersToIgnore;

    /**
     * @return Common characters to not transform when masking. Useful to avoid removing punctuation.
     * Possible values are `NUMERIC`, `ALPHA_UPPER_CASE`, `ALPHA_LOWER_CASE`, `PUNCTUATION`, and `WHITESPACE`.
     * 
     */
    public Optional<Output<String>> commonCharactersToIgnore() {
        return Optional.ofNullable(this.commonCharactersToIgnore);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs $) {
        this.charactersToSkip = $.charactersToSkip;
        this.commonCharactersToIgnore = $.commonCharactersToIgnore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param charactersToSkip Characters to not transform when masking.
         * 
         * @return builder
         * 
         */
        public Builder charactersToSkip(@Nullable Output<String> charactersToSkip) {
            $.charactersToSkip = charactersToSkip;
            return this;
        }

        /**
         * @param charactersToSkip Characters to not transform when masking.
         * 
         * @return builder
         * 
         */
        public Builder charactersToSkip(String charactersToSkip) {
            return charactersToSkip(Output.of(charactersToSkip));
        }

        /**
         * @param commonCharactersToIgnore Common characters to not transform when masking. Useful to avoid removing punctuation.
         * Possible values are `NUMERIC`, `ALPHA_UPPER_CASE`, `ALPHA_LOWER_CASE`, `PUNCTUATION`, and `WHITESPACE`.
         * 
         * @return builder
         * 
         */
        public Builder commonCharactersToIgnore(@Nullable Output<String> commonCharactersToIgnore) {
            $.commonCharactersToIgnore = commonCharactersToIgnore;
            return this;
        }

        /**
         * @param commonCharactersToIgnore Common characters to not transform when masking. Useful to avoid removing punctuation.
         * Possible values are `NUMERIC`, `ALPHA_UPPER_CASE`, `ALPHA_LOWER_CASE`, `PUNCTUATION`, and `WHITESPACE`.
         * 
         * @return builder
         * 
         */
        public Builder commonCharactersToIgnore(String commonCharactersToIgnore) {
            return commonCharactersToIgnore(Output.of(commonCharactersToIgnore));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs build() {
            return $;
        }
    }

}
