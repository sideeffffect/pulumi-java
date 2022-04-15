// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class UptimeCheckConfigTcpCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigTcpCheckArgs Empty = new UptimeCheckConfigTcpCheckArgs();

    /**
     * The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    public UptimeCheckConfigTcpCheckArgs(Output<Integer> port) {
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private UptimeCheckConfigTcpCheckArgs() {
        this.port = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigTcpCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigTcpCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
        }

        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }        public UptimeCheckConfigTcpCheckArgs build() {
            return new UptimeCheckConfigTcpCheckArgs(port);
        }
    }
}
