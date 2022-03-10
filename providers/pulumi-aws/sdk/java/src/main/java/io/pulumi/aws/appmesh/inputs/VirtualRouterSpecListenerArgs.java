// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualRouterSpecListenerPortMappingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class VirtualRouterSpecListenerArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualRouterSpecListenerArgs Empty = new VirtualRouterSpecListenerArgs();

    /**
     * The port mapping information for the listener.
     * 
     */
    @InputImport(name="portMapping", required=true)
      private final Input<VirtualRouterSpecListenerPortMappingArgs> portMapping;

    public Input<VirtualRouterSpecListenerPortMappingArgs> getPortMapping() {
        return this.portMapping;
    }

    public VirtualRouterSpecListenerArgs(Input<VirtualRouterSpecListenerPortMappingArgs> portMapping) {
        this.portMapping = Objects.requireNonNull(portMapping, "expected parameter 'portMapping' to be non-null");
    }

    private VirtualRouterSpecListenerArgs() {
        this.portMapping = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualRouterSpecListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<VirtualRouterSpecListenerPortMappingArgs> portMapping;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualRouterSpecListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portMapping = defaults.portMapping;
        }

        public Builder portMapping(Input<VirtualRouterSpecListenerPortMappingArgs> portMapping) {
            this.portMapping = Objects.requireNonNull(portMapping);
            return this;
        }

        public Builder portMapping(VirtualRouterSpecListenerPortMappingArgs portMapping) {
            this.portMapping = Input.of(Objects.requireNonNull(portMapping));
            return this;
        }
        public VirtualRouterSpecListenerArgs build() {
            return new VirtualRouterSpecListenerArgs(portMapping);
        }
    }
}
