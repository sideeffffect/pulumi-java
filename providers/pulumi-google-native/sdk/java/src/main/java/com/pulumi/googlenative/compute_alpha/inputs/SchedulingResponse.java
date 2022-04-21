// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.DurationResponse;
import com.pulumi.googlenative.compute_alpha.inputs.SchedulingNodeAffinityResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Sets the scheduling options for an Instance. NextID: 21
 * 
 */
public final class SchedulingResponse extends com.pulumi.resources.InvokeArgs {

    public static final SchedulingResponse Empty = new SchedulingResponse();

    /**
     * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
     */
    @Import(name="automaticRestart", required=true)
    private Boolean automaticRestart;

    public Boolean automaticRestart() {
        return this.automaticRestart;
    }

    /**
     * Specifies the availability domain (AD), which this instance should be scheduled on. The AD belongs to the spread GroupPlacementPolicy resource policy that has been assigned to the instance. Specify a value between 1-max count of availability domains in your GroupPlacementPolicy. See go/placement-policy-extension for more details.
     * 
     */
    @Import(name="availabilityDomain", required=true)
    private Integer availabilityDomain;

    public Integer availabilityDomain() {
        return this.availabilityDomain;
    }

    /**
     * Current number of vCPUs available for VM. 0 or unset means default vCPUs of the current machine type.
     * 
     */
    @Import(name="currentCpus", required=true)
    private Integer currentCpus;

    public Integer currentCpus() {
        return this.currentCpus;
    }

    /**
     * Current amount of memory (in MB) available for VM. 0 or unset means default amount of memory of the current machine type.
     * 
     */
    @Import(name="currentMemoryMb", required=true)
    private String currentMemoryMb;

    public String currentMemoryMb() {
        return this.currentMemoryMb;
    }

    /**
     * Specify the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
     * 
     */
    @Import(name="hostErrorTimeoutSeconds", required=true)
    private Integer hostErrorTimeoutSeconds;

    public Integer hostErrorTimeoutSeconds() {
        return this.hostErrorTimeoutSeconds;
    }

    /**
     * Specifies the termination action for the instance.
     * 
     */
    @Import(name="instanceTerminationAction", required=true)
    private String instanceTerminationAction;

    public String instanceTerminationAction() {
        return this.instanceTerminationAction;
    }

    /**
     * Defines whether the instance is tolerant of higher cpu latency. This can only be set during instance creation, or when the instance is not currently running. It must not be set if the preemptible option is also set.
     * 
     */
    @Import(name="latencyTolerant", required=true)
    private Boolean latencyTolerant;

    public Boolean latencyTolerant() {
        return this.latencyTolerant;
    }

    /**
     * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @Import(name="locationHint", required=true)
    private String locationHint;

    public String locationHint() {
        return this.locationHint;
    }

    /**
     * Specifies the number of hours after VM instance creation where the VM won&#39;t be scheduled for maintenance.
     * 
     */
    @Import(name="maintenanceFreezeDurationHours", required=true)
    private Integer maintenanceFreezeDurationHours;

    public Integer maintenanceFreezeDurationHours() {
        return this.maintenanceFreezeDurationHours;
    }

    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
     */
    @Import(name="maintenanceInterval", required=true)
    private String maintenanceInterval;

    public String maintenanceInterval() {
        return this.maintenanceInterval;
    }

    /**
     * Specifies the max run duration for the given instance. If specified, the instance termination action will be performed at the end of the run duration.
     * 
     */
    @Import(name="maxRunDuration", required=true)
    private DurationResponse maxRunDuration;

    public DurationResponse maxRunDuration() {
        return this.maxRunDuration;
    }

    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    @Import(name="minNodeCpus", required=true)
    private Integer minNodeCpus;

    public Integer minNodeCpus() {
        return this.minNodeCpus;
    }

    /**
     * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
     */
    @Import(name="nodeAffinities", required=true)
    private List<SchedulingNodeAffinityResponse> nodeAffinities;

    public List<SchedulingNodeAffinityResponse> nodeAffinities() {
        return this.nodeAffinities;
    }

    /**
     * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
     */
    @Import(name="onHostMaintenance", required=true)
    private String onHostMaintenance;

    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }

    /**
     * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
     */
    @Import(name="preemptible", required=true)
    private Boolean preemptible;

    public Boolean preemptible() {
        return this.preemptible;
    }

    /**
     * Specifies the provisioning model of the instance.
     * 
     */
    @Import(name="provisioningModel", required=true)
    private String provisioningModel;

    public String provisioningModel() {
        return this.provisioningModel;
    }

    /**
     * Specifies the timestamp, when the instance will be terminated, in RFC3339 text format. If specified, the instance termination action will be performed at the termination time.
     * 
     */
    @Import(name="terminationTime", required=true)
    private String terminationTime;

    public String terminationTime() {
        return this.terminationTime;
    }

    private SchedulingResponse() {}

    private SchedulingResponse(SchedulingResponse $) {
        this.automaticRestart = $.automaticRestart;
        this.availabilityDomain = $.availabilityDomain;
        this.currentCpus = $.currentCpus;
        this.currentMemoryMb = $.currentMemoryMb;
        this.hostErrorTimeoutSeconds = $.hostErrorTimeoutSeconds;
        this.instanceTerminationAction = $.instanceTerminationAction;
        this.latencyTolerant = $.latencyTolerant;
        this.locationHint = $.locationHint;
        this.maintenanceFreezeDurationHours = $.maintenanceFreezeDurationHours;
        this.maintenanceInterval = $.maintenanceInterval;
        this.maxRunDuration = $.maxRunDuration;
        this.minNodeCpus = $.minNodeCpus;
        this.nodeAffinities = $.nodeAffinities;
        this.onHostMaintenance = $.onHostMaintenance;
        this.preemptible = $.preemptible;
        this.provisioningModel = $.provisioningModel;
        this.terminationTime = $.terminationTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulingResponse $;

        public Builder() {
            $ = new SchedulingResponse();
        }

        public Builder(SchedulingResponse defaults) {
            $ = new SchedulingResponse(Objects.requireNonNull(defaults));
        }

        public Builder automaticRestart(Boolean automaticRestart) {
            $.automaticRestart = automaticRestart;
            return this;
        }

        public Builder availabilityDomain(Integer availabilityDomain) {
            $.availabilityDomain = availabilityDomain;
            return this;
        }

        public Builder currentCpus(Integer currentCpus) {
            $.currentCpus = currentCpus;
            return this;
        }

        public Builder currentMemoryMb(String currentMemoryMb) {
            $.currentMemoryMb = currentMemoryMb;
            return this;
        }

        public Builder hostErrorTimeoutSeconds(Integer hostErrorTimeoutSeconds) {
            $.hostErrorTimeoutSeconds = hostErrorTimeoutSeconds;
            return this;
        }

        public Builder instanceTerminationAction(String instanceTerminationAction) {
            $.instanceTerminationAction = instanceTerminationAction;
            return this;
        }

        public Builder latencyTolerant(Boolean latencyTolerant) {
            $.latencyTolerant = latencyTolerant;
            return this;
        }

        public Builder locationHint(String locationHint) {
            $.locationHint = locationHint;
            return this;
        }

        public Builder maintenanceFreezeDurationHours(Integer maintenanceFreezeDurationHours) {
            $.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
            return this;
        }

        public Builder maintenanceInterval(String maintenanceInterval) {
            $.maintenanceInterval = maintenanceInterval;
            return this;
        }

        public Builder maxRunDuration(DurationResponse maxRunDuration) {
            $.maxRunDuration = maxRunDuration;
            return this;
        }

        public Builder minNodeCpus(Integer minNodeCpus) {
            $.minNodeCpus = minNodeCpus;
            return this;
        }

        public Builder nodeAffinities(List<SchedulingNodeAffinityResponse> nodeAffinities) {
            $.nodeAffinities = nodeAffinities;
            return this;
        }

        public Builder nodeAffinities(SchedulingNodeAffinityResponse... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }

        public Builder onHostMaintenance(String onHostMaintenance) {
            $.onHostMaintenance = onHostMaintenance;
            return this;
        }

        public Builder preemptible(Boolean preemptible) {
            $.preemptible = preemptible;
            return this;
        }

        public Builder provisioningModel(String provisioningModel) {
            $.provisioningModel = provisioningModel;
            return this;
        }

        public Builder terminationTime(String terminationTime) {
            $.terminationTime = terminationTime;
            return this;
        }

        public SchedulingResponse build() {
            $.automaticRestart = Objects.requireNonNull($.automaticRestart, "expected parameter 'automaticRestart' to be non-null");
            $.availabilityDomain = Objects.requireNonNull($.availabilityDomain, "expected parameter 'availabilityDomain' to be non-null");
            $.currentCpus = Objects.requireNonNull($.currentCpus, "expected parameter 'currentCpus' to be non-null");
            $.currentMemoryMb = Objects.requireNonNull($.currentMemoryMb, "expected parameter 'currentMemoryMb' to be non-null");
            $.hostErrorTimeoutSeconds = Objects.requireNonNull($.hostErrorTimeoutSeconds, "expected parameter 'hostErrorTimeoutSeconds' to be non-null");
            $.instanceTerminationAction = Objects.requireNonNull($.instanceTerminationAction, "expected parameter 'instanceTerminationAction' to be non-null");
            $.latencyTolerant = Objects.requireNonNull($.latencyTolerant, "expected parameter 'latencyTolerant' to be non-null");
            $.locationHint = Objects.requireNonNull($.locationHint, "expected parameter 'locationHint' to be non-null");
            $.maintenanceFreezeDurationHours = Objects.requireNonNull($.maintenanceFreezeDurationHours, "expected parameter 'maintenanceFreezeDurationHours' to be non-null");
            $.maintenanceInterval = Objects.requireNonNull($.maintenanceInterval, "expected parameter 'maintenanceInterval' to be non-null");
            $.maxRunDuration = Objects.requireNonNull($.maxRunDuration, "expected parameter 'maxRunDuration' to be non-null");
            $.minNodeCpus = Objects.requireNonNull($.minNodeCpus, "expected parameter 'minNodeCpus' to be non-null");
            $.nodeAffinities = Objects.requireNonNull($.nodeAffinities, "expected parameter 'nodeAffinities' to be non-null");
            $.onHostMaintenance = Objects.requireNonNull($.onHostMaintenance, "expected parameter 'onHostMaintenance' to be non-null");
            $.preemptible = Objects.requireNonNull($.preemptible, "expected parameter 'preemptible' to be non-null");
            $.provisioningModel = Objects.requireNonNull($.provisioningModel, "expected parameter 'provisioningModel' to be non-null");
            $.terminationTime = Objects.requireNonNull($.terminationTime, "expected parameter 'terminationTime' to be non-null");
            return $;
        }
    }

}
