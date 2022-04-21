// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics;

import com.pulumi.awsnative.iotanalytics.inputs.DatastoreFileFormatConfigurationArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatastorePartitionsArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatastoreRetentionPeriodArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatastoreStorageArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatastoreTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastoreArgs Empty = new DatastoreArgs();

    @Import(name="datastoreName")
    private @Nullable Output<String> datastoreName;

    public Optional<Output<String>> datastoreName() {
        return Optional.ofNullable(this.datastoreName);
    }

    @Import(name="datastorePartitions")
    private @Nullable Output<DatastorePartitionsArgs> datastorePartitions;

    public Optional<Output<DatastorePartitionsArgs>> datastorePartitions() {
        return Optional.ofNullable(this.datastorePartitions);
    }

    @Import(name="datastoreStorage")
    private @Nullable Output<DatastoreStorageArgs> datastoreStorage;

    public Optional<Output<DatastoreStorageArgs>> datastoreStorage() {
        return Optional.ofNullable(this.datastoreStorage);
    }

    @Import(name="fileFormatConfiguration")
    private @Nullable Output<DatastoreFileFormatConfigurationArgs> fileFormatConfiguration;

    public Optional<Output<DatastoreFileFormatConfigurationArgs>> fileFormatConfiguration() {
        return Optional.ofNullable(this.fileFormatConfiguration);
    }

    @Import(name="retentionPeriod")
    private @Nullable Output<DatastoreRetentionPeriodArgs> retentionPeriod;

    public Optional<Output<DatastoreRetentionPeriodArgs>> retentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }

    @Import(name="tags")
    private @Nullable Output<List<DatastoreTagArgs>> tags;

    public Optional<Output<List<DatastoreTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DatastoreArgs() {}

    private DatastoreArgs(DatastoreArgs $) {
        this.datastoreName = $.datastoreName;
        this.datastorePartitions = $.datastorePartitions;
        this.datastoreStorage = $.datastoreStorage;
        this.fileFormatConfiguration = $.fileFormatConfiguration;
        this.retentionPeriod = $.retentionPeriod;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastoreArgs $;

        public Builder() {
            $ = new DatastoreArgs();
        }

        public Builder(DatastoreArgs defaults) {
            $ = new DatastoreArgs(Objects.requireNonNull(defaults));
        }

        public Builder datastoreName(@Nullable Output<String> datastoreName) {
            $.datastoreName = datastoreName;
            return this;
        }

        public Builder datastoreName(String datastoreName) {
            return datastoreName(Output.of(datastoreName));
        }

        public Builder datastorePartitions(@Nullable Output<DatastorePartitionsArgs> datastorePartitions) {
            $.datastorePartitions = datastorePartitions;
            return this;
        }

        public Builder datastorePartitions(DatastorePartitionsArgs datastorePartitions) {
            return datastorePartitions(Output.of(datastorePartitions));
        }

        public Builder datastoreStorage(@Nullable Output<DatastoreStorageArgs> datastoreStorage) {
            $.datastoreStorage = datastoreStorage;
            return this;
        }

        public Builder datastoreStorage(DatastoreStorageArgs datastoreStorage) {
            return datastoreStorage(Output.of(datastoreStorage));
        }

        public Builder fileFormatConfiguration(@Nullable Output<DatastoreFileFormatConfigurationArgs> fileFormatConfiguration) {
            $.fileFormatConfiguration = fileFormatConfiguration;
            return this;
        }

        public Builder fileFormatConfiguration(DatastoreFileFormatConfigurationArgs fileFormatConfiguration) {
            return fileFormatConfiguration(Output.of(fileFormatConfiguration));
        }

        public Builder retentionPeriod(@Nullable Output<DatastoreRetentionPeriodArgs> retentionPeriod) {
            $.retentionPeriod = retentionPeriod;
            return this;
        }

        public Builder retentionPeriod(DatastoreRetentionPeriodArgs retentionPeriod) {
            return retentionPeriod(Output.of(retentionPeriod));
        }

        public Builder tags(@Nullable Output<List<DatastoreTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<DatastoreTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(DatastoreTagArgs... tags) {
            return tags(List.of(tags));
        }

        public DatastoreArgs build() {
            return $;
        }
    }

}
