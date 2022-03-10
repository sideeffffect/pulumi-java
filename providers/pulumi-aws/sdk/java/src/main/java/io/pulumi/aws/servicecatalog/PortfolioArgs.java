// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PortfolioArgs extends io.pulumi.resources.ResourceArgs {

    public static final PortfolioArgs Empty = new PortfolioArgs();

    /**
     * Description of the portfolio
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the portfolio.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Name of the person or organization who owns the portfolio.
     * 
     */
    @InputImport(name="providerName", required=true)
      private final Input<String> providerName;

    public Input<String> getProviderName() {
        return this.providerName;
    }

    /**
     * Tags to apply to the connection. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PortfolioArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<String> providerName,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.name = name;
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
        this.tags = tags;
    }

    private PortfolioArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.providerName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PortfolioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<String> providerName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PortfolioArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.providerName = defaults.providerName;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder providerName(Input<String> providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }

        public Builder providerName(String providerName) {
            this.providerName = Input.of(Objects.requireNonNull(providerName));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public PortfolioArgs build() {
            return new PortfolioArgs(description, name, providerName, tags);
        }
    }
}
