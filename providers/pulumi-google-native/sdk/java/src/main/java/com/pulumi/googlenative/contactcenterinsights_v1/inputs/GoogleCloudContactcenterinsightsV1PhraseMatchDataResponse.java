// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The data for a matched phrase matcher. Represents information identifying a phrase matcher for a given match.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse Empty = new GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse();

    /**
     * The human-readable name of the phrase matcher.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * The unique identifier (the resource name) of the phrase matcher.
     * 
     */
    @Import(name="phraseMatcher", required=true)
    private String phraseMatcher;

    public String phraseMatcher() {
        return this.phraseMatcher;
    }

    private GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse() {}

    private GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse $) {
        this.displayName = $.displayName;
        this.phraseMatcher = $.phraseMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse(Objects.requireNonNull(defaults));
        }

        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder phraseMatcher(String phraseMatcher) {
            $.phraseMatcher = phraseMatcher;
            return this;
        }

        public GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.phraseMatcher = Objects.requireNonNull($.phraseMatcher, "expected parameter 'phraseMatcher' to be non-null");
            return $;
        }
    }

}
