// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateFieldTypeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldTypeGetArgs Empty = new TagTemplateFieldTypeGetArgs();

    /**
     * Represents an enum type.
     * Exactly one of `primitive_type` or `enum_type` must be set
     * Structure is documented below.
     * 
     */
    @InputImport(name="enumType")
      private final @Nullable Input<TagTemplateFieldTypeEnumTypeGetArgs> enumType;

    public Input<TagTemplateFieldTypeEnumTypeGetArgs> getEnumType() {
        return this.enumType == null ? Input.empty() : this.enumType;
    }

    /**
     * Represents primitive types - string, bool etc.
     * Exactly one of `primitive_type` or `enum_type` must be set
     * Possible values are `DOUBLE`, `STRING`, `BOOL`, and `TIMESTAMP`.
     * 
     */
    @InputImport(name="primitiveType")
      private final @Nullable Input<String> primitiveType;

    public Input<String> getPrimitiveType() {
        return this.primitiveType == null ? Input.empty() : this.primitiveType;
    }

    public TagTemplateFieldTypeGetArgs(
        @Nullable Input<TagTemplateFieldTypeEnumTypeGetArgs> enumType,
        @Nullable Input<String> primitiveType) {
        this.enumType = enumType;
        this.primitiveType = primitiveType;
    }

    private TagTemplateFieldTypeGetArgs() {
        this.enumType = Input.empty();
        this.primitiveType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldTypeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TagTemplateFieldTypeEnumTypeGetArgs> enumType;
        private @Nullable Input<String> primitiveType;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldTypeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enumType = defaults.enumType;
    	      this.primitiveType = defaults.primitiveType;
        }

        public Builder enumType(@Nullable Input<TagTemplateFieldTypeEnumTypeGetArgs> enumType) {
            this.enumType = enumType;
            return this;
        }

        public Builder enumType(@Nullable TagTemplateFieldTypeEnumTypeGetArgs enumType) {
            this.enumType = Input.ofNullable(enumType);
            return this;
        }

        public Builder primitiveType(@Nullable Input<String> primitiveType) {
            this.primitiveType = primitiveType;
            return this;
        }

        public Builder primitiveType(@Nullable String primitiveType) {
            this.primitiveType = Input.ofNullable(primitiveType);
            return this;
        }
        public TagTemplateFieldTypeGetArgs build() {
            return new TagTemplateFieldTypeGetArgs(enumType, primitiveType);
        }
    }
}
