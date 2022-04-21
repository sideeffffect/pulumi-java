// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.DiffDiskSettingsResponse;
import com.pulumi.azurenative.compute.inputs.VirtualHardDiskResponse;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetManagedDiskParametersResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set operating system disk.
 * 
 */
public final class VirtualMachineScaleSetOSDiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetOSDiskResponse Empty = new VirtualMachineScaleSetOSDiskResponse();

    /**
     * Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @Import(name="caching")
    private @Nullable String caching;

    public Optional<String> caching() {
        return Optional.ofNullable(this.caching);
    }

    /**
     * Specifies how the virtual machines in the scale set should be created.&lt;br&gt;&lt;br&gt; The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    @Import(name="createOption", required=true)
    private String createOption;

    public String createOption() {
        return this.createOption;
    }

    /**
     * Specifies the ephemeral disk Settings for the operating system disk used by the virtual machine scale set.
     * 
     */
    @Import(name="diffDiskSettings")
    private @Nullable DiffDiskSettingsResponse diffDiskSettings;

    public Optional<DiffDiskSettingsResponse> diffDiskSettings() {
        return Optional.ofNullable(this.diffDiskSettings);
    }

    /**
     * Specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
     */
    @Import(name="diskSizeGB")
    private @Nullable Integer diskSizeGB;

    public Optional<Integer> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * Specifies information about the unmanaged user image to base the scale set on.
     * 
     */
    @Import(name="image")
    private @Nullable VirtualHardDiskResponse image;

    public Optional<VirtualHardDiskResponse> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * The managed disk parameters.
     * 
     */
    @Import(name="managedDisk")
    private @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;

    public Optional<VirtualMachineScaleSetManagedDiskParametersResponse> managedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }

    /**
     * The disk name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from user-image or a specialized VHD. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
     * 
     */
    @Import(name="osType")
    private @Nullable String osType;

    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * Specifies the container urls that are used to store operating system disks for the scale set.
     * 
     */
    @Import(name="vhdContainers")
    private @Nullable List<String> vhdContainers;

    public Optional<List<String>> vhdContainers() {
        return Optional.ofNullable(this.vhdContainers);
    }

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    @Import(name="writeAcceleratorEnabled")
    private @Nullable Boolean writeAcceleratorEnabled;

    public Optional<Boolean> writeAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    private VirtualMachineScaleSetOSDiskResponse() {}

    private VirtualMachineScaleSetOSDiskResponse(VirtualMachineScaleSetOSDiskResponse $) {
        this.caching = $.caching;
        this.createOption = $.createOption;
        this.diffDiskSettings = $.diffDiskSettings;
        this.diskSizeGB = $.diskSizeGB;
        this.image = $.image;
        this.managedDisk = $.managedDisk;
        this.name = $.name;
        this.osType = $.osType;
        this.vhdContainers = $.vhdContainers;
        this.writeAcceleratorEnabled = $.writeAcceleratorEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetOSDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetOSDiskResponse $;

        public Builder() {
            $ = new VirtualMachineScaleSetOSDiskResponse();
        }

        public Builder(VirtualMachineScaleSetOSDiskResponse defaults) {
            $ = new VirtualMachineScaleSetOSDiskResponse(Objects.requireNonNull(defaults));
        }

        public Builder caching(@Nullable String caching) {
            $.caching = caching;
            return this;
        }

        public Builder createOption(String createOption) {
            $.createOption = createOption;
            return this;
        }

        public Builder diffDiskSettings(@Nullable DiffDiskSettingsResponse diffDiskSettings) {
            $.diffDiskSettings = diffDiskSettings;
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            $.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder image(@Nullable VirtualHardDiskResponse image) {
            $.image = image;
            return this;
        }

        public Builder managedDisk(@Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk) {
            $.managedDisk = managedDisk;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder osType(@Nullable String osType) {
            $.osType = osType;
            return this;
        }

        public Builder vhdContainers(@Nullable List<String> vhdContainers) {
            $.vhdContainers = vhdContainers;
            return this;
        }

        public Builder vhdContainers(String... vhdContainers) {
            return vhdContainers(List.of(vhdContainers));
        }

        public Builder writeAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            $.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }

        public VirtualMachineScaleSetOSDiskResponse build() {
            $.createOption = Objects.requireNonNull($.createOption, "expected parameter 'createOption' to be non-null");
            return $;
        }
    }

}
