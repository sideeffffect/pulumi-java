// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Time window specified for daily maintenance operations. GCE's internal maintenance will be performed within this window.
 * 
 */
public final class NodeGroupMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeGroupMaintenanceWindowArgs Empty = new NodeGroupMaintenanceWindowArgs();

    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    public NodeGroupMaintenanceWindowArgs(@Nullable Output<String> startTime) {
        this.startTime = startTime;
    }

    private NodeGroupMaintenanceWindowArgs() {
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupMaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTime = defaults.startTime;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }        public NodeGroupMaintenanceWindowArgs build() {
            return new NodeGroupMaintenanceWindowArgs(startTime);
        }
    }
}
