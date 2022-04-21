// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Resource request payload of Service Registry
 * 
 */
public final class ServiceRegistryResourceRequestsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceRegistryResourceRequestsResponse Empty = new ServiceRegistryResourceRequestsResponse();

    /**
     * Cpu allocated to each Service Registry instance
     * 
     */
    @Import(name="cpu", required=true)
    private String cpu;

    public String cpu() {
        return this.cpu;
    }

    /**
     * Instance count of the Service Registry
     * 
     */
    @Import(name="instanceCount", required=true)
    private Integer instanceCount;

    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Memory allocated to each Service Registry instance
     * 
     */
    @Import(name="memory", required=true)
    private String memory;

    public String memory() {
        return this.memory;
    }

    private ServiceRegistryResourceRequestsResponse() {}

    private ServiceRegistryResourceRequestsResponse(ServiceRegistryResourceRequestsResponse $) {
        this.cpu = $.cpu;
        this.instanceCount = $.instanceCount;
        this.memory = $.memory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceRegistryResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceRegistryResourceRequestsResponse $;

        public Builder() {
            $ = new ServiceRegistryResourceRequestsResponse();
        }

        public Builder(ServiceRegistryResourceRequestsResponse defaults) {
            $ = new ServiceRegistryResourceRequestsResponse(Objects.requireNonNull(defaults));
        }

        public Builder cpu(String cpu) {
            $.cpu = cpu;
            return this;
        }

        public Builder instanceCount(Integer instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        public Builder memory(String memory) {
            $.memory = memory;
            return this;
        }

        public ServiceRegistryResourceRequestsResponse build() {
            $.cpu = Objects.requireNonNull($.cpu, "expected parameter 'cpu' to be non-null");
            $.instanceCount = Objects.requireNonNull($.instanceCount, "expected parameter 'instanceCount' to be non-null");
            $.memory = Objects.requireNonNull($.memory, "expected parameter 'memory' to be non-null");
            return $;
        }
    }

}
