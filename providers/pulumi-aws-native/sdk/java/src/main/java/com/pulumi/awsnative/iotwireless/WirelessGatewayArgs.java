// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless;

import com.pulumi.awsnative.iotwireless.inputs.WirelessGatewayLoRaWANGatewayArgs;
import com.pulumi.awsnative.iotwireless.inputs.WirelessGatewayTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessGatewayArgs Empty = new WirelessGatewayArgs();

    /**
     * Description of Wireless Gateway.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of Wireless Gateway.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The date and time when the most recent uplink was received.
     * 
     */
    @Import(name="lastUplinkReceivedAt")
    private @Nullable Output<String> lastUplinkReceivedAt;

    /**
     * @return The date and time when the most recent uplink was received.
     * 
     */
    public Optional<Output<String>> lastUplinkReceivedAt() {
        return Optional.ofNullable(this.lastUplinkReceivedAt);
    }

    /**
     * The combination of Package, Station and Model which represents the version of the LoRaWAN Wireless Gateway.
     * 
     */
    @Import(name="loRaWAN", required=true)
    private Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN;

    /**
     * @return The combination of Package, Station and Model which represents the version of the LoRaWAN Wireless Gateway.
     * 
     */
    public Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN() {
        return this.loRaWAN;
    }

    /**
     * Name of Wireless Gateway.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of Wireless Gateway.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of key-value pairs that contain metadata for the gateway.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<WirelessGatewayTagArgs>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the gateway.
     * 
     */
    public Optional<Output<List<WirelessGatewayTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Thing Arn. Passed into Update to associate a Thing with the Wireless Gateway.
     * 
     */
    @Import(name="thingArn")
    private @Nullable Output<String> thingArn;

    /**
     * @return Thing Arn. Passed into Update to associate a Thing with the Wireless Gateway.
     * 
     */
    public Optional<Output<String>> thingArn() {
        return Optional.ofNullable(this.thingArn);
    }

    private WirelessGatewayArgs() {}

    private WirelessGatewayArgs(WirelessGatewayArgs $) {
        this.description = $.description;
        this.lastUplinkReceivedAt = $.lastUplinkReceivedAt;
        this.loRaWAN = $.loRaWAN;
        this.name = $.name;
        this.tags = $.tags;
        this.thingArn = $.thingArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessGatewayArgs $;

        public Builder() {
            $ = new WirelessGatewayArgs();
        }

        public Builder(WirelessGatewayArgs defaults) {
            $ = new WirelessGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of Wireless Gateway.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of Wireless Gateway.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param lastUplinkReceivedAt The date and time when the most recent uplink was received.
         * 
         * @return builder
         * 
         */
        public Builder lastUplinkReceivedAt(@Nullable Output<String> lastUplinkReceivedAt) {
            $.lastUplinkReceivedAt = lastUplinkReceivedAt;
            return this;
        }

        /**
         * @param lastUplinkReceivedAt The date and time when the most recent uplink was received.
         * 
         * @return builder
         * 
         */
        public Builder lastUplinkReceivedAt(String lastUplinkReceivedAt) {
            return lastUplinkReceivedAt(Output.of(lastUplinkReceivedAt));
        }

        /**
         * @param loRaWAN The combination of Package, Station and Model which represents the version of the LoRaWAN Wireless Gateway.
         * 
         * @return builder
         * 
         */
        public Builder loRaWAN(Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN) {
            $.loRaWAN = loRaWAN;
            return this;
        }

        /**
         * @param loRaWAN The combination of Package, Station and Model which represents the version of the LoRaWAN Wireless Gateway.
         * 
         * @return builder
         * 
         */
        public Builder loRaWAN(WirelessGatewayLoRaWANGatewayArgs loRaWAN) {
            return loRaWAN(Output.of(loRaWAN));
        }

        /**
         * @param name Name of Wireless Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of Wireless Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<WirelessGatewayTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<WirelessGatewayTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(WirelessGatewayTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param thingArn Thing Arn. Passed into Update to associate a Thing with the Wireless Gateway.
         * 
         * @return builder
         * 
         */
        public Builder thingArn(@Nullable Output<String> thingArn) {
            $.thingArn = thingArn;
            return this;
        }

        /**
         * @param thingArn Thing Arn. Passed into Update to associate a Thing with the Wireless Gateway.
         * 
         * @return builder
         * 
         */
        public Builder thingArn(String thingArn) {
            return thingArn(Output.of(thingArn));
        }

        public WirelessGatewayArgs build() {
            $.loRaWAN = Objects.requireNonNull($.loRaWAN, "expected parameter 'loRaWAN' to be non-null");
            return $;
        }
    }

}
