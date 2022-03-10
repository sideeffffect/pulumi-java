// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="collectorIlb", required=true)
      private final Input<PacketMirroringCollectorIlbArgs> collectorIlb;

    public Input<PacketMirroringCollectorIlbArgs> getCollectorIlb() {
        return this.collectorIlb;
    }

    /**
     * A human-readable description of the rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A filter for mirrored traffic.  If unset, all traffic is mirrored.
     * Structure is documented below.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<PacketMirroringFilterArgs> filter;

    public Input<PacketMirroringFilterArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * A means of specifying which resources to mirror.
     * Structure is documented below.
     * 
     */
    @InputImport(name="mirroredResources", required=true)
      private final Input<PacketMirroringMirroredResourcesArgs> mirroredResources;

    public Input<PacketMirroringMirroredResourcesArgs> getMirroredResources() {
        return this.mirroredResources;
    }

    /**
     * The name of the packet mirroring rule
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the mirrored VPC network. Only packets in this network
     * will be mirrored. All mirrored VMs should have a NIC in the given
     * network. All mirrored subnetworks should belong to the given network.
     * Structure is documented below.
     * 
     */
    @InputImport(name="network", required=true)
      private final Input<PacketMirroringNetworkArgs> network;

    public Input<PacketMirroringNetworkArgs> getNetwork() {
        return this.network;
    }

    /**
     * Since only one rule can be active at a time, priority is
     * used to break ties in the case of two rules that apply to
     * the same instances.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public PacketMirroringArgs(
        Input<PacketMirroringCollectorIlbArgs> collectorIlb,
        @Nullable Input<String> description,
        @Nullable Input<PacketMirroringFilterArgs> filter,
        Input<PacketMirroringMirroredResourcesArgs> mirroredResources,
        @Nullable Input<String> name,
        Input<PacketMirroringNetworkArgs> network,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
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
        this.collectorIlb = Input.empty();
        this.description = Input.empty();
        this.filter = Input.empty();
        this.mirroredResources = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.priority = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PacketMirroringCollectorIlbArgs> collectorIlb;
        private @Nullable Input<String> description;
        private @Nullable Input<PacketMirroringFilterArgs> filter;
        private Input<PacketMirroringMirroredResourcesArgs> mirroredResources;
        private @Nullable Input<String> name;
        private Input<PacketMirroringNetworkArgs> network;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

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

        public Builder collectorIlb(Input<PacketMirroringCollectorIlbArgs> collectorIlb) {
            this.collectorIlb = Objects.requireNonNull(collectorIlb);
            return this;
        }

        public Builder collectorIlb(PacketMirroringCollectorIlbArgs collectorIlb) {
            this.collectorIlb = Input.of(Objects.requireNonNull(collectorIlb));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder filter(@Nullable Input<PacketMirroringFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable PacketMirroringFilterArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder mirroredResources(Input<PacketMirroringMirroredResourcesArgs> mirroredResources) {
            this.mirroredResources = Objects.requireNonNull(mirroredResources);
            return this;
        }

        public Builder mirroredResources(PacketMirroringMirroredResourcesArgs mirroredResources) {
            this.mirroredResources = Input.of(Objects.requireNonNull(mirroredResources));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder network(Input<PacketMirroringNetworkArgs> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder network(PacketMirroringNetworkArgs network) {
            this.network = Input.of(Objects.requireNonNull(network));
            return this;
        }

        public Builder priority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }
        public PacketMirroringArgs build() {
            return new PacketMirroringArgs(collectorIlb, description, filter, mirroredResources, name, network, priority, project, region);
        }
    }
}
