// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Visibility Metric of the WebACL.
 * 
 */
public final class WebACLVisibilityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLVisibilityConfigArgs Empty = new WebACLVisibilityConfigArgs();

    @InputImport(name="cloudWatchMetricsEnabled", required=true)
      private final Input<Boolean> cloudWatchMetricsEnabled;

    public Input<Boolean> getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    @InputImport(name="metricName", required=true)
      private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    @InputImport(name="sampledRequestsEnabled", required=true)
      private final Input<Boolean> sampledRequestsEnabled;

    public Input<Boolean> getSampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    public WebACLVisibilityConfigArgs(
        Input<Boolean> cloudWatchMetricsEnabled,
        Input<String> metricName,
        Input<Boolean> sampledRequestsEnabled) {
        this.cloudWatchMetricsEnabled = Objects.requireNonNull(cloudWatchMetricsEnabled, "expected parameter 'cloudWatchMetricsEnabled' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled, "expected parameter 'sampledRequestsEnabled' to be non-null");
    }

    private WebACLVisibilityConfigArgs() {
        this.cloudWatchMetricsEnabled = Input.empty();
        this.metricName = Input.empty();
        this.sampledRequestsEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLVisibilityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> cloudWatchMetricsEnabled;
        private Input<String> metricName;
        private Input<Boolean> sampledRequestsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLVisibilityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchMetricsEnabled = defaults.cloudWatchMetricsEnabled;
    	      this.metricName = defaults.metricName;
    	      this.sampledRequestsEnabled = defaults.sampledRequestsEnabled;
        }

        public Builder cloudWatchMetricsEnabled(Input<Boolean> cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = Objects.requireNonNull(cloudWatchMetricsEnabled);
            return this;
        }

        public Builder cloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = Input.of(Objects.requireNonNull(cloudWatchMetricsEnabled));
            return this;
        }

        public Builder metricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder sampledRequestsEnabled(Input<Boolean> sampledRequestsEnabled) {
            this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled);
            return this;
        }

        public Builder sampledRequestsEnabled(Boolean sampledRequestsEnabled) {
            this.sampledRequestsEnabled = Input.of(Objects.requireNonNull(sampledRequestsEnabled));
            return this;
        }
        public WebACLVisibilityConfigArgs build() {
            return new WebACLVisibilityConfigArgs(cloudWatchMetricsEnabled, metricName, sampledRequestsEnabled);
        }
    }
}
