// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains the IP tag associated with the public IP address.
 * 
 */
public final class VirtualMachineScaleSetIpTagResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetIpTagResponse Empty = new VirtualMachineScaleSetIpTagResponse();

    /**
     * IP tag type. Example: FirstPartyUsage.
     * 
     */
    @Import(name="ipTagType")
      private final @Nullable String ipTagType;

    public Optional<String> ipTagType() {
        return this.ipTagType == null ? Optional.empty() : Optional.ofNullable(this.ipTagType);
    }

    /**
     * IP tag associated with the public IP. Example: SQL, Storage etc.
     * 
     */
    @Import(name="tag")
      private final @Nullable String tag;

    public Optional<String> tag() {
        return this.tag == null ? Optional.empty() : Optional.ofNullable(this.tag);
    }

    public VirtualMachineScaleSetIpTagResponse(
        @Nullable String ipTagType,
        @Nullable String tag) {
        this.ipTagType = ipTagType;
        this.tag = tag;
    }

    private VirtualMachineScaleSetIpTagResponse() {
        this.ipTagType = null;
        this.tag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetIpTagResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipTagType;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetIpTagResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipTagType = defaults.ipTagType;
    	      this.tag = defaults.tag;
        }

        public Builder ipTagType(@Nullable String ipTagType) {
            this.ipTagType = ipTagType;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }        public VirtualMachineScaleSetIpTagResponse build() {
            return new VirtualMachineScaleSetIpTagResponse(ipTagType, tag);
        }
    }
}
