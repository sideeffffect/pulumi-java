// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings that will be leveraged for teradata source partitioning.
 * 
 */
public final class TeradataPartitionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TeradataPartitionSettingsArgs Empty = new TeradataPartitionSettingsArgs();

    /**
     * The name of the column that will be used for proceeding range or hash partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionColumnName")
      private final @Nullable Input<Object> partitionColumnName;

    public Input<Object> getPartitionColumnName() {
        return this.partitionColumnName == null ? Input.empty() : this.partitionColumnName;
    }

    /**
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionLowerBound")
      private final @Nullable Input<Object> partitionLowerBound;

    public Input<Object> getPartitionLowerBound() {
        return this.partitionLowerBound == null ? Input.empty() : this.partitionLowerBound;
    }

    /**
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionUpperBound")
      private final @Nullable Input<Object> partitionUpperBound;

    public Input<Object> getPartitionUpperBound() {
        return this.partitionUpperBound == null ? Input.empty() : this.partitionUpperBound;
    }

    public TeradataPartitionSettingsArgs(
        @Nullable Input<Object> partitionColumnName,
        @Nullable Input<Object> partitionLowerBound,
        @Nullable Input<Object> partitionUpperBound) {
        this.partitionColumnName = partitionColumnName;
        this.partitionLowerBound = partitionLowerBound;
        this.partitionUpperBound = partitionUpperBound;
    }

    private TeradataPartitionSettingsArgs() {
        this.partitionColumnName = Input.empty();
        this.partitionLowerBound = Input.empty();
        this.partitionUpperBound = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeradataPartitionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> partitionColumnName;
        private @Nullable Input<Object> partitionLowerBound;
        private @Nullable Input<Object> partitionUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(TeradataPartitionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionColumnName = defaults.partitionColumnName;
    	      this.partitionLowerBound = defaults.partitionLowerBound;
    	      this.partitionUpperBound = defaults.partitionUpperBound;
        }

        public Builder partitionColumnName(@Nullable Input<Object> partitionColumnName) {
            this.partitionColumnName = partitionColumnName;
            return this;
        }

        public Builder partitionColumnName(@Nullable Object partitionColumnName) {
            this.partitionColumnName = Input.ofNullable(partitionColumnName);
            return this;
        }

        public Builder partitionLowerBound(@Nullable Input<Object> partitionLowerBound) {
            this.partitionLowerBound = partitionLowerBound;
            return this;
        }

        public Builder partitionLowerBound(@Nullable Object partitionLowerBound) {
            this.partitionLowerBound = Input.ofNullable(partitionLowerBound);
            return this;
        }

        public Builder partitionUpperBound(@Nullable Input<Object> partitionUpperBound) {
            this.partitionUpperBound = partitionUpperBound;
            return this;
        }

        public Builder partitionUpperBound(@Nullable Object partitionUpperBound) {
            this.partitionUpperBound = Input.ofNullable(partitionUpperBound);
            return this;
        }
        public TeradataPartitionSettingsArgs build() {
            return new TeradataPartitionSettingsArgs(partitionColumnName, partitionLowerBound, partitionUpperBound);
        }
    }
}
