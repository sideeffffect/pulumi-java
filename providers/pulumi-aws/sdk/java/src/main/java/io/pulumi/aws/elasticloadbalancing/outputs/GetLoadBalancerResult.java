// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.outputs;

import io.pulumi.aws.elasticloadbalancing.outputs.GetLoadBalancerAccessLogs;
import io.pulumi.aws.elasticloadbalancing.outputs.GetLoadBalancerHealthCheck;
import io.pulumi.aws.elasticloadbalancing.outputs.GetLoadBalancerListener;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetLoadBalancerResult {
    private final GetLoadBalancerAccessLogs accessLogs;
    private final String arn;
    private final List<String> availabilityZones;
    private final Boolean connectionDraining;
    private final Integer connectionDrainingTimeout;
    private final Boolean crossZoneLoadBalancing;
    private final String desyncMitigationMode;
    private final String dnsName;
    private final GetLoadBalancerHealthCheck healthCheck;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Integer idleTimeout;
    private final List<String> instances;
    private final Boolean internal;
    private final List<GetLoadBalancerListener> listeners;
    private final String name;
    private final List<String> securityGroups;
    private final String sourceSecurityGroup;
    private final String sourceSecurityGroupId;
    private final List<String> subnets;
    private final Map<String,String> tags;
    private final String zoneId;

    @OutputCustomType.Constructor({"accessLogs","arn","availabilityZones","connectionDraining","connectionDrainingTimeout","crossZoneLoadBalancing","desyncMitigationMode","dnsName","healthCheck","id","idleTimeout","instances","internal","listeners","name","securityGroups","sourceSecurityGroup","sourceSecurityGroupId","subnets","tags","zoneId"})
    private GetLoadBalancerResult(
        GetLoadBalancerAccessLogs accessLogs,
        String arn,
        List<String> availabilityZones,
        Boolean connectionDraining,
        Integer connectionDrainingTimeout,
        Boolean crossZoneLoadBalancing,
        String desyncMitigationMode,
        String dnsName,
        GetLoadBalancerHealthCheck healthCheck,
        String id,
        Integer idleTimeout,
        List<String> instances,
        Boolean internal,
        List<GetLoadBalancerListener> listeners,
        String name,
        List<String> securityGroups,
        String sourceSecurityGroup,
        String sourceSecurityGroupId,
        List<String> subnets,
        Map<String,String> tags,
        String zoneId) {
        this.accessLogs = accessLogs;
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.connectionDraining = connectionDraining;
        this.connectionDrainingTimeout = connectionDrainingTimeout;
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
        this.desyncMitigationMode = desyncMitigationMode;
        this.dnsName = dnsName;
        this.healthCheck = healthCheck;
        this.id = id;
        this.idleTimeout = idleTimeout;
        this.instances = instances;
        this.internal = internal;
        this.listeners = listeners;
        this.name = name;
        this.securityGroups = securityGroups;
        this.sourceSecurityGroup = sourceSecurityGroup;
        this.sourceSecurityGroupId = sourceSecurityGroupId;
        this.subnets = subnets;
        this.tags = tags;
        this.zoneId = zoneId;
    }

    public GetLoadBalancerAccessLogs getAccessLogs() {
        return this.accessLogs;
    }
    public String getArn() {
        return this.arn;
    }
    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }
    public Boolean getConnectionDraining() {
        return this.connectionDraining;
    }
    public Integer getConnectionDrainingTimeout() {
        return this.connectionDrainingTimeout;
    }
    public Boolean getCrossZoneLoadBalancing() {
        return this.crossZoneLoadBalancing;
    }
    public String getDesyncMitigationMode() {
        return this.desyncMitigationMode;
    }
    public String getDnsName() {
        return this.dnsName;
    }
    public GetLoadBalancerHealthCheck getHealthCheck() {
        return this.healthCheck;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }
    public List<String> getInstances() {
        return this.instances;
    }
    public Boolean getInternal() {
        return this.internal;
    }
    public List<GetLoadBalancerListener> getListeners() {
        return this.listeners;
    }
    public String getName() {
        return this.name;
    }
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }
    public String getSourceSecurityGroup() {
        return this.sourceSecurityGroup;
    }
    public String getSourceSecurityGroupId() {
        return this.sourceSecurityGroupId;
    }
    public List<String> getSubnets() {
        return this.subnets;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerAccessLogs accessLogs;
        private String arn;
        private List<String> availabilityZones;
        private Boolean connectionDraining;
        private Integer connectionDrainingTimeout;
        private Boolean crossZoneLoadBalancing;
        private String desyncMitigationMode;
        private String dnsName;
        private GetLoadBalancerHealthCheck healthCheck;
        private String id;
        private Integer idleTimeout;
        private List<String> instances;
        private Boolean internal;
        private List<GetLoadBalancerListener> listeners;
        private String name;
        private List<String> securityGroups;
        private String sourceSecurityGroup;
        private String sourceSecurityGroupId;
        private List<String> subnets;
        private Map<String,String> tags;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogs = defaults.accessLogs;
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.connectionDraining = defaults.connectionDraining;
    	      this.connectionDrainingTimeout = defaults.connectionDrainingTimeout;
    	      this.crossZoneLoadBalancing = defaults.crossZoneLoadBalancing;
    	      this.desyncMitigationMode = defaults.desyncMitigationMode;
    	      this.dnsName = defaults.dnsName;
    	      this.healthCheck = defaults.healthCheck;
    	      this.id = defaults.id;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.instances = defaults.instances;
    	      this.internal = defaults.internal;
    	      this.listeners = defaults.listeners;
    	      this.name = defaults.name;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sourceSecurityGroup = defaults.sourceSecurityGroup;
    	      this.sourceSecurityGroupId = defaults.sourceSecurityGroupId;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder setAccessLogs(GetLoadBalancerAccessLogs accessLogs) {
            this.accessLogs = Objects.requireNonNull(accessLogs);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAvailabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }

        public Builder setConnectionDraining(Boolean connectionDraining) {
            this.connectionDraining = Objects.requireNonNull(connectionDraining);
            return this;
        }

        public Builder setConnectionDrainingTimeout(Integer connectionDrainingTimeout) {
            this.connectionDrainingTimeout = Objects.requireNonNull(connectionDrainingTimeout);
            return this;
        }

        public Builder setCrossZoneLoadBalancing(Boolean crossZoneLoadBalancing) {
            this.crossZoneLoadBalancing = Objects.requireNonNull(crossZoneLoadBalancing);
            return this;
        }

        public Builder setDesyncMitigationMode(String desyncMitigationMode) {
            this.desyncMitigationMode = Objects.requireNonNull(desyncMitigationMode);
            return this;
        }

        public Builder setDnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }

        public Builder setHealthCheck(GetLoadBalancerHealthCheck healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = Objects.requireNonNull(idleTimeout);
            return this;
        }

        public Builder setInstances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setInternal(Boolean internal) {
            this.internal = Objects.requireNonNull(internal);
            return this;
        }

        public Builder setListeners(List<GetLoadBalancerListener> listeners) {
            this.listeners = Objects.requireNonNull(listeners);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder setSourceSecurityGroup(String sourceSecurityGroup) {
            this.sourceSecurityGroup = Objects.requireNonNull(sourceSecurityGroup);
            return this;
        }

        public Builder setSourceSecurityGroupId(String sourceSecurityGroupId) {
            this.sourceSecurityGroupId = Objects.requireNonNull(sourceSecurityGroupId);
            return this;
        }

        public Builder setSubnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setZoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetLoadBalancerResult build() {
            return new GetLoadBalancerResult(accessLogs, arn, availabilityZones, connectionDraining, connectionDrainingTimeout, crossZoneLoadBalancing, desyncMitigationMode, dnsName, healthCheck, id, idleTimeout, instances, internal, listeners, name, securityGroups, sourceSecurityGroup, sourceSecurityGroupId, subnets, tags, zoneId);
        }
    }
}
