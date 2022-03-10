// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatastoreTimestampPartition;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatastorePartition {
    private final @Nullable DatastorePartition partition;
    private final @Nullable DatastoreTimestampPartition timestampPartition;

    @OutputCustomType.Constructor
    private DatastorePartition(
        @OutputCustomType.Parameter("partition") @Nullable DatastorePartition partition,
        @OutputCustomType.Parameter("timestampPartition") @Nullable DatastoreTimestampPartition timestampPartition) {
        this.partition = partition;
        this.timestampPartition = timestampPartition;
    }

    public Optional<DatastorePartition> getPartition() {
        return Optional.ofNullable(this.partition);
    }
    public Optional<DatastoreTimestampPartition> getTimestampPartition() {
        return Optional.ofNullable(this.timestampPartition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastorePartition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatastorePartition partition;
        private @Nullable DatastoreTimestampPartition timestampPartition;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastorePartition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partition = defaults.partition;
    	      this.timestampPartition = defaults.timestampPartition;
        }

        public Builder partition(@Nullable DatastorePartition partition) {
            this.partition = partition;
            return this;
        }

        public Builder timestampPartition(@Nullable DatastoreTimestampPartition timestampPartition) {
            this.timestampPartition = timestampPartition;
            return this;
        }
        public DatastorePartition build() {
            return new DatastorePartition(partition, timestampPartition);
        }
    }
}
