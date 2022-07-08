// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerActionsSummaryResponse {
    /**
     * @return The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from the managed instance group without deleting it.
     * 
     */
    private final Integer abandoning;
    /**
     * @return The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails to create any of these instances, it tries again until it creates the instance successfully. If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries field will be populated.
     * 
     */
    private final Integer creating;
    /**
     * @return The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If the group fails to create any of these instances, it decreases the group&#39;s targetSize value accordingly.
     * 
     */
    private final Integer creatingWithoutRetries;
    /**
     * @return The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted.
     * 
     */
    private final Integer deleting;
    /**
     * @return The number of instances in the managed instance group that are running and have no scheduled actions.
     * 
     */
    private final Integer none;
    /**
     * @return The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated. Recreating an instance deletes the existing root persistent disk and creates a new disk from the image that is defined in the instance template.
     * 
     */
    private final Integer recreating;
    /**
     * @return The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a recreate action. For example, setting or removing target pools for the instance.
     * 
     */
    private final Integer refreshing;
    /**
     * @return The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted.
     * 
     */
    private final Integer restarting;
    /**
     * @return The number of instances in the managed instance group that are scheduled to be resumed or are currently being resumed.
     * 
     */
    private final Integer resuming;
    /**
     * @return The number of instances in the managed instance group that are scheduled to be started or are currently being started.
     * 
     */
    private final Integer starting;
    /**
     * @return The number of instances in the managed instance group that are scheduled to be stopped or are currently being stopped.
     * 
     */
    private final Integer stopping;
    /**
     * @return The number of instances in the managed instance group that are scheduled to be suspended or are currently being suspended.
     * 
     */
    private final Integer suspending;
    /**
     * @return The number of instances in the managed instance group that are being verified. See the managedInstances[].currentAction property in the listManagedInstances method documentation.
     * 
     */
    private final Integer verifying;

    @CustomType.Constructor
    private InstanceGroupManagerActionsSummaryResponse(
        @CustomType.Parameter("abandoning") Integer abandoning,
        @CustomType.Parameter("creating") Integer creating,
        @CustomType.Parameter("creatingWithoutRetries") Integer creatingWithoutRetries,
        @CustomType.Parameter("deleting") Integer deleting,
        @CustomType.Parameter("none") Integer none,
        @CustomType.Parameter("recreating") Integer recreating,
        @CustomType.Parameter("refreshing") Integer refreshing,
        @CustomType.Parameter("restarting") Integer restarting,
        @CustomType.Parameter("resuming") Integer resuming,
        @CustomType.Parameter("starting") Integer starting,
        @CustomType.Parameter("stopping") Integer stopping,
        @CustomType.Parameter("suspending") Integer suspending,
        @CustomType.Parameter("verifying") Integer verifying) {
        this.abandoning = abandoning;
        this.creating = creating;
        this.creatingWithoutRetries = creatingWithoutRetries;
        this.deleting = deleting;
        this.none = none;
        this.recreating = recreating;
        this.refreshing = refreshing;
        this.restarting = restarting;
        this.resuming = resuming;
        this.starting = starting;
        this.stopping = stopping;
        this.suspending = suspending;
        this.verifying = verifying;
    }

    /**
     * @return The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from the managed instance group without deleting it.
     * 
     */
    public Integer abandoning() {
        return this.abandoning;
    }
    /**
     * @return The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails to create any of these instances, it tries again until it creates the instance successfully. If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries field will be populated.
     * 
     */
    public Integer creating() {
        return this.creating;
    }
    /**
     * @return The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If the group fails to create any of these instances, it decreases the group&#39;s targetSize value accordingly.
     * 
     */
    public Integer creatingWithoutRetries() {
        return this.creatingWithoutRetries;
    }
    /**
     * @return The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted.
     * 
     */
    public Integer deleting() {
        return this.deleting;
    }
    /**
     * @return The number of instances in the managed instance group that are running and have no scheduled actions.
     * 
     */
    public Integer none() {
        return this.none;
    }
    /**
     * @return The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated. Recreating an instance deletes the existing root persistent disk and creates a new disk from the image that is defined in the instance template.
     * 
     */
    public Integer recreating() {
        return this.recreating;
    }
    /**
     * @return The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a recreate action. For example, setting or removing target pools for the instance.
     * 
     */
    public Integer refreshing() {
        return this.refreshing;
    }
    /**
     * @return The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted.
     * 
     */
    public Integer restarting() {
        return this.restarting;
    }
    /**
     * @return The number of instances in the managed instance group that are scheduled to be resumed or are currently being resumed.
     * 
     */
    public Integer resuming() {
        return this.resuming;
    }
    /**
     * @return The number of instances in the managed instance group that are scheduled to be started or are currently being started.
     * 
     */
    public Integer starting() {
        return this.starting;
    }
    /**
     * @return The number of instances in the managed instance group that are scheduled to be stopped or are currently being stopped.
     * 
     */
    public Integer stopping() {
        return this.stopping;
    }
    /**
     * @return The number of instances in the managed instance group that are scheduled to be suspended or are currently being suspended.
     * 
     */
    public Integer suspending() {
        return this.suspending;
    }
    /**
     * @return The number of instances in the managed instance group that are being verified. See the managedInstances[].currentAction property in the listManagedInstances method documentation.
     * 
     */
    public Integer verifying() {
        return this.verifying;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerActionsSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer abandoning;
        private Integer creating;
        private Integer creatingWithoutRetries;
        private Integer deleting;
        private Integer none;
        private Integer recreating;
        private Integer refreshing;
        private Integer restarting;
        private Integer resuming;
        private Integer starting;
        private Integer stopping;
        private Integer suspending;
        private Integer verifying;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerActionsSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abandoning = defaults.abandoning;
    	      this.creating = defaults.creating;
    	      this.creatingWithoutRetries = defaults.creatingWithoutRetries;
    	      this.deleting = defaults.deleting;
    	      this.none = defaults.none;
    	      this.recreating = defaults.recreating;
    	      this.refreshing = defaults.refreshing;
    	      this.restarting = defaults.restarting;
    	      this.resuming = defaults.resuming;
    	      this.starting = defaults.starting;
    	      this.stopping = defaults.stopping;
    	      this.suspending = defaults.suspending;
    	      this.verifying = defaults.verifying;
        }

        public Builder abandoning(Integer abandoning) {
            this.abandoning = Objects.requireNonNull(abandoning);
            return this;
        }
        public Builder creating(Integer creating) {
            this.creating = Objects.requireNonNull(creating);
            return this;
        }
        public Builder creatingWithoutRetries(Integer creatingWithoutRetries) {
            this.creatingWithoutRetries = Objects.requireNonNull(creatingWithoutRetries);
            return this;
        }
        public Builder deleting(Integer deleting) {
            this.deleting = Objects.requireNonNull(deleting);
            return this;
        }
        public Builder none(Integer none) {
            this.none = Objects.requireNonNull(none);
            return this;
        }
        public Builder recreating(Integer recreating) {
            this.recreating = Objects.requireNonNull(recreating);
            return this;
        }
        public Builder refreshing(Integer refreshing) {
            this.refreshing = Objects.requireNonNull(refreshing);
            return this;
        }
        public Builder restarting(Integer restarting) {
            this.restarting = Objects.requireNonNull(restarting);
            return this;
        }
        public Builder resuming(Integer resuming) {
            this.resuming = Objects.requireNonNull(resuming);
            return this;
        }
        public Builder starting(Integer starting) {
            this.starting = Objects.requireNonNull(starting);
            return this;
        }
        public Builder stopping(Integer stopping) {
            this.stopping = Objects.requireNonNull(stopping);
            return this;
        }
        public Builder suspending(Integer suspending) {
            this.suspending = Objects.requireNonNull(suspending);
            return this;
        }
        public Builder verifying(Integer verifying) {
            this.verifying = Objects.requireNonNull(verifying);
            return this;
        }        public InstanceGroupManagerActionsSummaryResponse build() {
            return new InstanceGroupManagerActionsSummaryResponse(abandoning, creating, creatingWithoutRetries, deleting, none, recreating, refreshing, restarting, resuming, starting, stopping, suspending, verifying);
        }
    }
}
