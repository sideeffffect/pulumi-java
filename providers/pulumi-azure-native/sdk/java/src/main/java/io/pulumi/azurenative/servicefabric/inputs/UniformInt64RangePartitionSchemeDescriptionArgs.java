// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a partitioning scheme where an integer range is allocated evenly across a number of partitions.
 * 
 */
public final class UniformInt64RangePartitionSchemeDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final UniformInt64RangePartitionSchemeDescriptionArgs Empty = new UniformInt64RangePartitionSchemeDescriptionArgs();

    /**
     * The number of partitions.
     * 
     */
    @InputImport(name="count", required=true)
      private final Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count;
    }

    /**
     * String indicating the upper bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    @InputImport(name="highKey", required=true)
      private final Input<String> highKey;

    public Input<String> getHighKey() {
        return this.highKey;
    }

    /**
     * String indicating the lower bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    @InputImport(name="lowKey", required=true)
      private final Input<String> lowKey;

    public Input<String> getLowKey() {
        return this.lowKey;
    }

    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is 'UniformInt64Range'.
     * 
     */
    @InputImport(name="partitionScheme", required=true)
      private final Input<String> partitionScheme;

    public Input<String> getPartitionScheme() {
        return this.partitionScheme;
    }

    public UniformInt64RangePartitionSchemeDescriptionArgs(
        Input<Integer> count,
        Input<String> highKey,
        Input<String> lowKey,
        Input<String> partitionScheme) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.highKey = Objects.requireNonNull(highKey, "expected parameter 'highKey' to be non-null");
        this.lowKey = Objects.requireNonNull(lowKey, "expected parameter 'lowKey' to be non-null");
        this.partitionScheme = Objects.requireNonNull(partitionScheme, "expected parameter 'partitionScheme' to be non-null");
    }

    private UniformInt64RangePartitionSchemeDescriptionArgs() {
        this.count = Input.empty();
        this.highKey = Input.empty();
        this.lowKey = Input.empty();
        this.partitionScheme = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniformInt64RangePartitionSchemeDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> count;
        private Input<String> highKey;
        private Input<String> lowKey;
        private Input<String> partitionScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(UniformInt64RangePartitionSchemeDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.highKey = defaults.highKey;
    	      this.lowKey = defaults.lowKey;
    	      this.partitionScheme = defaults.partitionScheme;
        }

        public Builder count(Input<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder count(Integer count) {
            this.count = Input.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder highKey(Input<String> highKey) {
            this.highKey = Objects.requireNonNull(highKey);
            return this;
        }

        public Builder highKey(String highKey) {
            this.highKey = Input.of(Objects.requireNonNull(highKey));
            return this;
        }

        public Builder lowKey(Input<String> lowKey) {
            this.lowKey = Objects.requireNonNull(lowKey);
            return this;
        }

        public Builder lowKey(String lowKey) {
            this.lowKey = Input.of(Objects.requireNonNull(lowKey));
            return this;
        }

        public Builder partitionScheme(Input<String> partitionScheme) {
            this.partitionScheme = Objects.requireNonNull(partitionScheme);
            return this;
        }

        public Builder partitionScheme(String partitionScheme) {
            this.partitionScheme = Input.of(Objects.requireNonNull(partitionScheme));
            return this;
        }
        public UniformInt64RangePartitionSchemeDescriptionArgs build() {
            return new UniformInt64RangePartitionSchemeDescriptionArgs(count, highKey, lowKey, partitionScheme);
        }
    }
}
