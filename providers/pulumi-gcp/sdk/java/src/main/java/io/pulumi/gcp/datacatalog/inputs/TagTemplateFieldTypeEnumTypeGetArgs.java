// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeAllowedValueGetArgs;
import java.util.List;
import java.util.Objects;


public final class TagTemplateFieldTypeEnumTypeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldTypeEnumTypeGetArgs Empty = new TagTemplateFieldTypeEnumTypeGetArgs();

    /**
     * The set of allowed values for this enum. The display names of the
     * values must be case-insensitively unique within this set. Currently,
     * enum values can only be added to the list of allowed values. Deletion
     * and renaming of enum values are not supported.
     * Can have up to 500 allowed values.
     * Structure is documented below.
     * 
     */
    @Import(name="allowedValues", required=true)
      private final Output<List<TagTemplateFieldTypeEnumTypeAllowedValueGetArgs>> allowedValues;

    public Output<List<TagTemplateFieldTypeEnumTypeAllowedValueGetArgs>> allowedValues() {
        return this.allowedValues;
    }

    public TagTemplateFieldTypeEnumTypeGetArgs(Output<List<TagTemplateFieldTypeEnumTypeAllowedValueGetArgs>> allowedValues) {
        this.allowedValues = Objects.requireNonNull(allowedValues, "expected parameter 'allowedValues' to be non-null");
    }

    private TagTemplateFieldTypeEnumTypeGetArgs() {
        this.allowedValues = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldTypeEnumTypeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<TagTemplateFieldTypeEnumTypeAllowedValueGetArgs>> allowedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldTypeEnumTypeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
        }

        public Builder allowedValues(Output<List<TagTemplateFieldTypeEnumTypeAllowedValueGetArgs>> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }
        public Builder allowedValues(List<TagTemplateFieldTypeEnumTypeAllowedValueGetArgs> allowedValues) {
            this.allowedValues = Output.of(Objects.requireNonNull(allowedValues));
            return this;
        }
        public Builder allowedValues(TagTemplateFieldTypeEnumTypeAllowedValueGetArgs... allowedValues) {
            return allowedValues(List.of(allowedValues));
        }        public TagTemplateFieldTypeEnumTypeGetArgs build() {
            return new TagTemplateFieldTypeEnumTypeGetArgs(allowedValues);
        }
    }
}
