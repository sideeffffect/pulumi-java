// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless;

import com.pulumi.awsnative.iotwireless.enums.WirelessDeviceType;
import com.pulumi.awsnative.iotwireless.inputs.WirelessDeviceLoRaWANDeviceArgs;
import com.pulumi.awsnative.iotwireless.inputs.WirelessDeviceTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessDeviceArgs Empty = new WirelessDeviceArgs();

    /**
     * Wireless device description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Wireless device destination name
     * 
     */
    @Import(name="destinationName", required=true)
    private Output<String> destinationName;

    public Output<String> destinationName() {
        return this.destinationName;
    }

    /**
     * The date and time when the most recent uplink was received.
     * 
     */
    @Import(name="lastUplinkReceivedAt")
    private @Nullable Output<String> lastUplinkReceivedAt;

    public Optional<Output<String>> lastUplinkReceivedAt() {
        return Optional.ofNullable(this.lastUplinkReceivedAt);
    }

    /**
     * The combination of Package, Station and Model which represents the version of the LoRaWAN Wireless Device.
     * 
     */
    @Import(name="loRaWAN")
    private @Nullable Output<WirelessDeviceLoRaWANDeviceArgs> loRaWAN;

    public Optional<Output<WirelessDeviceLoRaWANDeviceArgs>> loRaWAN() {
        return Optional.ofNullable(this.loRaWAN);
    }

    /**
     * Wireless device name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of key-value pairs that contain metadata for the device. Currently not supported, will not create if tags are passed.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<WirelessDeviceTagArgs>> tags;

    public Optional<Output<List<WirelessDeviceTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Thing arn. Passed into update to associate Thing with Wireless device.
     * 
     */
    @Import(name="thingArn")
    private @Nullable Output<String> thingArn;

    public Optional<Output<String>> thingArn() {
        return Optional.ofNullable(this.thingArn);
    }

    /**
     * Wireless device type, currently only Sidewalk and LoRa
     * 
     */
    @Import(name="type", required=true)
    private Output<WirelessDeviceType> type;

    public Output<WirelessDeviceType> type() {
        return this.type;
    }

    private WirelessDeviceArgs() {}

    private WirelessDeviceArgs(WirelessDeviceArgs $) {
        this.description = $.description;
        this.destinationName = $.destinationName;
        this.lastUplinkReceivedAt = $.lastUplinkReceivedAt;
        this.loRaWAN = $.loRaWAN;
        this.name = $.name;
        this.tags = $.tags;
        this.thingArn = $.thingArn;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessDeviceArgs $;

        public Builder() {
            $ = new WirelessDeviceArgs();
        }

        public Builder(WirelessDeviceArgs defaults) {
            $ = new WirelessDeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder destinationName(Output<String> destinationName) {
            $.destinationName = destinationName;
            return this;
        }

        public Builder destinationName(String destinationName) {
            return destinationName(Output.of(destinationName));
        }

        public Builder lastUplinkReceivedAt(@Nullable Output<String> lastUplinkReceivedAt) {
            $.lastUplinkReceivedAt = lastUplinkReceivedAt;
            return this;
        }

        public Builder lastUplinkReceivedAt(String lastUplinkReceivedAt) {
            return lastUplinkReceivedAt(Output.of(lastUplinkReceivedAt));
        }

        public Builder loRaWAN(@Nullable Output<WirelessDeviceLoRaWANDeviceArgs> loRaWAN) {
            $.loRaWAN = loRaWAN;
            return this;
        }

        public Builder loRaWAN(WirelessDeviceLoRaWANDeviceArgs loRaWAN) {
            return loRaWAN(Output.of(loRaWAN));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<List<WirelessDeviceTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<WirelessDeviceTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(WirelessDeviceTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder thingArn(@Nullable Output<String> thingArn) {
            $.thingArn = thingArn;
            return this;
        }

        public Builder thingArn(String thingArn) {
            return thingArn(Output.of(thingArn));
        }

        public Builder type(Output<WirelessDeviceType> type) {
            $.type = type;
            return this;
        }

        public Builder type(WirelessDeviceType type) {
            return type(Output.of(type));
        }

        public WirelessDeviceArgs build() {
            $.destinationName = Objects.requireNonNull($.destinationName, "expected parameter 'destinationName' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
