// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs();

    /**
     * Optional. The time when cluster will be auto-deleted (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="autoDeleteTime")
    private @Nullable Output<String> autoDeleteTime;

    public Optional<Output<String>> autoDeleteTime() {
        return Optional.ofNullable(this.autoDeleteTime);
    }

    /**
     * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="autoDeleteTtl")
    private @Nullable Output<String> autoDeleteTtl;

    public Optional<Output<String>> autoDeleteTtl() {
        return Optional.ofNullable(this.autoDeleteTtl);
    }

    /**
     * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json).
     * 
     */
    @Import(name="idleDeleteTtl")
    private @Nullable Output<String> idleDeleteTtl;

    public Optional<Output<String>> idleDeleteTtl() {
        return Optional.ofNullable(this.idleDeleteTtl);
    }

    /**
     * - 
     * Output only. The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="idleStartTime")
    private @Nullable Output<String> idleStartTime;

    public Optional<Output<String>> idleStartTime() {
        return Optional.ofNullable(this.idleStartTime);
    }

    private WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs(WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs $) {
        this.autoDeleteTime = $.autoDeleteTime;
        this.autoDeleteTtl = $.autoDeleteTtl;
        this.idleDeleteTtl = $.idleDeleteTtl;
        this.idleStartTime = $.idleStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoDeleteTime(@Nullable Output<String> autoDeleteTime) {
            $.autoDeleteTime = autoDeleteTime;
            return this;
        }

        public Builder autoDeleteTime(String autoDeleteTime) {
            return autoDeleteTime(Output.of(autoDeleteTime));
        }

        public Builder autoDeleteTtl(@Nullable Output<String> autoDeleteTtl) {
            $.autoDeleteTtl = autoDeleteTtl;
            return this;
        }

        public Builder autoDeleteTtl(String autoDeleteTtl) {
            return autoDeleteTtl(Output.of(autoDeleteTtl));
        }

        public Builder idleDeleteTtl(@Nullable Output<String> idleDeleteTtl) {
            $.idleDeleteTtl = idleDeleteTtl;
            return this;
        }

        public Builder idleDeleteTtl(String idleDeleteTtl) {
            return idleDeleteTtl(Output.of(idleDeleteTtl));
        }

        public Builder idleStartTime(@Nullable Output<String> idleStartTime) {
            $.idleStartTime = idleStartTime;
            return this;
        }

        public Builder idleStartTime(String idleStartTime) {
            return idleStartTime(Output.of(idleStartTime));
        }

        public WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs build() {
            return $;
        }
    }

}
