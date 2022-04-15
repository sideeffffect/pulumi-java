// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RegionInstanceGroupManagerNamedPortGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerNamedPortGetArgs Empty = new RegionInstanceGroupManagerNamedPortGetArgs();

    /**
     * - Version name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The port number.
     * ***
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    public RegionInstanceGroupManagerNamedPortGetArgs(
        Output<String> name,
        Output<Integer> port) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private RegionInstanceGroupManagerNamedPortGetArgs() {
        this.name = Codegen.empty();
        this.port = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerNamedPortGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerNamedPortGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }        public RegionInstanceGroupManagerNamedPortGetArgs build() {
            return new RegionInstanceGroupManagerNamedPortGetArgs(name, port);
        }
    }
}
