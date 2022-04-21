// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Location of a resource.
 * 
 */
public final class DiskLocation extends com.pulumi.resources.InvokeArgs {

    public static final DiskLocation Empty = new DiskLocation();

    /**
     * The Availability Zone in which to create your disk. Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability Zones parameter to your request.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable String availabilityZone;

    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * The Region Name in which to create your disk.
     * 
     */
    @Import(name="regionName")
    private @Nullable String regionName;

    public Optional<String> regionName() {
        return Optional.ofNullable(this.regionName);
    }

    private DiskLocation() {}

    private DiskLocation(DiskLocation $) {
        this.availabilityZone = $.availabilityZone;
        this.regionName = $.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskLocation $;

        public Builder() {
            $ = new DiskLocation();
        }

        public Builder(DiskLocation defaults) {
            $ = new DiskLocation(Objects.requireNonNull(defaults));
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        public Builder regionName(@Nullable String regionName) {
            $.regionName = regionName;
            return this;
        }

        public DiskLocation build() {
            return $;
        }
    }

}
