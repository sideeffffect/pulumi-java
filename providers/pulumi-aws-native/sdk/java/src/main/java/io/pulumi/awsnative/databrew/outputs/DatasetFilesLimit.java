// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.enums.DatasetFilesLimitOrder;
import io.pulumi.awsnative.databrew.enums.DatasetFilesLimitOrderedBy;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetFilesLimit {
    /**
     * Maximum number of files
     * 
     */
    private final Integer maxFiles;
    /**
     * Order
     * 
     */
    private final @Nullable DatasetFilesLimitOrder order;
    /**
     * Ordered by
     * 
     */
    private final @Nullable DatasetFilesLimitOrderedBy orderedBy;

    @OutputCustomType.Constructor
    private DatasetFilesLimit(
        @OutputCustomType.Parameter("maxFiles") Integer maxFiles,
        @OutputCustomType.Parameter("order") @Nullable DatasetFilesLimitOrder order,
        @OutputCustomType.Parameter("orderedBy") @Nullable DatasetFilesLimitOrderedBy orderedBy) {
        this.maxFiles = maxFiles;
        this.order = order;
        this.orderedBy = orderedBy;
    }

    /**
     * Maximum number of files
     * 
    */
    public Integer getMaxFiles() {
        return this.maxFiles;
    }
    /**
     * Order
     * 
    */
    public Optional<DatasetFilesLimitOrder> getOrder() {
        return Optional.ofNullable(this.order);
    }
    /**
     * Ordered by
     * 
    */
    public Optional<DatasetFilesLimitOrderedBy> getOrderedBy() {
        return Optional.ofNullable(this.orderedBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFilesLimit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxFiles;
        private @Nullable DatasetFilesLimitOrder order;
        private @Nullable DatasetFilesLimitOrderedBy orderedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFilesLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFiles = defaults.maxFiles;
    	      this.order = defaults.order;
    	      this.orderedBy = defaults.orderedBy;
        }

        public Builder maxFiles(Integer maxFiles) {
            this.maxFiles = Objects.requireNonNull(maxFiles);
            return this;
        }

        public Builder order(@Nullable DatasetFilesLimitOrder order) {
            this.order = order;
            return this;
        }

        public Builder orderedBy(@Nullable DatasetFilesLimitOrderedBy orderedBy) {
            this.orderedBy = orderedBy;
            return this;
        }
        public DatasetFilesLimit build() {
            return new DatasetFilesLimit(maxFiles, order, orderedBy);
        }
    }
}
