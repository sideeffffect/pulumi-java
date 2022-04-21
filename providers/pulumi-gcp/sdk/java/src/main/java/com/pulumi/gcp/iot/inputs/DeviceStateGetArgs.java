// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceStateGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceStateGetArgs Empty = new DeviceStateGetArgs();

    @Import(name="binaryData")
    private @Nullable Output<String> binaryData;

    public Optional<Output<String>> binaryData() {
        return Optional.ofNullable(this.binaryData);
    }

    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private DeviceStateGetArgs() {}

    private DeviceStateGetArgs(DeviceStateGetArgs $) {
        this.binaryData = $.binaryData;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceStateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceStateGetArgs $;

        public Builder() {
            $ = new DeviceStateGetArgs();
        }

        public Builder(DeviceStateGetArgs defaults) {
            $ = new DeviceStateGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder binaryData(@Nullable Output<String> binaryData) {
            $.binaryData = binaryData;
            return this;
        }

        public Builder binaryData(String binaryData) {
            return binaryData(Output.of(binaryData));
        }

        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public DeviceStateGetArgs build() {
            return $;
        }
    }

}
