// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceConfigArgs extends ResourceArgs {

    public static final DeviceConfigArgs Empty = new DeviceConfigArgs();

    @Import(name="binaryData")
    private @Nullable Output<String> binaryData;

    public Optional<Output<String>> binaryData() {
        return Optional.ofNullable(this.binaryData);
    }

    @Import(name="cloudUpdateTime")
    private @Nullable Output<String> cloudUpdateTime;

    public Optional<Output<String>> cloudUpdateTime() {
        return Optional.ofNullable(this.cloudUpdateTime);
    }

    @Import(name="deviceAckTime")
    private @Nullable Output<String> deviceAckTime;

    public Optional<Output<String>> deviceAckTime() {
        return Optional.ofNullable(this.deviceAckTime);
    }

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private DeviceConfigArgs() {}

    private DeviceConfigArgs(DeviceConfigArgs $) {
        this.binaryData = $.binaryData;
        this.cloudUpdateTime = $.cloudUpdateTime;
        this.deviceAckTime = $.deviceAckTime;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceConfigArgs $;

        public Builder() {
            $ = new DeviceConfigArgs();
        }

        public Builder(DeviceConfigArgs defaults) {
            $ = new DeviceConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder binaryData(@Nullable Output<String> binaryData) {
            $.binaryData = binaryData;
            return this;
        }

        public Builder binaryData(String binaryData) {
            return binaryData(Output.of(binaryData));
        }

        public Builder cloudUpdateTime(@Nullable Output<String> cloudUpdateTime) {
            $.cloudUpdateTime = cloudUpdateTime;
            return this;
        }

        public Builder cloudUpdateTime(String cloudUpdateTime) {
            return cloudUpdateTime(Output.of(cloudUpdateTime));
        }

        public Builder deviceAckTime(@Nullable Output<String> deviceAckTime) {
            $.deviceAckTime = deviceAckTime;
            return this;
        }

        public Builder deviceAckTime(String deviceAckTime) {
            return deviceAckTime(Output.of(deviceAckTime));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public DeviceConfigArgs build() {
            return $;
        }
    }

}
