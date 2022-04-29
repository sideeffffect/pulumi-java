// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetFleetMetricArgs extends InvokeArgs {

    public static final GetFleetMetricArgs Empty = new GetFleetMetricArgs();

    /**
     * The name of the fleet metric
     * 
     */
    @Import(name="metricName", required=true)
    private String metricName;

    /**
     * @return The name of the fleet metric
     * 
     */
    public String metricName() {
        return this.metricName;
    }

    private GetFleetMetricArgs() {}

    private GetFleetMetricArgs(GetFleetMetricArgs $) {
        this.metricName = $.metricName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFleetMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFleetMetricArgs $;

        public Builder() {
            $ = new GetFleetMetricArgs();
        }

        public Builder(GetFleetMetricArgs defaults) {
            $ = new GetFleetMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricName The name of the fleet metric
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            $.metricName = metricName;
            return this;
        }

        public GetFleetMetricArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            return $;
        }
    }

}
