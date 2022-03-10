// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WirelessDeviceSessionKeysAbpV10x {
    private final String appSKey;
    private final String nwkSKey;

    @OutputCustomType.Constructor
    private WirelessDeviceSessionKeysAbpV10x(
        @OutputCustomType.Parameter("appSKey") String appSKey,
        @OutputCustomType.Parameter("nwkSKey") String nwkSKey) {
        this.appSKey = appSKey;
        this.nwkSKey = nwkSKey;
    }

    public String getAppSKey() {
        return this.appSKey;
    }
    public String getNwkSKey() {
        return this.nwkSKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceSessionKeysAbpV10x defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appSKey;
        private String nwkSKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceSessionKeysAbpV10x defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSKey = defaults.appSKey;
    	      this.nwkSKey = defaults.nwkSKey;
        }

        public Builder appSKey(String appSKey) {
            this.appSKey = Objects.requireNonNull(appSKey);
            return this;
        }

        public Builder nwkSKey(String nwkSKey) {
            this.nwkSKey = Objects.requireNonNull(nwkSKey);
            return this;
        }
        public WirelessDeviceSessionKeysAbpV10x build() {
            return new WirelessDeviceSessionKeysAbpV10x(appSKey, nwkSKey);
        }
    }
}
