// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayResourceRequestsResponse {
    /**
     * @return Cpu allocated to each Spring Cloud Gateway instance.
     * 
     */
    private final @Nullable String cpu;
    /**
     * @return Memory allocated to each Spring Cloud Gateway instance.
     * 
     */
    private final @Nullable String memory;

    @CustomType.Constructor
    private GatewayResourceRequestsResponse(
        @CustomType.Parameter("cpu") @Nullable String cpu,
        @CustomType.Parameter("memory") @Nullable String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    /**
     * @return Cpu allocated to each Spring Cloud Gateway instance.
     * 
     */
    public Optional<String> cpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * @return Memory allocated to each Spring Cloud Gateway instance.
     * 
     */
    public Optional<String> memory() {
        return Optional.ofNullable(this.memory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cpu;
        private @Nullable String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayResourceRequestsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memory = defaults.memory;
        }

        public Builder cpu(@Nullable String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder memory(@Nullable String memory) {
            this.memory = memory;
            return this;
        }        public GatewayResourceRequestsResponse build() {
            return new GatewayResourceRequestsResponse(cpu, memory);
        }
    }
}
