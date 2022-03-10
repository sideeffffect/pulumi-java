// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1TestConfigResponse {
    /**
     * Flow name. If not set, default start flow is assumed. Format: `projects//locations//agents//flows/`.
     * 
     */
    private final String flow;
    /**
     * Session parameters to be compared when calculating differences.
     * 
     */
    private final List<String> trackingParameters;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1TestConfigResponse(
        @OutputCustomType.Parameter("flow") String flow,
        @OutputCustomType.Parameter("trackingParameters") List<String> trackingParameters) {
        this.flow = flow;
        this.trackingParameters = trackingParameters;
    }

    /**
     * Flow name. If not set, default start flow is assumed. Format: `projects//locations//agents//flows/`.
     * 
    */
    public String getFlow() {
        return this.flow;
    }
    /**
     * Session parameters to be compared when calculating differences.
     * 
    */
    public List<String> getTrackingParameters() {
        return this.trackingParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1TestConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flow;
        private List<String> trackingParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TestConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flow = defaults.flow;
    	      this.trackingParameters = defaults.trackingParameters;
        }

        public Builder flow(String flow) {
            this.flow = Objects.requireNonNull(flow);
            return this;
        }

        public Builder trackingParameters(List<String> trackingParameters) {
            this.trackingParameters = Objects.requireNonNull(trackingParameters);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1TestConfigResponse build() {
            return new GoogleCloudDialogflowCxV3beta1TestConfigResponse(flow, trackingParameters);
        }
    }
}
