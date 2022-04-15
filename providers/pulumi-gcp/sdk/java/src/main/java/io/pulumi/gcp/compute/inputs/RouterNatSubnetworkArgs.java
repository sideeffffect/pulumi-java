// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterNatSubnetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatSubnetworkArgs Empty = new RouterNatSubnetworkArgs();

    /**
     * Self-link of subnetwork to NAT
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * List of the secondary ranges of the subnetwork that are allowed
     * to use NAT. This can be populated only if
     * `LIST_OF_SECONDARY_IP_RANGES` is one of the values in
     * sourceIpRangesToNat
     * 
     */
    @Import(name="secondaryIpRangeNames")
      private final @Nullable Output<List<String>> secondaryIpRangeNames;

    public Output<List<String>> secondaryIpRangeNames() {
        return this.secondaryIpRangeNames == null ? Codegen.empty() : this.secondaryIpRangeNames;
    }

    /**
     * List of options for which source IPs in the subnetwork
     * should have NAT enabled. Supported values include:
     * `ALL_IP_RANGES`, `LIST_OF_SECONDARY_IP_RANGES`,
     * `PRIMARY_IP_RANGE`.
     * 
     */
    @Import(name="sourceIpRangesToNats", required=true)
      private final Output<List<String>> sourceIpRangesToNats;

    public Output<List<String>> sourceIpRangesToNats() {
        return this.sourceIpRangesToNats;
    }

    public RouterNatSubnetworkArgs(
        Output<String> name,
        @Nullable Output<List<String>> secondaryIpRangeNames,
        Output<List<String>> sourceIpRangesToNats) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secondaryIpRangeNames = secondaryIpRangeNames;
        this.sourceIpRangesToNats = Objects.requireNonNull(sourceIpRangesToNats, "expected parameter 'sourceIpRangesToNats' to be non-null");
    }

    private RouterNatSubnetworkArgs() {
        this.name = Codegen.empty();
        this.secondaryIpRangeNames = Codegen.empty();
        this.sourceIpRangesToNats = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatSubnetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private @Nullable Output<List<String>> secondaryIpRangeNames;
        private Output<List<String>> sourceIpRangesToNats;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatSubnetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secondaryIpRangeNames = defaults.secondaryIpRangeNames;
    	      this.sourceIpRangesToNats = defaults.sourceIpRangesToNats;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder secondaryIpRangeNames(@Nullable Output<List<String>> secondaryIpRangeNames) {
            this.secondaryIpRangeNames = secondaryIpRangeNames;
            return this;
        }
        public Builder secondaryIpRangeNames(@Nullable List<String> secondaryIpRangeNames) {
            this.secondaryIpRangeNames = Codegen.ofNullable(secondaryIpRangeNames);
            return this;
        }
        public Builder secondaryIpRangeNames(String... secondaryIpRangeNames) {
            return secondaryIpRangeNames(List.of(secondaryIpRangeNames));
        }
        public Builder sourceIpRangesToNats(Output<List<String>> sourceIpRangesToNats) {
            this.sourceIpRangesToNats = Objects.requireNonNull(sourceIpRangesToNats);
            return this;
        }
        public Builder sourceIpRangesToNats(List<String> sourceIpRangesToNats) {
            this.sourceIpRangesToNats = Output.of(Objects.requireNonNull(sourceIpRangesToNats));
            return this;
        }
        public Builder sourceIpRangesToNats(String... sourceIpRangesToNats) {
            return sourceIpRangesToNats(List.of(sourceIpRangesToNats));
        }        public RouterNatSubnetworkArgs build() {
            return new RouterNatSubnetworkArgs(name, secondaryIpRangeNames, sourceIpRangesToNats);
        }
    }
}
