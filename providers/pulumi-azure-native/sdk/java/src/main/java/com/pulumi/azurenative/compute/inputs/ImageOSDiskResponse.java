// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersResponse;
import com.pulumi.azurenative.compute.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an Operating System disk.
 * 
 */
public final class ImageOSDiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageOSDiskResponse Empty = new ImageOSDiskResponse();

    /**
     * The Virtual Hard Disk.
     * 
     */
    @Import(name="blobUri")
    private @Nullable String blobUri;

    public Optional<String> blobUri() {
        return Optional.ofNullable(this.blobUri);
    }

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
     * Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
     */
    @Import(name="diskEncryptionSet")
    private @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;

    public Optional<DiskEncryptionSetParametersResponse> diskEncryptionSet() {
        return Optional.ofNullable(this.diskEncryptionSet);
    }

    /**
     * Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
     */
    @Import(name="diskSizeGB")
    private @Nullable Integer diskSizeGB;

    public Optional<Integer> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * The managedDisk.
     * 
     */
    @Import(name="managedDisk")
    private @Nullable SubResourceResponse managedDisk;

    public Optional<SubResourceResponse> managedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }

    /**
     * The OS State.
     * 
     */
    @Import(name="osState", required=true)
    private String osState;

    public String osState() {
        return this.osState;
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from a custom image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
     * 
     */
    @Import(name="osType", required=true)
    private String osType;

    public String osType() {
        return this.osType;
    }

    /**
     * The snapshot.
     * 
     */
    @Import(name="snapshot")
    private @Nullable SubResourceResponse snapshot;

    public Optional<SubResourceResponse> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }

    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable String storageAccountType;

    public Optional<String> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    private ImageOSDiskResponse() {}

    private ImageOSDiskResponse(ImageOSDiskResponse $) {
        this.blobUri = $.blobUri;
        this.caching = $.caching;
        this.diskEncryptionSet = $.diskEncryptionSet;
        this.diskSizeGB = $.diskSizeGB;
        this.managedDisk = $.managedDisk;
        this.osState = $.osState;
        this.osType = $.osType;
        this.snapshot = $.snapshot;
        this.storageAccountType = $.storageAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageOSDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageOSDiskResponse $;

        public Builder() {
            $ = new ImageOSDiskResponse();
        }

        public Builder(ImageOSDiskResponse defaults) {
            $ = new ImageOSDiskResponse(Objects.requireNonNull(defaults));
        }

        public Builder blobUri(@Nullable String blobUri) {
            $.blobUri = blobUri;
            return this;
        }

        public Builder caching(@Nullable String caching) {
            $.caching = caching;
            return this;
        }

        public Builder diskEncryptionSet(@Nullable DiskEncryptionSetParametersResponse diskEncryptionSet) {
            $.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            $.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder managedDisk(@Nullable SubResourceResponse managedDisk) {
            $.managedDisk = managedDisk;
            return this;
        }

        public Builder osState(String osState) {
            $.osState = osState;
            return this;
        }

        public Builder osType(String osType) {
            $.osType = osType;
            return this;
        }

        public Builder snapshot(@Nullable SubResourceResponse snapshot) {
            $.snapshot = snapshot;
            return this;
        }

        public Builder storageAccountType(@Nullable String storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        public ImageOSDiskResponse build() {
            $.osState = Objects.requireNonNull($.osState, "expected parameter 'osState' to be non-null");
            $.osType = Objects.requireNonNull($.osType, "expected parameter 'osType' to be non-null");
            return $;
        }
    }

}
