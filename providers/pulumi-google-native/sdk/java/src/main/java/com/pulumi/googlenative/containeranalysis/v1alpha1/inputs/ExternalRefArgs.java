// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.enums.ExternalRefCategory;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
 * 
 */
public final class ExternalRefArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalRefArgs Empty = new ExternalRefArgs();

    /**
     * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
     * 
     */
    @Import(name="category")
    private @Nullable Output<ExternalRefCategory> category;

    /**
     * @return An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
     * 
     */
    public Optional<Output<ExternalRefCategory>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * Human-readable information about the purpose and target of the reference
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Human-readable information about the purpose and target of the reference
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location
     * 
     */
    @Import(name="locator")
    private @Nullable Output<String> locator;

    /**
     * @return The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location
     * 
     */
    public Optional<Output<String>> locator() {
        return Optional.ofNullable(this.locator);
    }

    /**
     * Type of category (e.g. &#39;npm&#39; for the PACKAGE_MANAGER category)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of category (e.g. &#39;npm&#39; for the PACKAGE_MANAGER category)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ExternalRefArgs() {}

    private ExternalRefArgs(ExternalRefArgs $) {
        this.category = $.category;
        this.comment = $.comment;
        this.locator = $.locator;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalRefArgs $;

        public Builder() {
            $ = new ExternalRefArgs();
        }

        public Builder(ExternalRefArgs defaults) {
            $ = new ExternalRefArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<ExternalRefCategory> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
         * 
         * @return builder
         * 
         */
        public Builder category(ExternalRefCategory category) {
            return category(Output.of(category));
        }

        /**
         * @param comment Human-readable information about the purpose and target of the reference
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Human-readable information about the purpose and target of the reference
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param locator The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location
         * 
         * @return builder
         * 
         */
        public Builder locator(@Nullable Output<String> locator) {
            $.locator = locator;
            return this;
        }

        /**
         * @param locator The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location
         * 
         * @return builder
         * 
         */
        public Builder locator(String locator) {
            return locator(Output.of(locator));
        }

        /**
         * @param type Type of category (e.g. &#39;npm&#39; for the PACKAGE_MANAGER category)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of category (e.g. &#39;npm&#39; for the PACKAGE_MANAGER category)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ExternalRefArgs build() {
            return $;
        }
    }

}
