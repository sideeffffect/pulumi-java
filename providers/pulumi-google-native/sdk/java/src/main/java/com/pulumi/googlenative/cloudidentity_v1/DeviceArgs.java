// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * Asset tag of the device.
     * 
     */
    @Import(name="assetTag")
    private @Nullable Output<String> assetTag;

    /**
     * @return Asset tag of the device.
     * 
     */
    public Optional<Output<String>> assetTag() {
        return Optional.ofNullable(this.assetTag);
    }

    /**
     * Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you&#39;re using this API for your own organization, use `customers/my_customer` If you&#39;re using this API to manage another organization, use `customers/{customer}`, where customer is the customer to whom the device belongs.
     * 
     */
    @Import(name="customer")
    private @Nullable Output<String> customer;

    /**
     * @return Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you&#39;re using this API for your own organization, use `customers/my_customer` If you&#39;re using this API to manage another organization, use `customers/{customer}`, where customer is the customer to whom the device belongs.
     * 
     */
    public Optional<Output<String>> customer() {
        return Optional.ofNullable(this.customer);
    }

    /**
     * Most recent time when device synced with this service.
     * 
     */
    @Import(name="lastSyncTime")
    private @Nullable Output<String> lastSyncTime;

    /**
     * @return Most recent time when device synced with this service.
     * 
     */
    public Optional<Output<String>> lastSyncTime() {
        return Optional.ofNullable(this.lastSyncTime);
    }

    /**
     * Serial Number of device. Example: HT82V1A01076.
     * 
     */
    @Import(name="serialNumber")
    private @Nullable Output<String> serialNumber;

    /**
     * @return Serial Number of device. Example: HT82V1A01076.
     * 
     */
    public Optional<Output<String>> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }

    /**
     * WiFi MAC addresses of device.
     * 
     */
    @Import(name="wifiMacAddresses")
    private @Nullable Output<List<String>> wifiMacAddresses;

    /**
     * @return WiFi MAC addresses of device.
     * 
     */
    public Optional<Output<List<String>>> wifiMacAddresses() {
        return Optional.ofNullable(this.wifiMacAddresses);
    }

    private DeviceArgs() {}

    private DeviceArgs(DeviceArgs $) {
        this.assetTag = $.assetTag;
        this.customer = $.customer;
        this.lastSyncTime = $.lastSyncTime;
        this.serialNumber = $.serialNumber;
        this.wifiMacAddresses = $.wifiMacAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceArgs $;

        public Builder() {
            $ = new DeviceArgs();
        }

        public Builder(DeviceArgs defaults) {
            $ = new DeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assetTag Asset tag of the device.
         * 
         * @return builder
         * 
         */
        public Builder assetTag(@Nullable Output<String> assetTag) {
            $.assetTag = assetTag;
            return this;
        }

        /**
         * @param assetTag Asset tag of the device.
         * 
         * @return builder
         * 
         */
        public Builder assetTag(String assetTag) {
            return assetTag(Output.of(assetTag));
        }

        /**
         * @param customer Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you&#39;re using this API for your own organization, use `customers/my_customer` If you&#39;re using this API to manage another organization, use `customers/{customer}`, where customer is the customer to whom the device belongs.
         * 
         * @return builder
         * 
         */
        public Builder customer(@Nullable Output<String> customer) {
            $.customer = customer;
            return this;
        }

        /**
         * @param customer Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you&#39;re using this API for your own organization, use `customers/my_customer` If you&#39;re using this API to manage another organization, use `customers/{customer}`, where customer is the customer to whom the device belongs.
         * 
         * @return builder
         * 
         */
        public Builder customer(String customer) {
            return customer(Output.of(customer));
        }

        /**
         * @param lastSyncTime Most recent time when device synced with this service.
         * 
         * @return builder
         * 
         */
        public Builder lastSyncTime(@Nullable Output<String> lastSyncTime) {
            $.lastSyncTime = lastSyncTime;
            return this;
        }

        /**
         * @param lastSyncTime Most recent time when device synced with this service.
         * 
         * @return builder
         * 
         */
        public Builder lastSyncTime(String lastSyncTime) {
            return lastSyncTime(Output.of(lastSyncTime));
        }

        /**
         * @param serialNumber Serial Number of device. Example: HT82V1A01076.
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(@Nullable Output<String> serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        /**
         * @param serialNumber Serial Number of device. Example: HT82V1A01076.
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(String serialNumber) {
            return serialNumber(Output.of(serialNumber));
        }

        /**
         * @param wifiMacAddresses WiFi MAC addresses of device.
         * 
         * @return builder
         * 
         */
        public Builder wifiMacAddresses(@Nullable Output<List<String>> wifiMacAddresses) {
            $.wifiMacAddresses = wifiMacAddresses;
            return this;
        }

        /**
         * @param wifiMacAddresses WiFi MAC addresses of device.
         * 
         * @return builder
         * 
         */
        public Builder wifiMacAddresses(List<String> wifiMacAddresses) {
            return wifiMacAddresses(Output.of(wifiMacAddresses));
        }

        /**
         * @param wifiMacAddresses WiFi MAC addresses of device.
         * 
         * @return builder
         * 
         */
        public Builder wifiMacAddresses(String... wifiMacAddresses) {
            return wifiMacAddresses(List.of(wifiMacAddresses));
        }

        public DeviceArgs build() {
            return $;
        }
    }

}
