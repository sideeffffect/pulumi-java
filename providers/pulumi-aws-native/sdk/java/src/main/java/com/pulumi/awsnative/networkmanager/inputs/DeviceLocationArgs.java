// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The site location.
 * 
 */
public final class DeviceLocationArgs extends ResourceArgs {

    public static final DeviceLocationArgs Empty = new DeviceLocationArgs();

    /**
     * The physical address.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The physical address.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The latitude.
     * 
     */
    @Import(name="latitude")
    private @Nullable Output<String> latitude;

    /**
     * @return The latitude.
     * 
     */
    public Optional<Output<String>> latitude() {
        return Optional.ofNullable(this.latitude);
    }

    /**
     * The longitude.
     * 
     */
    @Import(name="longitude")
    private @Nullable Output<String> longitude;

    /**
     * @return The longitude.
     * 
     */
    public Optional<Output<String>> longitude() {
        return Optional.ofNullable(this.longitude);
    }

    private DeviceLocationArgs() {}

    private DeviceLocationArgs(DeviceLocationArgs $) {
        this.address = $.address;
        this.latitude = $.latitude;
        this.longitude = $.longitude;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceLocationArgs $;

        public Builder() {
            $ = new DeviceLocationArgs();
        }

        public Builder(DeviceLocationArgs defaults) {
            $ = new DeviceLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The physical address.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The physical address.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param latitude The latitude.
         * 
         * @return builder
         * 
         */
        public Builder latitude(@Nullable Output<String> latitude) {
            $.latitude = latitude;
            return this;
        }

        /**
         * @param latitude The latitude.
         * 
         * @return builder
         * 
         */
        public Builder latitude(String latitude) {
            return latitude(Output.of(latitude));
        }

        /**
         * @param longitude The longitude.
         * 
         * @return builder
         * 
         */
        public Builder longitude(@Nullable Output<String> longitude) {
            $.longitude = longitude;
            return this;
        }

        /**
         * @param longitude The longitude.
         * 
         * @return builder
         * 
         */
        public Builder longitude(String longitude) {
            return longitude(Output.of(longitude));
        }

        public DeviceLocationArgs build() {
            return $;
        }
    }

}
