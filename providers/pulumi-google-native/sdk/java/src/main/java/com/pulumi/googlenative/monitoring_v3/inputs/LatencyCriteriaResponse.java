// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Parameters for a latency threshold SLI.
 * 
 */
public final class LatencyCriteriaResponse extends com.pulumi.resources.InvokeArgs {

    public static final LatencyCriteriaResponse Empty = new LatencyCriteriaResponse();

    /**
     * Good service is defined to be the count of requests made to this service that return in no more than threshold.
     * 
     */
    @Import(name="threshold", required=true)
    private String threshold;

    public String threshold() {
        return this.threshold;
    }

    private LatencyCriteriaResponse() {}

    private LatencyCriteriaResponse(LatencyCriteriaResponse $) {
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LatencyCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LatencyCriteriaResponse $;

        public Builder() {
            $ = new LatencyCriteriaResponse();
        }

        public Builder(LatencyCriteriaResponse defaults) {
            $ = new LatencyCriteriaResponse(Objects.requireNonNull(defaults));
        }

        public Builder threshold(String threshold) {
            $.threshold = threshold;
            return this;
        }

        public LatencyCriteriaResponse build() {
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            return $;
        }
    }

}
