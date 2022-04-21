// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Strategy that specifies how clients of Google Service Controller want to send traffic to use different config versions. This is generally used by API proxy to split traffic based on your configured percentage for each config version. One example of how to gradually rollout a new service configuration using this strategy: Day 1 Rollout { id: &#34;example.googleapis.com/rollout_20160206&#34; traffic_percent_strategy { percentages: { &#34;example.googleapis.com/20160201&#34;: 70.00 &#34;example.googleapis.com/20160206&#34;: 30.00 } } } Day 2 Rollout { id: &#34;example.googleapis.com/rollout_20160207&#34; traffic_percent_strategy: { percentages: { &#34;example.googleapis.com/20160206&#34;: 100.00 } } }
 * 
 */
public final class TrafficPercentStrategyResponse extends com.pulumi.resources.InvokeArgs {

    public static final TrafficPercentStrategyResponse Empty = new TrafficPercentStrategyResponse();

    /**
     * Maps service configuration IDs to their corresponding traffic percentage. Key is the service configuration ID, Value is the traffic percentage which must be greater than 0.0 and the sum must equal to 100.0.
     * 
     */
    @Import(name="percentages", required=true)
    private Map<String,String> percentages;

    public Map<String,String> percentages() {
        return this.percentages;
    }

    private TrafficPercentStrategyResponse() {}

    private TrafficPercentStrategyResponse(TrafficPercentStrategyResponse $) {
        this.percentages = $.percentages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficPercentStrategyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficPercentStrategyResponse $;

        public Builder() {
            $ = new TrafficPercentStrategyResponse();
        }

        public Builder(TrafficPercentStrategyResponse defaults) {
            $ = new TrafficPercentStrategyResponse(Objects.requireNonNull(defaults));
        }

        public Builder percentages(Map<String,String> percentages) {
            $.percentages = percentages;
            return this;
        }

        public TrafficPercentStrategyResponse build() {
            $.percentages = Objects.requireNonNull($.percentages, "expected parameter 'percentages' to be non-null");
            return $;
        }
    }

}
