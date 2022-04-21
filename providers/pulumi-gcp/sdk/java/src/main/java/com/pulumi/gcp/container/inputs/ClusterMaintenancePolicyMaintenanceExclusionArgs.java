// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterMaintenancePolicyMaintenanceExclusionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyMaintenanceExclusionArgs Empty = new ClusterMaintenancePolicyMaintenanceExclusionArgs();

    @Import(name="endTime", required=true)
    private Output<String> endTime;

    public Output<String> endTime() {
        return this.endTime;
    }

    @Import(name="exclusionName", required=true)
    private Output<String> exclusionName;

    public Output<String> exclusionName() {
        return this.exclusionName;
    }

    @Import(name="startTime", required=true)
    private Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime;
    }

    private ClusterMaintenancePolicyMaintenanceExclusionArgs() {}

    private ClusterMaintenancePolicyMaintenanceExclusionArgs(ClusterMaintenancePolicyMaintenanceExclusionArgs $) {
        this.endTime = $.endTime;
        this.exclusionName = $.exclusionName;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMaintenancePolicyMaintenanceExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMaintenancePolicyMaintenanceExclusionArgs $;

        public Builder() {
            $ = new ClusterMaintenancePolicyMaintenanceExclusionArgs();
        }

        public Builder(ClusterMaintenancePolicyMaintenanceExclusionArgs defaults) {
            $ = new ClusterMaintenancePolicyMaintenanceExclusionArgs(Objects.requireNonNull(defaults));
        }

        public Builder endTime(Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        public Builder exclusionName(Output<String> exclusionName) {
            $.exclusionName = exclusionName;
            return this;
        }

        public Builder exclusionName(String exclusionName) {
            return exclusionName(Output.of(exclusionName));
        }

        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public ClusterMaintenancePolicyMaintenanceExclusionArgs build() {
            $.endTime = Objects.requireNonNull($.endTime, "expected parameter 'endTime' to be non-null");
            $.exclusionName = Objects.requireNonNull($.exclusionName, "expected parameter 'exclusionName' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
