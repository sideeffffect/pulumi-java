// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class InstanceGroupManagerActionsSummaryResponse {
    /**
     * The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from the managed instance group without deleting it.
     * 
     */
    private final Integer abandoning;
    /**
     * The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails to create any of these instances, it tries again until it creates the instance successfully. If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries field will be populated.
     * 
     */
    private final Integer creating;
    /**
     * The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If the group fails to create any of these instances, it decreases the group's targetSize value accordingly.
     * 
     */
    private final Integer creatingWithoutRetries;
    /**
     * The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted.
     * 
     */
    private final Integer deleting;
    /**
     * The number of instances in the managed instance group that are running and have no scheduled actions.
     * 
     */
    private final Integer none;
    /**
     * The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated. Recreating an instance deletes the existing root persistent disk and creates a new disk from the image that is defined in the instance template.
     * 
     */
    private final Integer recreating;
    /**
     * The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a recreate action. For example, setting or removing target pools for the instance.
     * 
     */
    private final Integer refreshing;
    /**
     * The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted.
     * 
     */
    private final Integer restarting;
    /**
     * The number of instances in the managed instance group that are scheduled to be resumed or are currently being resumed.
     * 
     */
    private final Integer resuming;
    /**
     * The number of instances in the managed instance group that are scheduled to be started or are currently being started.
     * 
     */
    private final Integer starting;
    /**
     * The number of instances in the managed instance group that are scheduled to be stopped or are currently being stopped.
     * 
     */
    private final Integer stopping;
    /**
     * The number of instances in the managed instance group that are scheduled to be suspended or are currently being suspended.
     * 
     */
    private final Integer suspending;
    /**
     * The number of instances in the managed instance group that are being verified. See the managedInstances[].currentAction property in the listManagedInstances method documentation.
     * 
     */
    private final Integer verifying;

    @OutputCustomType.Constructor({"abandoning","creating","creatingWithoutRetries","deleting","none","recreating","refreshing","restarting","resuming","starting","stopping","suspending","verifying"})
    private InstanceGroupManagerActionsSummaryResponse(
        Integer abandoning,
        Integer creating,
        Integer creatingWithoutRetries,
        Integer deleting,
        Integer none,
        Integer recreating,
        Integer refreshing,
        Integer restarting,
        Integer resuming,
        Integer starting,
        Integer stopping,
        Integer suspending,
        Integer verifying) {
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
     * The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from the managed instance group without deleting it.
     * 
    */
    public Integer getAbandoning() {
        return this.abandoning;
    }
    /**
     * The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails to create any of these instances, it tries again until it creates the instance successfully. If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries field will be populated.
     * 
    */
    public Integer getCreating() {
        return this.creating;
    }
    /**
     * The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If the group fails to create any of these instances, it decreases the group's targetSize value accordingly.
     * 
    */
    public Integer getCreatingWithoutRetries() {
        return this.creatingWithoutRetries;
    }
    /**
     * The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted.
     * 
    */
    public Integer getDeleting() {
        return this.deleting;
    }
    /**
     * The number of instances in the managed instance group that are running and have no scheduled actions.
     * 
    */
    public Integer getNone() {
        return this.none;
    }
    /**
     * The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated. Recreating an instance deletes the existing root persistent disk and creates a new disk from the image that is defined in the instance template.
     * 
    */
    public Integer getRecreating() {
        return this.recreating;
    }
    /**
     * The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a recreate action. For example, setting or removing target pools for the instance.
     * 
    */
    public Integer getRefreshing() {
        return this.refreshing;
    }
    /**
     * The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted.
     * 
    */
    public Integer getRestarting() {
        return this.restarting;
    }
    /**
     * The number of instances in the managed instance group that are scheduled to be resumed or are currently being resumed.
     * 
    */
    public Integer getResuming() {
        return this.resuming;
    }
    /**
     * The number of instances in the managed instance group that are scheduled to be started or are currently being started.
     * 
    */
    public Integer getStarting() {
        return this.starting;
    }
    /**
     * The number of instances in the managed instance group that are scheduled to be stopped or are currently being stopped.
     * 
    */
    public Integer getStopping() {
        return this.stopping;
    }
    /**
     * The number of instances in the managed instance group that are scheduled to be suspended or are currently being suspended.
     * 
    */
    public Integer getSuspending() {
        return this.suspending;
    }
    /**
     * The number of instances in the managed instance group that are being verified. See the managedInstances[].currentAction property in the listManagedInstances method documentation.
     * 
    */
    public Integer getVerifying() {
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

        public Builder setAbandoning(Integer abandoning) {
            this.abandoning = Objects.requireNonNull(abandoning);
            return this;
        }

        public Builder setCreating(Integer creating) {
            this.creating = Objects.requireNonNull(creating);
            return this;
        }

        public Builder setCreatingWithoutRetries(Integer creatingWithoutRetries) {
            this.creatingWithoutRetries = Objects.requireNonNull(creatingWithoutRetries);
            return this;
        }

        public Builder setDeleting(Integer deleting) {
            this.deleting = Objects.requireNonNull(deleting);
            return this;
        }

        public Builder setNone(Integer none) {
            this.none = Objects.requireNonNull(none);
            return this;
        }

        public Builder setRecreating(Integer recreating) {
            this.recreating = Objects.requireNonNull(recreating);
            return this;
        }

        public Builder setRefreshing(Integer refreshing) {
            this.refreshing = Objects.requireNonNull(refreshing);
            return this;
        }

        public Builder setRestarting(Integer restarting) {
            this.restarting = Objects.requireNonNull(restarting);
            return this;
        }

        public Builder setResuming(Integer resuming) {
            this.resuming = Objects.requireNonNull(resuming);
            return this;
        }

        public Builder setStarting(Integer starting) {
            this.starting = Objects.requireNonNull(starting);
            return this;
        }

        public Builder setStopping(Integer stopping) {
            this.stopping = Objects.requireNonNull(stopping);
            return this;
        }

        public Builder setSuspending(Integer suspending) {
            this.suspending = Objects.requireNonNull(suspending);
            return this;
        }

        public Builder setVerifying(Integer verifying) {
            this.verifying = Objects.requireNonNull(verifying);
            return this;
        }
        public InstanceGroupManagerActionsSummaryResponse build() {
            return new InstanceGroupManagerActionsSummaryResponse(abandoning, creating, creatingWithoutRetries, deleting, none, recreating, refreshing, restarting, resuming, starting, stopping, suspending, verifying);
        }
    }
}
