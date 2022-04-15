// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.ImageOutputResourceAmiGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageOutputResourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageOutputResourceGetArgs Empty = new ImageOutputResourceGetArgs();

    /**
     * Set of objects with each Amazon Machine Image (AMI) created.
     * 
     */
    @Import(name="amis")
      private final @Nullable Output<List<ImageOutputResourceAmiGetArgs>> amis;

    public Output<List<ImageOutputResourceAmiGetArgs>> amis() {
        return this.amis == null ? Codegen.empty() : this.amis;
    }

    public ImageOutputResourceGetArgs(@Nullable Output<List<ImageOutputResourceAmiGetArgs>> amis) {
        this.amis = amis;
    }

    private ImageOutputResourceGetArgs() {
        this.amis = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageOutputResourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ImageOutputResourceAmiGetArgs>> amis;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageOutputResourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amis = defaults.amis;
        }

        public Builder amis(@Nullable Output<List<ImageOutputResourceAmiGetArgs>> amis) {
            this.amis = amis;
            return this;
        }
        public Builder amis(@Nullable List<ImageOutputResourceAmiGetArgs> amis) {
            this.amis = Codegen.ofNullable(amis);
            return this;
        }
        public Builder amis(ImageOutputResourceAmiGetArgs... amis) {
            return amis(List.of(amis));
        }        public ImageOutputResourceGetArgs build() {
            return new ImageOutputResourceGetArgs(amis);
        }
    }
}
