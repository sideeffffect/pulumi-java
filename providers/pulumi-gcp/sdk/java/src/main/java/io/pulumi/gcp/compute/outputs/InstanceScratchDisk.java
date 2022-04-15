// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceScratchDisk {
    /**
     * The disk interface to use for attaching this disk; either SCSI or NVME.
     * 
     */
    private final String interface_;

    @CustomType.Constructor
    private InstanceScratchDisk(@CustomType.Parameter("interface") String interface_) {
        this.interface_ = interface_;
    }

    /**
     * The disk interface to use for attaching this disk; either SCSI or NVME.
     * 
    */
    public String interface_() {
        return this.interface_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceScratchDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interface_;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceScratchDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interface_ = defaults.interface_;
        }

        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }        public InstanceScratchDisk build() {
            return new InstanceScratchDisk(interface_);
        }
    }
}
