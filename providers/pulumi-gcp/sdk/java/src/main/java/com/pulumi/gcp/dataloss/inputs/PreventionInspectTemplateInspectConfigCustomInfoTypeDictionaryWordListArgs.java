// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs extends ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs Empty = new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs();

    /**
     * Words or phrases defining the dictionary. The dictionary must contain at least one
     * phrase and every phrase must contain at least 2 characters that are letters or digits.
     * 
     */
    @Import(name="words", required=true)
    private Output<List<String>> words;

    /**
     * @return Words or phrases defining the dictionary. The dictionary must contain at least one
     * phrase and every phrase must contain at least 2 characters that are letters or digits.
     * 
     */
    public Output<List<String>> words() {
        return this.words;
    }

    private PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs() {}

    private PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs $) {
        this.words = $.words;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param words Words or phrases defining the dictionary. The dictionary must contain at least one
         * phrase and every phrase must contain at least 2 characters that are letters or digits.
         * 
         * @return builder
         * 
         */
        public Builder words(Output<List<String>> words) {
            $.words = words;
            return this;
        }

        /**
         * @param words Words or phrases defining the dictionary. The dictionary must contain at least one
         * phrase and every phrase must contain at least 2 characters that are letters or digits.
         * 
         * @return builder
         * 
         */
        public Builder words(List<String> words) {
            return words(Output.of(words));
        }

        /**
         * @param words Words or phrases defining the dictionary. The dictionary must contain at least one
         * phrase and every phrase must contain at least 2 characters that are letters or digits.
         * 
         * @return builder
         * 
         */
        public Builder words(String... words) {
            return words(List.of(words));
        }

        public PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs build() {
            $.words = Objects.requireNonNull($.words, "expected parameter 'words' to be non-null");
            return $;
        }
    }

}
