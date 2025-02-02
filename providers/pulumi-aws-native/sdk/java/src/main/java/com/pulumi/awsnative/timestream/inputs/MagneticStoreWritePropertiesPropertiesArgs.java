// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream.inputs;

import com.pulumi.awsnative.timestream.inputs.MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that determine whether magnetic store writes are enabled.
 * 
 */
public final class MagneticStoreWritePropertiesPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MagneticStoreWritePropertiesPropertiesArgs Empty = new MagneticStoreWritePropertiesPropertiesArgs();

    /**
     * Boolean flag indicating whether magnetic store writes are enabled.
     * 
     */
    @Import(name="enableMagneticStoreWrites", required=true)
    private Output<Boolean> enableMagneticStoreWrites;

    /**
     * @return Boolean flag indicating whether magnetic store writes are enabled.
     * 
     */
    public Output<Boolean> enableMagneticStoreWrites() {
        return this.enableMagneticStoreWrites;
    }

    /**
     * Location to store information about records that were asynchronously rejected during magnetic store writes.
     * 
     */
    @Import(name="magneticStoreRejectedDataLocation")
    private @Nullable Output<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs> magneticStoreRejectedDataLocation;

    /**
     * @return Location to store information about records that were asynchronously rejected during magnetic store writes.
     * 
     */
    public Optional<Output<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs>> magneticStoreRejectedDataLocation() {
        return Optional.ofNullable(this.magneticStoreRejectedDataLocation);
    }

    private MagneticStoreWritePropertiesPropertiesArgs() {}

    private MagneticStoreWritePropertiesPropertiesArgs(MagneticStoreWritePropertiesPropertiesArgs $) {
        this.enableMagneticStoreWrites = $.enableMagneticStoreWrites;
        this.magneticStoreRejectedDataLocation = $.magneticStoreRejectedDataLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MagneticStoreWritePropertiesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MagneticStoreWritePropertiesPropertiesArgs $;

        public Builder() {
            $ = new MagneticStoreWritePropertiesPropertiesArgs();
        }

        public Builder(MagneticStoreWritePropertiesPropertiesArgs defaults) {
            $ = new MagneticStoreWritePropertiesPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableMagneticStoreWrites Boolean flag indicating whether magnetic store writes are enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableMagneticStoreWrites(Output<Boolean> enableMagneticStoreWrites) {
            $.enableMagneticStoreWrites = enableMagneticStoreWrites;
            return this;
        }

        /**
         * @param enableMagneticStoreWrites Boolean flag indicating whether magnetic store writes are enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableMagneticStoreWrites(Boolean enableMagneticStoreWrites) {
            return enableMagneticStoreWrites(Output.of(enableMagneticStoreWrites));
        }

        /**
         * @param magneticStoreRejectedDataLocation Location to store information about records that were asynchronously rejected during magnetic store writes.
         * 
         * @return builder
         * 
         */
        public Builder magneticStoreRejectedDataLocation(@Nullable Output<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs> magneticStoreRejectedDataLocation) {
            $.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
            return this;
        }

        /**
         * @param magneticStoreRejectedDataLocation Location to store information about records that were asynchronously rejected during magnetic store writes.
         * 
         * @return builder
         * 
         */
        public Builder magneticStoreRejectedDataLocation(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs magneticStoreRejectedDataLocation) {
            return magneticStoreRejectedDataLocation(Output.of(magneticStoreRejectedDataLocation));
        }

        public MagneticStoreWritePropertiesPropertiesArgs build() {
            $.enableMagneticStoreWrites = Objects.requireNonNull($.enableMagneticStoreWrites, "expected parameter 'enableMagneticStoreWrites' to be non-null");
            return $;
        }
    }

}
