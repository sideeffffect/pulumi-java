// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class VirtualNodeSpecListenerConnectionPoolTcpArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerConnectionPoolTcpArgs Empty = new VirtualNodeSpecListenerConnectionPoolTcpArgs();

    /**
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @InputImport(name="maxConnections", required=true)
      private final Input<Integer> maxConnections;

    public Input<Integer> getMaxConnections() {
        return this.maxConnections;
    }

    public VirtualNodeSpecListenerConnectionPoolTcpArgs(Input<Integer> maxConnections) {
        this.maxConnections = Objects.requireNonNull(maxConnections, "expected parameter 'maxConnections' to be non-null");
    }

    private VirtualNodeSpecListenerConnectionPoolTcpArgs() {
        this.maxConnections = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolTcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolTcpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
        }

        public Builder maxConnections(Input<Integer> maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }

        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Input.of(Objects.requireNonNull(maxConnections));
            return this;
        }
        public VirtualNodeSpecListenerConnectionPoolTcpArgs build() {
            return new VirtualNodeSpecListenerConnectionPoolTcpArgs(maxConnections);
        }
    }
}
