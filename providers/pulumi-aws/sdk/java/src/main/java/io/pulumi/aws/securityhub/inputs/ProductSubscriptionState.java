// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProductSubscriptionState extends io.pulumi.resources.ResourceArgs {

    public static final ProductSubscriptionState Empty = new ProductSubscriptionState();

    /**
     * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The ARN of the product that generates findings that you want to import into Security Hub - see below.
     * 
     */
    @Import(name="productArn")
      private final @Nullable Output<String> productArn;

    public Output<String> productArn() {
        return this.productArn == null ? Codegen.empty() : this.productArn;
    }

    public ProductSubscriptionState(
        @Nullable Output<String> arn,
        @Nullable Output<String> productArn) {
        this.arn = arn;
        this.productArn = productArn;
    }

    private ProductSubscriptionState() {
        this.arn = Codegen.empty();
        this.productArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> productArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductSubscriptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.productArn = defaults.productArn;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder productArn(@Nullable Output<String> productArn) {
            this.productArn = productArn;
            return this;
        }
        public Builder productArn(@Nullable String productArn) {
            this.productArn = Codegen.ofNullable(productArn);
            return this;
        }        public ProductSubscriptionState build() {
            return new ProductSubscriptionState(arn, productArn);
        }
    }
}
