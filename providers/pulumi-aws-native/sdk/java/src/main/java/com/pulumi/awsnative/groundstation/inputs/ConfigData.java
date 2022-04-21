// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.inputs;

import com.pulumi.awsnative.groundstation.inputs.ConfigAntennaDownlinkConfig;
import com.pulumi.awsnative.groundstation.inputs.ConfigAntennaDownlinkDemodDecodeConfig;
import com.pulumi.awsnative.groundstation.inputs.ConfigAntennaUplinkConfig;
import com.pulumi.awsnative.groundstation.inputs.ConfigDataflowEndpointConfig;
import com.pulumi.awsnative.groundstation.inputs.ConfigS3RecordingConfig;
import com.pulumi.awsnative.groundstation.inputs.ConfigTrackingConfig;
import com.pulumi.awsnative.groundstation.inputs.ConfigUplinkEchoConfig;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigData extends com.pulumi.resources.InvokeArgs {

    public static final ConfigData Empty = new ConfigData();

    @Import(name="antennaDownlinkConfig")
    private @Nullable ConfigAntennaDownlinkConfig antennaDownlinkConfig;

    public Optional<ConfigAntennaDownlinkConfig> antennaDownlinkConfig() {
        return Optional.ofNullable(this.antennaDownlinkConfig);
    }

    @Import(name="antennaDownlinkDemodDecodeConfig")
    private @Nullable ConfigAntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig;

    public Optional<ConfigAntennaDownlinkDemodDecodeConfig> antennaDownlinkDemodDecodeConfig() {
        return Optional.ofNullable(this.antennaDownlinkDemodDecodeConfig);
    }

    @Import(name="antennaUplinkConfig")
    private @Nullable ConfigAntennaUplinkConfig antennaUplinkConfig;

    public Optional<ConfigAntennaUplinkConfig> antennaUplinkConfig() {
        return Optional.ofNullable(this.antennaUplinkConfig);
    }

    @Import(name="dataflowEndpointConfig")
    private @Nullable ConfigDataflowEndpointConfig dataflowEndpointConfig;

    public Optional<ConfigDataflowEndpointConfig> dataflowEndpointConfig() {
        return Optional.ofNullable(this.dataflowEndpointConfig);
    }

    @Import(name="s3RecordingConfig")
    private @Nullable ConfigS3RecordingConfig s3RecordingConfig;

    public Optional<ConfigS3RecordingConfig> s3RecordingConfig() {
        return Optional.ofNullable(this.s3RecordingConfig);
    }

    @Import(name="trackingConfig")
    private @Nullable ConfigTrackingConfig trackingConfig;

    public Optional<ConfigTrackingConfig> trackingConfig() {
        return Optional.ofNullable(this.trackingConfig);
    }

    @Import(name="uplinkEchoConfig")
    private @Nullable ConfigUplinkEchoConfig uplinkEchoConfig;

    public Optional<ConfigUplinkEchoConfig> uplinkEchoConfig() {
        return Optional.ofNullable(this.uplinkEchoConfig);
    }

    private ConfigData() {}

    private ConfigData(ConfigData $) {
        this.antennaDownlinkConfig = $.antennaDownlinkConfig;
        this.antennaDownlinkDemodDecodeConfig = $.antennaDownlinkDemodDecodeConfig;
        this.antennaUplinkConfig = $.antennaUplinkConfig;
        this.dataflowEndpointConfig = $.dataflowEndpointConfig;
        this.s3RecordingConfig = $.s3RecordingConfig;
        this.trackingConfig = $.trackingConfig;
        this.uplinkEchoConfig = $.uplinkEchoConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigData $;

        public Builder() {
            $ = new ConfigData();
        }

        public Builder(ConfigData defaults) {
            $ = new ConfigData(Objects.requireNonNull(defaults));
        }

        public Builder antennaDownlinkConfig(@Nullable ConfigAntennaDownlinkConfig antennaDownlinkConfig) {
            $.antennaDownlinkConfig = antennaDownlinkConfig;
            return this;
        }

        public Builder antennaDownlinkDemodDecodeConfig(@Nullable ConfigAntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig) {
            $.antennaDownlinkDemodDecodeConfig = antennaDownlinkDemodDecodeConfig;
            return this;
        }

        public Builder antennaUplinkConfig(@Nullable ConfigAntennaUplinkConfig antennaUplinkConfig) {
            $.antennaUplinkConfig = antennaUplinkConfig;
            return this;
        }

        public Builder dataflowEndpointConfig(@Nullable ConfigDataflowEndpointConfig dataflowEndpointConfig) {
            $.dataflowEndpointConfig = dataflowEndpointConfig;
            return this;
        }

        public Builder s3RecordingConfig(@Nullable ConfigS3RecordingConfig s3RecordingConfig) {
            $.s3RecordingConfig = s3RecordingConfig;
            return this;
        }

        public Builder trackingConfig(@Nullable ConfigTrackingConfig trackingConfig) {
            $.trackingConfig = trackingConfig;
            return this;
        }

        public Builder uplinkEchoConfig(@Nullable ConfigUplinkEchoConfig uplinkEchoConfig) {
            $.uplinkEchoConfig = uplinkEchoConfig;
            return this;
        }

        public ConfigData build() {
            return $;
        }
    }

}
