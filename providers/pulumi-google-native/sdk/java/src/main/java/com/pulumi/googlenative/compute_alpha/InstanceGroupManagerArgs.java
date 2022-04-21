// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.InstanceGroupManagerFailoverAction;
import com.pulumi.googlenative.compute_alpha.inputs.DistributionPolicyArgs;
import com.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerAllInstancesConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerAutoHealingPolicyArgs;
import com.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerInstanceLifecyclePolicyArgs;
import com.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerStandbyPolicyArgs;
import com.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerUpdatePolicyArgs;
import com.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerVersionArgs;
import com.pulumi.googlenative.compute_alpha.inputs.NamedPortArgs;
import com.pulumi.googlenative.compute_alpha.inputs.StatefulPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerArgs Empty = new InstanceGroupManagerArgs();

    /**
     * Specifies the instances configs overrides that should be applied for all instances in the MIG.
     * 
     */
    @Import(name="allInstancesConfig")
    private @Nullable Output<InstanceGroupManagerAllInstancesConfigArgs> allInstancesConfig;

    public Optional<Output<InstanceGroupManagerAllInstancesConfigArgs>> allInstancesConfig() {
        return Optional.ofNullable(this.allInstancesConfig);
    }

    /**
     * The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    @Import(name="autoHealingPolicies")
    private @Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies;

    public Optional<Output<List<InstanceGroupManagerAutoHealingPolicyArgs>>> autoHealingPolicies() {
        return Optional.ofNullable(this.autoHealingPolicies);
    }

    /**
     * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    @Import(name="baseInstanceName")
    private @Nullable Output<String> baseInstanceName;

    public Optional<Output<String>> baseInstanceName() {
        return Optional.ofNullable(this.baseInstanceName);
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    @Import(name="distributionPolicy")
    private @Nullable Output<DistributionPolicyArgs> distributionPolicy;

    public Optional<Output<DistributionPolicyArgs>> distributionPolicy() {
        return Optional.ofNullable(this.distributionPolicy);
    }

    /**
     * The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
     * 
     */
    @Import(name="failoverAction")
    private @Nullable Output<InstanceGroupManagerFailoverAction> failoverAction;

    public Optional<Output<InstanceGroupManagerFailoverAction>> failoverAction() {
        return Optional.ofNullable(this.failoverAction);
    }

    /**
     * Instance lifecycle policy for this Instance Group Manager.
     * 
     */
    @Import(name="instanceLifecyclePolicy")
    private @Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyArgs> instanceLifecyclePolicy;

    public Optional<Output<InstanceGroupManagerInstanceLifecyclePolicyArgs>> instanceLifecyclePolicy() {
        return Optional.ofNullable(this.instanceLifecyclePolicy);
    }

    /**
     * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE.
     * 
     */
    @Import(name="instanceTemplate")
    private @Nullable Output<String> instanceTemplate;

    public Optional<Output<String>> instanceTemplate() {
        return Optional.ofNullable(this.instanceTemplate);
    }

    /**
     * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    @Import(name="namedPorts")
    private @Nullable Output<List<NamedPortArgs>> namedPorts;

    public Optional<Output<List<NamedPortArgs>>> namedPorts() {
        return Optional.ofNullable(this.namedPorts);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Standby policy for stopped and suspended instances.
     * 
     */
    @Import(name="standbyPolicy")
    private @Nullable Output<InstanceGroupManagerStandbyPolicyArgs> standbyPolicy;

    public Optional<Output<InstanceGroupManagerStandbyPolicyArgs>> standbyPolicy() {
        return Optional.ofNullable(this.standbyPolicy);
    }

    /**
     * Stateful configuration for this Instanced Group Manager
     * 
     */
    @Import(name="statefulPolicy")
    private @Nullable Output<StatefulPolicyArgs> statefulPolicy;

    public Optional<Output<StatefulPolicyArgs>> statefulPolicy() {
        return Optional.ofNullable(this.statefulPolicy);
    }

    /**
     * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    @Import(name="targetPools")
    private @Nullable Output<List<String>> targetPools;

    public Optional<Output<List<String>>> targetPools() {
        return Optional.ofNullable(this.targetPools);
    }

    /**
     * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    @Import(name="targetSize")
    private @Nullable Output<Integer> targetSize;

    public Optional<Output<Integer>> targetSize() {
        return Optional.ofNullable(this.targetSize);
    }

    /**
     * The target number of stopped instances for this managed instance group. This number changes when you: - Stop instance using the stopInstances method or start instances using the startInstances method. - Manually change the targetStoppedSize using the update method.
     * 
     */
    @Import(name="targetStoppedSize")
    private @Nullable Output<Integer> targetStoppedSize;

    public Optional<Output<Integer>> targetStoppedSize() {
        return Optional.ofNullable(this.targetStoppedSize);
    }

    /**
     * The target number of suspended instances for this managed instance group. This number changes when you: - Suspend instance using the suspendInstances method or resume instances using the resumeInstances method. - Manually change the targetSuspendedSize using the update method.
     * 
     */
    @Import(name="targetSuspendedSize")
    private @Nullable Output<Integer> targetSuspendedSize;

    public Optional<Output<Integer>> targetSuspendedSize() {
        return Optional.ofNullable(this.targetSuspendedSize);
    }

    /**
     * The update policy for this managed instance group.
     * 
     */
    @Import(name="updatePolicy")
    private @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;

    public Optional<Output<InstanceGroupManagerUpdatePolicyArgs>> updatePolicy() {
        return Optional.ofNullable(this.updatePolicy);
    }

    /**
     * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    @Import(name="versions")
    private @Nullable Output<List<InstanceGroupManagerVersionArgs>> versions;

    public Optional<Output<List<InstanceGroupManagerVersionArgs>>> versions() {
        return Optional.ofNullable(this.versions);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceGroupManagerArgs() {}

    private InstanceGroupManagerArgs(InstanceGroupManagerArgs $) {
        this.allInstancesConfig = $.allInstancesConfig;
        this.autoHealingPolicies = $.autoHealingPolicies;
        this.baseInstanceName = $.baseInstanceName;
        this.description = $.description;
        this.distributionPolicy = $.distributionPolicy;
        this.failoverAction = $.failoverAction;
        this.instanceLifecyclePolicy = $.instanceLifecyclePolicy;
        this.instanceTemplate = $.instanceTemplate;
        this.name = $.name;
        this.namedPorts = $.namedPorts;
        this.project = $.project;
        this.requestId = $.requestId;
        this.serviceAccount = $.serviceAccount;
        this.standbyPolicy = $.standbyPolicy;
        this.statefulPolicy = $.statefulPolicy;
        this.targetPools = $.targetPools;
        this.targetSize = $.targetSize;
        this.targetStoppedSize = $.targetStoppedSize;
        this.targetSuspendedSize = $.targetSuspendedSize;
        this.updatePolicy = $.updatePolicy;
        this.versions = $.versions;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerArgs $;

        public Builder() {
            $ = new InstanceGroupManagerArgs();
        }

        public Builder(InstanceGroupManagerArgs defaults) {
            $ = new InstanceGroupManagerArgs(Objects.requireNonNull(defaults));
        }

        public Builder allInstancesConfig(@Nullable Output<InstanceGroupManagerAllInstancesConfigArgs> allInstancesConfig) {
            $.allInstancesConfig = allInstancesConfig;
            return this;
        }

        public Builder allInstancesConfig(InstanceGroupManagerAllInstancesConfigArgs allInstancesConfig) {
            return allInstancesConfig(Output.of(allInstancesConfig));
        }

        public Builder autoHealingPolicies(@Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies) {
            $.autoHealingPolicies = autoHealingPolicies;
            return this;
        }

        public Builder autoHealingPolicies(List<InstanceGroupManagerAutoHealingPolicyArgs> autoHealingPolicies) {
            return autoHealingPolicies(Output.of(autoHealingPolicies));
        }

        public Builder autoHealingPolicies(InstanceGroupManagerAutoHealingPolicyArgs... autoHealingPolicies) {
            return autoHealingPolicies(List.of(autoHealingPolicies));
        }

        public Builder baseInstanceName(@Nullable Output<String> baseInstanceName) {
            $.baseInstanceName = baseInstanceName;
            return this;
        }

        public Builder baseInstanceName(String baseInstanceName) {
            return baseInstanceName(Output.of(baseInstanceName));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder distributionPolicy(@Nullable Output<DistributionPolicyArgs> distributionPolicy) {
            $.distributionPolicy = distributionPolicy;
            return this;
        }

        public Builder distributionPolicy(DistributionPolicyArgs distributionPolicy) {
            return distributionPolicy(Output.of(distributionPolicy));
        }

        public Builder failoverAction(@Nullable Output<InstanceGroupManagerFailoverAction> failoverAction) {
            $.failoverAction = failoverAction;
            return this;
        }

        public Builder failoverAction(InstanceGroupManagerFailoverAction failoverAction) {
            return failoverAction(Output.of(failoverAction));
        }

        public Builder instanceLifecyclePolicy(@Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyArgs> instanceLifecyclePolicy) {
            $.instanceLifecyclePolicy = instanceLifecyclePolicy;
            return this;
        }

        public Builder instanceLifecyclePolicy(InstanceGroupManagerInstanceLifecyclePolicyArgs instanceLifecyclePolicy) {
            return instanceLifecyclePolicy(Output.of(instanceLifecyclePolicy));
        }

        public Builder instanceTemplate(@Nullable Output<String> instanceTemplate) {
            $.instanceTemplate = instanceTemplate;
            return this;
        }

        public Builder instanceTemplate(String instanceTemplate) {
            return instanceTemplate(Output.of(instanceTemplate));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namedPorts(@Nullable Output<List<NamedPortArgs>> namedPorts) {
            $.namedPorts = namedPorts;
            return this;
        }

        public Builder namedPorts(List<NamedPortArgs> namedPorts) {
            return namedPorts(Output.of(namedPorts));
        }

        public Builder namedPorts(NamedPortArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public Builder standbyPolicy(@Nullable Output<InstanceGroupManagerStandbyPolicyArgs> standbyPolicy) {
            $.standbyPolicy = standbyPolicy;
            return this;
        }

        public Builder standbyPolicy(InstanceGroupManagerStandbyPolicyArgs standbyPolicy) {
            return standbyPolicy(Output.of(standbyPolicy));
        }

        public Builder statefulPolicy(@Nullable Output<StatefulPolicyArgs> statefulPolicy) {
            $.statefulPolicy = statefulPolicy;
            return this;
        }

        public Builder statefulPolicy(StatefulPolicyArgs statefulPolicy) {
            return statefulPolicy(Output.of(statefulPolicy));
        }

        public Builder targetPools(@Nullable Output<List<String>> targetPools) {
            $.targetPools = targetPools;
            return this;
        }

        public Builder targetPools(List<String> targetPools) {
            return targetPools(Output.of(targetPools));
        }

        public Builder targetPools(String... targetPools) {
            return targetPools(List.of(targetPools));
        }

        public Builder targetSize(@Nullable Output<Integer> targetSize) {
            $.targetSize = targetSize;
            return this;
        }

        public Builder targetSize(Integer targetSize) {
            return targetSize(Output.of(targetSize));
        }

        public Builder targetStoppedSize(@Nullable Output<Integer> targetStoppedSize) {
            $.targetStoppedSize = targetStoppedSize;
            return this;
        }

        public Builder targetStoppedSize(Integer targetStoppedSize) {
            return targetStoppedSize(Output.of(targetStoppedSize));
        }

        public Builder targetSuspendedSize(@Nullable Output<Integer> targetSuspendedSize) {
            $.targetSuspendedSize = targetSuspendedSize;
            return this;
        }

        public Builder targetSuspendedSize(Integer targetSuspendedSize) {
            return targetSuspendedSize(Output.of(targetSuspendedSize));
        }

        public Builder updatePolicy(@Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy) {
            $.updatePolicy = updatePolicy;
            return this;
        }

        public Builder updatePolicy(InstanceGroupManagerUpdatePolicyArgs updatePolicy) {
            return updatePolicy(Output.of(updatePolicy));
        }

        public Builder versions(@Nullable Output<List<InstanceGroupManagerVersionArgs>> versions) {
            $.versions = versions;
            return this;
        }

        public Builder versions(List<InstanceGroupManagerVersionArgs> versions) {
            return versions(Output.of(versions));
        }

        public Builder versions(InstanceGroupManagerVersionArgs... versions) {
            return versions(List.of(versions));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceGroupManagerArgs build() {
            return $;
        }
    }

}
