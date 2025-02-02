// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogs {
    /**
     * @return Specifies whether connector logs get sent to the specified Amazon S3 destination.
     * 
     */
    private final Boolean enabled;
    /**
     * @return The name of the CloudWatch log group that is the destination for log delivery.
     * 
     */
    private final @Nullable String logGroup;

    @CustomType.Constructor
    private ConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogs(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("logGroup") @Nullable String logGroup) {
        this.enabled = enabled;
        this.logGroup = logGroup;
    }

    /**
     * @return Specifies whether connector logs get sent to the specified Amazon S3 destination.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The name of the CloudWatch log group that is the destination for log delivery.
     * 
     */
    public Optional<String> logGroup() {
        return Optional.ofNullable(this.logGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String logGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroup = defaults.logGroup;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder logGroup(@Nullable String logGroup) {
            this.logGroup = logGroup;
            return this;
        }        public ConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogs build() {
            return new ConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogs(enabled, logGroup);
        }
    }
}
