// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs Empty = new VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs();

    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @InputImport(name="maxRequests", required=true)
      private final Input<Integer> maxRequests;

    public Input<Integer> getMaxRequests() {
        return this.maxRequests;
    }

    public VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs(Input<Integer> maxRequests) {
        this.maxRequests = Objects.requireNonNull(maxRequests, "expected parameter 'maxRequests' to be non-null");
    }

    private VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs() {
        this.maxRequests = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRequests = defaults.maxRequests;
        }

        public Builder maxRequests(Input<Integer> maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }

        public Builder maxRequests(Integer maxRequests) {
            this.maxRequests = Input.of(Objects.requireNonNull(maxRequests));
            return this;
        }
        public VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs build() {
            return new VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs(maxRequests);
        }
    }
}
