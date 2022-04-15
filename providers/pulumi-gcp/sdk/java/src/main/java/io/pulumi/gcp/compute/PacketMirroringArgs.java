// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.PacketMirroringCollectorIlbArgs;
import io.pulumi.gcp.compute.inputs.PacketMirroringFilterArgs;
import io.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesArgs;
import io.pulumi.gcp.compute.inputs.PacketMirroringNetworkArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringArgs Empty = new PacketMirroringArgs();

    /**
     * The Forwarding Rule resource (of type load_balancing_scheme=INTERNAL)
     * that will be used as collector for mirrored traffic. The
     * specified forwarding rule must have is_mirroring_collector
     * set to true.
     * Structure is documented below.
     * 
     */
    @Import(name="collectorIlb", required=true)
      private final Output<PacketMirroringCollectorIlbArgs> collectorIlb;

    public Output<PacketMirroringCollectorIlbArgs> collectorIlb() {
        return this.collectorIlb;
    }

    /**
     * A human-readable description of the rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A filter for mirrored traffic.  If unset, all traffic is mirrored.
     * Structure is documented below.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<PacketMirroringFilterArgs> filter;

    public Output<PacketMirroringFilterArgs> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * A means of specifying which resources to mirror.
     * Structure is documented below.
     * 
     */
    @Import(name="mirroredResources", required=true)
      private final Output<PacketMirroringMirroredResourcesArgs> mirroredResources;

    public Output<PacketMirroringMirroredResourcesArgs> mirroredResources() {
        return this.mirroredResources;
    }

    /**
     * The name of the packet mirroring rule
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specifies the mirrored VPC network. Only packets in this network
     * will be mirrored. All mirrored VMs should have a NIC in the given
     * network. All mirrored subnetworks should belong to the given network.
     * Structure is documented below.
     * 
     */
    @Import(name="network", required=true)
      private final Output<PacketMirroringNetworkArgs> network;

    public Output<PacketMirroringNetworkArgs> network() {
        return this.network;
    }

    /**
     * Since only one rule can be active at a time, priority is
     * used to break ties in the case of two rules that apply to
     * the same instances.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    public PacketMirroringArgs(
        Output<PacketMirroringCollectorIlbArgs> collectorIlb,
        @Nullable Output<String> description,
        @Nullable Output<PacketMirroringFilterArgs> filter,
        Output<PacketMirroringMirroredResourcesArgs> mirroredResources,
        @Nullable Output<String> name,
        Output<PacketMirroringNetworkArgs> network,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.collectorIlb = Objects.requireNonNull(collectorIlb, "expected parameter 'collectorIlb' to be non-null");
        this.description = description;
        this.filter = filter;
        this.mirroredResources = Objects.requireNonNull(mirroredResources, "expected parameter 'mirroredResources' to be non-null");
        this.name = name;
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.priority = priority;
        this.project = project;
        this.region = region;
    }

    private PacketMirroringArgs() {
        this.collectorIlb = Codegen.empty();
        this.description = Codegen.empty();
        this.filter = Codegen.empty();
        this.mirroredResources = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.priority = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<PacketMirroringCollectorIlbArgs> collectorIlb;
        private @Nullable Output<String> description;
        private @Nullable Output<PacketMirroringFilterArgs> filter;
        private Output<PacketMirroringMirroredResourcesArgs> mirroredResources;
        private @Nullable Output<String> name;
        private Output<PacketMirroringNetworkArgs> network;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectorIlb = defaults.collectorIlb;
    	      this.description = defaults.description;
    	      this.filter = defaults.filter;
    	      this.mirroredResources = defaults.mirroredResources;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder collectorIlb(Output<PacketMirroringCollectorIlbArgs> collectorIlb) {
            this.collectorIlb = Objects.requireNonNull(collectorIlb);
            return this;
        }
        public Builder collectorIlb(PacketMirroringCollectorIlbArgs collectorIlb) {
            this.collectorIlb = Output.of(Objects.requireNonNull(collectorIlb));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder filter(@Nullable Output<PacketMirroringFilterArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable PacketMirroringFilterArgs filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder mirroredResources(Output<PacketMirroringMirroredResourcesArgs> mirroredResources) {
            this.mirroredResources = Objects.requireNonNull(mirroredResources);
            return this;
        }
        public Builder mirroredResources(PacketMirroringMirroredResourcesArgs mirroredResources) {
            this.mirroredResources = Output.of(Objects.requireNonNull(mirroredResources));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(Output<PacketMirroringNetworkArgs> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder network(PacketMirroringNetworkArgs network) {
            this.network = Output.of(Objects.requireNonNull(network));
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }        public PacketMirroringArgs build() {
            return new PacketMirroringArgs(collectorIlb, description, filter, mirroredResources, name, network, priority, project, region);
        }
    }
}
