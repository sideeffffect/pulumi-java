// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the gallery image definition purchase plan. This is used by marketplace images.
 * 
 */
public final class ImagePurchasePlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImagePurchasePlanArgs Empty = new ImagePurchasePlanArgs();

    /**
     * The plan ID.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The product ID.
     * 
     */
    @Import(name="product")
    private @Nullable Output<String> product;

    public Optional<Output<String>> product() {
        return Optional.ofNullable(this.product);
    }

    /**
     * The publisher ID.
     * 
     */
    @Import(name="publisher")
    private @Nullable Output<String> publisher;

    public Optional<Output<String>> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    private ImagePurchasePlanArgs() {}

    private ImagePurchasePlanArgs(ImagePurchasePlanArgs $) {
        this.name = $.name;
        this.product = $.product;
        this.publisher = $.publisher;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImagePurchasePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImagePurchasePlanArgs $;

        public Builder() {
            $ = new ImagePurchasePlanArgs();
        }

        public Builder(ImagePurchasePlanArgs defaults) {
            $ = new ImagePurchasePlanArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder product(@Nullable Output<String> product) {
            $.product = product;
            return this;
        }

        public Builder product(String product) {
            return product(Output.of(product));
        }

        public Builder publisher(@Nullable Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        public ImagePurchasePlanArgs build() {
            return $;
        }
    }

}
