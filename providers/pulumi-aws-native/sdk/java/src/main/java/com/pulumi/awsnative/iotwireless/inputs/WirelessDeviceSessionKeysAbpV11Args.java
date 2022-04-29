// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceSessionKeysAbpV11Args extends ResourceArgs {

    public static final WirelessDeviceSessionKeysAbpV11Args Empty = new WirelessDeviceSessionKeysAbpV11Args();

    @Import(name="appSKey", required=true)
    private Output<String> appSKey;

    public Output<String> appSKey() {
        return this.appSKey;
    }

    @Import(name="fNwkSIntKey", required=true)
    private Output<String> fNwkSIntKey;

    public Output<String> fNwkSIntKey() {
        return this.fNwkSIntKey;
    }

    @Import(name="nwkSEncKey", required=true)
    private Output<String> nwkSEncKey;

    public Output<String> nwkSEncKey() {
        return this.nwkSEncKey;
    }

    @Import(name="sNwkSIntKey", required=true)
    private Output<String> sNwkSIntKey;

    public Output<String> sNwkSIntKey() {
        return this.sNwkSIntKey;
    }

    private WirelessDeviceSessionKeysAbpV11Args() {}

    private WirelessDeviceSessionKeysAbpV11Args(WirelessDeviceSessionKeysAbpV11Args $) {
        this.appSKey = $.appSKey;
        this.fNwkSIntKey = $.fNwkSIntKey;
        this.nwkSEncKey = $.nwkSEncKey;
        this.sNwkSIntKey = $.sNwkSIntKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessDeviceSessionKeysAbpV11Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessDeviceSessionKeysAbpV11Args $;

        public Builder() {
            $ = new WirelessDeviceSessionKeysAbpV11Args();
        }

        public Builder(WirelessDeviceSessionKeysAbpV11Args defaults) {
            $ = new WirelessDeviceSessionKeysAbpV11Args(Objects.requireNonNull(defaults));
        }

        public Builder appSKey(Output<String> appSKey) {
            $.appSKey = appSKey;
            return this;
        }

        public Builder appSKey(String appSKey) {
            return appSKey(Output.of(appSKey));
        }

        public Builder fNwkSIntKey(Output<String> fNwkSIntKey) {
            $.fNwkSIntKey = fNwkSIntKey;
            return this;
        }

        public Builder fNwkSIntKey(String fNwkSIntKey) {
            return fNwkSIntKey(Output.of(fNwkSIntKey));
        }

        public Builder nwkSEncKey(Output<String> nwkSEncKey) {
            $.nwkSEncKey = nwkSEncKey;
            return this;
        }

        public Builder nwkSEncKey(String nwkSEncKey) {
            return nwkSEncKey(Output.of(nwkSEncKey));
        }

        public Builder sNwkSIntKey(Output<String> sNwkSIntKey) {
            $.sNwkSIntKey = sNwkSIntKey;
            return this;
        }

        public Builder sNwkSIntKey(String sNwkSIntKey) {
            return sNwkSIntKey(Output.of(sNwkSIntKey));
        }

        public WirelessDeviceSessionKeysAbpV11Args build() {
            $.appSKey = Objects.requireNonNull($.appSKey, "expected parameter 'appSKey' to be non-null");
            $.fNwkSIntKey = Objects.requireNonNull($.fNwkSIntKey, "expected parameter 'fNwkSIntKey' to be non-null");
            $.nwkSEncKey = Objects.requireNonNull($.nwkSEncKey, "expected parameter 'nwkSEncKey' to be non-null");
            $.sNwkSIntKey = Objects.requireNonNull($.sNwkSIntKey, "expected parameter 'sNwkSIntKey' to be non-null");
            return $;
        }
    }

}
