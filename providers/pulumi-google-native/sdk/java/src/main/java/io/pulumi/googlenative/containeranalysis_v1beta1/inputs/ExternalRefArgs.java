// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.enums.ExternalRefCategory;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
 * 
 */
public final class ExternalRefArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalRefArgs Empty = new ExternalRefArgs();

    /**
     * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
     * 
     */
    @InputImport(name="category")
      private final @Nullable Input<ExternalRefCategory> category;

    public Input<ExternalRefCategory> getCategory() {
        return this.category == null ? Input.empty() : this.category;
    }

    /**
     * Human-readable information about the purpose and target of the reference
     * 
     */
    @InputImport(name="comment")
      private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location
     * 
     */
    @InputImport(name="locator")
      private final @Nullable Input<String> locator;

    public Input<String> getLocator() {
        return this.locator == null ? Input.empty() : this.locator;
    }

    /**
     * Type of category (e.g. 'npm' for the PACKAGE_MANAGER category)
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ExternalRefArgs(
        @Nullable Input<ExternalRefCategory> category,
        @Nullable Input<String> comment,
        @Nullable Input<String> locator,
        @Nullable Input<String> type) {
        this.category = category;
        this.comment = comment;
        this.locator = locator;
        this.type = type;
    }

    private ExternalRefArgs() {
        this.category = Input.empty();
        this.comment = Input.empty();
        this.locator = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExternalRefCategory> category;
        private @Nullable Input<String> comment;
        private @Nullable Input<String> locator;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalRefArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.comment = defaults.comment;
    	      this.locator = defaults.locator;
    	      this.type = defaults.type;
        }

        public Builder category(@Nullable Input<ExternalRefCategory> category) {
            this.category = category;
            return this;
        }

        public Builder category(@Nullable ExternalRefCategory category) {
            this.category = Input.ofNullable(category);
            return this;
        }

        public Builder comment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder locator(@Nullable Input<String> locator) {
            this.locator = locator;
            return this;
        }

        public Builder locator(@Nullable String locator) {
            this.locator = Input.ofNullable(locator);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ExternalRefArgs build() {
            return new ExternalRefArgs(category, comment, locator, type);
        }
    }
}
