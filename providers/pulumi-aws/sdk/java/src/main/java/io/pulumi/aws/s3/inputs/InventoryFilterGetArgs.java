// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InventoryFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InventoryFilterGetArgs Empty = new InventoryFilterGetArgs();

    /**
     * The prefix that an object must have to be included in the inventory results.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix == null ? Codegen.empty() : this.prefix;
    }

    public InventoryFilterGetArgs(@Nullable Output<String> prefix) {
        this.prefix = prefix;
    }

    private InventoryFilterGetArgs() {
        this.prefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Codegen.ofNullable(prefix);
            return this;
        }        public InventoryFilterGetArgs build() {
            return new InventoryFilterGetArgs(prefix);
        }
    }
}
