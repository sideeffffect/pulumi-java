// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceStateArgs Empty = new DeviceStateArgs();

    @InputImport(name="binaryData")
      private final @Nullable Input<String> binaryData;

    public Input<String> getBinaryData() {
        return this.binaryData == null ? Input.empty() : this.binaryData;
    }

    @InputImport(name="updateTime")
      private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public DeviceStateArgs(
        @Nullable Input<String> binaryData,
        @Nullable Input<String> updateTime) {
        this.binaryData = binaryData;
        this.updateTime = updateTime;
    }

    private DeviceStateArgs() {
        this.binaryData = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> binaryData;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryData = defaults.binaryData;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder binaryData(@Nullable Input<String> binaryData) {
            this.binaryData = binaryData;
            return this;
        }

        public Builder binaryData(@Nullable String binaryData) {
            this.binaryData = Input.ofNullable(binaryData);
            return this;
        }

        public Builder updateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }
        public DeviceStateArgs build() {
            return new DeviceStateArgs(binaryData, updateTime);
        }
    }
}
