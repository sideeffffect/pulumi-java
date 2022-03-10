// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.ServiceMeshAnalysisMessageResponse;
import java.util.List;
import java.util.Objects;


/**
 * **Service Mesh**: State for the whole Hub, as analyzed by the Service Mesh Hub Controller.
 * 
 */
public final class ServiceMeshFeatureStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceMeshFeatureStateResponse Empty = new ServiceMeshFeatureStateResponse();

    /**
     * Results of running Service Mesh analyzers.
     * 
     */
    @InputImport(name="analysisMessages", required=true)
      private final List<ServiceMeshAnalysisMessageResponse> analysisMessages;

    public List<ServiceMeshAnalysisMessageResponse> getAnalysisMessages() {
        return this.analysisMessages;
    }

    public ServiceMeshFeatureStateResponse(List<ServiceMeshAnalysisMessageResponse> analysisMessages) {
        this.analysisMessages = Objects.requireNonNull(analysisMessages, "expected parameter 'analysisMessages' to be non-null");
    }

    private ServiceMeshFeatureStateResponse() {
        this.analysisMessages = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshFeatureStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ServiceMeshAnalysisMessageResponse> analysisMessages;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceMeshFeatureStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisMessages = defaults.analysisMessages;
        }

        public Builder analysisMessages(List<ServiceMeshAnalysisMessageResponse> analysisMessages) {
            this.analysisMessages = Objects.requireNonNull(analysisMessages);
            return this;
        }
        public ServiceMeshFeatureStateResponse build() {
            return new ServiceMeshFeatureStateResponse(analysisMessages);
        }
    }
}
