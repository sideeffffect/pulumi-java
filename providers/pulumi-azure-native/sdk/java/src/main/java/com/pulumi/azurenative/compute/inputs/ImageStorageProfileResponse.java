// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.ImageDataDiskResponse;
import com.pulumi.azurenative.compute.inputs.ImageOSDiskResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a storage profile.
 * 
 */
public final class ImageStorageProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageStorageProfileResponse Empty = new ImageStorageProfileResponse();

    /**
     * Specifies the parameters that are used to add a data disk to a virtual machine. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     */
    @Import(name="dataDisks")
    private @Nullable List<ImageDataDiskResponse> dataDisks;

    public Optional<List<ImageDataDiskResponse>> dataDisks() {
        return Optional.ofNullable(this.dataDisks);
    }

    /**
     * Specifies information about the operating system disk used by the virtual machine. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     */
    @Import(name="osDisk")
    private @Nullable ImageOSDiskResponse osDisk;

    public Optional<ImageOSDiskResponse> osDisk() {
        return Optional.ofNullable(this.osDisk);
    }

    /**
     * Specifies whether an image is zone resilient or not. Default is false. Zone resilient images can be created only in regions that provide Zone Redundant Storage (ZRS).
     * 
     */
    @Import(name="zoneResilient")
    private @Nullable Boolean zoneResilient;

    public Optional<Boolean> zoneResilient() {
        return Optional.ofNullable(this.zoneResilient);
    }

    private ImageStorageProfileResponse() {}

    private ImageStorageProfileResponse(ImageStorageProfileResponse $) {
        this.dataDisks = $.dataDisks;
        this.osDisk = $.osDisk;
        this.zoneResilient = $.zoneResilient;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageStorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageStorageProfileResponse $;

        public Builder() {
            $ = new ImageStorageProfileResponse();
        }

        public Builder(ImageStorageProfileResponse defaults) {
            $ = new ImageStorageProfileResponse(Objects.requireNonNull(defaults));
        }

        public Builder dataDisks(@Nullable List<ImageDataDiskResponse> dataDisks) {
            $.dataDisks = dataDisks;
            return this;
        }

        public Builder dataDisks(ImageDataDiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }

        public Builder osDisk(@Nullable ImageOSDiskResponse osDisk) {
            $.osDisk = osDisk;
            return this;
        }

        public Builder zoneResilient(@Nullable Boolean zoneResilient) {
            $.zoneResilient = zoneResilient;
            return this;
        }

        public ImageStorageProfileResponse build() {
            return $;
        }
    }

}
