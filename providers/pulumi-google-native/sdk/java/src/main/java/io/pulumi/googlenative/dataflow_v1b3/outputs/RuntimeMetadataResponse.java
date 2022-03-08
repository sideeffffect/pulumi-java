// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataflow_v1b3.outputs.ParameterMetadataResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.SDKInfoResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuntimeMetadataResponse {
    /**
     * The parameters for the template.
     * 
     */
    private final List<ParameterMetadataResponse> parameters;
    /**
     * SDK Info for the template.
     * 
     */
    private final SDKInfoResponse sdkInfo;

    @OutputCustomType.Constructor({"parameters","sdkInfo"})
    private RuntimeMetadataResponse(
        List<ParameterMetadataResponse> parameters,
        SDKInfoResponse sdkInfo) {
        this.parameters = parameters;
        this.sdkInfo = sdkInfo;
    }

    /**
     * The parameters for the template.
     * 
    */
    public List<ParameterMetadataResponse> getParameters() {
        return this.parameters;
    }
    /**
     * SDK Info for the template.
     * 
    */
    public SDKInfoResponse getSdkInfo() {
        return this.sdkInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ParameterMetadataResponse> parameters;
        private SDKInfoResponse sdkInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.sdkInfo = defaults.sdkInfo;
        }

        public Builder setParameters(List<ParameterMetadataResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setSdkInfo(SDKInfoResponse sdkInfo) {
            this.sdkInfo = Objects.requireNonNull(sdkInfo);
            return this;
        }
        public RuntimeMetadataResponse build() {
            return new RuntimeMetadataResponse(parameters, sdkInfo);
        }
    }
}
