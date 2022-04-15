// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.GetInstanceGroupNamedPort;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceGroupResult {
    /**
     * Textual description of the instance group.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * List of instances in the group.
     * 
     */
    private final List<String> instances;
    private final @Nullable String name;
    /**
     * List of named ports in the group.
     * 
     */
    private final List<GetInstanceGroupNamedPort> namedPorts;
    /**
     * The URL of the network the instance group is in.
     * 
     */
    private final String network;
    private final String project;
    /**
     * The URI of the resource.
     * 
     */
    private final String selfLink;
    /**
     * The number of instances in the group.
     * 
     */
    private final Integer size;
    private final String zone;

    @CustomType.Constructor
    private GetInstanceGroupResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instances") List<String> instances,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("namedPorts") List<GetInstanceGroupNamedPort> namedPorts,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("zone") String zone) {
        this.description = description;
        this.id = id;
        this.instances = instances;
        this.name = name;
        this.namedPorts = namedPorts;
        this.network = network;
        this.project = project;
        this.selfLink = selfLink;
        this.size = size;
        this.zone = zone;
    }

    /**
     * Textual description of the instance group.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * List of instances in the group.
     * 
    */
    public List<String> instances() {
        return this.instances;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * List of named ports in the group.
     * 
    */
    public List<GetInstanceGroupNamedPort> namedPorts() {
        return this.namedPorts;
    }
    /**
     * The URL of the network the instance group is in.
     * 
    */
    public String network() {
        return this.network;
    }
    public String project() {
        return this.project;
    }
    /**
     * The URI of the resource.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * The number of instances in the group.
     * 
    */
    public Integer size() {
        return this.size;
    }
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private List<String> instances;
        private @Nullable String name;
        private List<GetInstanceGroupNamedPort> namedPorts;
        private String network;
        private String project;
        private String selfLink;
        private Integer size;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.zone = defaults.zone;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder namedPorts(List<GetInstanceGroupNamedPort> namedPorts) {
            this.namedPorts = Objects.requireNonNull(namedPorts);
            return this;
        }
        public Builder namedPorts(GetInstanceGroupNamedPort... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetInstanceGroupResult build() {
            return new GetInstanceGroupResult(description, id, instances, name, namedPorts, network, project, selfLink, size, zone);
        }
    }
}
