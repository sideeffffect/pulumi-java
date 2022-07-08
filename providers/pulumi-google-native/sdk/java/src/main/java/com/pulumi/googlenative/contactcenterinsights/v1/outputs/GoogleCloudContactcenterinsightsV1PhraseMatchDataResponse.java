// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse {
    /**
     * @return The human-readable name of the phrase matcher.
     * 
     */
    private final String displayName;
    /**
     * @return The unique identifier (the resource name) of the phrase matcher.
     * 
     */
    private final String phraseMatcher;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("phraseMatcher") String phraseMatcher) {
        this.displayName = displayName;
        this.phraseMatcher = phraseMatcher;
    }

    /**
     * @return The human-readable name of the phrase matcher.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The unique identifier (the resource name) of the phrase matcher.
     * 
     */
    public String phraseMatcher() {
        return this.phraseMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String phraseMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.phraseMatcher = defaults.phraseMatcher;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder phraseMatcher(String phraseMatcher) {
            this.phraseMatcher = Objects.requireNonNull(phraseMatcher);
            return this;
        }        public GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse(displayName, phraseMatcher);
        }
    }
}
