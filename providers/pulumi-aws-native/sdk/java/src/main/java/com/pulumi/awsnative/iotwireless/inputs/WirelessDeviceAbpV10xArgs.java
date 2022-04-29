// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.inputs;

import com.pulumi.awsnative.iotwireless.inputs.WirelessDeviceSessionKeysAbpV10xArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceAbpV10xArgs extends ResourceArgs {

    public static final WirelessDeviceAbpV10xArgs Empty = new WirelessDeviceAbpV10xArgs();

    @Import(name="devAddr", required=true)
    private Output<String> devAddr;

    public Output<String> devAddr() {
        return this.devAddr;
    }

    @Import(name="sessionKeys", required=true)
    private Output<WirelessDeviceSessionKeysAbpV10xArgs> sessionKeys;

    public Output<WirelessDeviceSessionKeysAbpV10xArgs> sessionKeys() {
        return this.sessionKeys;
    }

    private WirelessDeviceAbpV10xArgs() {}

    private WirelessDeviceAbpV10xArgs(WirelessDeviceAbpV10xArgs $) {
        this.devAddr = $.devAddr;
        this.sessionKeys = $.sessionKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessDeviceAbpV10xArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessDeviceAbpV10xArgs $;

        public Builder() {
            $ = new WirelessDeviceAbpV10xArgs();
        }

        public Builder(WirelessDeviceAbpV10xArgs defaults) {
            $ = new WirelessDeviceAbpV10xArgs(Objects.requireNonNull(defaults));
        }

        public Builder devAddr(Output<String> devAddr) {
            $.devAddr = devAddr;
            return this;
        }

        public Builder devAddr(String devAddr) {
            return devAddr(Output.of(devAddr));
        }

        public Builder sessionKeys(Output<WirelessDeviceSessionKeysAbpV10xArgs> sessionKeys) {
            $.sessionKeys = sessionKeys;
            return this;
        }

        public Builder sessionKeys(WirelessDeviceSessionKeysAbpV10xArgs sessionKeys) {
            return sessionKeys(Output.of(sessionKeys));
        }

        public WirelessDeviceAbpV10xArgs build() {
            $.devAddr = Objects.requireNonNull($.devAddr, "expected parameter 'devAddr' to be non-null");
            $.sessionKeys = Objects.requireNonNull($.sessionKeys, "expected parameter 'sessionKeys' to be non-null");
            return $;
        }
    }

}
