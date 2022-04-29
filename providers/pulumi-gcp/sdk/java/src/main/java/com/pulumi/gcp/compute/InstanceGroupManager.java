// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.InstanceGroupManagerArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerState;
import com.pulumi.gcp.compute.outputs.InstanceGroupManagerAutoHealingPolicies;
import com.pulumi.gcp.compute.outputs.InstanceGroupManagerNamedPort;
import com.pulumi.gcp.compute.outputs.InstanceGroupManagerStatefulDisk;
import com.pulumi.gcp.compute.outputs.InstanceGroupManagerStatus;
import com.pulumi.gcp.compute.outputs.InstanceGroupManagerUpdatePolicy;
import com.pulumi.gcp.compute.outputs.InstanceGroupManagerVersion;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Google Compute Engine Instance Group Manager API creates and manages pools
 * of homogeneous Compute Engine virtual machine instances from a common instance
 * template. For more information, see [the official documentation](https://cloud.google.com/compute/docs/instance-groups/manager)
 * and [API](https://cloud.google.com/compute/docs/reference/latest/instanceGroupManagers)
 * 
 * &gt; **Note:** Use [gcp.compute.RegionInstanceGroupManager](https://www.terraform.io/docs/providers/google/r/compute_region_instance_group_manager.html) to create a regional (multi-zone) instance group manager.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Instance group managers can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroupManager:InstanceGroupManager appserver projects/{{project}}/zones/{{zone}}/instanceGroupManagers/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroupManager:InstanceGroupManager appserver {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroupManager:InstanceGroupManager appserver {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroupManager:InstanceGroupManager appserver {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/instanceGroupManager:InstanceGroupManager")
public class InstanceGroupManager extends CustomResource {
    /**
     * The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * 
     */
    @Export(name="autoHealingPolicies", type=InstanceGroupManagerAutoHealingPolicies.class, parameters={})
    private Output</* @Nullable */ InstanceGroupManagerAutoHealingPolicies> autoHealingPolicies;

    /**
     * @return The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * 
     */
    public Output<Optional<InstanceGroupManagerAutoHealingPolicies>> autoHealingPolicies() {
        return Codegen.optional(this.autoHealingPolicies);
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
    @Export(name="baseInstanceName", type=String.class, parameters={})
    private Output<String> baseInstanceName;

    /**
     * @return The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     * 
     */
    public Output<String> baseInstanceName() {
        return this.baseInstanceName;
    }
    /**
     * An optional textual description of the instance
     * group manager.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional textual description of the instance
     * group manager.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The fingerprint of the instance group manager.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return The fingerprint of the instance group manager.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The full URL of the instance group created by the manager.
     * 
     */
    @Export(name="instanceGroup", type=String.class, parameters={})
    private Output<String> instanceGroup;

    /**
     * @return The full URL of the instance group created by the manager.
     * 
     */
    public Output<String> instanceGroup() {
        return this.instanceGroup;
    }
    /**
     * - Version name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return - Version name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The named port configuration. See the section below
     * for details on configuration.
     * 
     */
    @Export(name="namedPorts", type=List.class, parameters={InstanceGroupManagerNamedPort.class})
    private Output</* @Nullable */ List<InstanceGroupManagerNamedPort>> namedPorts;

    /**
     * @return The named port configuration. See the section below
     * for details on configuration.
     * 
     */
    public Output<Optional<List<InstanceGroupManagerNamedPort>>> namedPorts() {
        return Codegen.optional(this.namedPorts);
    }
    @Export(name="operation", type=String.class, parameters={})
    private Output<String> operation;

    public Output<String> operation() {
        return this.operation;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The URL of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URL of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * ) Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
     * 
     */
    @Export(name="statefulDisks", type=List.class, parameters={InstanceGroupManagerStatefulDisk.class})
    private Output</* @Nullable */ List<InstanceGroupManagerStatefulDisk>> statefulDisks;

    /**
     * @return ) Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs).
     * 
     */
    public Output<Optional<List<InstanceGroupManagerStatefulDisk>>> statefulDisks() {
        return Codegen.optional(this.statefulDisks);
    }
    /**
     * The status of this managed instance group.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={InstanceGroupManagerStatus.class})
    private Output<List<InstanceGroupManagerStatus>> statuses;

    /**
     * @return The status of this managed instance group.
     * 
     */
    public Output<List<InstanceGroupManagerStatus>> statuses() {
        return this.statuses;
    }
    /**
     * The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     * 
     */
    @Export(name="targetPools", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> targetPools;

    /**
     * @return The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     * 
     */
    public Output<Optional<List<String>>> targetPools() {
        return Codegen.optional(this.targetPools);
    }
    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @Export(name="targetSize", type=Integer.class, parameters={})
    private Output<Integer> targetSize;

    /**
     * @return - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    public Output<Integer> targetSize() {
        return this.targetSize;
    }
    /**
     * The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers/patch)
     * 
     */
    @Export(name="updatePolicy", type=InstanceGroupManagerUpdatePolicy.class, parameters={})
    private Output<InstanceGroupManagerUpdatePolicy> updatePolicy;

    /**
     * @return The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers/patch)
     * 
     */
    public Output<InstanceGroupManagerUpdatePolicy> updatePolicy() {
        return this.updatePolicy;
    }
    /**
     * Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * 
     */
    @Export(name="versions", type=List.class, parameters={InstanceGroupManagerVersion.class})
    private Output<List<InstanceGroupManagerVersion>> versions;

    /**
     * @return Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * 
     */
    public Output<List<InstanceGroupManagerVersion>> versions() {
        return this.versions;
    }
    /**
     * Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, this provider will
     * continue trying until it times out.
     * 
     */
    @Export(name="waitForInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> waitForInstances;

    /**
     * @return Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, this provider will
     * continue trying until it times out.
     * 
     */
    public Output<Optional<Boolean>> waitForInstances() {
        return Codegen.optional(this.waitForInstances);
    }
    /**
     * When used with `wait_for_instances` it specifies the status to wait for.
     * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
     * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
     * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
     * 
     */
    @Export(name="waitForInstancesStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> waitForInstancesStatus;

    /**
     * @return When used with `wait_for_instances` it specifies the status to wait for.
     * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
     * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
     * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
     * 
     */
    public Output<Optional<String>> waitForInstancesStatus() {
        return Codegen.optional(this.waitForInstancesStatus);
    }
    /**
     * The zone that instances in this group should be created
     * in.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The zone that instances in this group should be created
     * in.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceGroupManager(String name) {
        this(name, InstanceGroupManagerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceGroupManager(String name, InstanceGroupManagerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceGroupManager(String name, InstanceGroupManagerArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:compute/instanceGroupManager:InstanceGroupManager", name, args == null ? InstanceGroupManagerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceGroupManager(String name, Output<String> id, @Nullable InstanceGroupManagerState state, @Nullable CustomResourceOptions options) {
        super("gcp:compute/instanceGroupManager:InstanceGroupManager", name, state, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceGroupManager get(String name, Output<String> id, @Nullable InstanceGroupManagerState state, @Nullable CustomResourceOptions options) {
        return new InstanceGroupManager(name, id, state, options);
    }
}
