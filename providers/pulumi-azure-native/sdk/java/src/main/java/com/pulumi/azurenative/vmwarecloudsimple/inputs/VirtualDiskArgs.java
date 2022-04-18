// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.vmwarecloudsimple.inputs;

import com.pulumi.azurenative.vmwarecloudsimple.enums.DiskIndependenceMode;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Virtual disk model
 * 
 */
public final class VirtualDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualDiskArgs Empty = new VirtualDiskArgs();

    /**
     * Disk's Controller id
     * 
     */
    @Import(name="controllerId", required=true)
      private final Output<String> controllerId;

    public Output<String> controllerId() {
        return this.controllerId;
    }

    /**
     * Disk's independence mode type
     * 
     */
    @Import(name="independenceMode", required=true)
      private final Output<DiskIndependenceMode> independenceMode;

    public Output<DiskIndependenceMode> independenceMode() {
        return this.independenceMode;
    }

    /**
     * Disk's total size
     * 
     */
    @Import(name="totalSize", required=true)
      private final Output<Integer> totalSize;

    public Output<Integer> totalSize() {
        return this.totalSize;
    }

    /**
     * Disk's id
     * 
     */
    @Import(name="virtualDiskId")
      private final @Nullable Output<String> virtualDiskId;

    public Output<String> virtualDiskId() {
        return this.virtualDiskId == null ? Codegen.empty() : this.virtualDiskId;
    }

    public VirtualDiskArgs(
        Output<String> controllerId,
        Output<DiskIndependenceMode> independenceMode,
        Output<Integer> totalSize,
        @Nullable Output<String> virtualDiskId) {
        this.controllerId = Objects.requireNonNull(controllerId, "expected parameter 'controllerId' to be non-null");
        this.independenceMode = Objects.requireNonNull(independenceMode, "expected parameter 'independenceMode' to be non-null");
        this.totalSize = Objects.requireNonNull(totalSize, "expected parameter 'totalSize' to be non-null");
        this.virtualDiskId = virtualDiskId;
    }

    private VirtualDiskArgs() {
        this.controllerId = Codegen.empty();
        this.independenceMode = Codegen.empty();
        this.totalSize = Codegen.empty();
        this.virtualDiskId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> controllerId;
        private Output<DiskIndependenceMode> independenceMode;
        private Output<Integer> totalSize;
        private @Nullable Output<String> virtualDiskId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controllerId = defaults.controllerId;
    	      this.independenceMode = defaults.independenceMode;
    	      this.totalSize = defaults.totalSize;
    	      this.virtualDiskId = defaults.virtualDiskId;
        }

        public Builder controllerId(Output<String> controllerId) {
            this.controllerId = Objects.requireNonNull(controllerId);
            return this;
        }
        public Builder controllerId(String controllerId) {
            this.controllerId = Output.of(Objects.requireNonNull(controllerId));
            return this;
        }
        public Builder independenceMode(Output<DiskIndependenceMode> independenceMode) {
            this.independenceMode = Objects.requireNonNull(independenceMode);
            return this;
        }
        public Builder independenceMode(DiskIndependenceMode independenceMode) {
            this.independenceMode = Output.of(Objects.requireNonNull(independenceMode));
            return this;
        }
        public Builder totalSize(Output<Integer> totalSize) {
            this.totalSize = Objects.requireNonNull(totalSize);
            return this;
        }
        public Builder totalSize(Integer totalSize) {
            this.totalSize = Output.of(Objects.requireNonNull(totalSize));
            return this;
        }
        public Builder virtualDiskId(@Nullable Output<String> virtualDiskId) {
            this.virtualDiskId = virtualDiskId;
            return this;
        }
        public Builder virtualDiskId(@Nullable String virtualDiskId) {
            this.virtualDiskId = Codegen.ofNullable(virtualDiskId);
            return this;
        }        public VirtualDiskArgs build() {
            return new VirtualDiskArgs(controllerId, independenceMode, totalSize, virtualDiskId);
        }
    }
}
