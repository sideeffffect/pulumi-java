// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.aws.opsworks.inputs.MysqlLayerCloudwatchConfigurationArgs;
import io.pulumi.aws.opsworks.inputs.MysqlLayerEbsVolumeArgs;
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


public final class MysqlLayerArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlLayerArgs Empty = new MysqlLayerArgs();

    /**
     * Whether to automatically assign an elastic IP address to the layer's instances.
     * 
     */
    @Import(name="autoAssignElasticIps")
      private final @Nullable Output<Boolean> autoAssignElasticIps;

    public Output<Boolean> autoAssignElasticIps() {
        return this.autoAssignElasticIps == null ? Codegen.empty() : this.autoAssignElasticIps;
    }

    /**
     * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
     * 
     */
    @Import(name="autoAssignPublicIps")
      private final @Nullable Output<Boolean> autoAssignPublicIps;

    public Output<Boolean> autoAssignPublicIps() {
        return this.autoAssignPublicIps == null ? Codegen.empty() : this.autoAssignPublicIps;
    }

    /**
     * Whether to enable auto-healing for the layer.
     * 
     */
    @Import(name="autoHealing")
      private final @Nullable Output<Boolean> autoHealing;

    public Output<Boolean> autoHealing() {
        return this.autoHealing == null ? Codegen.empty() : this.autoHealing;
    }

    @Import(name="cloudwatchConfiguration")
      private final @Nullable Output<MysqlLayerCloudwatchConfigurationArgs> cloudwatchConfiguration;

    public Output<MysqlLayerCloudwatchConfigurationArgs> cloudwatchConfiguration() {
        return this.cloudwatchConfiguration == null ? Codegen.empty() : this.cloudwatchConfiguration;
    }

    @Import(name="customConfigureRecipes")
      private final @Nullable Output<List<String>> customConfigureRecipes;

    public Output<List<String>> customConfigureRecipes() {
        return this.customConfigureRecipes == null ? Codegen.empty() : this.customConfigureRecipes;
    }

    @Import(name="customDeployRecipes")
      private final @Nullable Output<List<String>> customDeployRecipes;

    public Output<List<String>> customDeployRecipes() {
        return this.customDeployRecipes == null ? Codegen.empty() : this.customDeployRecipes;
    }

    /**
     * The ARN of an IAM profile that will be used for the layer's instances.
     * 
     */
    @Import(name="customInstanceProfileArn")
      private final @Nullable Output<String> customInstanceProfileArn;

    public Output<String> customInstanceProfileArn() {
        return this.customInstanceProfileArn == null ? Codegen.empty() : this.customInstanceProfileArn;
    }

    /**
     * Custom JSON attributes to apply to the layer.
     * 
     */
    @Import(name="customJson")
      private final @Nullable Output<String> customJson;

    public Output<String> customJson() {
        return this.customJson == null ? Codegen.empty() : this.customJson;
    }

    /**
     * Ids for a set of security groups to apply to the layer's instances.
     * 
     */
    @Import(name="customSecurityGroupIds")
      private final @Nullable Output<List<String>> customSecurityGroupIds;

    public Output<List<String>> customSecurityGroupIds() {
        return this.customSecurityGroupIds == null ? Codegen.empty() : this.customSecurityGroupIds;
    }

    @Import(name="customSetupRecipes")
      private final @Nullable Output<List<String>> customSetupRecipes;

    public Output<List<String>> customSetupRecipes() {
        return this.customSetupRecipes == null ? Codegen.empty() : this.customSetupRecipes;
    }

    @Import(name="customShutdownRecipes")
      private final @Nullable Output<List<String>> customShutdownRecipes;

    public Output<List<String>> customShutdownRecipes() {
        return this.customShutdownRecipes == null ? Codegen.empty() : this.customShutdownRecipes;
    }

    @Import(name="customUndeployRecipes")
      private final @Nullable Output<List<String>> customUndeployRecipes;

    public Output<List<String>> customUndeployRecipes() {
        return this.customUndeployRecipes == null ? Codegen.empty() : this.customUndeployRecipes;
    }

    /**
     * Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    @Import(name="drainElbOnShutdown")
      private final @Nullable Output<Boolean> drainElbOnShutdown;

    public Output<Boolean> drainElbOnShutdown() {
        return this.drainElbOnShutdown == null ? Codegen.empty() : this.drainElbOnShutdown;
    }

    /**
     * `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
     * 
     */
    @Import(name="ebsVolumes")
      private final @Nullable Output<List<MysqlLayerEbsVolumeArgs>> ebsVolumes;

    public Output<List<MysqlLayerEbsVolumeArgs>> ebsVolumes() {
        return this.ebsVolumes == null ? Codegen.empty() : this.ebsVolumes;
    }

    /**
     * Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    @Import(name="elasticLoadBalancer")
      private final @Nullable Output<String> elasticLoadBalancer;

    public Output<String> elasticLoadBalancer() {
        return this.elasticLoadBalancer == null ? Codegen.empty() : this.elasticLoadBalancer;
    }

    /**
     * Whether to install OS and package updates on each instance when it boots.
     * 
     */
    @Import(name="installUpdatesOnBoot")
      private final @Nullable Output<Boolean> installUpdatesOnBoot;

    public Output<Boolean> installUpdatesOnBoot() {
        return this.installUpdatesOnBoot == null ? Codegen.empty() : this.installUpdatesOnBoot;
    }

    /**
     * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     * 
     */
    @Import(name="instanceShutdownTimeout")
      private final @Nullable Output<Integer> instanceShutdownTimeout;

    public Output<Integer> instanceShutdownTimeout() {
        return this.instanceShutdownTimeout == null ? Codegen.empty() : this.instanceShutdownTimeout;
    }

    /**
     * A human-readable name for the layer.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Root password to use for MySQL.
     * 
     */
    @Import(name="rootPassword")
      private final @Nullable Output<String> rootPassword;

    public Output<String> rootPassword() {
        return this.rootPassword == null ? Codegen.empty() : this.rootPassword;
    }

    /**
     * Whether to set the root user password to all instances in the stack so they can access the instances in this layer.
     * 
     */
    @Import(name="rootPasswordOnAllInstances")
      private final @Nullable Output<Boolean> rootPasswordOnAllInstances;

    public Output<Boolean> rootPasswordOnAllInstances() {
        return this.rootPasswordOnAllInstances == null ? Codegen.empty() : this.rootPasswordOnAllInstances;
    }

    /**
     * The id of the stack the layer will belong to.
     * 
     */
    @Import(name="stackId", required=true)
      private final Output<String> stackId;

    public Output<String> stackId() {
        return this.stackId;
    }

    /**
     * Names of a set of system packages to install on the layer's instances.
     * 
     */
    @Import(name="systemPackages")
      private final @Nullable Output<List<String>> systemPackages;

    public Output<List<String>> systemPackages() {
        return this.systemPackages == null ? Codegen.empty() : this.systemPackages;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Whether to use EBS-optimized instances.
     * 
     */
    @Import(name="useEbsOptimizedInstances")
      private final @Nullable Output<Boolean> useEbsOptimizedInstances;

    public Output<Boolean> useEbsOptimizedInstances() {
        return this.useEbsOptimizedInstances == null ? Codegen.empty() : this.useEbsOptimizedInstances;
    }

    public MysqlLayerArgs(
        @Nullable Output<Boolean> autoAssignElasticIps,
        @Nullable Output<Boolean> autoAssignPublicIps,
        @Nullable Output<Boolean> autoHealing,
        @Nullable Output<MysqlLayerCloudwatchConfigurationArgs> cloudwatchConfiguration,
        @Nullable Output<List<String>> customConfigureRecipes,
        @Nullable Output<List<String>> customDeployRecipes,
        @Nullable Output<String> customInstanceProfileArn,
        @Nullable Output<String> customJson,
        @Nullable Output<List<String>> customSecurityGroupIds,
        @Nullable Output<List<String>> customSetupRecipes,
        @Nullable Output<List<String>> customShutdownRecipes,
        @Nullable Output<List<String>> customUndeployRecipes,
        @Nullable Output<Boolean> drainElbOnShutdown,
        @Nullable Output<List<MysqlLayerEbsVolumeArgs>> ebsVolumes,
        @Nullable Output<String> elasticLoadBalancer,
        @Nullable Output<Boolean> installUpdatesOnBoot,
        @Nullable Output<Integer> instanceShutdownTimeout,
        @Nullable Output<String> name,
        @Nullable Output<String> rootPassword,
        @Nullable Output<Boolean> rootPasswordOnAllInstances,
        Output<String> stackId,
        @Nullable Output<List<String>> systemPackages,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Boolean> useEbsOptimizedInstances) {
        this.autoAssignElasticIps = autoAssignElasticIps;
        this.autoAssignPublicIps = autoAssignPublicIps;
        this.autoHealing = autoHealing;
        this.cloudwatchConfiguration = cloudwatchConfiguration;
        this.customConfigureRecipes = customConfigureRecipes;
        this.customDeployRecipes = customDeployRecipes;
        this.customInstanceProfileArn = customInstanceProfileArn;
        this.customJson = customJson;
        this.customSecurityGroupIds = customSecurityGroupIds;
        this.customSetupRecipes = customSetupRecipes;
        this.customShutdownRecipes = customShutdownRecipes;
        this.customUndeployRecipes = customUndeployRecipes;
        this.drainElbOnShutdown = drainElbOnShutdown;
        this.ebsVolumes = ebsVolumes;
        this.elasticLoadBalancer = elasticLoadBalancer;
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        this.instanceShutdownTimeout = instanceShutdownTimeout;
        this.name = name;
        this.rootPassword = rootPassword;
        this.rootPasswordOnAllInstances = rootPasswordOnAllInstances;
        this.stackId = Objects.requireNonNull(stackId, "expected parameter 'stackId' to be non-null");
        this.systemPackages = systemPackages;
        this.tags = tags;
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
    }

    private MysqlLayerArgs() {
        this.autoAssignElasticIps = Codegen.empty();
        this.autoAssignPublicIps = Codegen.empty();
        this.autoHealing = Codegen.empty();
        this.cloudwatchConfiguration = Codegen.empty();
        this.customConfigureRecipes = Codegen.empty();
        this.customDeployRecipes = Codegen.empty();
        this.customInstanceProfileArn = Codegen.empty();
        this.customJson = Codegen.empty();
        this.customSecurityGroupIds = Codegen.empty();
        this.customSetupRecipes = Codegen.empty();
        this.customShutdownRecipes = Codegen.empty();
        this.customUndeployRecipes = Codegen.empty();
        this.drainElbOnShutdown = Codegen.empty();
        this.ebsVolumes = Codegen.empty();
        this.elasticLoadBalancer = Codegen.empty();
        this.installUpdatesOnBoot = Codegen.empty();
        this.instanceShutdownTimeout = Codegen.empty();
        this.name = Codegen.empty();
        this.rootPassword = Codegen.empty();
        this.rootPasswordOnAllInstances = Codegen.empty();
        this.stackId = Codegen.empty();
        this.systemPackages = Codegen.empty();
        this.tags = Codegen.empty();
        this.useEbsOptimizedInstances = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlLayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoAssignElasticIps;
        private @Nullable Output<Boolean> autoAssignPublicIps;
        private @Nullable Output<Boolean> autoHealing;
        private @Nullable Output<MysqlLayerCloudwatchConfigurationArgs> cloudwatchConfiguration;
        private @Nullable Output<List<String>> customConfigureRecipes;
        private @Nullable Output<List<String>> customDeployRecipes;
        private @Nullable Output<String> customInstanceProfileArn;
        private @Nullable Output<String> customJson;
        private @Nullable Output<List<String>> customSecurityGroupIds;
        private @Nullable Output<List<String>> customSetupRecipes;
        private @Nullable Output<List<String>> customShutdownRecipes;
        private @Nullable Output<List<String>> customUndeployRecipes;
        private @Nullable Output<Boolean> drainElbOnShutdown;
        private @Nullable Output<List<MysqlLayerEbsVolumeArgs>> ebsVolumes;
        private @Nullable Output<String> elasticLoadBalancer;
        private @Nullable Output<Boolean> installUpdatesOnBoot;
        private @Nullable Output<Integer> instanceShutdownTimeout;
        private @Nullable Output<String> name;
        private @Nullable Output<String> rootPassword;
        private @Nullable Output<Boolean> rootPasswordOnAllInstances;
        private Output<String> stackId;
        private @Nullable Output<List<String>> systemPackages;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Boolean> useEbsOptimizedInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlLayerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoAssignElasticIps = defaults.autoAssignElasticIps;
    	      this.autoAssignPublicIps = defaults.autoAssignPublicIps;
    	      this.autoHealing = defaults.autoHealing;
    	      this.cloudwatchConfiguration = defaults.cloudwatchConfiguration;
    	      this.customConfigureRecipes = defaults.customConfigureRecipes;
    	      this.customDeployRecipes = defaults.customDeployRecipes;
    	      this.customInstanceProfileArn = defaults.customInstanceProfileArn;
    	      this.customJson = defaults.customJson;
    	      this.customSecurityGroupIds = defaults.customSecurityGroupIds;
    	      this.customSetupRecipes = defaults.customSetupRecipes;
    	      this.customShutdownRecipes = defaults.customShutdownRecipes;
    	      this.customUndeployRecipes = defaults.customUndeployRecipes;
    	      this.drainElbOnShutdown = defaults.drainElbOnShutdown;
    	      this.ebsVolumes = defaults.ebsVolumes;
    	      this.elasticLoadBalancer = defaults.elasticLoadBalancer;
    	      this.installUpdatesOnBoot = defaults.installUpdatesOnBoot;
    	      this.instanceShutdownTimeout = defaults.instanceShutdownTimeout;
    	      this.name = defaults.name;
    	      this.rootPassword = defaults.rootPassword;
    	      this.rootPasswordOnAllInstances = defaults.rootPasswordOnAllInstances;
    	      this.stackId = defaults.stackId;
    	      this.systemPackages = defaults.systemPackages;
    	      this.tags = defaults.tags;
    	      this.useEbsOptimizedInstances = defaults.useEbsOptimizedInstances;
        }

        public Builder autoAssignElasticIps(@Nullable Output<Boolean> autoAssignElasticIps) {
            this.autoAssignElasticIps = autoAssignElasticIps;
            return this;
        }
        public Builder autoAssignElasticIps(@Nullable Boolean autoAssignElasticIps) {
            this.autoAssignElasticIps = Codegen.ofNullable(autoAssignElasticIps);
            return this;
        }
        public Builder autoAssignPublicIps(@Nullable Output<Boolean> autoAssignPublicIps) {
            this.autoAssignPublicIps = autoAssignPublicIps;
            return this;
        }
        public Builder autoAssignPublicIps(@Nullable Boolean autoAssignPublicIps) {
            this.autoAssignPublicIps = Codegen.ofNullable(autoAssignPublicIps);
            return this;
        }
        public Builder autoHealing(@Nullable Output<Boolean> autoHealing) {
            this.autoHealing = autoHealing;
            return this;
        }
        public Builder autoHealing(@Nullable Boolean autoHealing) {
            this.autoHealing = Codegen.ofNullable(autoHealing);
            return this;
        }
        public Builder cloudwatchConfiguration(@Nullable Output<MysqlLayerCloudwatchConfigurationArgs> cloudwatchConfiguration) {
            this.cloudwatchConfiguration = cloudwatchConfiguration;
            return this;
        }
        public Builder cloudwatchConfiguration(@Nullable MysqlLayerCloudwatchConfigurationArgs cloudwatchConfiguration) {
            this.cloudwatchConfiguration = Codegen.ofNullable(cloudwatchConfiguration);
            return this;
        }
        public Builder customConfigureRecipes(@Nullable Output<List<String>> customConfigureRecipes) {
            this.customConfigureRecipes = customConfigureRecipes;
            return this;
        }
        public Builder customConfigureRecipes(@Nullable List<String> customConfigureRecipes) {
            this.customConfigureRecipes = Codegen.ofNullable(customConfigureRecipes);
            return this;
        }
        public Builder customConfigureRecipes(String... customConfigureRecipes) {
            return customConfigureRecipes(List.of(customConfigureRecipes));
        }
        public Builder customDeployRecipes(@Nullable Output<List<String>> customDeployRecipes) {
            this.customDeployRecipes = customDeployRecipes;
            return this;
        }
        public Builder customDeployRecipes(@Nullable List<String> customDeployRecipes) {
            this.customDeployRecipes = Codegen.ofNullable(customDeployRecipes);
            return this;
        }
        public Builder customDeployRecipes(String... customDeployRecipes) {
            return customDeployRecipes(List.of(customDeployRecipes));
        }
        public Builder customInstanceProfileArn(@Nullable Output<String> customInstanceProfileArn) {
            this.customInstanceProfileArn = customInstanceProfileArn;
            return this;
        }
        public Builder customInstanceProfileArn(@Nullable String customInstanceProfileArn) {
            this.customInstanceProfileArn = Codegen.ofNullable(customInstanceProfileArn);
            return this;
        }
        public Builder customJson(@Nullable Output<String> customJson) {
            this.customJson = customJson;
            return this;
        }
        public Builder customJson(@Nullable String customJson) {
            this.customJson = Codegen.ofNullable(customJson);
            return this;
        }
        public Builder customSecurityGroupIds(@Nullable Output<List<String>> customSecurityGroupIds) {
            this.customSecurityGroupIds = customSecurityGroupIds;
            return this;
        }
        public Builder customSecurityGroupIds(@Nullable List<String> customSecurityGroupIds) {
            this.customSecurityGroupIds = Codegen.ofNullable(customSecurityGroupIds);
            return this;
        }
        public Builder customSecurityGroupIds(String... customSecurityGroupIds) {
            return customSecurityGroupIds(List.of(customSecurityGroupIds));
        }
        public Builder customSetupRecipes(@Nullable Output<List<String>> customSetupRecipes) {
            this.customSetupRecipes = customSetupRecipes;
            return this;
        }
        public Builder customSetupRecipes(@Nullable List<String> customSetupRecipes) {
            this.customSetupRecipes = Codegen.ofNullable(customSetupRecipes);
            return this;
        }
        public Builder customSetupRecipes(String... customSetupRecipes) {
            return customSetupRecipes(List.of(customSetupRecipes));
        }
        public Builder customShutdownRecipes(@Nullable Output<List<String>> customShutdownRecipes) {
            this.customShutdownRecipes = customShutdownRecipes;
            return this;
        }
        public Builder customShutdownRecipes(@Nullable List<String> customShutdownRecipes) {
            this.customShutdownRecipes = Codegen.ofNullable(customShutdownRecipes);
            return this;
        }
        public Builder customShutdownRecipes(String... customShutdownRecipes) {
            return customShutdownRecipes(List.of(customShutdownRecipes));
        }
        public Builder customUndeployRecipes(@Nullable Output<List<String>> customUndeployRecipes) {
            this.customUndeployRecipes = customUndeployRecipes;
            return this;
        }
        public Builder customUndeployRecipes(@Nullable List<String> customUndeployRecipes) {
            this.customUndeployRecipes = Codegen.ofNullable(customUndeployRecipes);
            return this;
        }
        public Builder customUndeployRecipes(String... customUndeployRecipes) {
            return customUndeployRecipes(List.of(customUndeployRecipes));
        }
        public Builder drainElbOnShutdown(@Nullable Output<Boolean> drainElbOnShutdown) {
            this.drainElbOnShutdown = drainElbOnShutdown;
            return this;
        }
        public Builder drainElbOnShutdown(@Nullable Boolean drainElbOnShutdown) {
            this.drainElbOnShutdown = Codegen.ofNullable(drainElbOnShutdown);
            return this;
        }
        public Builder ebsVolumes(@Nullable Output<List<MysqlLayerEbsVolumeArgs>> ebsVolumes) {
            this.ebsVolumes = ebsVolumes;
            return this;
        }
        public Builder ebsVolumes(@Nullable List<MysqlLayerEbsVolumeArgs> ebsVolumes) {
            this.ebsVolumes = Codegen.ofNullable(ebsVolumes);
            return this;
        }
        public Builder ebsVolumes(MysqlLayerEbsVolumeArgs... ebsVolumes) {
            return ebsVolumes(List.of(ebsVolumes));
        }
        public Builder elasticLoadBalancer(@Nullable Output<String> elasticLoadBalancer) {
            this.elasticLoadBalancer = elasticLoadBalancer;
            return this;
        }
        public Builder elasticLoadBalancer(@Nullable String elasticLoadBalancer) {
            this.elasticLoadBalancer = Codegen.ofNullable(elasticLoadBalancer);
            return this;
        }
        public Builder installUpdatesOnBoot(@Nullable Output<Boolean> installUpdatesOnBoot) {
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            return this;
        }
        public Builder installUpdatesOnBoot(@Nullable Boolean installUpdatesOnBoot) {
            this.installUpdatesOnBoot = Codegen.ofNullable(installUpdatesOnBoot);
            return this;
        }
        public Builder instanceShutdownTimeout(@Nullable Output<Integer> instanceShutdownTimeout) {
            this.instanceShutdownTimeout = instanceShutdownTimeout;
            return this;
        }
        public Builder instanceShutdownTimeout(@Nullable Integer instanceShutdownTimeout) {
            this.instanceShutdownTimeout = Codegen.ofNullable(instanceShutdownTimeout);
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
        public Builder rootPassword(@Nullable Output<String> rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }
        public Builder rootPassword(@Nullable String rootPassword) {
            this.rootPassword = Codegen.ofNullable(rootPassword);
            return this;
        }
        public Builder rootPasswordOnAllInstances(@Nullable Output<Boolean> rootPasswordOnAllInstances) {
            this.rootPasswordOnAllInstances = rootPasswordOnAllInstances;
            return this;
        }
        public Builder rootPasswordOnAllInstances(@Nullable Boolean rootPasswordOnAllInstances) {
            this.rootPasswordOnAllInstances = Codegen.ofNullable(rootPasswordOnAllInstances);
            return this;
        }
        public Builder stackId(Output<String> stackId) {
            this.stackId = Objects.requireNonNull(stackId);
            return this;
        }
        public Builder stackId(String stackId) {
            this.stackId = Output.of(Objects.requireNonNull(stackId));
            return this;
        }
        public Builder systemPackages(@Nullable Output<List<String>> systemPackages) {
            this.systemPackages = systemPackages;
            return this;
        }
        public Builder systemPackages(@Nullable List<String> systemPackages) {
            this.systemPackages = Codegen.ofNullable(systemPackages);
            return this;
        }
        public Builder systemPackages(String... systemPackages) {
            return systemPackages(List.of(systemPackages));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder useEbsOptimizedInstances(@Nullable Output<Boolean> useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = useEbsOptimizedInstances;
            return this;
        }
        public Builder useEbsOptimizedInstances(@Nullable Boolean useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = Codegen.ofNullable(useEbsOptimizedInstances);
            return this;
        }        public MysqlLayerArgs build() {
            return new MysqlLayerArgs(autoAssignElasticIps, autoAssignPublicIps, autoHealing, cloudwatchConfiguration, customConfigureRecipes, customDeployRecipes, customInstanceProfileArn, customJson, customSecurityGroupIds, customSetupRecipes, customShutdownRecipes, customUndeployRecipes, drainElbOnShutdown, ebsVolumes, elasticLoadBalancer, installUpdatesOnBoot, instanceShutdownTimeout, name, rootPassword, rootPasswordOnAllInstances, stackId, systemPackages, tags, useEbsOptimizedInstances);
        }
    }
}
