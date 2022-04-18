// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CidrBlock contains an optional name and one CIDR block.
 * 
 */
public final class CidrBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final CidrBlockArgs Empty = new CidrBlockArgs();

    /**
     * cidr_block must be specified in CIDR notation.
     * 
     */
    @Import(name="cidrBlock")
      private final @Nullable Output<String> cidrBlock;

    public Output<String> cidrBlock() {
        return this.cidrBlock == null ? Codegen.empty() : this.cidrBlock;
    }

    /**
     * display_name is an optional field for users to identify CIDR blocks.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    public CidrBlockArgs(
        @Nullable Output<String> cidrBlock,
        @Nullable Output<String> displayName) {
        this.cidrBlock = cidrBlock;
        this.displayName = displayName;
    }

    private CidrBlockArgs() {
        this.cidrBlock = Codegen.empty();
        this.displayName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CidrBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cidrBlock;
        private @Nullable Output<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(CidrBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Codegen.ofNullable(cidrBlock);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }        public CidrBlockArgs build() {
            return new CidrBlockArgs(cidrBlock, displayName);
        }
    }
}
