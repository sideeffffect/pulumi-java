// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerAutoHealingPoliciesArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerNamedPortArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatefulDiskArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerUpdatePolicyArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerState extends ResourceArgs {

    public static final InstanceGroupManagerState Empty = new InstanceGroupManagerState();

    /**
     * The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * 
     */
    @Import(name="autoHealingPolicies")
    private @Nullable Output<InstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies;

    /**
     * @return The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * 
     */
    public Optional<Output<InstanceGroupManagerAutoHealingPoliciesArgs>> autoHealingPolicies() {
        return Optional.ofNullable(this.autoHealingPolicies);
    }

    /**
     * The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     * 
     */
    @Import(name="baseInstanceName")
    private @Nullable Output<String> baseInstanceName;

    /**
     * @return The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     * 
     */
    public Optional<Output<String>> baseInstanceName() {
        return Optional.ofNullable(this.baseInstanceName);
    }

    /**
     * An optional textual description of the instance
     * group manager.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional textual description of the instance
     * group manager.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The fingerprint of the instance group manager.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return The fingerprint of the instance group manager.
     * 
     */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * The full URL of the instance group created by the manager.
     * 
     */
    @Import(name="instanceGroup")
    private @Nullable Output<String> instanceGroup;

    /**
     * @return The full URL of the instance group created by the manager.
     * 
     */
    public Optional<Output<String>> instanceGroup() {
        return Optional.ofNullable(this.instanceGroup);
    }

    /**
     * - Version name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return - Version name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The named port configuration. See the section below
     * for details on configuration.
     * 
     */
    @Import(name="namedPorts")
    private @Nullable Output<List<InstanceGroupManagerNamedPortArgs>> namedPorts;

    /**
     * @return The named port configuration. See the section below
     * for details on configuration.
     * 
     */
    public Optional<Output<List<InstanceGroupManagerNamedPortArgs>>> namedPorts() {
        return Optional.ofNullable(this.namedPorts);
    }

    @Import(name="operation")
    private @Nullable Output<String> operation;

    public Optional<Output<String>> operation() {
        return Optional.ofNullable(this.operation);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The URL of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The URL of the created resource.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * ) Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
     * 
     */
    @Import(name="statefulDisks")
    private @Nullable Output<List<InstanceGroupManagerStatefulDiskArgs>> statefulDisks;

    /**
     * @return ) Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
     * 
     */
    public Optional<Output<List<InstanceGroupManagerStatefulDiskArgs>>> statefulDisks() {
        return Optional.ofNullable(this.statefulDisks);
    }

    /**
     * The status of this managed instance group.
     * 
     */
    @Import(name="statuses")
    private @Nullable Output<List<InstanceGroupManagerStatusArgs>> statuses;

    /**
     * @return The status of this managed instance group.
     * 
     */
    public Optional<Output<List<InstanceGroupManagerStatusArgs>>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    /**
     * The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     * 
     */
    @Import(name="targetPools")
    private @Nullable Output<List<String>> targetPools;

    /**
     * @return The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     * 
     */
    public Optional<Output<List<String>>> targetPools() {
        return Optional.ofNullable(this.targetPools);
    }

    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @Import(name="targetSize")
    private @Nullable Output<Integer> targetSize;

    /**
     * @return - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    public Optional<Output<Integer>> targetSize() {
        return Optional.ofNullable(this.targetSize);
    }

    /**
     * The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers/patch)
     * 
     */
    @Import(name="updatePolicy")
    private @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;

    /**
     * @return The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers/patch)
     * 
     */
    public Optional<Output<InstanceGroupManagerUpdatePolicyArgs>> updatePolicy() {
        return Optional.ofNullable(this.updatePolicy);
    }

    /**
     * Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * 
     */
    @Import(name="versions")
    private @Nullable Output<List<InstanceGroupManagerVersionArgs>> versions;

    /**
     * @return Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InstanceGroupManagerVersionArgs>>> versions() {
        return Optional.ofNullable(this.versions);
    }

    /**
     * Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, this provider will
     * continue trying until it times out.
     * 
     */
    @Import(name="waitForInstances")
    private @Nullable Output<Boolean> waitForInstances;

    /**
     * @return Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, this provider will
     * continue trying until it times out.
     * 
     */
    public Optional<Output<Boolean>> waitForInstances() {
        return Optional.ofNullable(this.waitForInstances);
    }

    /**
     * When used with `wait_for_instances` it specifies the status to wait for.
     * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
     * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
     * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
     * 
     */
    @Import(name="waitForInstancesStatus")
    private @Nullable Output<String> waitForInstancesStatus;

    /**
     * @return When used with `wait_for_instances` it specifies the status to wait for.
     * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
     * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
     * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
     * 
     */
    public Optional<Output<String>> waitForInstancesStatus() {
        return Optional.ofNullable(this.waitForInstancesStatus);
    }

    /**
     * The zone that instances in this group should be created
     * in.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The zone that instances in this group should be created
     * in.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceGroupManagerState() {}

    private InstanceGroupManagerState(InstanceGroupManagerState $) {
        this.autoHealingPolicies = $.autoHealingPolicies;
        this.baseInstanceName = $.baseInstanceName;
        this.description = $.description;
        this.fingerprint = $.fingerprint;
        this.instanceGroup = $.instanceGroup;
        this.name = $.name;
        this.namedPorts = $.namedPorts;
        this.operation = $.operation;
        this.project = $.project;
        this.selfLink = $.selfLink;
        this.statefulDisks = $.statefulDisks;
        this.statuses = $.statuses;
        this.targetPools = $.targetPools;
        this.targetSize = $.targetSize;
        this.updatePolicy = $.updatePolicy;
        this.versions = $.versions;
        this.waitForInstances = $.waitForInstances;
        this.waitForInstancesStatus = $.waitForInstancesStatus;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerState $;

        public Builder() {
            $ = new InstanceGroupManagerState();
        }

        public Builder(InstanceGroupManagerState defaults) {
            $ = new InstanceGroupManagerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoHealingPolicies The autohealing policies for this managed instance
         * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
         * 
         * @return builder
         * 
         */
        public Builder autoHealingPolicies(@Nullable Output<InstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies) {
            $.autoHealingPolicies = autoHealingPolicies;
            return this;
        }

        /**
         * @param autoHealingPolicies The autohealing policies for this managed instance
         * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
         * 
         * @return builder
         * 
         */
        public Builder autoHealingPolicies(InstanceGroupManagerAutoHealingPoliciesArgs autoHealingPolicies) {
            return autoHealingPolicies(Output.of(autoHealingPolicies));
        }

        /**
         * @param baseInstanceName The base instance name to use for
         * instances in this group. The value must be a valid
         * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
         * are lowercase letters, numbers, and hyphens (-). Instances are named by
         * appending a hyphen and a random four-character string to the base instance
         * name.
         * 
         * @return builder
         * 
         */
        public Builder baseInstanceName(@Nullable Output<String> baseInstanceName) {
            $.baseInstanceName = baseInstanceName;
            return this;
        }

        /**
         * @param baseInstanceName The base instance name to use for
         * instances in this group. The value must be a valid
         * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
         * are lowercase letters, numbers, and hyphens (-). Instances are named by
         * appending a hyphen and a random four-character string to the base instance
         * name.
         * 
         * @return builder
         * 
         */
        public Builder baseInstanceName(String baseInstanceName) {
            return baseInstanceName(Output.of(baseInstanceName));
        }

        /**
         * @param description An optional textual description of the instance
         * group manager.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional textual description of the instance
         * group manager.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fingerprint The fingerprint of the instance group manager.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint The fingerprint of the instance group manager.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param instanceGroup The full URL of the instance group created by the manager.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroup(@Nullable Output<String> instanceGroup) {
            $.instanceGroup = instanceGroup;
            return this;
        }

        /**
         * @param instanceGroup The full URL of the instance group created by the manager.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroup(String instanceGroup) {
            return instanceGroup(Output.of(instanceGroup));
        }

        /**
         * @param name - Version name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name - Version name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namedPorts The named port configuration. See the section below
         * for details on configuration.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(@Nullable Output<List<InstanceGroupManagerNamedPortArgs>> namedPorts) {
            $.namedPorts = namedPorts;
            return this;
        }

        /**
         * @param namedPorts The named port configuration. See the section below
         * for details on configuration.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(List<InstanceGroupManagerNamedPortArgs> namedPorts) {
            return namedPorts(Output.of(namedPorts));
        }

        /**
         * @param namedPorts The named port configuration. See the section below
         * for details on configuration.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(InstanceGroupManagerNamedPortArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }

        public Builder operation(@Nullable Output<String> operation) {
            $.operation = operation;
            return this;
        }

        public Builder operation(String operation) {
            return operation(Output.of(operation));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param selfLink The URL of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The URL of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param statefulDisks ) Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
         * 
         * @return builder
         * 
         */
        public Builder statefulDisks(@Nullable Output<List<InstanceGroupManagerStatefulDiskArgs>> statefulDisks) {
            $.statefulDisks = statefulDisks;
            return this;
        }

        /**
         * @param statefulDisks ) Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
         * 
         * @return builder
         * 
         */
        public Builder statefulDisks(List<InstanceGroupManagerStatefulDiskArgs> statefulDisks) {
            return statefulDisks(Output.of(statefulDisks));
        }

        /**
         * @param statefulDisks ) Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
         * 
         * @return builder
         * 
         */
        public Builder statefulDisks(InstanceGroupManagerStatefulDiskArgs... statefulDisks) {
            return statefulDisks(List.of(statefulDisks));
        }

        /**
         * @param statuses The status of this managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable Output<List<InstanceGroupManagerStatusArgs>> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses The status of this managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder statuses(List<InstanceGroupManagerStatusArgs> statuses) {
            return statuses(Output.of(statuses));
        }

        /**
         * @param statuses The status of this managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder statuses(InstanceGroupManagerStatusArgs... statuses) {
            return statuses(List.of(statuses));
        }

        /**
         * @param targetPools The full URL of all target pools to which new
         * instances in the group are added. Updating the target pools attribute does
         * not affect existing instances.
         * 
         * @return builder
         * 
         */
        public Builder targetPools(@Nullable Output<List<String>> targetPools) {
            $.targetPools = targetPools;
            return this;
        }

        /**
         * @param targetPools The full URL of all target pools to which new
         * instances in the group are added. Updating the target pools attribute does
         * not affect existing instances.
         * 
         * @return builder
         * 
         */
        public Builder targetPools(List<String> targetPools) {
            return targetPools(Output.of(targetPools));
        }

        /**
         * @param targetPools The full URL of all target pools to which new
         * instances in the group are added. Updating the target pools attribute does
         * not affect existing instances.
         * 
         * @return builder
         * 
         */
        public Builder targetPools(String... targetPools) {
            return targetPools(List.of(targetPools));
        }

        /**
         * @param targetSize - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetSize(@Nullable Output<Integer> targetSize) {
            $.targetSize = targetSize;
            return this;
        }

        /**
         * @param targetSize - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetSize(Integer targetSize) {
            return targetSize(Output.of(targetSize));
        }

        /**
         * @param updatePolicy The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers/patch)
         * 
         * @return builder
         * 
         */
        public Builder updatePolicy(@Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy) {
            $.updatePolicy = updatePolicy;
            return this;
        }

        /**
         * @param updatePolicy The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers/patch)
         * 
         * @return builder
         * 
         */
        public Builder updatePolicy(InstanceGroupManagerUpdatePolicyArgs updatePolicy) {
            return updatePolicy(Output.of(updatePolicy));
        }

        /**
         * @param versions Application versions managed by this instance group. Each
         * version deals with a specific instance template, allowing canary release scenarios.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versions(@Nullable Output<List<InstanceGroupManagerVersionArgs>> versions) {
            $.versions = versions;
            return this;
        }

        /**
         * @param versions Application versions managed by this instance group. Each
         * version deals with a specific instance template, allowing canary release scenarios.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versions(List<InstanceGroupManagerVersionArgs> versions) {
            return versions(Output.of(versions));
        }

        /**
         * @param versions Application versions managed by this instance group. Each
         * version deals with a specific instance template, allowing canary release scenarios.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versions(InstanceGroupManagerVersionArgs... versions) {
            return versions(List.of(versions));
        }

        /**
         * @param waitForInstances Whether to wait for all instances to be created/updated before
         * returning. Note that if this is set to true and the operation does not succeed, this provider will
         * continue trying until it times out.
         * 
         * @return builder
         * 
         */
        public Builder waitForInstances(@Nullable Output<Boolean> waitForInstances) {
            $.waitForInstances = waitForInstances;
            return this;
        }

        /**
         * @param waitForInstances Whether to wait for all instances to be created/updated before
         * returning. Note that if this is set to true and the operation does not succeed, this provider will
         * continue trying until it times out.
         * 
         * @return builder
         * 
         */
        public Builder waitForInstances(Boolean waitForInstances) {
            return waitForInstances(Output.of(waitForInstances));
        }

        /**
         * @param waitForInstancesStatus When used with `wait_for_instances` it specifies the status to wait for.
         * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
         * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
         * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
         * 
         * @return builder
         * 
         */
        public Builder waitForInstancesStatus(@Nullable Output<String> waitForInstancesStatus) {
            $.waitForInstancesStatus = waitForInstancesStatus;
            return this;
        }

        /**
         * @param waitForInstancesStatus When used with `wait_for_instances` it specifies the status to wait for.
         * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
         * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
         * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
         * 
         * @return builder
         * 
         */
        public Builder waitForInstancesStatus(String waitForInstancesStatus) {
            return waitForInstancesStatus(Output.of(waitForInstancesStatus));
        }

        /**
         * @param zone The zone that instances in this group should be created
         * in.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The zone that instances in this group should be created
         * in.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceGroupManagerState build() {
            return $;
        }
    }

}
