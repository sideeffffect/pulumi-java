// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.NodeGroupAutoscalingPolicyResponse;
import com.pulumi.googlenative.compute_v1.outputs.NodeGroupMaintenanceWindowResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNodeGroupResult {
    /**
     * Specifies how autoscaling should behave.
     * 
     */
    private final NodeGroupAutoscalingPolicyResponse autoscalingPolicy;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    private final String fingerprint;
    /**
     * The type of the resource. Always compute#nodeGroup for node group.
     * 
     */
    private final String kind;
    /**
     * An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     * 
     */
    private final String locationHint;
    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
     */
    private final String maintenancePolicy;
    private final NodeGroupMaintenanceWindowResponse maintenanceWindow;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * URL of the node template to create the node group from.
     * 
     */
    private final String nodeTemplate;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * The total number of nodes in the node group.
     * 
     */
    private final Integer size;
    private final String status;
    /**
     * The name of the zone where the node group resides, such as us-central1-a.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetNodeGroupResult(
        @CustomType.Parameter("autoscalingPolicy") NodeGroupAutoscalingPolicyResponse autoscalingPolicy,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("locationHint") String locationHint,
        @CustomType.Parameter("maintenancePolicy") String maintenancePolicy,
        @CustomType.Parameter("maintenanceWindow") NodeGroupMaintenanceWindowResponse maintenanceWindow,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodeTemplate") String nodeTemplate,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("zone") String zone) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.fingerprint = fingerprint;
        this.kind = kind;
        this.locationHint = locationHint;
        this.maintenancePolicy = maintenancePolicy;
        this.maintenanceWindow = maintenanceWindow;
        this.name = name;
        this.nodeTemplate = nodeTemplate;
        this.selfLink = selfLink;
        this.size = size;
        this.status = status;
        this.zone = zone;
    }

    /**
     * Specifies how autoscaling should behave.
     * 
    */
    public NodeGroupAutoscalingPolicyResponse autoscalingPolicy() {
        return this.autoscalingPolicy;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String description() {
        return this.description;
    }
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * The type of the resource. Always compute#nodeGroup for node group.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     * 
    */
    public String locationHint() {
        return this.locationHint;
    }
    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
    */
    public String maintenancePolicy() {
        return this.maintenancePolicy;
    }
    public NodeGroupMaintenanceWindowResponse maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * URL of the node template to create the node group from.
     * 
    */
    public String nodeTemplate() {
        return this.nodeTemplate;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * The total number of nodes in the node group.
     * 
    */
    public Integer size() {
        return this.size;
    }
    public String status() {
        return this.status;
    }
    /**
     * The name of the zone where the node group resides, such as us-central1-a.
     * 
    */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeGroupAutoscalingPolicyResponse autoscalingPolicy;
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String kind;
        private String locationHint;
        private String maintenancePolicy;
        private NodeGroupMaintenanceWindowResponse maintenanceWindow;
        private String name;
        private String nodeTemplate;
        private String selfLink;
        private Integer size;
        private String status;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.locationHint = defaults.locationHint;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.nodeTemplate = defaults.nodeTemplate;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        public Builder autoscalingPolicy(NodeGroupAutoscalingPolicyResponse autoscalingPolicy) {
            this.autoscalingPolicy = Objects.requireNonNull(autoscalingPolicy);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder locationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }
        public Builder maintenancePolicy(String maintenancePolicy) {
            this.maintenancePolicy = Objects.requireNonNull(maintenancePolicy);
            return this;
        }
        public Builder maintenanceWindow(NodeGroupMaintenanceWindowResponse maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodeTemplate(String nodeTemplate) {
            this.nodeTemplate = Objects.requireNonNull(nodeTemplate);
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
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetNodeGroupResult build() {
            return new GetNodeGroupResult(autoscalingPolicy, creationTimestamp, description, fingerprint, kind, locationHint, maintenancePolicy, maintenanceWindow, name, nodeTemplate, selfLink, size, status, zone);
        }
    }
}
