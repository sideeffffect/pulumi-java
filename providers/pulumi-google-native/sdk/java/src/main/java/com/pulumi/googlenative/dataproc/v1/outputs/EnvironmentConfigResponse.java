// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc.v1.outputs.ExecutionConfigResponse;
import com.pulumi.googlenative.dataproc.v1.outputs.PeripheralsConfigResponse;
import java.util.Objects;

@CustomType
public final class EnvironmentConfigResponse {
    /**
     * @return Optional. Execution configuration for a workload.
     * 
     */
    private final ExecutionConfigResponse executionConfig;
    /**
     * @return Optional. Peripherals configuration that workload has access to.
     * 
     */
    private final PeripheralsConfigResponse peripheralsConfig;

    @CustomType.Constructor
    private EnvironmentConfigResponse(
        @CustomType.Parameter("executionConfig") ExecutionConfigResponse executionConfig,
        @CustomType.Parameter("peripheralsConfig") PeripheralsConfigResponse peripheralsConfig) {
        this.executionConfig = executionConfig;
        this.peripheralsConfig = peripheralsConfig;
    }

    /**
     * @return Optional. Execution configuration for a workload.
     * 
     */
    public ExecutionConfigResponse executionConfig() {
        return this.executionConfig;
    }
    /**
     * @return Optional. Peripherals configuration that workload has access to.
     * 
     */
    public PeripheralsConfigResponse peripheralsConfig() {
        return this.peripheralsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutionConfigResponse executionConfig;
        private PeripheralsConfigResponse peripheralsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionConfig = defaults.executionConfig;
    	      this.peripheralsConfig = defaults.peripheralsConfig;
        }

        public Builder executionConfig(ExecutionConfigResponse executionConfig) {
            this.executionConfig = Objects.requireNonNull(executionConfig);
            return this;
        }
        public Builder peripheralsConfig(PeripheralsConfigResponse peripheralsConfig) {
            this.peripheralsConfig = Objects.requireNonNull(peripheralsConfig);
            return this;
        }        public EnvironmentConfigResponse build() {
            return new EnvironmentConfigResponse(executionConfig, peripheralsConfig);
        }
    }
}
