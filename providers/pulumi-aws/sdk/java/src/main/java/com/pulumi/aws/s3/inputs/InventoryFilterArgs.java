// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryFilterArgs Empty = new InventoryFilterArgs();

    /**
     * The prefix that an object must have to be included in the inventory results.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private InventoryFilterArgs() {}

    private InventoryFilterArgs(InventoryFilterArgs $) {
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryFilterArgs $;

        public Builder() {
            $ = new InventoryFilterArgs();
        }

        public Builder(InventoryFilterArgs defaults) {
            $ = new InventoryFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public InventoryFilterArgs build() {
            return $;
        }
    }

}
