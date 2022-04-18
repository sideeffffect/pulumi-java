// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.enums.SkuName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Sku.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The display name of the sku.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The sku family.
     * 
     */
    @Import(name="family")
      private final @Nullable Output<String> family;

    public Output<String> family() {
        return this.family == null ? Codegen.empty() : this.family;
    }

    /**
     * The sku name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,SkuName>> name;

    public Output<Either<String,SkuName>> name() {
        return this.name;
    }

    public SkuArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<String> family,
        Output<Either<String,SkuName>> name) {
        this.displayName = displayName;
        this.family = family;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SkuArgs() {
        this.displayName = Codegen.empty();
        this.family = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> family;
        private Output<Either<String,SkuName>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder family(@Nullable Output<String> family) {
            this.family = family;
            return this;
        }
        public Builder family(@Nullable String family) {
            this.family = Codegen.ofNullable(family);
            return this;
        }
        public Builder name(Output<Either<String,SkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(Either<String,SkuName> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public SkuArgs build() {
            return new SkuArgs(displayName, family, name);
        }
    }
}
