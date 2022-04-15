// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ImageRecipeComponentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRecipeComponentArgs Empty = new ImageRecipeComponentArgs();

    /**
     * Amazon Resource Name (ARN) of the Image Builder Component to associate.
     * 
     */
    @Import(name="componentArn", required=true)
      private final Output<String> componentArn;

    public Output<String> componentArn() {
        return this.componentArn;
    }

    public ImageRecipeComponentArgs(Output<String> componentArn) {
        this.componentArn = Objects.requireNonNull(componentArn, "expected parameter 'componentArn' to be non-null");
    }

    private ImageRecipeComponentArgs() {
        this.componentArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> componentArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
        }

        public Builder componentArn(Output<String> componentArn) {
            this.componentArn = Objects.requireNonNull(componentArn);
            return this;
        }
        public Builder componentArn(String componentArn) {
            this.componentArn = Output.of(Objects.requireNonNull(componentArn));
            return this;
        }        public ImageRecipeComponentArgs build() {
            return new ImageRecipeComponentArgs(componentArn);
        }
    }
}
