// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualService;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecBackend {
    /**
     * @return Specifies a virtual service to use as a backend for a virtual node.
     * 
     */
    private final VirtualNodeSpecBackendVirtualService virtualService;

    @CustomType.Constructor
    private VirtualNodeSpecBackend(@CustomType.Parameter("virtualService") VirtualNodeSpecBackendVirtualService virtualService) {
        this.virtualService = virtualService;
    }

    /**
     * @return Specifies a virtual service to use as a backend for a virtual node.
     * 
     */
    public VirtualNodeSpecBackendVirtualService virtualService() {
        return this.virtualService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackend defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendVirtualService virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder virtualService(VirtualNodeSpecBackendVirtualService virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }        public VirtualNodeSpecBackend build() {
            return new VirtualNodeSpecBackend(virtualService);
        }
    }
}
