// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.inputs;

import io.pulumi.aws.elb.inputs.LoadBalancerAccessLogsGetArgs;
import io.pulumi.aws.elb.inputs.LoadBalancerHealthCheckGetArgs;
import io.pulumi.aws.elb.inputs.LoadBalancerListenerGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerState extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerState Empty = new LoadBalancerState();

    /**
     * An Access Logs block. Access Logs documented below.
     * 
     */
    @Import(name="accessLogs")
      private final @Nullable Output<LoadBalancerAccessLogsGetArgs> accessLogs;

    public Output<LoadBalancerAccessLogsGetArgs> accessLogs() {
        return this.accessLogs == null ? Codegen.empty() : this.accessLogs;
    }

    /**
     * The ARN of the ELB
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The AZ's to serve traffic in.
     * 
     */
    @Import(name="availabilityZones")
      private final @Nullable Output<List<String>> availabilityZones;

    public Output<List<String>> availabilityZones() {
        return this.availabilityZones == null ? Codegen.empty() : this.availabilityZones;
    }

    /**
     * Boolean to enable connection draining. Default: `false`
     * 
     */
    @Import(name="connectionDraining")
      private final @Nullable Output<Boolean> connectionDraining;

    public Output<Boolean> connectionDraining() {
        return this.connectionDraining == null ? Codegen.empty() : this.connectionDraining;
    }

    /**
     * The time in seconds to allow for connections to drain. Default: `300`
     * 
     */
    @Import(name="connectionDrainingTimeout")
      private final @Nullable Output<Integer> connectionDrainingTimeout;

    public Output<Integer> connectionDrainingTimeout() {
        return this.connectionDrainingTimeout == null ? Codegen.empty() : this.connectionDrainingTimeout;
    }

    /**
     * Enable cross-zone load balancing. Default: `true`
     * 
     */
    @Import(name="crossZoneLoadBalancing")
      private final @Nullable Output<Boolean> crossZoneLoadBalancing;

    public Output<Boolean> crossZoneLoadBalancing() {
        return this.crossZoneLoadBalancing == null ? Codegen.empty() : this.crossZoneLoadBalancing;
    }

    /**
     * Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    @Import(name="desyncMitigationMode")
      private final @Nullable Output<String> desyncMitigationMode;

    public Output<String> desyncMitigationMode() {
        return this.desyncMitigationMode == null ? Codegen.empty() : this.desyncMitigationMode;
    }

    /**
     * The DNS name of the ELB
     * 
     */
    @Import(name="dnsName")
      private final @Nullable Output<String> dnsName;

    public Output<String> dnsName() {
        return this.dnsName == null ? Codegen.empty() : this.dnsName;
    }

    /**
     * A health_check block. Health Check documented below.
     * 
     */
    @Import(name="healthCheck")
      private final @Nullable Output<LoadBalancerHealthCheckGetArgs> healthCheck;

    public Output<LoadBalancerHealthCheckGetArgs> healthCheck() {
        return this.healthCheck == null ? Codegen.empty() : this.healthCheck;
    }

    /**
     * The time in seconds that the connection is allowed to be idle. Default: `60`
     * 
     */
    @Import(name="idleTimeout")
      private final @Nullable Output<Integer> idleTimeout;

    public Output<Integer> idleTimeout() {
        return this.idleTimeout == null ? Codegen.empty() : this.idleTimeout;
    }

    /**
     * A list of instance ids to place in the ELB pool.
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<List<String>> instances;

    public Output<List<String>> instances() {
        return this.instances == null ? Codegen.empty() : this.instances;
    }

    /**
     * If true, ELB will be an internal ELB.
     * 
     */
    @Import(name="internal")
      private final @Nullable Output<Boolean> internal;

    public Output<Boolean> internal() {
        return this.internal == null ? Codegen.empty() : this.internal;
    }

    /**
     * A list of listener blocks. Listeners documented below.
     * 
     */
    @Import(name="listeners")
      private final @Nullable Output<List<LoadBalancerListenerGetArgs>> listeners;

    public Output<List<LoadBalancerListenerGetArgs>> listeners() {
        return this.listeners == null ? Codegen.empty() : this.listeners;
    }

    /**
     * The name of the ELB. By default generated by this provider.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * A list of security group IDs to assign to the ELB.
     * Only valid if creating an ELB within a VPC
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> securityGroups() {
        return this.securityGroups == null ? Codegen.empty() : this.securityGroups;
    }

    /**
     * The name of the security group that you can use as
     * part of your inbound rules for your load balancer's back-end application
     * instances. Use this for Classic or Default VPC only.
     * 
     */
    @Import(name="sourceSecurityGroup")
      private final @Nullable Output<String> sourceSecurityGroup;

    public Output<String> sourceSecurityGroup() {
        return this.sourceSecurityGroup == null ? Codegen.empty() : this.sourceSecurityGroup;
    }

    /**
     * The ID of the security group that you can use as
     * part of your inbound rules for your load balancer's back-end application
     * instances. Only available on ELBs launched in a VPC.
     * 
     */
    @Import(name="sourceSecurityGroupId")
      private final @Nullable Output<String> sourceSecurityGroupId;

    public Output<String> sourceSecurityGroupId() {
        return this.sourceSecurityGroupId == null ? Codegen.empty() : this.sourceSecurityGroupId;
    }

    /**
     * A list of subnet IDs to attach to the ELB.
     * 
     */
    @Import(name="subnets")
      private final @Nullable Output<List<String>> subnets;

    public Output<List<String>> subnets() {
        return this.subnets == null ? Codegen.empty() : this.subnets;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The canonical hosted zone ID of the ELB (to be used in a Route 53 Alias record)
     * 
     */
    @Import(name="zoneId")
      private final @Nullable Output<String> zoneId;

    public Output<String> zoneId() {
        return this.zoneId == null ? Codegen.empty() : this.zoneId;
    }

    public LoadBalancerState(
        @Nullable Output<LoadBalancerAccessLogsGetArgs> accessLogs,
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> availabilityZones,
        @Nullable Output<Boolean> connectionDraining,
        @Nullable Output<Integer> connectionDrainingTimeout,
        @Nullable Output<Boolean> crossZoneLoadBalancing,
        @Nullable Output<String> desyncMitigationMode,
        @Nullable Output<String> dnsName,
        @Nullable Output<LoadBalancerHealthCheckGetArgs> healthCheck,
        @Nullable Output<Integer> idleTimeout,
        @Nullable Output<List<String>> instances,
        @Nullable Output<Boolean> internal,
        @Nullable Output<List<LoadBalancerListenerGetArgs>> listeners,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<List<String>> securityGroups,
        @Nullable Output<String> sourceSecurityGroup,
        @Nullable Output<String> sourceSecurityGroupId,
        @Nullable Output<List<String>> subnets,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> zoneId) {
        this.accessLogs = accessLogs;
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.connectionDraining = connectionDraining;
        this.connectionDrainingTimeout = connectionDrainingTimeout;
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
        this.desyncMitigationMode = desyncMitigationMode;
        this.dnsName = dnsName;
        this.healthCheck = healthCheck;
        this.idleTimeout = idleTimeout;
        this.instances = instances;
        this.internal = internal;
        this.listeners = listeners;
        this.name = name;
        this.namePrefix = namePrefix;
        this.securityGroups = securityGroups;
        this.sourceSecurityGroup = sourceSecurityGroup;
        this.sourceSecurityGroupId = sourceSecurityGroupId;
        this.subnets = subnets;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.zoneId = zoneId;
    }

    private LoadBalancerState() {
        this.accessLogs = Codegen.empty();
        this.arn = Codegen.empty();
        this.availabilityZones = Codegen.empty();
        this.connectionDraining = Codegen.empty();
        this.connectionDrainingTimeout = Codegen.empty();
        this.crossZoneLoadBalancing = Codegen.empty();
        this.desyncMitigationMode = Codegen.empty();
        this.dnsName = Codegen.empty();
        this.healthCheck = Codegen.empty();
        this.idleTimeout = Codegen.empty();
        this.instances = Codegen.empty();
        this.internal = Codegen.empty();
        this.listeners = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.securityGroups = Codegen.empty();
        this.sourceSecurityGroup = Codegen.empty();
        this.sourceSecurityGroupId = Codegen.empty();
        this.subnets = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.zoneId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LoadBalancerAccessLogsGetArgs> accessLogs;
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> availabilityZones;
        private @Nullable Output<Boolean> connectionDraining;
        private @Nullable Output<Integer> connectionDrainingTimeout;
        private @Nullable Output<Boolean> crossZoneLoadBalancing;
        private @Nullable Output<String> desyncMitigationMode;
        private @Nullable Output<String> dnsName;
        private @Nullable Output<LoadBalancerHealthCheckGetArgs> healthCheck;
        private @Nullable Output<Integer> idleTimeout;
        private @Nullable Output<List<String>> instances;
        private @Nullable Output<Boolean> internal;
        private @Nullable Output<List<LoadBalancerListenerGetArgs>> listeners;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<List<String>> securityGroups;
        private @Nullable Output<String> sourceSecurityGroup;
        private @Nullable Output<String> sourceSecurityGroupId;
        private @Nullable Output<List<String>> subnets;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerState defaults) {
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
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.instances = defaults.instances;
    	      this.internal = defaults.internal;
    	      this.listeners = defaults.listeners;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sourceSecurityGroup = defaults.sourceSecurityGroup;
    	      this.sourceSecurityGroupId = defaults.sourceSecurityGroupId;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder accessLogs(@Nullable Output<LoadBalancerAccessLogsGetArgs> accessLogs) {
            this.accessLogs = accessLogs;
            return this;
        }
        public Builder accessLogs(@Nullable LoadBalancerAccessLogsGetArgs accessLogs) {
            this.accessLogs = Codegen.ofNullable(accessLogs);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Codegen.ofNullable(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder connectionDraining(@Nullable Output<Boolean> connectionDraining) {
            this.connectionDraining = connectionDraining;
            return this;
        }
        public Builder connectionDraining(@Nullable Boolean connectionDraining) {
            this.connectionDraining = Codegen.ofNullable(connectionDraining);
            return this;
        }
        public Builder connectionDrainingTimeout(@Nullable Output<Integer> connectionDrainingTimeout) {
            this.connectionDrainingTimeout = connectionDrainingTimeout;
            return this;
        }
        public Builder connectionDrainingTimeout(@Nullable Integer connectionDrainingTimeout) {
            this.connectionDrainingTimeout = Codegen.ofNullable(connectionDrainingTimeout);
            return this;
        }
        public Builder crossZoneLoadBalancing(@Nullable Output<Boolean> crossZoneLoadBalancing) {
            this.crossZoneLoadBalancing = crossZoneLoadBalancing;
            return this;
        }
        public Builder crossZoneLoadBalancing(@Nullable Boolean crossZoneLoadBalancing) {
            this.crossZoneLoadBalancing = Codegen.ofNullable(crossZoneLoadBalancing);
            return this;
        }
        public Builder desyncMitigationMode(@Nullable Output<String> desyncMitigationMode) {
            this.desyncMitigationMode = desyncMitigationMode;
            return this;
        }
        public Builder desyncMitigationMode(@Nullable String desyncMitigationMode) {
            this.desyncMitigationMode = Codegen.ofNullable(desyncMitigationMode);
            return this;
        }
        public Builder dnsName(@Nullable Output<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }
        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = Codegen.ofNullable(dnsName);
            return this;
        }
        public Builder healthCheck(@Nullable Output<LoadBalancerHealthCheckGetArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public Builder healthCheck(@Nullable LoadBalancerHealthCheckGetArgs healthCheck) {
            this.healthCheck = Codegen.ofNullable(healthCheck);
            return this;
        }
        public Builder idleTimeout(@Nullable Output<Integer> idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Builder idleTimeout(@Nullable Integer idleTimeout) {
            this.idleTimeout = Codegen.ofNullable(idleTimeout);
            return this;
        }
        public Builder instances(@Nullable Output<List<String>> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(@Nullable List<String> instances) {
            this.instances = Codegen.ofNullable(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        public Builder internal(@Nullable Output<Boolean> internal) {
            this.internal = internal;
            return this;
        }
        public Builder internal(@Nullable Boolean internal) {
            this.internal = Codegen.ofNullable(internal);
            return this;
        }
        public Builder listeners(@Nullable Output<List<LoadBalancerListenerGetArgs>> listeners) {
            this.listeners = listeners;
            return this;
        }
        public Builder listeners(@Nullable List<LoadBalancerListenerGetArgs> listeners) {
            this.listeners = Codegen.ofNullable(listeners);
            return this;
        }
        public Builder listeners(LoadBalancerListenerGetArgs... listeners) {
            return listeners(List.of(listeners));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Codegen.ofNullable(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder sourceSecurityGroup(@Nullable Output<String> sourceSecurityGroup) {
            this.sourceSecurityGroup = sourceSecurityGroup;
            return this;
        }
        public Builder sourceSecurityGroup(@Nullable String sourceSecurityGroup) {
            this.sourceSecurityGroup = Codegen.ofNullable(sourceSecurityGroup);
            return this;
        }
        public Builder sourceSecurityGroupId(@Nullable Output<String> sourceSecurityGroupId) {
            this.sourceSecurityGroupId = sourceSecurityGroupId;
            return this;
        }
        public Builder sourceSecurityGroupId(@Nullable String sourceSecurityGroupId) {
            this.sourceSecurityGroupId = Codegen.ofNullable(sourceSecurityGroupId);
            return this;
        }
        public Builder subnets(@Nullable Output<List<String>> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(@Nullable List<String> subnets) {
            this.subnets = Codegen.ofNullable(subnets);
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder zoneId(@Nullable Output<String> zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = Codegen.ofNullable(zoneId);
            return this;
        }        public LoadBalancerState build() {
            return new LoadBalancerState(accessLogs, arn, availabilityZones, connectionDraining, connectionDrainingTimeout, crossZoneLoadBalancing, desyncMitigationMode, dnsName, healthCheck, idleTimeout, instances, internal, listeners, name, namePrefix, securityGroups, sourceSecurityGroup, sourceSecurityGroupId, subnets, tags, tagsAll, zoneId);
        }
    }
}
