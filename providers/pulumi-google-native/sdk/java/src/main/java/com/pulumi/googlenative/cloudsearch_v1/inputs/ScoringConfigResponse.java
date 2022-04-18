// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Scoring configurations for a source while processing a Search or Suggest request.
 * 
 */
public final class ScoringConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScoringConfigResponse Empty = new ScoringConfigResponse();

    /**
     * Whether to use freshness as a ranking signal. By default, freshness is used as a ranking signal. Note that this setting is not available in the Admin UI.
     * 
     */
    @Import(name="disableFreshness", required=true)
      private final Boolean disableFreshness;

    public Boolean disableFreshness() {
        return this.disableFreshness;
    }

    /**
     * Whether to personalize the results. By default, personal signals will be used to boost results.
     * 
     */
    @Import(name="disablePersonalization", required=true)
      private final Boolean disablePersonalization;

    public Boolean disablePersonalization() {
        return this.disablePersonalization;
    }

    public ScoringConfigResponse(
        Boolean disableFreshness,
        Boolean disablePersonalization) {
        this.disableFreshness = Objects.requireNonNull(disableFreshness, "expected parameter 'disableFreshness' to be non-null");
        this.disablePersonalization = Objects.requireNonNull(disablePersonalization, "expected parameter 'disablePersonalization' to be non-null");
    }

    private ScoringConfigResponse() {
        this.disableFreshness = null;
        this.disablePersonalization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScoringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableFreshness;
        private Boolean disablePersonalization;

        public Builder() {
    	      // Empty
        }

        public Builder(ScoringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableFreshness = defaults.disableFreshness;
    	      this.disablePersonalization = defaults.disablePersonalization;
        }

        public Builder disableFreshness(Boolean disableFreshness) {
            this.disableFreshness = Objects.requireNonNull(disableFreshness);
            return this;
        }
        public Builder disablePersonalization(Boolean disablePersonalization) {
            this.disablePersonalization = Objects.requireNonNull(disablePersonalization);
            return this;
        }        public ScoringConfigResponse build() {
            return new ScoringConfigResponse(disableFreshness, disablePersonalization);
        }
    }
}
