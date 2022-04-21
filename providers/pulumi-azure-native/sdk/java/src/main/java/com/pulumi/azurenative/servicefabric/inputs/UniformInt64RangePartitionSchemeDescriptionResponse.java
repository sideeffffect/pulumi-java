// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a partitioning scheme where an integer range is allocated evenly across a number of partitions.
 * 
 */
public final class UniformInt64RangePartitionSchemeDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final UniformInt64RangePartitionSchemeDescriptionResponse Empty = new UniformInt64RangePartitionSchemeDescriptionResponse();

    /**
     * The number of partitions.
     * 
     */
    @Import(name="count", required=true)
    private Integer count;

    public Integer count() {
        return this.count;
    }

    /**
     * String indicating the upper bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    @Import(name="highKey", required=true)
    private String highKey;

    public String highKey() {
        return this.highKey;
    }

    /**
     * String indicating the lower bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    @Import(name="lowKey", required=true)
    private String lowKey;

    public String lowKey() {
        return this.lowKey;
    }

    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is &#39;UniformInt64Range&#39;.
     * 
     */
    @Import(name="partitionScheme", required=true)
    private String partitionScheme;

    public String partitionScheme() {
        return this.partitionScheme;
    }

    private UniformInt64RangePartitionSchemeDescriptionResponse() {}

    private UniformInt64RangePartitionSchemeDescriptionResponse(UniformInt64RangePartitionSchemeDescriptionResponse $) {
        this.count = $.count;
        this.highKey = $.highKey;
        this.lowKey = $.lowKey;
        this.partitionScheme = $.partitionScheme;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UniformInt64RangePartitionSchemeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UniformInt64RangePartitionSchemeDescriptionResponse $;

        public Builder() {
            $ = new UniformInt64RangePartitionSchemeDescriptionResponse();
        }

        public Builder(UniformInt64RangePartitionSchemeDescriptionResponse defaults) {
            $ = new UniformInt64RangePartitionSchemeDescriptionResponse(Objects.requireNonNull(defaults));
        }

        public Builder count(Integer count) {
            $.count = count;
            return this;
        }

        public Builder highKey(String highKey) {
            $.highKey = highKey;
            return this;
        }

        public Builder lowKey(String lowKey) {
            $.lowKey = lowKey;
            return this;
        }

        public Builder partitionScheme(String partitionScheme) {
            $.partitionScheme = partitionScheme;
            return this;
        }

        public UniformInt64RangePartitionSchemeDescriptionResponse build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.highKey = Objects.requireNonNull($.highKey, "expected parameter 'highKey' to be non-null");
            $.lowKey = Objects.requireNonNull($.lowKey, "expected parameter 'lowKey' to be non-null");
            $.partitionScheme = Codegen.stringProp("partitionScheme").arg($.partitionScheme).require();
            return $;
        }
    }

}
