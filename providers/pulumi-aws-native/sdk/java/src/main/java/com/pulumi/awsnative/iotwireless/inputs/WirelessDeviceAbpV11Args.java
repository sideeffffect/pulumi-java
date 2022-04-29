// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.inputs;

import com.pulumi.awsnative.iotwireless.inputs.WirelessDeviceSessionKeysAbpV11Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceAbpV11Args extends ResourceArgs {

    public static final WirelessDeviceAbpV11Args Empty = new WirelessDeviceAbpV11Args();

    @Import(name="devAddr", required=true)
    private Output<String> devAddr;

    public Output<String> devAddr() {
        return this.devAddr;
    }

    @Import(name="sessionKeys", required=true)
    private Output<WirelessDeviceSessionKeysAbpV11Args> sessionKeys;

    public Output<WirelessDeviceSessionKeysAbpV11Args> sessionKeys() {
        return this.sessionKeys;
    }

    private WirelessDeviceAbpV11Args() {}

    private WirelessDeviceAbpV11Args(WirelessDeviceAbpV11Args $) {
        this.devAddr = $.devAddr;
        this.sessionKeys = $.sessionKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessDeviceAbpV11Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessDeviceAbpV11Args $;

        public Builder() {
            $ = new WirelessDeviceAbpV11Args();
        }

        public Builder(WirelessDeviceAbpV11Args defaults) {
            $ = new WirelessDeviceAbpV11Args(Objects.requireNonNull(defaults));
        }

        public Builder devAddr(Output<String> devAddr) {
            $.devAddr = devAddr;
            return this;
        }

        public Builder devAddr(String devAddr) {
            return devAddr(Output.of(devAddr));
        }

        public Builder sessionKeys(Output<WirelessDeviceSessionKeysAbpV11Args> sessionKeys) {
            $.sessionKeys = sessionKeys;
            return this;
        }

        public Builder sessionKeys(WirelessDeviceSessionKeysAbpV11Args sessionKeys) {
            return sessionKeys(Output.of(sessionKeys));
        }

        public WirelessDeviceAbpV11Args build() {
            $.devAddr = Objects.requireNonNull($.devAddr, "expected parameter 'devAddr' to be non-null");
            $.sessionKeys = Objects.requireNonNull($.sessionKeys, "expected parameter 'sessionKeys' to be non-null");
            return $;
        }
    }

}
