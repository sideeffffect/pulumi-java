// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualRouterSpecListener;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class VirtualRouterSpec {
    /**
     * The listeners that the virtual router is expected to receive inbound traffic from.
     * Currently only one listener is supported per virtual router.
     * 
     */
    private final VirtualRouterSpecListener listener;

    @OutputCustomType.Constructor({"listener"})
    private VirtualRouterSpec(VirtualRouterSpecListener listener) {
        this.listener = listener;
    }

    /**
     * The listeners that the virtual router is expected to receive inbound traffic from.
     * Currently only one listener is supported per virtual router.
     * 
    */
    public VirtualRouterSpecListener getListener() {
        return this.listener;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualRouterSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualRouterSpecListener listener;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualRouterSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listener = defaults.listener;
        }

        public Builder setListener(VirtualRouterSpecListener listener) {
            this.listener = Objects.requireNonNull(listener);
            return this;
        }
        public VirtualRouterSpec build() {
            return new VirtualRouterSpec(listener);
        }
    }
}
