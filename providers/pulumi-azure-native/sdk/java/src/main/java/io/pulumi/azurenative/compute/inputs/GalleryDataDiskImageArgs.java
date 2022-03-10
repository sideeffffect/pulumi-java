// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.HostCaching;
import io.pulumi.azurenative.compute.inputs.GalleryArtifactVersionSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is the data disk image.
 * 
 */
public final class GalleryDataDiskImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryDataDiskImageArgs Empty = new GalleryDataDiskImageArgs();

    /**
     * The host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'
     * 
     */
    @InputImport(name="hostCaching")
      private final @Nullable Input<HostCaching> hostCaching;

    public Input<HostCaching> getHostCaching() {
        return this.hostCaching == null ? Input.empty() : this.hostCaching;
    }

    /**
     * This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     */
    @InputImport(name="lun", required=true)
      private final Input<Integer> lun;

    public Input<Integer> getLun() {
        return this.lun;
    }

    /**
     * The gallery artifact version source.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<GalleryArtifactVersionSourceArgs> source;

    public Input<GalleryArtifactVersionSourceArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    public GalleryDataDiskImageArgs(
        @Nullable Input<HostCaching> hostCaching,
        Input<Integer> lun,
        @Nullable Input<GalleryArtifactVersionSourceArgs> source) {
        this.hostCaching = hostCaching;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.source = source;
    }

    private GalleryDataDiskImageArgs() {
        this.hostCaching = Input.empty();
        this.lun = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryDataDiskImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HostCaching> hostCaching;
        private Input<Integer> lun;
        private @Nullable Input<GalleryArtifactVersionSourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryDataDiskImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostCaching = defaults.hostCaching;
    	      this.lun = defaults.lun;
    	      this.source = defaults.source;
        }

        public Builder hostCaching(@Nullable Input<HostCaching> hostCaching) {
            this.hostCaching = hostCaching;
            return this;
        }

        public Builder hostCaching(@Nullable HostCaching hostCaching) {
            this.hostCaching = Input.ofNullable(hostCaching);
            return this;
        }

        public Builder lun(Input<Integer> lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder lun(Integer lun) {
            this.lun = Input.of(Objects.requireNonNull(lun));
            return this;
        }

        public Builder source(@Nullable Input<GalleryArtifactVersionSourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable GalleryArtifactVersionSourceArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }
        public GalleryDataDiskImageArgs build() {
            return new GalleryDataDiskImageArgs(hostCaching, lun, source);
        }
    }
}
