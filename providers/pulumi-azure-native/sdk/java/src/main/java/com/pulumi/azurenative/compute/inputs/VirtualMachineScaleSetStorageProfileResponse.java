// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.ImageReferenceResponse;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetDataDiskResponse;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetOSDiskResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set storage profile.
 * 
 */
public final class VirtualMachineScaleSetStorageProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetStorageProfileResponse Empty = new VirtualMachineScaleSetStorageProfileResponse();

    /**
     * Specifies the parameters that are used to add data disks to the virtual machines in the scale set. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     */
    @Import(name="dataDisks")
    private @Nullable List<VirtualMachineScaleSetDataDiskResponse> dataDisks;

    public Optional<List<VirtualMachineScaleSetDataDiskResponse>> dataDisks() {
        return Optional.ofNullable(this.dataDisks);
    }

    /**
     * Specifies information about the image to use. You can specify information about platform images, marketplace images, or virtual machine images. This element is required when you want to use a platform image, marketplace image, or virtual machine image, but is not used in other creation operations.
     * 
     */
    @Import(name="imageReference")
    private @Nullable ImageReferenceResponse imageReference;

    public Optional<ImageReferenceResponse> imageReference() {
        return Optional.ofNullable(this.imageReference);
    }

    /**
     * Specifies information about the operating system disk used by the virtual machines in the scale set. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     */
    @Import(name="osDisk")
    private @Nullable VirtualMachineScaleSetOSDiskResponse osDisk;

    public Optional<VirtualMachineScaleSetOSDiskResponse> osDisk() {
        return Optional.ofNullable(this.osDisk);
    }

    private VirtualMachineScaleSetStorageProfileResponse() {}

    private VirtualMachineScaleSetStorageProfileResponse(VirtualMachineScaleSetStorageProfileResponse $) {
        this.dataDisks = $.dataDisks;
        this.imageReference = $.imageReference;
        this.osDisk = $.osDisk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetStorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetStorageProfileResponse $;

        public Builder() {
            $ = new VirtualMachineScaleSetStorageProfileResponse();
        }

        public Builder(VirtualMachineScaleSetStorageProfileResponse defaults) {
            $ = new VirtualMachineScaleSetStorageProfileResponse(Objects.requireNonNull(defaults));
        }

        public Builder dataDisks(@Nullable List<VirtualMachineScaleSetDataDiskResponse> dataDisks) {
            $.dataDisks = dataDisks;
            return this;
        }

        public Builder dataDisks(VirtualMachineScaleSetDataDiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }

        public Builder imageReference(@Nullable ImageReferenceResponse imageReference) {
            $.imageReference = imageReference;
            return this;
        }

        public Builder osDisk(@Nullable VirtualMachineScaleSetOSDiskResponse osDisk) {
            $.osDisk = osDisk;
            return this;
        }

        public VirtualMachineScaleSetStorageProfileResponse build() {
            return $;
        }
    }

}
