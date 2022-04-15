// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLaunchPathsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchPathsArgs Empty = new GetLaunchPathsArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
      private final @Nullable String acceptLanguage;

    public Optional<String> acceptLanguage() {
        return this.acceptLanguage == null ? Optional.empty() : Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Product identifier.
     * 
     */
    @Import(name="productId", required=true)
      private final String productId;

    public String productId() {
        return this.productId;
    }

    public GetLaunchPathsArgs(
        @Nullable String acceptLanguage,
        String productId) {
        this.acceptLanguage = acceptLanguage;
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
    }

    private GetLaunchPathsArgs() {
        this.acceptLanguage = null;
        this.productId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchPathsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private String productId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchPathsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.productId = defaults.productId;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }
        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }        public GetLaunchPathsArgs build() {
            return new GetLaunchPathsArgs(acceptLanguage, productId);
        }
    }
}
