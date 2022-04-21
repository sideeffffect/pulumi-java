// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2WordListResponse;
import java.util.Objects;


/**
 * Replace each input value with a value randomly selected from the dictionary.
 * 
 */
public final class GooglePrivacyDlpV2ReplaceDictionaryConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ReplaceDictionaryConfigResponse Empty = new GooglePrivacyDlpV2ReplaceDictionaryConfigResponse();

    /**
     * A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     * 
     */
    @Import(name="wordList", required=true)
    private GooglePrivacyDlpV2WordListResponse wordList;

    public GooglePrivacyDlpV2WordListResponse wordList() {
        return this.wordList;
    }

    private GooglePrivacyDlpV2ReplaceDictionaryConfigResponse() {}

    private GooglePrivacyDlpV2ReplaceDictionaryConfigResponse(GooglePrivacyDlpV2ReplaceDictionaryConfigResponse $) {
        this.wordList = $.wordList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2ReplaceDictionaryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ReplaceDictionaryConfigResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2ReplaceDictionaryConfigResponse();
        }

        public Builder(GooglePrivacyDlpV2ReplaceDictionaryConfigResponse defaults) {
            $ = new GooglePrivacyDlpV2ReplaceDictionaryConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder wordList(GooglePrivacyDlpV2WordListResponse wordList) {
            $.wordList = wordList;
            return this;
        }

        public GooglePrivacyDlpV2ReplaceDictionaryConfigResponse build() {
            $.wordList = Objects.requireNonNull($.wordList, "expected parameter 'wordList' to be non-null");
            return $;
        }
    }

}
