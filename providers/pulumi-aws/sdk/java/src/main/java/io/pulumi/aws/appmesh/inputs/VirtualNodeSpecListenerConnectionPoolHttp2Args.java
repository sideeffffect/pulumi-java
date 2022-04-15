// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class VirtualNodeSpecListenerConnectionPoolHttp2Args extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerConnectionPoolHttp2Args Empty = new VirtualNodeSpecListenerConnectionPoolHttp2Args();

    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @Import(name="maxRequests", required=true)
      private final Output<Integer> maxRequests;

    public Output<Integer> maxRequests() {
        return this.maxRequests;
    }

    public VirtualNodeSpecListenerConnectionPoolHttp2Args(Output<Integer> maxRequests) {
        this.maxRequests = Objects.requireNonNull(maxRequests, "expected parameter 'maxRequests' to be non-null");
    }

    private VirtualNodeSpecListenerConnectionPoolHttp2Args() {
        this.maxRequests = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolHttp2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolHttp2Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRequests = defaults.maxRequests;
        }

        public Builder maxRequests(Output<Integer> maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }
        public Builder maxRequests(Integer maxRequests) {
            this.maxRequests = Output.of(Objects.requireNonNull(maxRequests));
            return this;
        }        public VirtualNodeSpecListenerConnectionPoolHttp2Args build() {
            return new VirtualNodeSpecListenerConnectionPoolHttp2Args(maxRequests);
        }
    }
}
