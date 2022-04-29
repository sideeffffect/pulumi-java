// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on
 * 
 */
public final class DiskAutoSnapshotAddOnArgs extends ResourceArgs {

    public static final DiskAutoSnapshotAddOnArgs Empty = new DiskAutoSnapshotAddOnArgs();

    /**
     * The daily time when an automatic snapshot will be created.
     * 
     */
    @Import(name="snapshotTimeOfDay")
    private @Nullable Output<String> snapshotTimeOfDay;

    /**
     * @return The daily time when an automatic snapshot will be created.
     * 
     */
    public Optional<Output<String>> snapshotTimeOfDay() {
        return Optional.ofNullable(this.snapshotTimeOfDay);
    }

    private DiskAutoSnapshotAddOnArgs() {}

    private DiskAutoSnapshotAddOnArgs(DiskAutoSnapshotAddOnArgs $) {
        this.snapshotTimeOfDay = $.snapshotTimeOfDay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskAutoSnapshotAddOnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskAutoSnapshotAddOnArgs $;

        public Builder() {
            $ = new DiskAutoSnapshotAddOnArgs();
        }

        public Builder(DiskAutoSnapshotAddOnArgs defaults) {
            $ = new DiskAutoSnapshotAddOnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param snapshotTimeOfDay The daily time when an automatic snapshot will be created.
         * 
         * @return builder
         * 
         */
        public Builder snapshotTimeOfDay(@Nullable Output<String> snapshotTimeOfDay) {
            $.snapshotTimeOfDay = snapshotTimeOfDay;
            return this;
        }

        /**
         * @param snapshotTimeOfDay The daily time when an automatic snapshot will be created.
         * 
         * @return builder
         * 
         */
        public Builder snapshotTimeOfDay(String snapshotTimeOfDay) {
            return snapshotTimeOfDay(Output.of(snapshotTimeOfDay));
        }

        public DiskAutoSnapshotAddOnArgs build() {
            return $;
        }
    }

}
