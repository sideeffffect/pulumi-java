// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena.inputs;

import com.pulumi.awsnative.athena.inputs.WorkGroupEngineVersion;
import com.pulumi.awsnative.athena.inputs.WorkGroupResultConfigurationUpdates;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration information that will be updated for this workgroup, which includes the location in Amazon S3 where query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, whether the workgroup settings override the client-side settings, and the data usage limit for the amount of bytes scanned per query, if it is specified.
 * 
 */
public final class WorkGroupConfigurationUpdates extends com.pulumi.resources.InvokeArgs {

    public static final WorkGroupConfigurationUpdates Empty = new WorkGroupConfigurationUpdates();

    @Import(name="bytesScannedCutoffPerQuery")
    private @Nullable Integer bytesScannedCutoffPerQuery;

    public Optional<Integer> bytesScannedCutoffPerQuery() {
        return Optional.ofNullable(this.bytesScannedCutoffPerQuery);
    }

    @Import(name="enforceWorkGroupConfiguration")
    private @Nullable Boolean enforceWorkGroupConfiguration;

    public Optional<Boolean> enforceWorkGroupConfiguration() {
        return Optional.ofNullable(this.enforceWorkGroupConfiguration);
    }

    @Import(name="engineVersion")
    private @Nullable WorkGroupEngineVersion engineVersion;

    public Optional<WorkGroupEngineVersion> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    @Import(name="publishCloudWatchMetricsEnabled")
    private @Nullable Boolean publishCloudWatchMetricsEnabled;

    public Optional<Boolean> publishCloudWatchMetricsEnabled() {
        return Optional.ofNullable(this.publishCloudWatchMetricsEnabled);
    }

    @Import(name="removeBytesScannedCutoffPerQuery")
    private @Nullable Boolean removeBytesScannedCutoffPerQuery;

    public Optional<Boolean> removeBytesScannedCutoffPerQuery() {
        return Optional.ofNullable(this.removeBytesScannedCutoffPerQuery);
    }

    @Import(name="requesterPaysEnabled")
    private @Nullable Boolean requesterPaysEnabled;

    public Optional<Boolean> requesterPaysEnabled() {
        return Optional.ofNullable(this.requesterPaysEnabled);
    }

    @Import(name="resultConfigurationUpdates")
    private @Nullable WorkGroupResultConfigurationUpdates resultConfigurationUpdates;

    public Optional<WorkGroupResultConfigurationUpdates> resultConfigurationUpdates() {
        return Optional.ofNullable(this.resultConfigurationUpdates);
    }

    private WorkGroupConfigurationUpdates() {}

    private WorkGroupConfigurationUpdates(WorkGroupConfigurationUpdates $) {
        this.bytesScannedCutoffPerQuery = $.bytesScannedCutoffPerQuery;
        this.enforceWorkGroupConfiguration = $.enforceWorkGroupConfiguration;
        this.engineVersion = $.engineVersion;
        this.publishCloudWatchMetricsEnabled = $.publishCloudWatchMetricsEnabled;
        this.removeBytesScannedCutoffPerQuery = $.removeBytesScannedCutoffPerQuery;
        this.requesterPaysEnabled = $.requesterPaysEnabled;
        this.resultConfigurationUpdates = $.resultConfigurationUpdates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkGroupConfigurationUpdates defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkGroupConfigurationUpdates $;

        public Builder() {
            $ = new WorkGroupConfigurationUpdates();
        }

        public Builder(WorkGroupConfigurationUpdates defaults) {
            $ = new WorkGroupConfigurationUpdates(Objects.requireNonNull(defaults));
        }

        public Builder bytesScannedCutoffPerQuery(@Nullable Integer bytesScannedCutoffPerQuery) {
            $.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
            return this;
        }

        public Builder enforceWorkGroupConfiguration(@Nullable Boolean enforceWorkGroupConfiguration) {
            $.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
            return this;
        }

        public Builder engineVersion(@Nullable WorkGroupEngineVersion engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        public Builder publishCloudWatchMetricsEnabled(@Nullable Boolean publishCloudWatchMetricsEnabled) {
            $.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
            return this;
        }

        public Builder removeBytesScannedCutoffPerQuery(@Nullable Boolean removeBytesScannedCutoffPerQuery) {
            $.removeBytesScannedCutoffPerQuery = removeBytesScannedCutoffPerQuery;
            return this;
        }

        public Builder requesterPaysEnabled(@Nullable Boolean requesterPaysEnabled) {
            $.requesterPaysEnabled = requesterPaysEnabled;
            return this;
        }

        public Builder resultConfigurationUpdates(@Nullable WorkGroupResultConfigurationUpdates resultConfigurationUpdates) {
            $.resultConfigurationUpdates = resultConfigurationUpdates;
            return this;
        }

        public WorkGroupConfigurationUpdates build() {
            return $;
        }
    }

}
