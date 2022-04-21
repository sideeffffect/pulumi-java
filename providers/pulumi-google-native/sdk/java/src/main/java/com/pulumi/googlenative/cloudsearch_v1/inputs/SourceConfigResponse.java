// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudsearch_v1.inputs.SourceCrowdingConfigResponse;
import com.pulumi.googlenative.cloudsearch_v1.inputs.SourceResponse;
import com.pulumi.googlenative.cloudsearch_v1.inputs.SourceScoringConfigResponse;
import java.util.Objects;


/**
 * Configurations for a source while processing a Search or Suggest request.
 * 
 */
public final class SourceConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SourceConfigResponse Empty = new SourceConfigResponse();

    /**
     * The crowding configuration for the source.
     * 
     */
    @Import(name="crowdingConfig", required=true)
    private SourceCrowdingConfigResponse crowdingConfig;

    public SourceCrowdingConfigResponse crowdingConfig() {
        return this.crowdingConfig;
    }

    /**
     * The scoring configuration for the source.
     * 
     */
    @Import(name="scoringConfig", required=true)
    private SourceScoringConfigResponse scoringConfig;

    public SourceScoringConfigResponse scoringConfig() {
        return this.scoringConfig;
    }

    /**
     * The source for which this configuration is to be used.
     * 
     */
    @Import(name="source", required=true)
    private SourceResponse source;

    public SourceResponse source() {
        return this.source;
    }

    private SourceConfigResponse() {}

    private SourceConfigResponse(SourceConfigResponse $) {
        this.crowdingConfig = $.crowdingConfig;
        this.scoringConfig = $.scoringConfig;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceConfigResponse $;

        public Builder() {
            $ = new SourceConfigResponse();
        }

        public Builder(SourceConfigResponse defaults) {
            $ = new SourceConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder crowdingConfig(SourceCrowdingConfigResponse crowdingConfig) {
            $.crowdingConfig = crowdingConfig;
            return this;
        }

        public Builder scoringConfig(SourceScoringConfigResponse scoringConfig) {
            $.scoringConfig = scoringConfig;
            return this;
        }

        public Builder source(SourceResponse source) {
            $.source = source;
            return this;
        }

        public SourceConfigResponse build() {
            $.crowdingConfig = Objects.requireNonNull($.crowdingConfig, "expected parameter 'crowdingConfig' to be non-null");
            $.scoringConfig = Objects.requireNonNull($.scoringConfig, "expected parameter 'scoringConfig' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
