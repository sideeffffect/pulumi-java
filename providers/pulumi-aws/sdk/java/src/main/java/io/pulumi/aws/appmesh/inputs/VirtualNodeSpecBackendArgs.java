// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class VirtualNodeSpecBackendArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendArgs Empty = new VirtualNodeSpecBackendArgs();

    /**
     * Specifies a virtual service to use as a backend for a virtual node.
     * 
     */
    @InputImport(name="virtualService", required=true)
      private final Input<VirtualNodeSpecBackendVirtualServiceArgs> virtualService;

    public Input<VirtualNodeSpecBackendVirtualServiceArgs> getVirtualService() {
        return this.virtualService;
    }

    public VirtualNodeSpecBackendArgs(Input<VirtualNodeSpecBackendVirtualServiceArgs> virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService, "expected parameter 'virtualService' to be non-null");
    }

    private VirtualNodeSpecBackendArgs() {
        this.virtualService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<VirtualNodeSpecBackendVirtualServiceArgs> virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder virtualService(Input<VirtualNodeSpecBackendVirtualServiceArgs> virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }

        public Builder virtualService(VirtualNodeSpecBackendVirtualServiceArgs virtualService) {
            this.virtualService = Input.of(Objects.requireNonNull(virtualService));
            return this;
        }
        public VirtualNodeSpecBackendArgs build() {
            return new VirtualNodeSpecBackendArgs(virtualService);
        }
    }
}
