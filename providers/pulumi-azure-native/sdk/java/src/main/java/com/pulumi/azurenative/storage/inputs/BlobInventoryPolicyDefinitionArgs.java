// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.BlobInventoryPolicyFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * An object that defines the blob inventory rule. Each definition consists of a set of filters.
 * 
 */
public final class BlobInventoryPolicyDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobInventoryPolicyDefinitionArgs Empty = new BlobInventoryPolicyDefinitionArgs();

    /**
     * An object that defines the filter set.
     * 
     */
    @Import(name="filters", required=true)
    private Output<BlobInventoryPolicyFilterArgs> filters;

    public Output<BlobInventoryPolicyFilterArgs> filters() {
        return this.filters;
    }

    private BlobInventoryPolicyDefinitionArgs() {}

    private BlobInventoryPolicyDefinitionArgs(BlobInventoryPolicyDefinitionArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobInventoryPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobInventoryPolicyDefinitionArgs $;

        public Builder() {
            $ = new BlobInventoryPolicyDefinitionArgs();
        }

        public Builder(BlobInventoryPolicyDefinitionArgs defaults) {
            $ = new BlobInventoryPolicyDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(Output<BlobInventoryPolicyFilterArgs> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(BlobInventoryPolicyFilterArgs filters) {
            return filters(Output.of(filters));
        }

        public BlobInventoryPolicyDefinitionArgs build() {
            $.filters = Objects.requireNonNull($.filters, "expected parameter 'filters' to be non-null");
            return $;
        }
    }

}
