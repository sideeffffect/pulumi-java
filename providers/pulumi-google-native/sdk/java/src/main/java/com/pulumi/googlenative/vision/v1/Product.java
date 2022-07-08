// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.vision.v1.ProductArgs;
import com.pulumi.googlenative.vision.v1.outputs.KeyValueResponse;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and returns a new product resource. Possible errors: * Returns INVALID_ARGUMENT if display_name is missing or longer than 4096 characters. * Returns INVALID_ARGUMENT if description is longer than 4096 characters. * Returns INVALID_ARGUMENT if product_category is missing or invalid.
 * 
 */
@ResourceType(type="google-native:vision/v1:Product")
public class Product extends com.pulumi.resources.CustomResource {
    /**
     * User-provided metadata to be stored with this product. Must be at most 4096 characters long.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User-provided metadata to be stored with this product. Must be at most 4096 characters long.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The user-provided name for this Product. Must not be empty. Must be at most 4096 characters long.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user-provided name for this Product. Must not be empty. Must be at most 4096 characters long.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name of the product. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`. This field is ignored when creating a product.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the product. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`. This field is ignored when creating a product.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Immutable. The category for the product identified by the reference image. This should be one of &#34;homegoods-v2&#34;, &#34;apparel-v2&#34;, &#34;toys-v2&#34;, &#34;packagedgoods-v1&#34; or &#34;general-v1&#34;. The legacy categories &#34;homegoods&#34;, &#34;apparel&#34;, and &#34;toys&#34; are still supported, but these should not be used for new products.
     * 
     */
    @Export(name="productCategory", type=String.class, parameters={})
    private Output<String> productCategory;

    /**
     * @return Immutable. The category for the product identified by the reference image. This should be one of &#34;homegoods-v2&#34;, &#34;apparel-v2&#34;, &#34;toys-v2&#34;, &#34;packagedgoods-v1&#34; or &#34;general-v1&#34;. The legacy categories &#34;homegoods&#34;, &#34;apparel&#34;, and &#34;toys&#34; are still supported, but these should not be used for new products.
     * 
     */
    public Output<String> productCategory() {
        return this.productCategory;
    }
    /**
     * A user-supplied resource id for this Product. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`.
     * 
     */
    @Export(name="productId", type=String.class, parameters={})
    private Output</* @Nullable */ String> productId;

    /**
     * @return A user-supplied resource id for this Product. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`.
     * 
     */
    public Output<Optional<String>> productId() {
        return Codegen.optional(this.productId);
    }
    /**
     * Key-value pairs that can be attached to a product. At query time, constraints can be specified based on the product_labels. Note that integer values can be provided as strings, e.g. &#34;1199&#34;. Only strings with integer values can match a range-based restriction which is to be supported soon. Multiple values can be assigned to the same key. One product may have up to 500 product_labels. Notice that the total number of distinct product_labels over all products in one ProductSet cannot exceed 1M, otherwise the product search pipeline will refuse to work for that ProductSet.
     * 
     */
    @Export(name="productLabels", type=List.class, parameters={KeyValueResponse.class})
    private Output<List<KeyValueResponse>> productLabels;

    /**
     * @return Key-value pairs that can be attached to a product. At query time, constraints can be specified based on the product_labels. Note that integer values can be provided as strings, e.g. &#34;1199&#34;. Only strings with integer values can match a range-based restriction which is to be supported soon. Multiple values can be assigned to the same key. One product may have up to 500 product_labels. Notice that the total number of distinct product_labels over all products in one ProductSet cannot exceed 1M, otherwise the product search pipeline will refuse to work for that ProductSet.
     * 
     */
    public Output<List<KeyValueResponse>> productLabels() {
        return this.productLabels;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Product(String name) {
        this(name, ProductArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Product(String name, @Nullable ProductArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Product(String name, @Nullable ProductArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vision/v1:Product", name, args == null ? ProductArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Product(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vision/v1:Product", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Product get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Product(name, id, options);
    }
}
