// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.beta.inputs.DiskInstantiationConfigArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A specification of the parameters to use when creating the instance template from a source instance.
 * 
 */
public final class SourceInstanceParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceInstanceParamsArgs Empty = new SourceInstanceParamsArgs();

    /**
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * 
     */
    @Import(name="diskConfigs")
    private @Nullable Output<List<DiskInstantiationConfigArgs>> diskConfigs;

    /**
     * @return Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * 
     */
    public Optional<Output<List<DiskInstantiationConfigArgs>>> diskConfigs() {
        return Optional.ofNullable(this.diskConfigs);
    }

    private SourceInstanceParamsArgs() {}

    private SourceInstanceParamsArgs(SourceInstanceParamsArgs $) {
        this.diskConfigs = $.diskConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceInstanceParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceInstanceParamsArgs $;

        public Builder() {
            $ = new SourceInstanceParamsArgs();
        }

        public Builder(SourceInstanceParamsArgs defaults) {
            $ = new SourceInstanceParamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskConfigs Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
         * 
         * @return builder
         * 
         */
        public Builder diskConfigs(@Nullable Output<List<DiskInstantiationConfigArgs>> diskConfigs) {
            $.diskConfigs = diskConfigs;
            return this;
        }

        /**
         * @param diskConfigs Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
         * 
         * @return builder
         * 
         */
        public Builder diskConfigs(List<DiskInstantiationConfigArgs> diskConfigs) {
            return diskConfigs(Output.of(diskConfigs));
        }

        /**
         * @param diskConfigs Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
         * 
         * @return builder
         * 
         */
        public Builder diskConfigs(DiskInstantiationConfigArgs... diskConfigs) {
            return diskConfigs(List.of(diskConfigs));
        }

        public SourceInstanceParamsArgs build() {
            return $;
        }
    }

}
